package enums;

public class TraversingEnums {
    public static void main(String[] args) {

        //Traverse the days
        for(Day day : Day.values()){
            System.out.println(day);
        }

        //Traverse the months
        for(Constants.Month month : Constants.Month.values()){
            System.out.println(month);
        }
    }
}
