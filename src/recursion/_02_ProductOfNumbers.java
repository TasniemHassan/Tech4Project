package recursion;

public class _02_ProductOfNumbers {

    public static int recursiveProduct(int n){
        if (n <= 0) return 0;
        else if(n == 1) return 1;
        return n * recursiveProduct(n-1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveProduct(-2)); // 0
        System.out.println(recursiveProduct(0)); // 0
        System.out.println(recursiveProduct(2)); // 2
        System.out.println(recursiveProduct(4)); // 24
        System.out.println(recursiveProduct(5));
    }
 }
