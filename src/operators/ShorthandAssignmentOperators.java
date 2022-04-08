package operators;

public class ShorthandAssignmentOperators {
    public static void main(String[] args){
        int johnsAge = 5;
        //please find the age of John for 5 years later

       // int johnsAge5YearsLater = johnsAge + 5;

        //System.out.println(johnsAge5YearsLater); this is not liked

        johnsAge += 5;

        System.out.println(johnsAge);

        String name = "Alex"; // how to make it to  Alexander without + + + +...

        //String name2 = name + "an";

       // name = name + "an";

        name += "an";
        name += "d";
        name += "e";
        name += "r";


        System.out.println(name); // Alexan



    }
}
