
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Multiplies the number by itself minus one
 */



import java.util.Scanner;  // import scanner class

public class MultiplyLessOne{  // boilerplate
	
	public static void main (String [] args){
		
		System.out.println(nMinusOneProduct(5));  // print method return value
	
	}  // end of main method
	
	// methods

	public static int nMinusOneProduct (int number){
		
		int result = 0;
		if (number > 1){  // execute code block if actual parameter > 1
			result = number * (number-1);
		}
		return result;  // return int to main method
		
		}  // end of method
		

	
}  // end of public class
