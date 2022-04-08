package homeworks;
import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args ){
         Scanner input =new Scanner(System.in);
        //Task-1

         System.out.println("Enter 2 numbers");
         int num1Entered = input.nextInt();
         int num2Entered = input.nextInt();

         System.out.println("The average of the given 2 numbers is: " +
                 ((num1Entered + num2Entered) / 2));

         //Task-2

        System.out.println("\n\nEnter 2 numbers");
        int num1UserEnter = input.nextInt();
        int num2UserEnter = input.nextInt();

        System.out.println("The product of the given 2 numbers is: " +
               num1UserEnter * num2UserEnter);

        //Task-3

        System.out.println("\n\nPlease Enter 3 Numbers");
        int userEnter1 = input.nextInt();
        int userEnter2 = input.nextInt();
        int userEnter3 = input.nextInt();

        System.out.println("The 5 multiplied with 5 is = " + userEnter1*userEnter1 +
                "\nThe 6 multiplied with 6 is = " + userEnter2 * userEnter2 +
                "\nThe 10 multiplied with 10 is = " + userEnter3 * userEnter3);

        //it is more correct and more dynamic to put ex: userEnter1 instead of 5 so it could
        //work with any number entered

        //Task-4

        System.out.println("\n\nEnter 2 numbers");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        System.out.println("The remainder of 25 % 8 = " + firstNum % secondNum);


        //Task-5

        System.out.println("\n\nPlease enter 5 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        System.out.println("The average of the given 5 numbers is: " +
                (num1 + num2 + num3 + num4 + num5) / 5);


        //Task-6
        System.out.println("\n\nEnter 1 number");
        int number = input.nextInt();
        System.out.println(number + "* 1 = " + number * 1 + "\n" +
                number + "* 2 = " + number * 2 + "\n" +
                number + "* 3 = " + number * 3 + "\n" +
                number + "* 4 = " + number * 4 + "\n" +
                number + "* 5 = " + number * 5 + "\n" +
                number + "* 6 = " + number * 6 + "\n" +
                number + "* 7 = " + number * 7 + "\n" +
                number + "* 8 = " + number * 8 + "\n" +
                number + "* 9 = " + number * 9 + "\n" +
                number + "* 10 = " + number * 10);

        /* a better way to do this task
        System.out.println("Please enter number");
        int number = input.nextInt();
        int num = 1;

        System.out.println(number + " * " + num++ " = " + (number * num++));

         */
        //Task-7
        System.out.println("\n\nEnter a number for a side of a square");
        int side = input.nextInt();

        System.out.println("Perimeter of the square = " + side * 4 +
                "\nArea of the square = " + side * side);




    }
}
