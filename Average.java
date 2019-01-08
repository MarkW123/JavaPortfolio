
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Calculates the average of two numbers
 */


import java.util.Scanner;  // import scanner class

public class Average{  // boilerplate
	
	public static void main (String [] args){
		
		System.out.println(calculateAverage(5.4, 5.4));  // call method
	
	}  // end of main method
	
	
	// methods

	public static double calculateAverage (double x, double y){
		
		double result = (x + y) / 2;
		
		return result;  // return double to main method
		
	}  // end of method
		

	
}  // end of public class

