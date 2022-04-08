package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args){

        String num1 = "23";
        String num2= "12";

        // 23 + 12 = 35

        System.out.println(num1 + num2); //2312

        //need to convert to make addition

        int num1Int = Integer.parseInt(num1); //returns a primitive
        int num2Int = Integer.parseInt(num2);

        System.out.println(num1Int + num2Int); //35

        Integer num1Integer = Integer.valueOf(num1); // returns wrapper(representation of primitive) class
        Integer num2Integer = Integer.valueOf(num2);

            System.out.println(num1Integer + num2Integer); //35

            Boolean b = true;




    }
}
