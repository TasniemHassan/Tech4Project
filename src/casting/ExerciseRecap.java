package casting;
import java.util.Scanner;
public class ExerciseRecap {
    public static void main(String[] args ){

        /*
        Write a program asks user for 5 of their grades as string
        and print out their avg

        input: 45 50 55 60 65
        output: 55
         */
        Scanner input =new Scanner(System.in);

       /* System.out.println("Please enter 5 grades");
        String grade1 = input.next();
        String grade2 = input.next();
        String grade3 = input.next();
        String grade4 = input.next();
        String grade5 = input.next();

        double grade1D = Double.parseDouble(grade1);
        double grade2D = Double.parseDouble(grade2);
        double grade3D = Double.parseDouble(grade3);
        double grade4D = Double.parseDouble(grade4);
        double grade5D = Double.parseDouble(grade5);

        System.out.println( (int) (grade1D + grade2D + grade3D + grade4D + grade5D)/ 5);
        //OR
       /* double grade1D = Double.parseDouble(input.next());
        double grade2D = Double.parseDouble(input.next());
        double grade3D = Double.parseDouble(input.next());
        double grade4D = Double.parseDouble(input.next());
        double grade5D = Double.parseDouble(input.next());

        */

       /*System.out.println( (int) (Double.parseDouble(input.next()) + Double.parseDouble(input.next()) +
                Double.parseDouble(input.next()) + Double.parseDouble(input.next()) +
                Double.parseDouble(input.next()))/ 5);//Can simply put this one line instead of the others



        /*
        Write a program that asks users their balance as a string and asks for
         3 transactions as string end print out the end result as double.


            Input:
        "What is your balance?"
        user: 456.7

        "What is your next 3 transactions?
        user:
        34.1
        65.3
        28.4

        Output:
        "Your balance is now = x"

*/
      /*  System.out.println("What is your balance?");
        String balance = input.next();
        System.out.println("What is your next 3 transactions?");
        String trans1 = input.next() , trans2 = input.next() , trans3 = input.next();

        Double balanceD = Double.valueOf(balance);
        Double trans1D = Double.valueOf(trans1);
        Double trans2D = Double.valueOf(trans2);
        Double trans3D = Double.valueOf(trans3);

        System.out.println("Your balance is now = $" +
                (balanceD - trans1D - trans2D - trans3D));

       */

        // refer to problem on general
        /*
        Please enter your name John Doe
Please enter your age 45
Please enter your phone number: (123) 123 1234
Enter the ages of your kids
12
22
17
Your name is John Doe, your phone number is (123) 123 1234,
Your are 45 years old. Your oldest kid is 22 years old, your
youngest is 12, the difference between the oldest and youngest is 10 years.

         */

        System.out.println("Please enter your name");
        String fullName = input.nextLine();

        System.out.println("Please enter your age");
        String age = input.next();

        System.out.println("Please enter your phone number:");
        input.nextLine();
        String phoneNumber = input.nextLine();

        System.out.println("Enter the ages of your kids");
        String age1 = input.next() , age2 = input.next() , age3 = input.next();
        int age1Int = Integer.parseInt(age1) , age2Int = Integer.parseInt(age2) ,
                age3Int = Integer.parseInt(age3);

        int oldestKid = Math.max(age3Int, Math.max(age1Int,age2Int));
        int youngestKid = Math.min(age3Int, Math.min(age1Int,age2Int));

        int ageDifference = oldestKid - youngestKid;


        System.out.println("Your name is " + fullName + ", your phone number is " + phoneNumber +
                ", \nYour are " + age + " years old. Your oldest kid is " + oldestKid + " years old, your " +
                "\nyoungest is " + youngestKid + ", the difference between the oldest and youngest is " +
                ageDifference + " years.");



    }

}
