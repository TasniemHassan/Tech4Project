package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
       // numbers.add(null); // cant add null bc in sorting it wont work. will throw nullPointer exception

        System.out.println(numbers); //print sorted in ascending order



        TreeSet <String> names = new TreeSet<>();
        names.add("John");
        names.add("Joe");
        names.add("Alex");
        names.add("ali");

        System.out.println(names);
    }
}
