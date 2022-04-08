package loops;

public class UnderstandingLoops {
    public static void main(String[] args){
        /*
        Write a Java program to print "Hello" 5 times

         */

       /* System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        */

        /*
        SYNTAX:
        for(start; termination; update){
            //Block of code to execute
        }

        Loops are used to execute a block of code repeatedlu
         */

        for(int count = 1; count <= 5; count++) {
            System.out.println("Hello");
        }
                int year = 2022;
            for(int age = 10; age <= 35; age++){

                System.out.println("The age is = " + age + "in " + year);
                year++;
        }
    }
}
