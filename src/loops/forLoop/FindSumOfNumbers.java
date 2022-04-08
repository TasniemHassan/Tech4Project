package loops.forLoop;

public class FindSumOfNumbers {
    public static void main(String[] args) {

        int sum = 0; // 1. create a result container eventually will have your answer
        //start filling your result
        for (int numbers = 10; numbers <= 15; numbers++) { //
            sum += numbers;
            System.out.println(sum); // prints sum of each line
        }
        System.out.println(sum); //prints total at the end



    }
}
