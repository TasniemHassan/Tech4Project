package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {

    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate); // Sat Apr 30 10:15:16 CDT 2022

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Today is = " + sdf.format(currentDate));

        //Print date in the format of Sat hh:mm:ss a

        SimpleDateFormat sdf2 = new SimpleDateFormat("EEE hh:mm a");
        System.out.println("The day and time are = " + sdf2.format(currentDate));




    }
}
