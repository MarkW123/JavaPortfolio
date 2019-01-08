
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Prints the values of mySigma for numbers 1 to 5
 */



import java.util.Scanner;  // import scanner class

public class mySigma{ 
	
	public static void main (String [] args){
		
		mySigma(5);  // call method
	
	}  // end of main method
	
	
	
	// method

	public static int mySigma (int x){
		
		int result = 0;
		int i = 0;
		String r = null;  // declare and initialise string
		
		for(i = 1; i < x; i++){
			result += i;  // add i to result and overwrite value of result
			System.out.println("The value of mySigma for " + i + " is : " + result);
		}
		return result;  // return int to main method
		
		
		
	}  // end of method
		

	
}  // end of public class
