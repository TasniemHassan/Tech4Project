package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Before: " + str);

        str = str.replaceAll("[aeiouAEIOU]","\\$");
        System.out.println("After: " + str);

        //removing digits

        String str2 = "hello123world";
        str2 = str2.replaceAll("[^0-9]","");
        System.out.println(str2);

        String str3 = " abc 123 $#^";
        str3=str3.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str3);
    }
}
