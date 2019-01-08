
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Calculates and prints area from length and width
 */



import java.util.Scanner;  // import scanner

public class Area{  // boilerplate
	
	public static void main (String [] args){
		
		System.out.println(returnArea(5, 6));  // print method return value
	
	}  // end of main method
	
	
	// method

	public static double returnArea (double x, double y){
		
		double result = (x * y);
		
		return result;  // return double
		
	}  // end of method
		

	
}  // end of public class