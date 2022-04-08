package operators.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args){

        /*
        PseudoCode
        1. create variables
        2. do the equation
        3. print them out
         */

        double salary = 90000;
        double year = 12;
        double weeks = 52;
        double biWeeks = 26;

        double monthly = salary / year;
        double biWeekly = salary / biWeeks;
        double weekly = salary / weeks;

        System.out.println("The average monthly salary of an SDET is " + monthly);
        System.out.println("The average weekly salary of an SDET is " + weekly);
        System.out.println("The average biweekly salary of an SDET is " + biWeekly);


    }
}
