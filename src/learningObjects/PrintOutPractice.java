package learningObjects;

public class PrintOutPractice {
    public static void main(String[] args) {

        char cH = 'H';
        char e = 'e';
        char l = 'l';
        char o = 'o';

        System.out.println(cH + e + l + l+ o); //72 + 101 + 108 + 108 + 111 = 500
        System.out.println("" + cH + e + l + l+ o); //hello
        System.out.println(cH + e + l + l+ o + ""); //500
        int valueOfcH = 'H';
        int cHNumber = 72;

        System.out.println("cH = " + cH); //cH = H
        System.out.println("valueOfcH = " + valueOfcH); //valueOfcH = 72
        System.out.println("cHNumber = " + cHNumber);  //cHNumber = 72



        System.out.print(cH);
        System.out.print(e);
        System.out.print(l);
        System.out.print(l);
        System.out.print(o);

        String greetings = "Hello";

        System.out.println("\n" + greetings);

        String studentNAme = "Diana";
        System.out.println(studentNAme + " is sleeping. " +
                studentNAme + " is coding. " +
                studentNAme + " is eating.");

    }
}
