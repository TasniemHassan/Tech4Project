package projects;

import java.util.ArrayList;

public class Project08 {

    //TASK 1
    public static int countMultipleWords(String[] arr){
        int count = 0;
        for(String element : arr){
            if(element.trim().split(" ").length > 1)
                count++;
        }
        return count;
    }

    /*public static void main(String[] args) {
        String[] arr = {"foo", "", " " , "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(arr));
    }

     */
    //TASK 2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
        numbers.removeIf(x -> x < 0);
        return numbers;
        }

    /*public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(-10);
        numbers.add(-78);
        numbers.add(0);
        numbers.add(15);
        System.out.println(removeNegatives(numbers));
    }
     */
    //TASK 3
    public static boolean validatePassword(String password){
        char[] passwordNew = password.toCharArray();
        int countDigit = 0;
        int countUpper = 0;
        int countLower = 0;
        int countSpecial = 0;
        int countSpace = 0;
        for (char i = 0; i < passwordNew.length; i++){
            if(Character.isWhitespace(passwordNew[i]))
                countSpace++;
            else if(Character.isDigit(passwordNew[i]))
               countDigit ++;
            else if(Character.isUpperCase(passwordNew[i]))
              countUpper++;
            else if(Character.isLowerCase(passwordNew[i]))
               countLower++;
            else countSpecial++;
        }
       if(password.length() >=8 && password.length()<=16 && countSpace==0 && countDigit >0
       && countUpper >0 && countLower >0 && countSpecial >0)
           return true;
       else return false;
    }
    /*public static void main(String[] args) {
        String password = "Abcd1234!";
        System.out.println(validatePassword(password));
    }

     */
    //TASK 4
    public static boolean validateEmailAddress(String email){
        char[] emailArray = email.toCharArray();
        int countAt = 0;
        for(char element : emailArray){
            if(Character.isWhitespace(element))
                return false;
            if(element == '@') countAt++;
        }
        if (countAt == 1 && email.indexOf('@') >=2 && email.indexOf('.') >= (email.indexOf('@') +3) &&
                email.length() >= (email.indexOf('.')+3))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        String email = "abc@@gmail.com";
        System.out.println(validateEmailAddress(email));
    }


}
