package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){
                //variable creation: DataType variableName = data/value
                //object creation: DataType/ClassName variableName = new DataType/ClassName(if it is needed);
            Scanner inputReader = new Scanner(System.in);

            System.out.println("Where is your address?");
            String userAddress = "\"" + inputReader.nextLine() + "\""; //variableName.methodName();

            System.out.println("User Address is = ".concat(userAddress.concat("\"")));


    }
}
