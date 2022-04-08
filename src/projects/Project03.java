package projects;

public class Project03 {
    public static void main(String[] args){


        System.out.println("---Task-1----");

        String s1 = "24";
        String s2 = "5";

        double s1Int = Double.parseDouble(s1);
        double s2Int = Double.parseDouble(s2);

        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (int) (s1Int + s2Int) +
                "\nThe subtraction of " + s1 + " and " + s2 + " = " + (int) (s1Int - s2Int) +
                "\nThe division of " + s1 + " and " + s2 + " = " +  (s1Int / s2Int) +
                "\nThe multiplication of " + s1 + " and " + s2 + " = " + (int) (s1Int * s2Int) +
                "\nThe remainder of " + s1 + " and " + s2 + " = " + (int) (s1Int % s2Int));


        System.out.println("\n\n---Task-2----");

        int randomNumber = (int) (Math.random() * 35) + 1;

        System.out.println(randomNumber);

            boolean isPrime =false;
       for (int i =2; i<= Math.sqrt(randomNumber); i++){
           if(randomNumber % i == 0) isPrime = false;
           else isPrime = true;
       }
       if(isPrime) System.out.println("THE NUMBER IS PRIME");
       else System.out.println("THE NUMBER IS NOT PRIME");



        System.out.println("\n\n---Task-3---");

        int num1 = (int) (Math.random() * 50) + 1;
        int num2 = (int) (Math.random() * 50) + 1;
        int num3 = (int) (Math.random() * 50) + 1;

        System.out.println("Random number 1 = " + num1);
        System.out.println("Random number 2 = " + num2);
        System.out.println("Random number 3 = " + num3);

        int lowestNumber = Math.min(Math.min(num1 , num2) , num3);
        int greatestNumber = Math.max(Math.max(num1 , num2) , num3);
        System.out.println("The Lowest Number is = "
                + lowestNumber);
            //ask how to get middle number

            if(num1 > num2 && num1 < num3){
                System.out.println("The Middle number is = " + num1);

            }else if(num2 > num1 && num2 < num3){
                System.out.println("The Middle number is = " + num2);
            }else{
                System.out.println("The Middle number is = " + num3);
            }
            System.out.println("The Greatest Number is = "
                    + greatestNumber);


            System.out.println("\n\n---Task-4---");
            System.out.println("\nTest Data 1:");
            char c = '5';
            System.out.println("char c = \'5\'\n");
            if(c >= 65 && c <= 90 || c >=97 && c <= 122 ) {

                System.out.println("Given char is a letter");
            }else{
                System.out.println("Invalid character detected!!!");
            }
            if(c >= 65 && c <= 90){
                System.out.println("The letter is uppercase");
            }else if (c >=97 && c <= 122){
                System.out.println("The letter is lowercase");
            }else {

            }

        System.out.println("\nTest Data 2:");
        char c2 = 'a';
        System.out.println("char c2 = \'a\'\n");
        if(c2 >= 65 && c2 <= 90 || c2 >=97 && c2 <= 122 ) {

            System.out.println("Given char is a letter");
        }else{
            System.out.println("Invalid character detected!!!");
        }
        if(c2 >= 65 && c2 <= 90){
            System.out.println("The letter is uppercase");
        }else if (c2 >=97 && c2 <= 122){
            System.out.println("The letter is lowercase");
        }else {

        }

        System.out.println("\nTest Data 3:");
        char c3 = 'R';
        System.out.println("char c3 = \'R\'\n");
        if(c3 >= 65 && c3 <= 90 || c3 >=97 && c3 <= 122 ) {

            System.out.println("Given char is a letter");
        }else{
            System.out.println("Invalid character detected!!!");
        }
        if(c3 >= 65 && c3 <= 90){
            System.out.println("The letter is uppercase");
        }else if (c3 >=97 && c3 <= 122){
            System.out.println("The letter is lowercase");
        }else {

        }

        System.out.println("\n\n---Task-5---");

        System.out.println("\nTest Data 1:");
        char c4 = '#';

        System.out.println("char c4 = \'#\'\n");
        if(c4 >= 65 && c4 <= 90 || c4 >=97 && c4 <= 122 ) {

            System.out.println("Given char is a letter");
        }else{
            System.out.println("Invalid character detected!!!");
        }
        if(c4 == 65 || c4 == 69 || c4 == 73 || c4 == 79 || c4 == 85 ||c4 == 97
                || c4 ==101 || c4 == 105 || c4 == 111 || c4 == 117) {
            System.out.println("The letter is vowel");
        }else if (c4 >65 && c4 < 69 || c4 > 69 && c4 < 73 || c4 > 73 && c4 < 79
        || c4 > 79 && c4 < 85 && c4 > 85 && c4 <= 90 || c4 > 97 && c4 < 101|| c4 > 101 && c4 < 105
        || c4 > 105 && c4 < 111 || c4 > 111 && c4 < 117 || c4 > 117 && c4 <= 122){
            System.out.println("The letter is consonant");
        }else {

        }

        System.out.println("\nTest Data 2:");
        char c5 = 'E';

        System.out.println("char c5 = \'E\'\n");
        if(c5 >= 65 && c5 <= 90 || c5 >=97 && c5 <= 122 ) {

            System.out.println("Given char is a letter");
        }else{
            System.out.println("Invalid character detected!!!");
        }
        if(c5 == 65 || c5 == 69 || c5 == 73 || c5 == 79 || c5 == 85 ||c5 == 97
                || c5 ==101 || c5 == 105 || c5 == 111 || c5 == 117) {
            System.out.println("The letter is vowel");
        }else if (c5 >65 && c5 < 69 || c5 > 69 && c5 < 73 || c5 > 73 && c5 < 79
                || c5 > 79 && c5 < 85 && c5 > 85 && c5 <= 90 || c5 > 97 && c5 < 101|| c4 > 101 && c4 < 105
                || c5 > 105 && c5 < 111 || c5 > 111 && c5 < 117 || c5 > 117 && c5 <= 122){
            System.out.println("The letter is consonant");
        }else {

        }

        System.out.println("\nTest Data 3:");
        char c6 = 'R';

        System.out.println("char c6 = \'R\'\n");
        if(c6 >= 65 && c6 <= 90 || c6 >=97 && c6 <= 122 ) {

            System.out.println("Given char is a letter");
        }else{
            System.out.println("Invalid character detected!!!");
        }
        if(c6 == 65 || c6 == 69 || c6 == 73 || c6 == 79 || c6 == 85 ||c6 == 97
                || c6 ==101 || c6 == 105 || c6 == 111 || c6 == 117) {
            System.out.println("The letter is vowel");
        }else if (c6 >65 && c6 < 69 || c6 > 69 && c6 < 73 || c6 > 73 && c6 < 79
                || c6 > 79 && c6 < 85 || c6 > 85 && c6 <= 90 || c6 > 97 && c6 < 101|| c4 > 101 && c4 < 105
                || c6 > 105 && c6< 111 || c6 > 111 && c6 < 117 || c6 > 117 && c6 <= 122){
            System.out.println("The letter is consonant");
        }else {

        }

        System.out.println("\n\n---Task-6---");

        System.out.println("\nTest Data 1:");
        char c7 = '8';
        System.out.println("char c7 = \'8\'\n");
        if(c7 >= 32 && c7 <= 47 || c7 >= 58 && c7 <=64 ||
                c7 >= 91 && c7 <=96 || c7 >= 123 && c7 <= 126) {
            System.out.println("The given char is a special character");
        }else {
            System.out.println("Invalid character detected!!!");
        }
        if(c7 >= 32 && c7 <= 47 || c7 >= 58 && c7 <=64 ||
                c7 >= 91 && c7 <=96 || c7 >= 123 && c7 <= 126){
            System.out.println("Special character is = " + c7);
        }else{

        }

        System.out.println("\nTest Data 2:");
        char c8 = '*';
        System.out.println("char c8 = \'*\'\n");
        if(c8 >= 32 && c8 <= 47 || c8 >= 58 && c8 <=64 ||
                c8 >= 91 && c8 <=96 || c8 >= 123 && c8 <= 126) {
            System.out.println("The given char is a special character");
        }else {
            System.out.println("Invalid character detected!!!");
        }
        if(c8 >= 32 && c8 <= 47 || c8 >= 58 && c8 <=64 ||
                c8 >= 91 && c8 <=96 || c8 >= 123 && c8 <= 126){
            System.out.println("Special character is = " + c8);
        }else {

        }

        System.out.println("\n\n---Task-7---");

        System.out.println("\nTest Data 1:");
        char c9 = 'g';
        System.out.println("char c9 = \'g\'\n");
        if (c9 >= 65 && c9 <= 90 || c9 >=97 && c9 <= 122 ){
            System.out.println("Character is a letter");

        }else if( c9 >= 48 && c9 <= 57){
            System.out.println("Character is a digit");
        }else {
            System.out.println("Character is a special character");
        }

        System.out.println("\nTest Data 2:");
        char c10 = '5';
        System.out.println("char c10 = \'5\'\n");
        if (c10 >= 65 && c10 <= 90 || c10 >=97 && c10 <= 122 ){
            System.out.println("Character is a letter");

        }else if( c10 >= 48 && c10 <= 57){
            System.out.println("Character is a digit");
        }else {
            System.out.println("Character is a special character");
        }
        System.out.println("\nTest Data 3:");
        char c11 = '@';
        System.out.println("char c11 = \'@\'\n");
        if (c11 >= 65 && c11 <= 90 || c11 >=97 && c11 <= 122 ){
            System.out.println("Character is a letter");

        }else if( c11 >= 48 && c11 <= 57){
            System.out.println("Character is a digit");
        }else {
            System.out.println("Character is a special character");
        }

    }
}
