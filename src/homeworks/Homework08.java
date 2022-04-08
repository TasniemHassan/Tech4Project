package homeworks;
import java.util.Scanner;
public class Homework08 {
    public static void main(String[] args){

        System.out.println("----Task-1-----");

        int number = (int) (Math.random() * 51);
        System.out.println(number);
        if (number >=10 && number <= 25){
            System.out.println("TRUE");
        }else {
            System.out.println("False");
        }

        System.out.println("----Task-2-----");

        int num = (int) (Math.random()* 100) + 1;
        System.out.println(num);

        if(num >= 1 && num <=25){
            System.out.println(num + " is in the 1st quarter");
        }else if(num >= 26 && num <= 50){
            System.out.println(num + " is in the 2nd quarter");
        }else if(num >= 51 && num <= 75){
            System.out.println(num + " is in the 3rd quarter");
        }else{
            System.out.println(num + " is in the 4th quarter");
        }
        if(num >= 1 && num <=50) {
            System.out.println(num + " is in the 1st half");
        }else {
            System.out.println(num + " is in the 2nd half");
        }

        System.out.println("\n\n----Task-3-----");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 numbers between 1 and 10 (1 and 10 included)");
        int num1 = scan.nextInt(), num2 = scan.nextInt() , num3 = scan.nextInt(),
                num4 = scan.nextInt() , num5 = scan.nextInt();

        int points = 0;

        if (num1 >= 1 && num1<=10){
            points += num1 * 5;
        }
        if (num2 >= 1 && num2<=10){
            points += num2 * 4;
        }
        if (num3 >= 1 && num3<=10){
            points += num3 * 3;
        }
        if (num4 >= 1 && num4<=10) {
            points += num4 * 2;
        }
        if (num5 >= 1 && num5<=10) {
            points += num5;
        }else{
            System.out.println("Number is not in range");
        }
        System.out.println(points);

        }
}
