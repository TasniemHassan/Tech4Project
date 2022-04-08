package operators.arithmeticOperators;

public class Division {
    public static void main(String[] args){

        double num1 = 15;
        double num2 = 3;
        int num3 = 4;
        int num4 = 10;

        double division = num1 / num2;
        double divisionByInt = num1 / num3;
        double divisionByDouble = num4 / num2;



        System.out.println("num1 / num2 = " + division); //double/double
        System.out.println("num1 / num3 = " + divisionByInt); //double/int
        System.out.println("num4 / num2 = " + divisionByDouble); //int/double

        System.out.println("num1 / num2 = " + (num1 / num2)); //must have paranthesis to have the division take place
        System.out.println("num1 / num2 = " + num4 + num2); // this will just concatenate it and connect numbers together
        System.out.println("num1 / num2 = " + (num4 + num2)); // this will sum it up

        System.out.println("num1 / num2 = " + (15.0 / 3.0)); //can also put numbers directly, must have decimal bc double





    }
}
