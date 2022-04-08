package ifElseStatements.ifElseStatements;
import java.util.Scanner;
public class Dividableby7 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = scan.nextInt();

        if(num % 7 ==0){
            System.out.println("The number you entered is dividable by 7!");
        }else{
            System.out.println("The number you entered is not dividable by 7!");

        }
    }
}
