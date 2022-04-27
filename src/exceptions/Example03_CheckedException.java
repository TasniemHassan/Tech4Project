package exceptions;

public class Example03_CheckedException {
    public static void main(String[] args) throws InterruptedException{
/*
Checked exception are immediately requiring a handling mechanism even before you run the code
The are also known as compiler time exception
 */

        /*
       FIRST WAY TO HANDLE CHECKED EXCEPTION IS USING tru-catch block

            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000); // 1 second
                    System.out.println(i);
                }
            }catch(Exception e){
                e.printStackTrace();
            }

         */


        for(int i =0; i < 10; i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
        Thread.sleep(3000);
        System.out.println("End of program!");

    }
}
