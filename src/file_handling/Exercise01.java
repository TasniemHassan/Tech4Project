package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        File file = new File("objects.txt");

        try {

            FileWriter fileWriter = new FileWriter("objects.txt");
            fileWriter.write("Computer\n");
            fileWriter.write("Phone\n");
            fileWriter.write("Table\n");
            fileWriter.write("Chair\n");
            fileWriter.write("Mouse\n");
            fileWriter.write("Screen\n");
            fileWriter.write("Remote\n");
            fileWriter.close();
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String next = scanner.nextLine();
                if(next.toLowerCase().contains("r"))
                System.out.println(next);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            file.delete();
        }

        System.out.println("End of Program!");
    }
}
