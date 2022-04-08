package homeworks;
    import java.util.Scanner;


public class Homework02 {
    public static void main(String[] args){

        //Task 1:

        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = inputData.next();

        System.out.println("Enter your last name");
        String lastName = inputData.next();

        System.out.println("Enter your age");
        int age = inputData.nextInt();

        System.out.println("Enter email address");
        inputData.nextLine();
        String emailAddress = inputData.nextLine();

        System.out.println("Enter your phone number");
        inputData.nextLine();
        String phoneNumber = inputData.nextLine();

        System.out.println("Enter your address");
        String address = inputData.nextLine();

        System.out.println("User who joined this program is " + firstName + " " + lastName+"." +
        "\nJohn's age is " + age +". John's email address is " + emailAddress+", " +
                "\nphone number (" + phoneNumber +", and address is " + address+".");


        //Task 2

        System.out.println("\n\n\nWhat is your favorite book?");
        String favBook = inputData.nextLine();

        System.out.println("What is your favorite color?");
        String favColor = inputData.next();

        System.out.println("What is your favorite number");
        int favNumber = inputData.nextInt();

        System.out.println("User's favorite book is: " + favBook +
                "\nUser's favorite color is: " + favColor +
                "\nUser's favorite number is: " + favNumber);







    }
}
