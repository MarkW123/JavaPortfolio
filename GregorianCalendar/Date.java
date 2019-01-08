package GregorianCalendar;

/**
 *
 * author:  Mark Williams
 * date:    1/1/2019
 * program description: Uses Gregorian calendar class to get the date and or day
 * of certain dates in the future.
 */

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Date {

    public static void main(String[] args) {
        
        //create new calendar with today's date
        GregorianCalendar cal = new GregorianCalendar();
        
        //create calendar
        GregorianCalendar myBirthday = new GregorianCalendar
        (1981, 6, 13);
        
        //add 100 days to cal
        cal.add(Calendar.DAY_OF_YEAR, 100);
        //print date
        System.out.println(cal.getTime());
        
        //print date
        System.out.println(myBirthday.get(Calendar.DAY_OF_WEEK));
        
        //add 10,000 days to myBirthday
        myBirthday.add(Calendar.DAY_OF_YEAR, 10000);
        //print date
        System.out.println(myBirthday.getTime());

    }

}
