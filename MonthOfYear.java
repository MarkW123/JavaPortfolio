
package Port;

import java.util.Scanner;

/**
 *
 * author:  Mark Williams
 * date:    
 * program description: 
 */



public class MonthOfYear {

    public static void main(String[] args) {
        
//Create an instance of a scanner class
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter an integer: ");
    //Read in a string
    int month = scan.nextInt();
        String monthString;  // Initialise monthString
        switch (month)  // If value of input is one of the following cases, monthString is equal to the equivalent string
		{
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println("This is the month of " + monthString);  // Print statement and add the value of monthString 

    }

}
