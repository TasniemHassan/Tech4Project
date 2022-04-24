package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {

        /*
    Create an int array to store 1, 5, 7, 9, 10
    Then, print the array
         */

        int [] arr = {1,5,7,9,10}; //null not allowed as it is a primitive array
        System.out.println(Arrays.toString(arr));


        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));


        ArrayList<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        Collection<String> names3 = new ArrayList<>();
        Iterable <String> names4 = new ArrayList<>();
        Object names5 = new ArrayList<>();
        Cloneable names6 = new ArrayList<>();


        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, cities);
        System.out.println(cities2);
        cities2.add("Tokyo"); // add to the end of the list bc it keeps the insertion order
        System.out.println(cities2.get(3)); // Denver

        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");
        System.out.println(names.size());
        names.forEach(System.out::println);
        System.out.println("Name at index of 5 = " + names.get(5));



        LinkedList<String> objects1 = new LinkedList<>();
        List<String> objects2 = new LinkedList<>();

        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);

        System.out.println(objects1.getLast());
        System.out.println(objects1);

        int count = 0;
        for (String s : objects1) {
            if(s == null) count++;
        }
        System.out.println(count);
                    //OR
        System.out.println(objects1.stream().filter(Objects :: isNull).count());


    }
}
