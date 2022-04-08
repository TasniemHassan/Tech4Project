package projects;
import java.util.Scanner;
public class Project06 {
    public static void main(String[] args) {

        System.out.println("-------TASK-1-------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence as a String");
        String sentence = scan.nextLine();

        int space = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                space++;
        }
        if (space < 1) System.out.println("This sentence does not have multiple words");
        else System.out.println("This sentence has " + (space + 1) + " words");


        System.out.println("\n\n-------TASK-2-------\n\n");

        System.out.println("Please enter a word");
        String word = scan.nextLine();

        String palindrome = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            palindrome += word.charAt(i);

        }
        if (word.isEmpty()) System.out.println("This word does not have 1 or more characters");
        else if (word.equals(palindrome)) System.out.println("This word is palindrome");
        else System.out.println("This word is not palindrome");



        System.out.println("\n\n-------TASK-3-------\n\n");

        System.out.println("Please enter a sentence");
        String sentence2 = scan.nextLine();

        int aOrAContainer=0;
        for(int i = 0; i < sentence2.length(); i++){
            if(sentence2.charAt(i)=='a' || sentence2.charAt(i)=='A')
                aOrAContainer++;
        }
        if (aOrAContainer == 0) System.out.println("This sentence does not have any characters.");
        else System.out.println("This sentence has " + aOrAContainer + " a or A letters.");

        System.out.println("\n\n-------TASK-4-------\n\n");

        System.out.println("Please enter a positive number");
        int num = scan.nextInt();

        for(int i =1; i <= num; i++){
            if(i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

    }
}
