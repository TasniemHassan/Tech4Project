package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        //To Create a file we use some classes

        File myFile = new File("myFirstFile.xls");

        try {
            System.out.println(myFile.createNewFile());

            Thread.sleep(5000);
            System.out.println(myFile.delete());
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("End of the program!");
    }
}
