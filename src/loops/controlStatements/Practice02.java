package loops.controlStatements;
import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args){

        /*
        1. Ask user to enter 2 numbers between 1 and 10
        2. Store number in int variables
        3. compare numbers and find biggest and smallest
        4. Start a loop with below info
                Start input = Math.min(num1,num2)
                EndPoint = Math.max(num1,num2)
              Update = increment
              ** don't print number 5
        5. print out numbers in ascending order

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers between 0 and 10");
        int num1 = input.nextInt() , num2 = input.nextInt();

        for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if(i == 5) continue;
            System.out.print(i+ " ");

        }

       // for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
        //if (i != 5) ;
           // System.out.print(i + " ");
      //  }

    }
}
