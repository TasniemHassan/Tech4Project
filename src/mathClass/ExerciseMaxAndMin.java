package mathClass;
import java.util.Scanner;
public class ExerciseMaxAndMin {
    public static void main(String[] args){

        /*

         */

        int x = 4, y = 67, z = -54;

        int maxOfXY = Math.max( x , y);
        int maxOfXYZ = Math.max(maxOfXY , z);
        int minOfXY = Math.min( x , y);
        int minOfXYZ = Math.min(maxOfXY , z);

        System.out.println("The max number of XYZ is = " +maxOfXYZ +
                "\nThe min number of XYZ is = " + minOfXYZ);

        //OR

        Math.max(x,y);
        System.out.println(" Max of every number is = " +
                Math.max(Math.max(x ,y),z));

        System.out.println(" Min of every number is = " +
                Math.min(Math.min(x ,y),z));

        //OR can replace the variable letters with the appropriate numbers. ex: replace x with 4


        //Write a program which is going to print the max of given 3 number
        //4, 56, 23

        System.out.println("The max of given 3 numbers is = " + Math.max(Math.max(4,56),23));
        System.out.println("The min of given 3 numbers is = " + Math.min(Math.min(4,56), 23));


        /*
        Write a program which is going to ask 4 number. print the max of the retrieved 4 numbers
         */

        Scanner enter =new Scanner(System.in);
        System.out.println("\nPlease enter 4 numbers");
        int num1 = enter.nextInt();
        int num2 = enter.nextInt();
        int num3 = enter.nextInt();
        int num4 = enter.nextInt();
        System.out.println("The max of retrieved numbers is " +
                Math.max(Math.max(num1 , num2) ,(Math.max(num3 , num4))));
        System.out.println("\nThe min of retrieved numbers is " +
                Math.min(Math.min(num1 , num2) ,(Math.min(num3 , num4))));



    }
}
