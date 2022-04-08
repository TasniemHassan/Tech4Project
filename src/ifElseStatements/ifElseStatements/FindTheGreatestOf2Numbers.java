package ifElseStatements.ifElseStatements;

public class FindTheGreatestOf2Numbers {
    public static void main(String[] args){

        /*
        How to get random number between 0 to 10 (both included)
         */
        int num1= (int) (Math.random() * 11)  , num2= (int) (Math.random() * 11);

        System.out.println(num1);
        System.out.println(num2);

        //System.out.println("The greatest of " + num1 + " and " + num2 + " is = " +
                //Math.max(num1 , num2));

        if(num1 > num2){
            System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num1);
        }else{ //num1 == num2 || num2 > num1
            System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num2);
        }
    }
}
