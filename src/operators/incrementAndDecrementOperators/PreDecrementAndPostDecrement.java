package operators.incrementAndDecrementOperators;

public class PreDecrementAndPostDecrement {
    public static void main(String[] args) {

        int a = 5;
        //pre decrement right away, post next time

        System.out.println(--a);
        System.out.println(a);


        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
    }
}
