package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]+", "hello"));//true; -> contains 1 or more letters
        System.out.println(Pattern.matches("[a-zA-Z]{3,}", "hello class"));// false bc it contains space

        System.out.println((Pattern.matches("[a-zA-Z0-9_-]{8,15}", "TechGlobal")));
        System.out.println(Pattern.matches("\\([0-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(708)-430-5296"));

    }
}
