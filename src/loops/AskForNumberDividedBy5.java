package loops;
import java.util.Scanner;
public class AskForNumberDividedBy5 {
    public static void main(String[] args){


        Scanner enter = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = enter.nextInt();


        while (num % 5 !=0){
            System.out.println("This number is not divisible by 5");
            System.out.println("Please enter a new number");
            num = enter.nextInt();
        }
        System.out.println("This number is divisible by 5");


        System.out.println("-----Do-while way----");
        int number;
        do{
            System.out.println("Please enter a number");
            number =enter.nextInt();
            if(number % 5 !=0); System.out.println("This number is not divisible by 5");
        }while(number % 5 !=0);
        System.out.println("The number you entered is divisible by 5");
    }
}
