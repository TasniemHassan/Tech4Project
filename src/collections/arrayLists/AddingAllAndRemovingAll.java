package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {

        /*
        TASK-1
        Create an ArrayList of germanCars and add below items
        BMW
        Mercedes
        Volkswagen

        Then print list
         */
        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German Cars = " + germanCars);

        /*
        TASK-2
        Create an ArrayList of japaneseCars and add below items
        Honda
        Toyota
        Lexus

        Then print the list

        RESULT:
        Japanese cars = [Honda, Toyota, Lexus]
        */

        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");

        System.out.println("Japanese Cars = " + japaneseCars);

        /*
        Create an ArrayList of luxuryCars and store below cars
        Maserati
        Tesla
        Range Rover
        Jaguar

        Then print list

        Result:
        Luxury cars = [Maserati, Tesla, Range Rover, Jaguar]
         */

        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars = " + luxuryCars);

        System.out.println("\n------Put all together---------\n");

        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("Inventory at the beginning = " + inventory);//[]

        //Adding all german cars to the inventory collection
        inventory.addAll(germanCars);
        System.out.println("Inventory after adding german cars = " + inventory);

        // Adding all luxury cars to the inventory collection
        inventory.addAll(luxuryCars);
        System.out.println("Inventory after adding luxury cars = " + inventory);

        //Adding all the japanese cars to the inventory collection
       // inventory.addAll(1, japaneseCars); // if we put 1, it will put the list after the 1st index
        // if we don't put any index then it will add all to the end of the list
        //if we want to for example put them after the german cars, do index=germanCars.size
            inventory.addAll(japaneseCars);
        System.out.println("Inventory after adding japanese cars = " + inventory);

        inventory.removeAll(japaneseCars);
        System.out.println("Inventory after removing japanese cars = " + inventory);

        /*
        Remove Tesla, Audi, and BMW
         */


        inventory.remove("BMW");
        inventory.remove("Tesla");
    }
}
