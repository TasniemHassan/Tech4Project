package date_practices;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter their year of Birth
        Then calculate their age and print with the message below

        EXPECTED OUTPUT:
        You are {age} years old!
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your year of Birth");
        int yearOfBirth = scan.nextInt();

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");


        System.out.println("You are " + (Integer.parseInt(dateFormat.format(date))-yearOfBirth) + " years old!");

    }
}
