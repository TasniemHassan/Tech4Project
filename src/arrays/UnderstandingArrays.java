package arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args){

        String name;

        name = "John";

        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);

        /*
        The new trend is to have multiple students information
         */

        String studentsName = " Alex, Abe , Yakeen";
        //String ages = "20 , 21, 22";

        // Can you print Abes's age only -> 21


        String[] names = {"Alex" , "Abe" , "Yakeen"};
        int[] ages = {20, 21, 22};
        char[] favCharacters = {'A', '%', 'G'};
        double[] balances = {5.6 , 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        // HOW TO PRINT ARRAY

        String namesToString = Arrays.toString(names); //convert array to string
        System.out.println(namesToString);

        //or System.out.println(Arrays.toString(names));


        // HOW TO GET A SINGLE DATA (Element) FROM ARRAY
        //all data put in array or collection is called element

        System.out.println(names[1]); // Abe
        System.out.println(names[0]); // Alex
        //System.out.println(names[5]); // ArrayOutOfBoundsException

        //How to update an element -> abe -> Abraham

        names[1]= "Abraham";
        System.out.println(Arrays.toString(names));


        //Alex's age is 20 and his fav char is A. His balance s 5.6, and he likes java is false.
        System.out.println(names[0] + " 's age is " + ages[0] + " and his fav char is " + favCharacters[0] + ".");
        System.out.println(names[1] + " 's age is " + ages[1] + " and his fav char is " + favCharacters[1] + ".");
        System.out.println(names[2] + " 's age is " + ages[2] + " and his fav char is " + favCharacters[2] + ".");


        //How to loop array using for i loop

        for(int i =0; i <=2; i++){
            System.out.println(names[i] + " 's age is " + ages[i] + " and his fav char is " + favCharacters[i] + ".");
        }
    }
}
