package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Exercise01_remove_duplicates {
    public static void main(String[] args) {
        /*
        Create an ArrayList and store below elements
        Computer
        Phone
        Mouse
        Mouse
        Phone
        Pen

        From above list, remove all duplicates and print the unique elements

        EXPECTED RESULT:
        [Computer, Phone, Mouse, Pen]
        */

        System.out.println("\n--------First way - not preferred------\n");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        System.out.println("My list before removing = " + objects);

        //create an empty list to store unique values
        ArrayList<String> uniques = new ArrayList<>();
        for (String object : objects){
            if(!uniques.contains(object)) uniques.add(object);
        }
        System.out.println("My list after removing duplicates = " + uniques);

        System.out.println("\n-------Second way - using collections--------\n"); // Any Set

        //TreeSet -> Computer, Mouse, Pen, Phone
        //HashSet -> no prediction
        //LinkedHashSet -> preserves insertion order.. this is what we need for this task

        LinkedHashSet<String> myUniques = new LinkedHashSet<>(objects);
        System.out.println(myUniques);

        //OR

        System.out.println(new LinkedHashSet<>(objects));
    }
}
