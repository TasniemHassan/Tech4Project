package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args){

        int num =36;

        // + (concatenation)
        // valueOf() method

        String numStr1 = num + "";
        String numStr2 = String.valueOf(num);
        String numStr22 = String.valueOf(45 + "" + num);
        String numStr3 = String.valueOf(num + 45);

        System.out.println("numStr1 " + numStr1);
        System.out.println("numStr3 " + numStr3);
        System.out.println("numStr22 " + numStr22);

    }
}
