package homeworks;
import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args){

        Scanner numEntered = new Scanner(System.in);

        //Task-1

        System.out.println("Enter 3 int values");
        int userEnter1 = numEntered.nextInt();
        int userEnter2 = numEntered.nextInt();
        int userEnter3 = numEntered.nextInt();

        System.out.println("Max value = " +
                Math.max ((Math.max (userEnter1, userEnter2)), userEnter3));
        System.out.println("Min value = " +
                Math.min ((Math.min (userEnter1, userEnter2)), userEnter3));


        //Task-2

        System.out.println("\n\nEnter 5 Numbers");
        int num1 = numEntered.nextInt();
        int num2 = numEntered.nextInt();
        int num3 = numEntered.nextInt();
        int num4 = numEntered.nextInt();
        int num5 = numEntered.nextInt();

        System.out.println("Max value = " +
                Math.max (Math.max (Math.max(num1,num2),Math.max(num3,num4)), num5));
        System.out.println("Min value = " +
        Math.min (Math.min (Math.min(num1,num2),Math.min(num3,num4)), num5));

        //Task-3

        System.out.println("\n\nEnter 2 int values");
        int value1 = numEntered.nextInt();
        int value2 = numEntered.nextInt();

        System.out.println("The difference between numbers is = " +
                Math.abs(value2 - value1));



        //Task-4

        int randomNum1 = (int) (Math.random() * 51 + 50);
        int randomNum2 = (int) (Math.random() * 51 + 50);
        int randomNum3= (int) (Math.random() * 51 + 50);

        System.out.println("\n\nNumber 1 = " + randomNum1 +
                "\nNumber 2 = " + randomNum2 +
                "\nNumber 3 = " + randomNum3 +
                "\nThe sum of numbers is = " + (randomNum1 + randomNum2 + randomNum3));

        //Task-5

        double alex = 125;
        double mike = 220;

        System.out.println("\n\nAlex's money: $" + (alex - 25.5) +
                "\nMike's money: $" + (mike + 25.5));

        //Task-6

        double cost = 390;
        double savePerDay = 15.60;

        System.out.println("\n\n" + (int) (cost / savePerDay));

    }
}
