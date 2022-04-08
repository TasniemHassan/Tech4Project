package utilities;

public class MathHelper {

        //create a method that takes 3 ints and returns the max
      public static int maxOfThree(int num1 , int num2, int num3){
          return Math.max(num1 , Math.max(num2, num3));
        }

        //method overloading
    public static double maxOfThree(double num1 , double num2 , double num3){
          return Math.max(num1, Math.max(num2, num3));
    }
    //Create a method that takes 3 byte numbers and returns the smallest


    public static byte minOfThree(byte num1 , byte num2, byte num3){
         return (byte) Math.min(num1 , Math.min(num2 , num3)); //need to cast or it will return an int
    }


    /*
    Please create a method that takes an int as an argument and returns true if t is even
    returns false if it is odd

    return type
    isEven
    static
    public

     */

    public static boolean isEven (int number){
        return number % 2 == 0;

    }


    //Create a method called isOdd() that takes one int parameter and returns
    //true if the number is odd, false otherwise

    public static boolean isOdd(int num1){
        return num1 % 2 == 1;
    }

    public static boolean isPositive(int number){
        return number > 0;
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static boolean isZero(int number) {
        return number == 0;
    }

}
