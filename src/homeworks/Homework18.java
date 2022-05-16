package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Homework18 {

    //TASK-1
    public static String noSpace(String str){
        return str.replaceAll(" ","");
    }

    //TASK-2
    public static String replaceFirstLast(String str){
        String string = str.trim();
        if(string.length() == 2) return "" + string.charAt(1)+ string.charAt(0);
        else if(string.length() <2) return "";
        return string.charAt(str.length()-1) + string.substring(1,string.length()-1) + string.charAt(0);
    }

    //TASK-3
    public static boolean hasVowel(String str){
        return (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") ||
                str.toLowerCase().contains("o") || str.toLowerCase().contains("u"));
    }

    //TASK-4
    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));

        if (yearOfBirth > currentYear || currentYear - yearOfBirth > 100) System.out.println("AGE IS NOT VALID");
        else if (currentYear - yearOfBirth < 16 ) System.out.println("AGE IS NOT ALLOWED");
        else if (currentYear - yearOfBirth >= 16) System.out.println("AGE IS ALLOWED");
    }

    //TASK-5
    public static int averageOfEdges(int a, int b, int c){
        int[] ints = {a,b,c};
        Arrays.sort(ints);
        return (ints[0] + ints[2])/2;
    }

    //TASK-6
    public static String[] noA(String[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].toLowerCase().startsWith("a")) a[i] = "###";
        }
        return a;
    }

    //TASK-7
    public static int[] no3or5(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 15 == 0) a[i] = 101;
            else if (a[i] % 3 == 0) a[i] = 100;
            else if (a[i] % 5 == 0) a[i] = 99;
        }
        return a;
    }

    //TASK-8
    public static int countPrimes(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (num == 2 || num == 3) count++;
            else if (num > 3){
                boolean prime = true;
                for (int i = 2; i <= num / 2; i++) {
                    if (num % 2 == 0){
                        prime = false;
                        break;
                    }
                }if (prime) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(noSpace("Tech Global"));
        System.out.println(replaceFirstLast("     A     "));
        System.out.println(hasVowel("ABC"));
        checkAge(2050);
        System.out.println(averageOfEdges(-2,-2,10));

        String[] a = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(a)));

        int[] b = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(b)));

        int[] c = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(c));
    }

}
