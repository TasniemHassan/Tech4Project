package mathClass;

public class FindMin {
    public static void main(String[] args){

        int x = 45;
        int y = 12;
        int z = 65;
        int a = 123;
        int b = -123;

        int minOfXY = Math.min(x , y); //min of x and y ---> 45,12
        int minOfZA = Math.min(z , a); //min of z and a ---> 65,123
        int minOfZAB = Math.min(minOfZA , b); // min of z, a and b --- 65 , -123
        int minOfEvery = Math.min(minOfXY , minOfZAB);

        System.out.println(minOfEvery);



    }
}
