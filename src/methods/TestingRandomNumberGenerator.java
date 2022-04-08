package methods;
import utilities.RandomNumberGenerator;
import utilities.Calculator;
public class TestingRandomNumberGenerator {
    public static void main(String[] args){


       //int ran1=  (int) (Math.random() * 27) + 37; old way

       //Now we should use

        int ran1= RandomNumberGenerator.getRandomNumber(37,63);
        int ran2= RandomNumberGenerator.getRandomNumber(37,63);

        System.out.println(ran1);
        System.out.println(ran2);

        System.out.println(Calculator.divide(ran1, ran2));

    }
}
