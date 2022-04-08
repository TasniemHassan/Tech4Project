package homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("-----Task-1------");
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n-----Task-2------\n");

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n-----Task-3------\n");

        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(-34);
        nums.add(-56);
        nums.add(0);
        nums.add(89);
        nums.add(100);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("\n-----Task-4------\n");

        List<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n-----Task-5------\n");
        List<String> marvelCharacters = new ArrayList<>();
        marvelCharacters.add("Spider Man");
        marvelCharacters.add("Iron Man");
        marvelCharacters.add("Black Panther");
        marvelCharacters.add("Deadpool");
        marvelCharacters.add("Captain America");

        System.out.println(marvelCharacters);

        boolean hasWolverine = false;
        for(String character :marvelCharacters){
            if(character.equals("Wolverine")) hasWolverine = true;
            break;
        }
        System.out.println(hasWolverine);

        System.out.println("\n-----Task-6------\n");
        List<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);

        boolean hasHulk = false;
        boolean hasIronMan = false;
        for(String avenger : avengers){
            if(avenger.equalsIgnoreCase("Hulk")) hasHulk = true;
            break;
        }
        for(String avenger : avengers){
            if(avenger.equalsIgnoreCase("Iron Man")) hasIronMan = true;
            break;
        }
        System.out.println(hasHulk && hasIronMan);

        System.out.println("\n-----Task-7------\n");
        List<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('x');
        characters.add('$');
        characters.add('%');
        characters.add('9');
        characters.add('*');
        characters.add('+');
        characters.add('F');
        characters.add('G');

        System.out.println(characters);

        for(Character character : characters){
            System.out.println(character);
        }

        System.out.println("\n-----Task-8------\n");

        List<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int countM = 0;
        int countNotAE = 0;
        for(String object : objects){
            if(object.toLowerCase().startsWith("m")) countM++;
            if(!object.toLowerCase().contains("a") && !object.toLowerCase().contains("e") )
                countNotAE ++;
        }
        System.out.println(countM);
        System.out.println(countNotAE);

        System.out.println("\n-----Task-9------\n");
        List<String> kitchenObjects = new ArrayList<>();
        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");
        System.out.println(kitchenObjects);

        int countUpper = 0;
        int countLower = 0;
        int countP = 0;
        int startOrEndP = 0;
        for(String object : kitchenObjects){
            if(Character.isUpperCase(object.charAt(0))) countUpper++;
            else countLower++;
            if (object.toLowerCase().contains("p")) countP++;
            if(object.toLowerCase().startsWith("p") || object.toLowerCase().endsWith("p"))
                startOrEndP++;
        }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements having P or p = " + countP);
        System.out.println("Elements starting or ending with P or p = " + startOrEndP);

        System.out.println("\n-----Task-10------\n");

    List<Integer> n = new ArrayList<>();
    n.add(3);
    n.add(5);
    n.add(7);
    n.add(10);
    n.add(0);
    n.add(20);
    n.add(17);
    n.add(10);
    n.add(23);
    n.add(56);
    n.add(78);

        System.out.println(n);

        int countDivideBy10 = 0;
        int countEvenAndMoreThan15 = 0;
        int countOddAndLessThan20 = 0;
        int countLessThan15OrGreaterThan20 = 0;

        for(int num: n){
            if(num % 10 == 0) countDivideBy10++;
            if(num % 2 == 0 && num >15) countEvenAndMoreThan15++;
            if(num % 2 != 0 && num<20) countOddAndLessThan20 ++;
            if(num<15 || num >50) countLessThan15OrGreaterThan20 ++;
        }
        System.out.println("Elements that can be divided by 10 = " + countDivideBy10);
        System.out.println("Elements that are even and greater than 15 = " + countEvenAndMoreThan15);
        System.out.println("Elements that are odd and less than 20 = " + countOddAndLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLessThan15OrGreaterThan20);

    }
}
