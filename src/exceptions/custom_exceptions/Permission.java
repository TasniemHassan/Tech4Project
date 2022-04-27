package exceptions.custom_exceptions;

import java.util.Scanner;

public class Permission {
    /*
    Create a method that checks the age of user, takes an argument int age
    if age is more than 16, "it is allowed to have driver licence"
    if the age is less than 16, the method will throw an exception
    "Age of {age} is not allowed to have driver licence"
     */
        public static void checkAge(int age){
            if(age >= 16) System.out.println("it is allowed to have driver license");
            else throw new RuntimeException("Age of " + age + " is not allowed to have driver license");
        }

    public static void checkIn(int day){
        if(day == 1 || day == 7) System.out.println("user is allowed to check in 10 AM to 3 PM");
        else if(day < 1 || day > 7) throw new RuntimeException("The input does not represent any day!!!");
        else System.out.println("user is allowed to check in from 10 AM to 5 PM");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user! Please enter your age");
        int age = scan.nextInt();
        try{
            checkAge(age);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Your age is = " + age);
        }
        System.out.println("End of the program");

        System.out.println("\n\n-----------------------------------------");
        checkIn(3);

        System.out.println("End of the program");
    }
 }
