package operators.relationalOperators;

public class RelationalOperators {
    public static void main(String[] args) {


        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b;
        boolean isANotEqualToB = a != b;

        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a != b : " + isANotEqualToB);


        boolean isAGreaterThanB = a > b;
        boolean isASmallerThanB = a < b;
        boolean isAGreaterOrEqualToB = a >= b;
        boolean isASmallerOrEqualToB = a <= b;


        System.out.println("a > b : " + isAGreaterThanB);
        System.out.println("a < b : " + isASmallerThanB);
        System.out.println("a >= b : " + isAGreaterOrEqualToB);
        System.out.println("a <= b : " + isASmallerOrEqualToB);


        int x = 3;
        int y = 5;
        int z = 9;

        boolean bool = x + y == --z;
       // bool = x + y + 1 == z;
        System.out.println("Naim's question: " + x + (y == --z));
        //Naim's question false

    }
}
