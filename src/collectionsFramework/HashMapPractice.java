package collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapPractice {
    public static void main(String[] args) {
        /*
        Ukraine -> Kiev
        Spain -> Madrid
        Portugal -> Lisbon
        Italy -> Roma
        US -> DC
        Canada -> Ottawa
         */

        TreeMap<String, String> capitals = new TreeMap<>();
        capitals.put("Ukraine", "Kieve"); //(keys,values)
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Roma");
        capitals.put("US", "DC");
        capitals.put("Canada", "Ottawa");

        //Printing a HashMap... will print random
        System.out.println(capitals);//{Canada=Ottawa, Ukraine=Kieve, Italy=Roma, Portugal=Lisbon, US=DC, Spain=Madrid}
        //Printing a LinkedHashMap
        System.out.println(capitals); // Will keep insertion order
        //Printing a TreeMap
        System.out.println(capitals); // will sort it by keys


        //How to get a particular key-value pair
        System.out.println(capitals.get("Spain")); //Madrid
        System.out.println(capitals.get("Germany")); // null bc not in list


        //UnderStanding HashMap
        HashMap<Integer, String> students = new HashMap();
        students.put(1, "Alona");
        students.put(2, "Abdullah");
        students.put(3, "Abdullah");
        students.put(4, "Data");
        students.put(null, "John");
        students.put(null, "Alex"); // keys can't be duplicates so the size remains 5
        //but also java thinks we are reassigning so it will print Alex instead of John
        students.put(1, "Daria");
        students.put(5, null); // unique key so it will increase size and null is added
        students.put(6, null);
        students.put(7, null);
        students.put(null, null);// null key cant be duplicate, so it will reassign alex to null

        System.out.println(students.size());
        System.out.println(students);


    }
}
