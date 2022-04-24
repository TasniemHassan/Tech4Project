package collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        /*
        How to create a HashSet
         */

        HashSet<Integer> numbers = new HashSet<>();
        Set<Integer> numbers2 = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(10); //  ignored when printed, no duplicates
        numbers.add(10);//  ignored when printed, no duplicates
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55); // added this but prints anywhere bc no insertion order
        numbers.add(null);
        numbers.add(null);// will print 1 null and ignore the rest. no duplicates
        numbers.add(null);
        numbers.add(null);

        System.out.println(numbers); // no insertion order, never know where object will go


    }
}
