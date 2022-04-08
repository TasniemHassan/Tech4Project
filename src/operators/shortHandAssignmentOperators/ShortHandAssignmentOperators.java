package operators.shortHandAssignmentOperators;

public class ShortHandAssignmentOperators {
    public static void main(String[] args){

        int age = 5; //declared and assigned variable

        System.out.println(age);

        //age = age + 3; // variable got reassigned
            //or
        age +=3; //age = age + 3; oldAge -> 5 + 3

        System.out.println(age);

        age -= 2; // -> 6
        System.out.println(age);

        age *= 2; // -> 12
        System.out.println(age);

        age /= 3; // ->4
        System.out.println(age);

        age %=3;
        System.out.println(age); //->1


    }
}
