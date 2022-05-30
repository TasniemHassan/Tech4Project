package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;
public class Homework20 {

    /*Task-1
    Requirement:
-Create a method called hasLowerCase()
-This method will take a String argument, and it will
return boolean true if there is lowercase letter and false
if it doesn’t.
     */
    public static boolean hasLowerCase(String str){
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))) return true;
            break;
        }
        return false;
    }
    /*
    TASK-2
    Requirement:
-Create a method called noZero()
-This method will take one Integer ArrayList argument and it will return an ArrayList
 with all zeros removed from the original Integer ArrayList.
NOTE: Assume that ArrayList size will be at least 1.
     */

    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
        ArrayList <Integer> noZeroList = new ArrayList<>();
        for(Integer number : numbers){
            if(number != 0) noZeroList.add(number);
        }
        return noZeroList;
    }

/*public static ArrayList<Integer> noZero (ArrayList<Integer> numbers){
        numbers.removeIf(element -> element == 0);
        return numbers;
}
 */

    /*
    TASK-3
    Requirement:
   -Create a method called numberAndSquare()
-This method will take an int array argument and it will
return a multidimensional array with all numbers squared.
NOTE: Assume that array size is at least 1

     */
public static int[][] numberAndSquare(int[]arr){
        int[][] numberGroups = new int[arr.length][2];
        for(int i = 0; i < arr.length; i++){
            numberGroups[i][0]=arr[i];
            numberGroups[i][1] = arr[i] * arr[i];
        }
        return numberGroups;
}

/*
TASK-4
Requirement:
-Create a method called containsValue()
-This method will take a String array and a String
argument, and it will return a boolean. Search the
variable inside of the array and return true if it exists in
the array. If it doesn’t exist, return false.
NOTE: Assume that array size is at least 1.
NOTE: The method is case-sensitive
 */
public static boolean containsValue(String[] arr, String s){
      Arrays.sort(arr);
      return Arrays.binarySearch(arr, s) >=0;
    }

    /*
    TASK-5
Requirement:
-Create a method called reverseSentence()
-This method will take a String argument and it will
return a String with changing the place of every word.
All words should be in reverse order. Make sure that there
are two words inside the sentence at least. If there is no
two words return “There is not enough words!”.
     */

    public static String reverseSentence(String s){
        String[] words = s.split(" ");
        if(words.length < 2) return "There is not enough words";
        else{
            words[0] = (words[0].charAt(0) + "").toLowerCase() + words[0].substring(1);
            words[words.length-1] = (words[words.length - 1].charAt(0) + "").toUpperCase()+ words[words.length-1].substring(1);
            String reverse = "";
            for(int i = words.length - 1; i >= 0; i--){
                reverse+= words[i] + " ";
            }
            return reverse;
        }
    }

    /*
    TASK-6
    Requirement:
-Create a method called removeStringSpecialsDigits()
-This method will take a String as argument, and it will
return a String without the special characters or digits.
NOTE: Assume that String length is at least 1.
NOTE: Do not remove spaces
     */

    public static String removeStringSpecialsDigits(String str){
        String strNew = str.replaceAll("[^a-zA-Z\\s]", "");
        return strNew;
    }

    /*
    Task-7
    Requirement:
-Create a method called removeArraySpecialsDigits()
-This method will take a String array as argument, and
it will return a String array without the special
characters or digits from the elements.
NOTE: Assume that array size is at least 1.
     */

    public static String[] removeArraySpecialsDigits(String[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^a-zA-Z\\s]", "");

        }
        return arr;
    }
    /*
    TASK-8
    Requirement:
-Create a method called removeAndReturnCommons()
-This method will take two String ArrayList and it will
return all the common words as String ArrayList.
NOTE: Assume that both ArrayList sizes are at least 1.
Test Data 1: [“Java”, “is”, “fun”], [“abc”, “xyz”, “123”]
     */
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> s1, ArrayList<String>s2){
        ArrayList<String> commons = new ArrayList<>();
        for (int i = 0; i < s1.size(); i++) {
            for (int j = 0; j < s2.size(); j++) {
                if (!commons.contains(s1.get(i)) && s1.get(i).equals(s2.get(j))) commons.add(s1.get(i));

            }
        }
        return commons;
    }

   /*
   TASK-9
   Requirement:
-Create a method called noXInVariables()
-This method will take an ArrayList argument, and it will
return an ArrayList with all the x or X removed from
elements.
If the element itself equals to x or X or contains only x
letters, then remove that element.
NOTE: Assume that ArrayList size is at least 1.

    */
    public static ArrayList<String> noXInVariables(ArrayList<String> list){
        ArrayList<String> listWithoutX = new ArrayList<>();

        for (String s : list){
            if (!s.toLowerCase().equals("x")){
                s = s.replaceAll("[xX]", "");
                listWithoutX.add(s);
            }

        }
        return listWithoutX;
    }



    public static void main(String[] args) {
        System.out.println(hasLowerCase("hELLO"));
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        System.out.println(noZero(new ArrayList<>(numbers)));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 4})));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "java", "hello"}, "123"));
        System.out.println(reverseSentence("This is a sentence"));
        System.out.println(removeStringSpecialsDigits("123Java #$is fun"));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Java");
        s1.add("C#");
        s1.add("C#");

        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Python");
        s2.add("C#");
        s2.add("C++");
        System.out.println(removeAndReturnCommons(new ArrayList<>(s1), new ArrayList<>(s2)));

        ArrayList<String> list = new ArrayList<>();
        list.add("xyXyxy");
        list.add("Xx");
        list.add("ABC");
        System.out.println(noXInVariables(new ArrayList<>(list)));
    }






}
