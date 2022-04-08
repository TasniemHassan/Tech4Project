package loops.doWhileLoop;
import java.util.Random;
public class UnderstandingDoWhileLoop {
    public static void main(String[] arg){

        /*Random random = new Random();
        boolean b = random.nextBoolean();

        while(b){
            System.out.println("It is true");
            b = random.nextBoolean();
        }

         */


        boolean b = true;
        while(b){
            System.out.println(true);
            b = false;
        }


        boolean b2 = false;
        do{
            System.out.println("true");
        }while (b2);



        System.out.println("End of Program"); //to see program better
    }
}
