package mathClass;

public class FindAbs {
    public static void main(String[] args){

        Math.abs(6-10);
        System.out.println(Math.abs(6-10));

        int abs = Math.abs(6 - 10 + 4 + 1 + 65 - 34 * 12 / 23 % 12);
        // int abs = Math.abs(32); same thing

       // int abs2 = Math.abs(5, 7); not gonna work bc java reads this as 2 numbers but
                                     // only takes 1 number
            System.out.println(abs);

            int x = 53;
            int y = 34;
            System.out.println(Math.abs(y - x));




    }
}
