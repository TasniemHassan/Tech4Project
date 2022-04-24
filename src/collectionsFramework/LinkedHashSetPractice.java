package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("foo");
        words.add("BAR");
        words.add(null);
        words.add(null);
        words.add("John");
        words.add("John");// duplicates are not allowed, won't be printed

        System.out.println(words); //keeps insertion order but doesnt have methods that require index
    }
}
