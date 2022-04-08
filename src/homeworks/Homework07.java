package homeworks;
import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args){

        System.out.println("-----Task-1---");

        int randomNum1 = (int) (Math.random() * 11) , randomNum2 = (int) (Math.random() * 11) ,
                randomNum3 = (int) (Math.random() * 11) , randomNum4 = (int) (Math.random() * 11);
        int i = 1;
        System.out.println("Number " + i++ + " = " + randomNum1 + "\nNumber " + i++ + " = " + randomNum2 +
                "\nNumber " + i++ + " = " + randomNum3 + "\nNumber " + i++ + " = " + randomNum4);

        System.out.println("Absolute difference of " + randomNum1 + " with 5 = " + Math.abs (randomNum1 - 5) +
                "\nAbsolute difference of " + randomNum2 + " with 5 = " + Math.abs (randomNum2 - 5) +
                "\nAbsolute difference of " + randomNum3 + " with 5 = " + Math.abs (randomNum3 - 5) +
                "\nAbsolute difference of " + randomNum4 + " with 5 = " + Math.abs (randomNum4 - 5));

        System.out.println("Greatest number is "
                + Math.max(Math.max(randomNum1,randomNum2) , Math.max(randomNum3,randomNum4))+
                "\nSmallest number is "
                + Math.min(Math.min(randomNum1,randomNum2) , Math.min(randomNum3,randomNum4)));


        System.out.println("\n\n----Task-2----");

        int num1= (int) (Math.random() * 101) - 50 , num2= (int) (Math.random() * 101) - 50
                , num3= (int) (Math.random() * 101) - 50 , num4= (int) (Math.random() * 101) - 50
                , num5= (int) (Math.random() * 101) - 50 , num6= (int) (Math.random() * 101) - 50
                , num7= (int) (Math.random() * 101) - 50 , num8= (int) (Math.random() * 101) - 50;

        int j = 1;
        System.out.println("Number " + j++ + " = " + num1);
        System.out.println("Number " + j++ + " = " + num2);
        System.out.println("Number " + j++ + " = " + num3);
        System.out.println("Number " + j++ + " = " + num4);
        System.out.println("Number " + j++ + " = " + num5);
        System.out.println("Number " + j++ + " = " + num6);
        System.out.println("Number " + j++ + " = " + num7);
        System.out.println("Number " + j++ + " = " + num8);

        int greatestNumber = (int) Math.max(Math.max(Math.max(num1, num2) , Math.max(num3 , num4))
                , Math.max(Math.max(num5 , num6) , Math.max(num7 ,num8)));
        int smallestNumber = (int) Math.min(Math.min(Math.min(num1 , num2) , Math.min(num3, num4))
                , Math.min(Math.min(num5, num6) , Math.min(num7 , num8)));


        System.out.println("The greatest number is = " + greatestNumber +
                "\nThe smallest number is = " + smallestNumber +
                "\nAverage of 8 numbers is = "
                + (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) / 8 +
                "\nAbsolute difference between smallest and greatest is = " +
                Math.abs(smallestNumber - greatestNumber));

        if(num3 > 0){
            System.out.println("The 3rd number is Positive = True"); //Can I combine these 2 if else

        }else{
            System.out.println("The 3rd number is Positive = False");
        }

        if(num5 < 0){
            System.out.println("The 5th number is Negative = True");
        }else{
            System.out.println("The 5th number is Negative = False");

        }
        if(num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0
                || num7 == 0 || num8 == 0){
            System.out.println("There is at least one zero amongst those numbers = True" );

        }else {
            System.out.println("There is at least one zero amongst those numbers = False");
        }


       System.out.println("\n\n----Task-3---");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 7 numbers between 0 and 50 (50 included)");
        int number1 = input.nextInt() , number2 = input.nextInt() , number3 = input.nextInt()
                , number4 = input.nextInt() , number5 = input.nextInt() , number6 = input.nextInt()
                , number7 = input.nextInt();

        System.out.println("Number 1 = " + number1 + "\nNumber 2 = " + number2 + "\nNumber 3 = " + number3 +
                "\nNumber 4 = " + number4 + "\nNumber 5 = " + number5 + "\nNumber 6 = " + number6 +
                "\nNumber 7 = " + number7);
                // edit to make more dynamic
        System.out.println("The greatest number is = "
                + Math.max(Math.max(Math.max(number1 , number2) , Math.max(number3 , number4))
                , (Math.max(Math.max(number5, number6) , number7))) +
                        "\nSmallest number is = " +
                Math.min(Math.min(Math.min(number1 , number2) , Math.min(number3 , number4))
                        , (Math.min(Math.min(number5, number6) , number7))) +
                "\nAverage of 7 numbers is = " +
                (number1 + number2 + number3 + number4 + number5 + number6 + number7)/7);

        if(number1 >= 10){
            System.out.println("First number is greater than or equal to 10 = True");

        }else{

        System.out.println("First number is greater than or equal to 10 = False");

        }

        if(number7 <= 40){
            System.out.println("Last number is less than or equal to 40 = True");
        }else {
            System.out.println("Last number is less than or equal to 40 = False");
        }

        if(number1 > 25 && number7 > 25){
            System.out.println("Both first and last numbers are greater than 25 = True");
        }else{
            System.out.println("Both first and last numbers are greater than 25 = False");
        }
        // instead of above if else we could use below statement
        //System.out.println("Both first and last numbers are greater than 25 = "
        // + (number1 > 25 && number7 > 25) ;
        if (number1 == 0 || number1 == 50 || number7 == 0 ||
                number7 == 50 || number2 == 0 || number2 == 50 || number3 == 0 || number3 == 50
            || number5 == 0 || number5 == 50 || number6 == 0 || number6 == 50 ||
                number4 == 0 || number4 == 50){
            System.out.println("At least one of those numbers is 0 or 50 = True");
        }else{
            System.out.println("At least one of those numbers is 0 or 50 = False");
        }
        if(number1 <= 40 && number2 <= 40 || number3 <= 40  ||
                number4 <= 40  || number5 <= 40  || number6 <= 40 ||
                number7 <= 40 ){
            System.out.println("There is no number between 40 and 50 = True");
        }else{
            System.out.println("There is no number between 40 and 50 = False");
        }



        System.out.println("\n\n----Task-4---");

    int n1Between0and100 = (int) (Math.random() * 101),
            n2Between0and100 = (int) (Math.random() * 101) ,
            n3Between0and100 = (int) (Math.random() * 101);


    if(n1Between0and100 > 25 && n2Between0and100 > 25 && n3Between0and100 > 25){
        System.out.println("True! All numbers are greater than 25.");
    }else{
        System.out.println("False! One or more numbers are less than or equal to 25.");
    }

        System.out.println("---Task-5---");

    System.out.println("Enter a number between 1 to 7 (1 and 7 are included)");
    int number1Entered = input.nextInt();

    if (number1Entered == 1){
        System.out.println("Monday");
    }else if (number1Entered == 2){
        System.out.println("Tuesday");
    }else if (number1Entered == 3){
        System.out.println("Wednesday");
    }else if (number1Entered == 4){
        System.out.println("Thursday");
    }else if (number1Entered == 5){
        System.out.println("Friday");
    }else if (number1Entered == 6){
        System.out.println("Saturday");
    }else if (number1Entered == 7){
        System.out.println("Sunday");
    }else{
        System.out.println("The number entered does not represent a day");
    }

    System.out.println("\n\n----Task-6---");

    System.out.println("Enter a number between -10 to 10 (-10 and 10 are included)");

    int numEnteredBetween_10And10 = input.nextInt();

    if(numEnteredBetween_10And10 > 0){
        System.out.println("Number entered is \nPOSITIVE");
    }else if(numEnteredBetween_10And10 < 0){
        System.out.println("Number entered is \nNEGATIVE");
    }else  {
        System.out.println("Number entered is \nZERO");
    }
    if (numEnteredBetween_10And10 % 2 == 0){
        System.out.println("Number entered is \nEVEN");

    }else {
        System.out.println("Number entered is \nODD");
    }

    System.out.println("\n\n---Task-7---");

    System.out.println("Tell me your 3 exam results?");
    int examScore1 = input.nextInt() , examScore2 = input.nextInt() ,
            examScore3 = input.nextInt();

    if((examScore1 + examScore2 + examScore3)/3 >= 70){
        System.out.println("YOU PASSED!");

    }else{
        System.out.println("YOU FAILED!");
    }

    System.out.println("\n\n---Task-8---");

    System.out.println("Enter 3 numbers");
    int userEnteredNum1 = input.nextInt() , userEnteredNum2 = input.nextInt() ,
            userEnteredNum3 = input.nextInt();

    if(userEnteredNum1 == userEnteredNum2 && userEnteredNum1 == userEnteredNum3){
        System.out.println("TRIPLE MATCH");
    }else if (userEnteredNum1 == userEnteredNum2 || userEnteredNum1 == userEnteredNum3
            || userEnteredNum2 == userEnteredNum3) {
        System.out.println("DOUBLE MATCH");
    } else{
        System.out.println("NO MATCH");



        System.out.println("\n\n END PROGRAM!");
    }
    }
}
