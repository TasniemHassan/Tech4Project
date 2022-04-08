package ifElseStatements.ifElseStatements;
import java.util.Scanner;
public class FindTheSmallestOf2Numbers {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

       /* if(num1<num2){
            System.out.print(num1);

        }else{
            System.out.println(num2); }

            //OR Short cut

            if(num1<num2) System.out.print(num1);

            else System.out.println(num2);

            //3rd way - using ternary operator

        */

            /*
            Ternary  operator
            -Java ternary operator can be used instead of if-else statement
            -it is used alot in java programming
            Note: it can be used only for simple if-else statement
            You cannot used for if -else if-else and nested if else statements
             */

            int smallestNumber = num1 < num2 ? num1 : num2;

            System.out.println(smallestNumber);





            System.out.println("End of the program!");// should get in habit of including this


    }
}
