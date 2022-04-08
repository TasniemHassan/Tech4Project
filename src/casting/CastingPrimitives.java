package casting;

public class CastingPrimitives {
    public static void main(String[] args){
        /*
        double > float > long > int > char > short > byte
         */

        int myInt = 32;
        long myLong = myInt;   // implicit casting

        myInt = (int) myLong;     // explicit casting


        int mySecondInt = 'B';  //implicit casting
        char myChar = (char) 56; //or char mychar = 56; you don't have to cast
        char mySecondChar = 56;

        int myThirdInt = (int) 45.4; //Say the data type you want to convert not the other one
        short myShort = (short) myChar;
        char myThirdChar = (char) myShort;


        /*
        Short max = 32767
        Short min = -32768
        Int max = 2147483647
        Int min = -2147483648
         */
        System.out.println("Short max = " + Short.MAX_VALUE);
        System.out.println("Short min = " + Short.MIN_VALUE);
        System.out.println("Int max = " + Integer.MAX_VALUE);
        System.out.println("Int min = " + Integer.MIN_VALUE);


        byte num1 = 45;
        int num2 = num1; //smaller into bigger is implicit

        double num3 = 13.6;
        float num4 = (float) num3; //explicit bc bigger is going into smaller

        int num5 = 45;
        short num6 = 34;

        char c = (char) num5; // we have to cast for both bc char should be positive everytime
        c = (char) num6;


    }

}
