package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args){

    /*
Create a program which is generating a random number between 45 - 98
and print it out.
 */
        int randomNum = (int) Math.random() * 54 + 45;
        System.out.println(randomNum); //OR
       System.out.println((int) Math.random() * 54 + 45);

         /*
Create a program which is generating 2 random number between 67 - 85
and print it out.
 */    int random1 = (int)(Math.random() * 19 + 67);
       int random2 = (int)(Math.random() * 19 + 67);

        // System.out.println(((int)(Math.random() * 19 + 67))+ " "
               // + ((int)(Math.random() * 19 + 67)));

        System.out.println("\n\nThe first number is = " + random1 +
                "\nThe second number is = " + random2 +
                "\nThe max of two numbers is = " + Math.max(random1, random2) +
                "\nThe min of two numbers is = " + Math.min(random1, random2));



    }
}
