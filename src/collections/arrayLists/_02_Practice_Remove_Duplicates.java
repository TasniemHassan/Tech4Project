package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Remove_Duplicates {
    public static void main(String[] args) {

        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");

    /*
    TASK-1
    Find unique elements in this and print them

    RESULT:
    [Cup, Book, Pen, Pencil]
    */

        List<String> uniques = new ArrayList<>();

        for(String element : objects){
            if(!uniques.contains(element)) uniques.add(element);
        }
        System.out.println(uniques);
    }


}
