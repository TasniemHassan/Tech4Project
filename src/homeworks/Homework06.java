package homeworks;
import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args){

        //Task-1

        String s1= "5";
        int s1D = Integer.parseInt(s1);
        String s2 = "10";
        int s2D = Integer.parseInt(s2);

       System.out.println("Sum of " + s1 + " and " + s2 + " is = " + (s1D + s2D) +
               "\nProduct of " + s1 + " and " + s2 + " is = " + s1D * s2D +
               "\nDivision of " + s1 + " and " + s2 + " is = " + s1D / s2D +
               "\nSubtraction of " + s1 + " and " + s2 + " is = " + (s1D - s2D)+
               "\nRemainder of " + s1 + " and " + s2 + " is = " + (s1D % s2D));

       //Task-2

        String s11 = "200", s22 = "-50";
        int s1V = Integer.parseInt(s11);
        int s2V = Integer.parseInt(s22);

        System.out.println("\n\nThe greatest value is = " + Math.max(s1V , s2V) +
                "\nThe smallest value is = " + Math.min(s1V , s2V) +
                "\nThe average is = " + ((s1V+s2V) /2) +
                "\nThe absolute difference is = " + Math.abs (s1V - s2V));


        //Task-3
        double coinsPerDaySaved = (3*0.25) + 0.10 + (2* 0.05) + 0.01; //0.96
        System.out.println("\n\n" + (int) (24/coinsPerDaySaved) +
                " days \n" + (int) (168/coinsPerDaySaved) +
                " days \n$" + (30 * 5 * coinsPerDaySaved));

        //Task-4
            String jessieSaved = "1250";
            String jessieSavingPerDay = "62.5";
        double jessieSavedDouble = Double.parseDouble(jessieSaved);
        double jessieSavingPerDayDouble = Double.parseDouble(jessieSavingPerDay);

        System.out.println("\n\n" + (int) (jessieSavedDouble / jessieSavingPerDayDouble));

        //Task-5

        double newCarOption1 = 14265 / 475.50;
        double newCarOption2 = 14265 / 951;
        System.out.println("\n\nOption 1 will take " + (int) (newCarOption1) +
                " months \nOption 2 will take " + (int) (newCarOption2) +" months");

        //Task-6

        Scanner userEnter = new Scanner(System.in);
        System.out.println("\n\nPlease Enter 2 numbers");
        int number1 = userEnter.nextInt();
        int number2 = userEnter.nextInt();

        double number1D = number1;
        double number2D = number2;

        System.out.println(number1D / number2D );


    }
}
