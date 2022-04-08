package operators.incrementAndDecrementOperators;

public class Exercise1 {
    public static void main(String[] args){

        int i =5;

        int age = 10 * i++; // 10 * 5
        System.out.println(age); //50

        age = 10 * i; //10 * 6
        System.out.println(age); //60

        age = 10 * i; // 10 * 6
        System.out.println(age); // it was incremented 0ne time so 60

        age = 10 * ++i;
        System.out.println(age); // 70

        age = 10 * i++;
        System.out.println(age); //70

        age = 10 * ++i;
        System.out.println(age); //90

        age = 10 * i;
        System.out.println(age); //90

        age = 10 * i++; //90
        System.out.println(age);

        age = 10 * ++i;
        System.out.println(age); //110



    }
}
