package operators.shortHandAssignmentOperators;

public class Exercise1 {
    public static void main(String[] args){

        /*
        1. Create the variables
        2. Use shorthand assignments
        3. Print them out
         */

        int a = 8;
        int b = 3;

        System.out.println("a +=b = " + (a +=b)); // a=11
        System.out.println("a -=b = " + (a -=b)); // a=8 bc 11-3=8
        System.out.println("a *=b = " + (a *=b)); // a=24 bc 8*3=24
        System.out.println("a /=b = " + (a /=b)); //a=8 bc 24/3=8
        System.out.println("a %=b = " + (a %=b)); // a=2 bc 8/3= 2 remainder 2

        //a is always changing
    }
}
