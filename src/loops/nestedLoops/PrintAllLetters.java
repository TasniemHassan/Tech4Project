package loops.nestedLoops;

public class PrintAllLetters {
    public static void main(String[] args){
        System.out.println("LowerCase Letters");
        for (int i = 97; i <= 122; i++) { //char i = 'a' can also be done
            System.out.println((char) i + " "); // cast the char to print letters
        }
        System.out.println("\nUppercase Letters");
        for (int i = 65; i <= 90; i++){
            System.out.println((char)i + " ");
        }


        for(int i = 1; i <= 2; i++){
            int start = 97;
            if(i==1){
                System.out.println("LowerCase Letters");
            }else{
                System.out.println("Uppercase Letters");
                start = 65;
            }
            for (int j = start; j <= start+25; j++){
                System.out.println((char)j);
            }
        }


    }
}
