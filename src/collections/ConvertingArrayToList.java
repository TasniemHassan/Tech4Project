package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        /*
        Create a List and store below data-countries

        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal

        Print your List
         */

      /*  List<String>countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Brasilia");
        countries.add("Argentina");
        countries.add("France");
        countries.add("Belgium");
        countries.add("Germany");
        countries.add("Portugal");
        System.out.println(countries);

       */

        String [] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};
        //WAY- 1 to convert Array to List (ArrayList or LinkedList)
            List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
            List<String> countries2 = new LinkedList<>(Arrays.asList(countries));
        System.out.println(countries1);
        System.out.println(countries2);


        //WAY-2 to convert Array to List (ArrayList or LinkedList)
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

Collections.addAll(countries3,countries); // this method is adding all array elements to the List collection
Collections.addAll(countries4,countries);

        System.out.println(countries3);
        System.out.println(countries4);

        //3rd Way-manual way

        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new ArrayList<>();

        for(int i : numbers){
            numbersList.add(i); //autoboxing happens primitive to object
        }
        System.out.println(numbersList);
    }
}
