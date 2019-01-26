package week11.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

    public static void main(String[] args) {
        Date today = new Date(); // current time instance is being created.
        System.out.println("Current time : " + today);

        System.out.println();

        // format date according to day/month/year
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Formatted current time (dd MMM yyyy) : " + sdf.format(today));
    }
}
