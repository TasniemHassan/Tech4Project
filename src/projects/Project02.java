package projects;
import java.util.Scanner;
public class Project02 {
    public static void main(String[] args){
        //Task-1
        Scanner userEnter = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int number1 = userEnter.nextInt();
        int number2 = userEnter.nextInt();
        int number3 = userEnter.nextInt();

        int product = number1 * number2 * number3;
        System.out.println("The product of the numbers entered is = " + product);


        //Task-2

       System.out.println("\n\nWhat is your first name?");
       String firstName = userEnter.next();

       System.out.println("What is your last name?");
       String lastName = userEnter.next();

       System.out.println("What is your year of birth?");
      int yearOfBirth = userEnter.nextInt();

       int currentYear = 2022;
       System.out.println(firstName + " " + lastName +"'s age is = " + (currentYear - yearOfBirth));

       //Task-3

        System.out.println("\n\nWhat is your full name?");
        userEnter.nextLine();
        String fullName = userEnter.nextLine();

        System.out.println("What is your weight in kg?");
        double kgWeight = userEnter.nextDouble();

        System.out.println(fullName +"'s weight is = " + (kgWeight * 2.205) + (" lbs."));

        //Task-4

        System.out.println("\n\nWhat is your full name?");
        userEnter.nextLine();
        String fullName1 = userEnter.nextLine();
        System.out.println("What is your age?");
        int age1 = userEnter.nextInt();
        System.out.println("What is your full name?");
        userEnter.nextLine();
        String fullName2 = userEnter.nextLine();
        System.out.println("What is your age?");
        int age2 = userEnter.nextInt();
        System.out.println("What is your full name?");
        userEnter.nextLine();
        String fullName3 = userEnter.nextLine();
        System.out.println("What is your age?");
        int age3 = userEnter.nextInt();

        int avgAge = (age1 + age2 + age3) / 3;
        int maxAge12 = Math.max(age1,age2);
        int maxAge123 = Math.max(maxAge12 , age3);
        int minAge12 = Math.min(age1,age2);
        int minAge123 = Math.min(minAge12 , age3);

        System.out.println(fullName1 + "'s age is " + age1 + "." +
                "\n" + fullName2 +"'s age is " + age2 + "." +
                "\n" + fullName3 +"'s age is " + age3 + ". \n"+
                "The average age is " + avgAge + ". \n" +
                "The eldest age is " + maxAge123 + ". \n" +
                "The youngest age is " + minAge123 + ".");
    }
}
