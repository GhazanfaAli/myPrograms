// every thing starts from 1 jan 1970
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()); //  mill secs
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // years
//        System.out.println(System.currentTimeMillis()/1000/3600/24/30); // months
//        System.out.println(System.currentTimeMillis()/1000/3600/24); // days

//        Date d = new Date();
//        System.out.println(d);  /// date month year
//        System.out.println(d.getTime());
//        System.out.println(d.getDay());
//        System.out.println(d.getMonth());
//        System.out.println(d.getYear());
//        System.out.println(d.getHours());


//..................................................................................................

        Calendar obj1 = Calendar.getInstance();
//        System.out.println(obj1.getCalendarType());
//        System.out.println(obj1.getTimeZone());
        System.out.println(obj1.getTime());
        obj1.set(2022, 0, 3);
        System.out.println(obj1.getTime());

        Calendar obj2 = Calendar.getInstance();
        obj2.set(2022, 0, 3, 14 , 23, 2);
        System.out.println(obj2.getTime());

        Calendar obj3 = Calendar.getInstance();
        obj3.set(2022, 0, 3, 14 , 23, 2);
        System.out.println("....."+obj3.toString());
        System.out.println(obj3.getTimeZone());

        Calendar obj4 = Calendar.getInstance();
        obj4.add(Calendar.MONTH, 4);
// ==>       obj4.add(Calendar.MONTH, -4);
// ==>       obj4.add(Calendar.DATE, 4);
// ==>       obj4.add(Calendar.YEAR, 4);

        System.out.println(obj4.getTime());

        Calendar obj5 = Calendar.getInstance();
        obj5.set(2023, 8, 8);
        Calendar obj6 = Calendar.getInstance();
        // we can here use "before" keyword
        System.out.println(obj5.after(obj6));


        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

        // Convert the day of the week to a string representation
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        String dayOfWeekString = days[dayOfWeek - 1];

        System.out.println(dayOfWeekString);






    }
}