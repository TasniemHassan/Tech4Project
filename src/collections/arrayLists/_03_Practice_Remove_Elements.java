package collections.arrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

         /*
        Remove Python from the list and print it

        [Java, JavaScript, C#, C++]
         */

        languages.remove("Python");
        System.out.println(languages);

        /*
        TASK-2
            Remove all elements that start with J
        RESULT:
        [C#, C++]
         */

        /*WAY TO SURVIVE
        List<String> newLanguage = new LinkedList<>();

        for(String language : languages){
            if(language.startsWith("J")) newLanguage.add(language);
        }
        languages.removeAll(newLanguage);
        System.out.println(languages);
    }

         */

     /*
        languages.removeIf(x -> x.startsWith("J"));
        System.out.println(languages);

         */

        //USING ITERATOR

        Iterator<String> iterator = languages.iterator(); // I put all elements in a queue

        while (iterator.hasNext()) { // We are asking if there is an element in the queue
            String element = iterator.next(); // this gets an element from the queue
            if (element.startsWith("J")) { // if element came from the queue starts with J
                iterator.remove(); // Remove
            }
        }

        System.out.println(languages);

    }

}
