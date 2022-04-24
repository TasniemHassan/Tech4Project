package projects;

import java.util.ArrayList;
import java.util.Iterator;

public class Project08 {

    //TASK 1
    public static int countMultipleWords(String[] arr){
        int count = 0;
        for(String element : arr){
            if(element.trim().contains(" "))
            //if(element.trim().split(" ").length > 1)... another way
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
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            if (it.next() < 0) it.remove();
        }
        //numbers.removeIf(x -> x < 0);... another way
        return numbers;
        }

    /*public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList([2,-5,6,7,-10,-78,0,15);
        System.out.println(removeNegatives(numbers));
    }
     */
    //TASK 3
    public static boolean validatePassword(String password){
        int countDigit = 0 , countUpper = 0, countLower = 0, countSpecial = 0;
        for (char i = 0; i < password.length(); i++){
            if(Character.isWhitespace(password.charAt(i)))
                return false;
            else if(Character.isDigit(password.charAt(i)))
               countDigit ++;
            else if(Character.isUpperCase(password.charAt(i)))
              countUpper++;
            else if(Character.isLowerCase(password.charAt(i)))
               countLower++;
            else countSpecial++;
        }
       return (password.length() >=8 && password.length()<=16 && countDigit >0
       && countUpper >0 && countLower >0 && countSpecial >0);
    }
    public static void main(String[] args) {
        String password = "Abcd1234!";
        System.out.println(validatePassword(password));
    }


    //TASK 4
    public static boolean validateEmailAddress(String email) {
        /*char[] emailArray = email.toCharArray();
        int countAt = 0;
        for(char element : emailArray){
            if(Character.isWhitespace(element))
                return false;
            if(element == '@') countAt++;
        }
        return (countAt == 1 && email.indexOf('@') >=2 && email.indexOf('.') >= (email.indexOf('@') +3) &&
                email.length() >= (email.indexOf('.')+3));
    }

         */

        int cD = 0, iAt = email.indexOf("@"), lAt = email.lastIndexOf("@"), lDot = email.lastIndexOf(".");
        for (int i = lAt + 1; i < email.length(); i++)
            if (email.charAt(i) == '.') cD++;
        return cD == 1
                && (iAt == lAt && email.contains("@"))
                && lAt >= 2
                && lDot - lAt >= 3 && email.length() - lDot >= 3;
    }

    /*public static void main(String[] args) {
        String email = "abc@@gmail.com";
        System.out.println(validateEmailAddress(email));
    }

     */


}
