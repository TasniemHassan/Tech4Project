package exceptions;

public class Example01 {
    public static void main(String[] args) {

        /*
        Handle the unchecked exception below and report with a message
         */

        String[] names = {"Alex", "John", "Max"};

       // System.out.println(names[-5]); //ArrayIndexOutOfBoundsException

        try {
            System.out.println(names[-5]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("An exception occurs here");
        }
        System.out.println("End of the program!");
    }
}
