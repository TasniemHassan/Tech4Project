package collections;

import java.util.HashMap;

public class Test {


    public static HashMap<String, Integer> countElements(String[] arr) {
        HashMap<String, Integer> newList = new HashMap<>();
            for(String element : arr){
                if(newList.containsKey(element))
                    newList.put(element, newList.get(element) + 1);
                else
                    newList.put(element,1);

            }
            return newList;
    }


    public static void main(String[] args) {

        System.out.println(countElements(new String[] {"Apple", "Apple", "Orange", "Apple", "Kiwi"}));
    }
/*
Test Data:
[“Apple”, “Apple”, “Orange”, “Apple”, “Kiwi”]
Expected:
 {Apple=3, Orange=1, Kiwi=1}
 */





}