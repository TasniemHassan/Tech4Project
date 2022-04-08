package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToEachOther {
    public static void main(String[] args) {
        /*

         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("The ArrayList is = " + numbers);

        //Converting ArrayList to a LinkedList

        LinkedList<Integer> numbers2 = new LinkedList<Integer>(numbers);
        System.out.println("The LinkedList is = " + numbers2);


       // Converting LinkedList to an ArrayList
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);

        String[] namesArr = {"Kaly", "Torrie", "Taylor"};

        Vector<String> names = new Vector<>();
        Collections.addAll(names,namesArr);

        System.out.println(names);
    }
}