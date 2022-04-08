package homeworks;
import java.util.Scanner;
public class Homework11 {
    public static void main(String[] args) {

       /* System.out.println("--------TASK -1-------");
        String space = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) space += i + " - ";
        }
        if (!space.isEmpty())
            System.out.println(space.substring(0, space.length() - 3));
        else System.out.println(space);


        System.out.println("\n\n--------TASK-2-------\n\n");
        String s = "";

        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) s += i + " - ";
        }
        if (!s.isEmpty())
            System.out.println(s.substring(0, s.length() - 3));
        else System.out.println(s);

        System.out.println("\n\n--------TASK-3-------\n\n");
        String s1 = "";

        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) s1 += i + " - ";
        }
        if (!s1.isEmpty())
            System.out.println(s1.substring(0, s1.length() - 3));
        else System.out.println(s1);

        System.out.println("\n\n--------TASK-4-------\n\n");
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + (i * i) + "\n");
        }

        System.out.println("\n\n--------TASK-5-------\n\n");
        int sum = 0;

        for (int i = 1; i <= 10; ++i) {
            sum += i;
        }

        System.out.println("The sum of numbers 1 to 10 is = " + sum);

        System.out.println("\n\n--------TASK-6-------\n\n");

        */

        Scanner userEnter = new Scanner(System.in);
        /*System.out.println("Please enter a positive number");
        int num = userEnter.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + num + "! = " + factorial);

         */

        System.out.println("\n\n--------TASK-7-------\n\n");
            /*
            1. create scanner object to get Full Name
            2. create a counter container to hold count outside the loop
            3. create a fori loop and find start and end point
            this case: start : 0 end : str.length()
            4. check every single char to see if they are a vowel
            5. print proper statement with # of vowels in string
             */
        System.out.println("Please enter your full name");
        String fullName = userEnter.nextLine();

        int vowelCount = 0;
        for (int i = 0; i < fullName.length(); i++) {
            char letter = fullName.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' | letter == 'u'
                    || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                vowelCount++;
            }

        }
        System.out.println("There are " + vowelCount + " vowel letters in this full name.");


        System.out.println("\n\n--------TASK-8-------\n\n");

        /*
        1. Create a do while loop
        2. Get number from user with scanner add them to sum
            -and if they are more than or equal to 100
            print "Sum of the entered numbers is at least 100"
        3.   If the number is more than or equal to 100 AND we are at the first run BREAK.
                - and print out "This number is already more than 100"
        4. create a container for counter, the sum and number
         */
        int number = 0; // used for getting a number from user
       int sum =0; // for getting the SUM of given Numbers
       int attempt = 1; // for checking how many times this loop is run
        // task need the sum to ==100 so it will keep adding numbers "while sum is less than 100"
        do {
            System.out.println("Please enter a number");
            number = userEnter.nextInt();
            if(attempt==1 && number >=100) { // most specific condition so put it 1st
                System.out.println("This number is already more than 100");
                break; // print 1st then break or message wont break
            }else{
                sum += number;
                if(sum >= 100){
                    System.out.println("Sum of the entered numbers is at least 100");
                }
            }
            attempt++;
        }while(sum < 100);


        System.out.println("\n\n--------TASK-9-------\n\n");

        /*
        1. two containers for 0, 1 and another one for the sum, string for message
        2. create a fori loop that runs 'n' times
        3. print out the series
         */


        int n1 = 0;
        int n2 = 1;
        int total = 0;
        String message = "";

        /*
                  n1  n2 total
          i = 0 | 0  1  1
          i = 1 | 1  1  2
          i = 2 | 1  2  3
          i = 3 | 2  3  5
         */

        for (int i = 0; i < 7; i++){
            message += n1 + " - ";
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
        System.out.println(message.substring(0 , message.length() - 3));

        System.out.println("\n\n--------TASK-10-------\n\n");



    }
}

