package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {

        TreeMap<String, Integer> studentAges = new TreeMap<>();
        //keys cannot be null bc we are sorting
        studentAges.put("Kaly", 17);
        studentAges.put("Torrie", 20);
        studentAges.put("Alona", 15);
        studentAges.put("andrei", 25);
       // studentAges.put(null, 15); null pointer exception
        studentAges.put("Guluzar", null);



        System.out.println(studentAges);
    }
}
