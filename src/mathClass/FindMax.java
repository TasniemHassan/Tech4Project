package mathClass;

public class FindMax {
    public static void main(String[] args){


        int x = 8;
        int y = 20;
        int z = 12_345;
        int a = 34;
        int b = 123;

        int maxValueOfXY = Math.max(x,y);
        //int maxValueOfXY = Math.max('a' , y); //char can be put as well bc it will take decimal
                                                //value from ASCII table

        int maxValueOfXYZ = Math.max(maxValueOfXY, z);
        int maxValueOfAB = Math.max(a, b);
        int maxOfEveryNumber = Math.max(maxValueOfXYZ, maxValueOfAB);
        int maxOfEvery = Math.max(Math.max(Math.max(8 , 20), 12_345), Math.max(34,123));

        System.out.println(maxValueOfXY);
        System.out.println(maxValueOfXYZ);
        System.out.println(maxValueOfAB);
        System.out.println(maxOfEveryNumber);




    }
}
