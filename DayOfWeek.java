
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Asks user to enter a number 1-7 and prints the day of
 * the week
 */



import java.util.Scanner;

public class DayOfWeek{  // Start of template class

	public static void main (String args[]){  // Start of main method
	
        //Create an instance of a scanner class
		Scanner scan = new Scanner( System.in );
		System.out.println("Enter a number 1 to 7: ");
		//Read in a string
		int x = scan.nextInt();
	
	String dayOfWeek = "invalid input";
	
		if ( x >= 1 && x <= 7 ){  // If x is between 1 and 7 execute block of code
			if ( x == 1){  
			dayOfWeek = "Monday";  // If x is 1, dayOfWeek is Monday
			}
			if ( x == 2){
			dayOfWeek = "Tuesday";
			}
			if ( x == 3){
			dayOfWeek = "Wednesday";
			}
			if ( x == 4){
			dayOfWeek = "Thursday";
			}
			if ( x == 5){
			dayOfWeek = "Friday";
			}
			if ( x == 6){
			dayOfWeek = "Saturday";
			}
			if ( x == 7){
			dayOfWeek = "Sunday";
			}
			System.out.println("Today is " + dayOfWeek);  // Print statement
		}
		else{
			System.out.println("Invalid input. Choose a number 1-7");  // If value of input is not from 1 to 7, print statement
		}
        }
}
	