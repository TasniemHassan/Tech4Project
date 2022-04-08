package homeworks;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {


        System.out.println("\n-----Task-1------\n");

        for(int i = 1; i<=10; i++){
            if( i % 10 == 0) System.out.println("FooBar");
            else if(i % 2 == 0 ) System.out.println("Foo");
            else if(i % 5 == 0 ) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n-----Task-2------\n");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean isFirstPositiveFound = false;
        boolean isFirstNegativeFound = false;


        for(int number : numbers){
            if(number > 0 && !isFirstPositiveFound) {
                isFirstPositiveFound=true;
                System.out.println("First Positive number is: " + number);
            }
            else if (number < 0 && !isFirstNegativeFound){
                isFirstNegativeFound = true;
                System.out.println("First Negative number is: " + number);
            }
            if(isFirstPositiveFound && isFirstNegativeFound) break;
        }

        System.out.println("\n-----Task-3------\n");

        int random1 = (int)(Math.random() * 10 + 1);
        int random2 = (int)(Math.random() * 10 + 1);
        int random3 = (int)(Math.random() * 10 + 1);
        int random4 = (int)(Math.random() * 10 + 1);
        int random5 = (int)(Math.random() * 10 + 1);

        int[] array ={random1, random2, random3, random4, random5};
        System.out.println(Arrays.toString(array));

        for(int num :array){
            if(num == 2 || num == 3) System.out.println("true");
            else System.out.println("false");
            break;
        }

        System.out.println("\n-----Task-4------\n");
        //can also use binarySearch after sorting the array
        boolean hasApple = false;
        String[] list ={"banana", "orange", "Apple"};
        for(String element : list){
            if(element.equalsIgnoreCase("apple")) {
                hasApple = true;
                break;
            }
        }
        System.out.println(hasApple);

        System.out.println("\n-----Task-5------\n");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean isEqual = false;
        for(int i = 0; i <numbers1.length; i++){
            for(int j = 0; j< numbers2.length; j++){
                if (numbers1[i] == numbers2[j]) {
                    isEqual = true;
                    System.out.println(numbers1[i]);
                }
            }
        }
        if(!isEqual) System.out.println("There is no matching elements");


        System.out.println("\n-----Task-6------\n"); //ASK?

        String str = "baNana";
       //char [] newStr = str.toLowerCase().toCharArray();
      // boolean duplicate = false;
       String duplicatedChars = "";
       for (int i = 0; i < str.length(); i++) { //other way is newStr.length
           for (int j = i + 1; j < str.length(); j++) {
              /* if (!(duplicatedChars.contains(newStr[i] + "")) && newStr[i] == (newStr[j])) {
                   duplicatedChars += newStr[i];
                   duplicate = true;
                   System.out.println(newStr[i]);
               }

               */
               if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
               !duplicatedChars.contains(str.toLowerCase().substring(i,j))){
                   duplicatedChars += str.toLowerCase().charAt(i);
                   System.out.println(str.toLowerCase().charAt(i));
                   break;
               }
           }

       }

    }
}
