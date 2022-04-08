package homeworks;
import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args){

        System.out.println("-----Task-1------");

        int[] numbers ={89,0,23,0,12,0,15,34,0,7};
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n-----Task-2------\n");

        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";

        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println("\n-----Task-3------\n");

        int[] nums = {23,-34,-56,0,89,100};
        System.out.println("Entire Array = " + Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("Array sorted = " + Arrays.toString(nums));


        System.out.println("\n-----Task-4------\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n-----Task-5------\n");

        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));

        boolean hasPluto = false;
        for(String element :cartoonDogs){
            if(element.equalsIgnoreCase("Pluto" )) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);


        System.out.println("\n-----Task-6------\n");
        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));



        boolean hasGarfield = false;
        boolean hasFelix = false;

        for(String element : cartoonCats) {
            if (element.equalsIgnoreCase("Garfield")) hasGarfield = true;
            else if (element.equalsIgnoreCase("Felix")) hasFelix = true;
        }

        System.out.println(hasFelix && hasGarfield);


        System.out.println("\n-----Task-7------\n");
        double[] dblNums = {10.5, 20.75, 70.0, 80.0, 15.75};
        System.out.println(Arrays.toString(dblNums));
        System.out.println(dblNums[0]);
        System.out.println(dblNums[1]);
        System.out.println(dblNums[2]);
        System.out.println(dblNums[3]);
        System.out.println(dblNums[4]);

        System.out.println("\n-----Task-8------\n");
        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4' };
        System.out.println(Arrays.toString(characters));

        int letters = 0;
        int countLC = 0;
        int countUP = 0;
        int countDigit = 0;
        int countSpecial = 0;
        for(char element :characters){
            if(Character.isLetter(element)) letters++;
             if(Character.isLowerCase(element)) countLC++;
                else if(Character.isUpperCase(element)) countUP++;
                    else if(Character.isDigit(element)) countDigit++;
                        else countSpecial++;
            }

       System.out.println("Letters = " + letters);
       System.out.println("Uppercase letters = " + countUP);
       System.out.println("Lowercase letters = " + countLC);
       System.out.println("Digits = " + countDigit);
       System.out.println("Special characters = " + countSpecial);


        System.out.println("\n-----Task-9------\n");

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));

        int countLC2 = 0;
        int countUP2 = 0;
        int countBOrP = 0;
        int countBookOrPen = 0;
        for(String elements :objects){
            if(Character.isUpperCase(elements.charAt(0))) countUP2++;
            else countLC2++; // we counted upcase so rest is lowcase, dont need another if else
            if(elements.toLowerCase().charAt(0) == 'b' || elements.toLowerCase().charAt(0)== 'p') countBOrP++;
            if(elements.toLowerCase().contains("book") || elements.toLowerCase().contains("pen")) countBookOrPen++;
        }
        System.out.println("Elements starts with uppercase = " + countUP2);
        System.out.println("Elements starts with lowercase = " + countLC2);
        System.out.println("Elements starting with B or P = " + countBOrP);
        System.out.println("Elements having \"book\" or \"pen\" = " + countBookOrPen);


        System.out.println("\n-----Task-10------\n");

        int countGreaterThan10 = 0;
        int countLessThan10 = 0;
        int countEqual10 = 0;
        int[] numbers3 = {3,5,7,10,0,20,17,10,23,56,78};
        System.out.println(Arrays.toString(numbers3));

        for(int element : numbers3){
            if(element > 10) countGreaterThan10++;
            else if(element < 10) countLessThan10++;
            else countEqual10++;
        }
        System.out.println("Elements that are more than 10 = " + countGreaterThan10);
        System.out.println("Elements that are less than 10 = " + countLessThan10);
        System.out.println("Elements that are  10 = " + countEqual10);

        System.out.println("\n-----Task-11------\n");

        int[] first = {5,8,13,1,2};
        int[] second = {9,3,67,1,0};
        int[] third = new int[Math.max(first.length, second.length)]; // can put [5] but this is more dynamic

        System.out.println("1st array is = " + Arrays.toString(first) +
                "\n2nd array is = " + Arrays.toString(second));

        for(int i = 0; i < third.length; i++){
            if(i < Math.min(first.length , second.length)) {// when arrays are same size the indexOf[i] will be less than
                // length so loop through each i and find the Math.max to give third[i].
                third[i] = Math.max(first[i], second[i]);
            }else if(first.length>second.length) third[i] = first[i];
            else third[i] = second [i];
        }
        System.out.println("3rd array is = " + Arrays.toString(third));

    }
}
