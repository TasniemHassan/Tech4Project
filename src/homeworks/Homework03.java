package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args){
            // Task-1
        Scanner enterNumber = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10");
        int number1= enterNumber.nextInt();

        System.out.println("Enter a second number between 1 and 10");
        int number2= enterNumber.nextInt();

        System.out.println("The number 1 entered by user is = " + number1 +
                "\nThe number 2 entered by user is = " + number2 +
                "\nThe sum of number 1 and 2 entered by user is = " + (number1 + number2));

        //Task-2
        /*
        Pseudo Code:
        1.Use a scanner to read data from user
        2.Store data as given in the requirement
        3.Find division
        4.Print all as required in the task
         */
        System.out.println("\nEnter a number with a decimal");
        double floatNumber1 = enterNumber.nextDouble();

        System.out.println("Enter a second number with decimal");
        double floatNumber2 = enterNumber.nextDouble();

        System.out.println("The number 1 entered by user is = " + floatNumber1 +
                "\nThe number 2 entered by user is = " + floatNumber2 +
                "\nThe division of number 1 and 2 entered by user is = " +
                (floatNumber1 / floatNumber2));



        //Task-3

            System.out.println("\n1. "+ (-10+7*5) +
                    "\n2. " + ((72+24)%24) +
                    "\n3. " + (10+-3*9/9) +
                    "\n4. " + (5+18/3*3-(6%3)));


        //Task-4

        System.out.println("\nEnter a floating number");
        double floatingNum1 = enterNumber.nextDouble();

        System.out.println("Enter a second floating number");
        double floatingNum2 = enterNumber.nextDouble();

        System.out.println("The sum of the given numbers is = " +
                (floatingNum1 + floatingNum2) + "\nThe product of the given numbers is = "+
                (floatingNum1 * floatingNum2) + "\nThe subtraction of the given numbers is = " +
                (floatingNum1 - floatingNum2) + "\nThe division of the given number is = " +
                (floatingNum1 / floatingNum2) + "\nThe remainder of the given number is = " +
                (floatingNum1 % floatingNum2));



        //Task-5

        double width = 7.5;
        double height = 10.5;

        System.out.println("\nThe area of the rectangle = " + (width * height) +
                "\nThe perimeter of the rectangle = " + ((2*width) + (2*height)));

        //Task-6

        double salary = 90000;

        System.out.println("\nA Software Engineer in Test can earn " + (3 * salary) + " in " +
                "\n3 years.");













    }
}
