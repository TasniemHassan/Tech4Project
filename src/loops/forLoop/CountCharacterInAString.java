package loops.forLoop;

public class CountCharacterInAString  {
    public static void main(String[] args){

        String str = "TechGlobal School";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'o') count++;

    }
        System.out.println(count); //3
   }
}
