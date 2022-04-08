package ifElseStatements.ifElseIfStatements;

public class Exercise1 {
    public static void main(String [] args){


        /*
        Write a program that generates a random number between -10, 10 (inclusive)
        and if number is positive print out "number is Positive!", if the
        number is negative print out "number is Negative!" , and if the number is 0 print out
        "number us Zero!"

        Run1
        input 6
        output number is Positive!

        Run2 input -5
        output Number is Negative!

        Run 3 input 0
        output number is Zero!


        1. Generate a number
        2. create if statements for checking 3 different possibilities
        3. do the proper action for every singe possibility


         */

        int num = (int) (Math.random () * 21 + (-10));
            System.out.println(num);
        if(num < 0){ //Negative
            System.out.println("number is Negative!");
        }
        if(num > 0){ // Positive
            System.out.println("number is Positive!");
        }
        if(num == 0){ // Zero
            System.out.println("number is Zero!");
        }

        // The 3 different possibilities ar linked that means I can use if, elseif

        if (num < 0){
            System.out.println("number is Negative!");
        }else if(num > 0){
            System.out.println("number is Positive!");
        }else {
            System.out.println("number is Zero!");
        }
    }
}
