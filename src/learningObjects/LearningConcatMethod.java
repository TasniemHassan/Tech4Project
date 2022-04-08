package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args){


        String tech = "Tech";
        String global = "Global";

        String schoolName1 = tech + global; //+ operator
        String schoolName2 = tech.concat(global); // concat method

        System.out.println(schoolName1 + "\n" + schoolName2);

        String myName = "Tasniem";
        String myLastName = "Hassan";
        String myFullName1 = "Tasniem Hassan";
        String myFullName2 = myName + "" + myLastName;
        String myFullName3 = myName.concat(myLastName);


        System.out.print ("Tasniem Hassan");

        System.out.println("This is fullname1 --> " + "Tasniem Hassan");






    }
}
