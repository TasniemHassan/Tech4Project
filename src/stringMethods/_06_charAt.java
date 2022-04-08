package stringMethods;

public class _06_charAt {
    public static void main(String[] args){
        /*
        Method Task: It helps to get a character at a specific index
        Note: Index starts with zero
        -It is non-static as we call it with object name
        -It is a return type and returns char primitive
        -It takes an argument which is int(index)

        Note: It will throw StringIndexOutOfBoundsException when the given index is not in the bounds
         */
        String name = "John";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));


        //System.out.println(name.charAt(4));


        String name2 = "Alex";
        System.out.println("\n" + name2.charAt(0));
        System.out.println(name2.charAt(1));
        System.out.println(name2.charAt(2));
        System.out.println(name2.charAt(3));

        char firstChar = name2.charAt(0);

        if (firstChar == 'A' || firstChar == 'a') {
            System.out.println("This name starts with A");
        }else {
            System.out.println("This name is not starting with A");
        }

    }
}

