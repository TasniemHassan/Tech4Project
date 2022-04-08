package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args){

        /*
        write a program that prints all the numbers between 1 and 25
        Skip the numbers that can be divided by 10
         */
        for(int i = 1; i <= 25; i++) {
            if(i % 10 !=0)
            System.out.println(i);
        }

        // using continue control statement to skip numbers that can be divided by 10

        for(int i = 1; i <= 25; i++) {
            if(i % 10 ==0) continue;
            else System.out.println(i);
        }
    }
}
