package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        /*TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22

         */

        System.out.println("-----Task-1-----");
        int[] numbers = {10,-3,-7,0,0,7,22};

        for(int element :numbers){
            System.out.println(element);
        }

        /*
        TASK-2
        Find the sum of all the elements

        RESULT:
        29
         */

        System.out.println("\n-----Task-2-----\n");
        int sum1 =0;
        for(int element :numbers){
            sum1 += element;
        }
        System.out.println(sum1);

        System.out.println("\n-----Task-3-----\n");
        int sumOfFirst3 =0;
        for(int i = 0; i <=2; i++){
            sumOfFirst3 += numbers[i];
        }
        System.out.println(sumOfFirst3);

        /*
        TASK-4
        Find the sum of last 5 elements in the array
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        22
         */

        System.out.println("\n-----Task-4-----\n");

        int sumOfLast5 =0;
        for(int i = numbers.length-5; i < numbers.length; i++){
            sumOfLast5 += numbers[i];
        }
        System.out.println(sumOfLast5);


        System.out.println("\n-----Task-5-----\n");

        int productOfLast4 =1;
        for(int i = 3; i < numbers.length; i++){ //or i=numbers.length-4
            if(numbers[i] != 0)
            productOfLast4 *= numbers[i];
        }
        System.out.println(productOfLast4);


        System.out.println("\n-----Task-6-----\n");

        boolean hasZero = false;
        for(int element :numbers){
            if(element == 0) {
                hasZero= true;
                break;
            }
        }
        System.out.println(hasZero);

    }
}
