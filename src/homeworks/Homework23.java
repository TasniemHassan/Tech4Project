package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {

    /*
    TASK-1
    Requirement:
Write a method called as parseData() which takes a
String has some keys in {} and values after between }{
and returns a collection that has all the keys and values
as entries.
NOTE: The keys should be sorted!
     */

    public static TreeMap<String,String> parseData(String str){
        TreeMap<String, String> dataTable = new TreeMap<>();
        while (str.contains("{")) {
            String key = str.substring(str.indexOf("{") + 1, str.indexOf("}"));
            str = str.substring(str.indexOf("}"));
            String value = str.contains("{") ? str.substring(str.indexOf("}") + 1, str.indexOf("{")) : str.substring(1);
            if (str.contains("{")) str = str.substring(str.indexOf("{"));
            dataTable.put(key, value);
        }
        return dataTable;
    }

    /*
    TASK-2
    Requirement:
Write a method called as calculateTotalPrice1() which takes
a Map of some shopping items with their amounts and
calculates the total prices as double. Item prices are given
below
Apple = $2.00
Orange = $3.29
Mango = $4.99
Pineapple = $5.25
     */

    public static double calculateTotalPrice1(Map<String, Integer> map) {
        double totalPrice = 0.00;
        HashMap<String, Double> map1 = new HashMap<>();
        map1.put("Apple", 2.00);
        map1.put("Mango", 4.99);
        map1.put("Orange", 3.29);
        map1.put("Pineapple", 5.25);

        for (String str : map.keySet()) {
            totalPrice += map.get(str) * map1.get(str);
        }
        return totalPrice;
    }

    /*
    Requirement:
    TASK-3
Write a method calculateTotalPrice2() which takes a Map of some
shopping items with their amounts and calculates the total prices as
double. Item prices are given below
Apple = $2.00
Orange = $3.29
Mango = $4.99
BUT there will be some discounts as below
There will be %50 discount for every second Apple
There will be 1 free Mango if customer gets 3. So, fourth one is free
     */

    public static double calculateTotalPrice2(Map<String, Integer> map) {
        Map<String, Double> items = new HashMap<>();
        items.put("Apple", 2.00);
        items.put("Orange", 3.29);
        items.put("Mango", 4.99);

        double totalPrice = 0;

        if (map.get("Mango") >= 3) map.put("Mango", map.get("Mango") - (map.get("Mango") / 3));
        for (String s : map.keySet()) {
            if (s.equals("Apple")){
                if (map.get("Apple") % 2 == 1) totalPrice += (map.get("Apple") - 1) * 1.5 + 2;
                else totalPrice += map.get("Apple") * 1.5;
            }
            else totalPrice += items.get(s) * map.get(s);
        }

        return totalPrice;

    }


    public static void main(String[] args) {
        System.out.println("-------TASK-1-------");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));


        System.out.println("-------TASK-2-------");
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 3);
        map1.put("Mango", 1);
        System.out.println(calculateTotalPrice1(map1));
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 2);
        map2.put("Pineapple", 1);
        map2.put("Orange", 3);
        System.out.println(calculateTotalPrice1(map2));


        System.out.println("-------TASK-3-------");

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Apple", 4);
        map3.put("Mango", 8);
        map3.put("Orange", 3);
        System.out.println(calculateTotalPrice2(map3));

        Map<String, Integer> map4 = new HashMap<>();
        map4.put("Apple", 3);
        map4.put("Mango", 5);
        System.out.println(calculateTotalPrice2(map4));

    }
}
