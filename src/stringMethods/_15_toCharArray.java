package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        String s = "Java"; // J, a, v, a

        char [] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

        int countA = 0;

        for (char element : chars){
            if(element == 'a') countA++;
        }


        System.out.println(Arrays.toString("Hello".toCharArray()));
        // combines all the above to 1 line
    }
}
