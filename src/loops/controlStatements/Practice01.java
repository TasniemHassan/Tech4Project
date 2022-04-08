package loops.controlStatements;
import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args){

        /*
        1. Ask user to enter 2 numbers
        2. Store number in int variables
        3. compare numbers and find biggest and smallest
        4. Start a loop with below info
                Start input = Math.max(num1,num2)
                EndPoint = Math.min(num1,num2)
              Update = decrement
        5. print out numbers in descending order

        +adding another requirement... don't print numbers less than 10
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = input.nextInt() , num2 = input.nextInt();

        for(int i = Math.max(num1, num2); i >= Math.min(num1, num2); i--) {
            System.out.print(i+ " ");
            if(i==10) break;
        }
        }
    }

