package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher("i love techGlobal");

        System.out.println(matcher.matches()); //returns true or false
        // checks if given string matches given pattern

        while (matcher.find()) { //find the next matcher patter in the given string
            System.out.println(matcher.group());//print out the next matched pattern in the given string
            System.out.println("Start index: " + matcher.start());//returns int --> prints out where found patter starts
            System.out.println("End index: " + matcher.end());// returns int --> prints out where found pattern ends
        }
    }
}

