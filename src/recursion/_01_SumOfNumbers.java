package recursion;



public class _01_SumOfNumbers {
    /*
    Write a method that finds the sum of the numbers from 1-n
    Both 1 and n are included
    Methods must be return type and static
     */

    public static int SumOfNumbers(int n){ // extra question: what can break this code
                                                // negative numbers
        int sum =0;
        for(int i = 1; i<= n; i++){
            sum += i;
        }
        return sum;
    }

    public static int recursiveSum(int n){
        int sum = 0;
        if(n > 0) return n + recursiveSum(n-1);
        return 0;
    }



    public static void main(String[] args) {
        System.out.println(SumOfNumbers(5));
        System.out.println(SumOfNumbers(7));

        System.out.println(recursiveSum(5));
        System.out.println(recursiveSum(4));
    }

}
