package loops.forLoop;

public class PrintNumbersDivisibleBy5 {
    public static void main(String[] args){

        for (int numbers = 1; numbers <= 50; numbers++) {

            if (numbers % 5 == 0) {
                System.out.println(numbers);
            }

        }
    }
}
