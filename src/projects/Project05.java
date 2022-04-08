package projects;
import java.util.Scanner;
public class Project05 {
    public static void main(String[] args) {

        System.out.println("-----TASK-1-----");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string of 8 or more characters");
        String str = scan.nextLine();

        if (str.length() >= 8) System.out.println(str.substring(str.length() - 4) + (str.substring(4, str.length() - 4))
                + str.substring(0, 4));
        else System.out.println("String length not enough characters");

        System.out.println("\n\n-----TASK-2-----\n\n");

        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();

        String sentence1 = sentence.substring(0, sentence.indexOf(' '));
        String sentence2 = sentence.substring(sentence.indexOf(' ') + 1, sentence.lastIndexOf(' '));
        String sentence3 = sentence.substring(sentence.lastIndexOf(' ') + 1);

        if (sentence.trim().indexOf(' ') > 0) System.out.println(sentence3 + " " + sentence2 + " " + sentence1);

        else System.out.println("This sentence does not have 2 or more words to swap");


        System.out.println("\n\n-----TASK-3-----\n\n");

        System.out.println("Please enter a string");
        String s = scan.nextLine();


        if (s.contains("stupid") || s.contains("idiot"))
            System.out.println(s.replace("idiot", "nice").replace("stupid", "nice"));
        if (s.isEmpty()) System.out.println(" ");
        else System.out.println("Sentence does not contain any bad words");


        System.out.println("\n\n-----TASK-4-----\n\n");

        System.out.println("Please enter your name");
        String name = scan.nextLine();

        if (name.length() <= 2) System.out.println("Invalid input!!!");
        else if (name.length() % 2 == 1) System.out.println(name.charAt(name.length() / 2));
        else System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));

        // ask why can we not concat 2 chars

        System.out.println("\n\n-----TASK-5-----\n\n");

        System.out.println("Please enter a name of a country");
        String country = scan.nextLine();

        if (country.length() < 5) System.out.println("Invalid input!!!");
        else System.out.println(country.substring(2, country.length() - 2));

        System.out.println("\n\n-----TASK-6-----\n\n");

        System.out.println("Please enter full address");
        String address = scan.nextLine();
        String address1 = address.toLowerCase();
        if (address1.contains("a") || address1.contains("e") || address1.contains("i")
                || address1.contains("o") || address1.contains("u")) {
            System.out.println(address.replace('a', '*').replace('e', '#').
                    replace('i', '+').replace('o', '@').replace('u', '$'));

        } else {
            System.out.println("invalid address");
        }


        System.out.println("\n\n-----TASK-7-----\n\n");

        int randomNumber1 = (int) (Math.random() * 26);
        System.out.println("Random Number 1 is: " + randomNumber1);

        int randomNumber2 = (int) (Math.random() * 26);
        System.out.println("Random Number 2 is: " + randomNumber2);

        /*for (int i = Math.min(randomNumber1, randomNumber2); i <= Math.max(randomNumber1 , randomNumber2); i++) {
            if (i % 5 != 0) {
                System.out.print(i + " - " );
            }
         */

        String space = "";

        for(int i = Math.min(randomNumber1, randomNumber2); i <= Math.max(randomNumber1, randomNumber2); i++) {
            if (i % 5 != 0) space += i + " - ";
        }
        if(!space.isEmpty())
       System.out.print(space.substring(0, space.length() - 3));
        else System.out.println(space);



    }
}
