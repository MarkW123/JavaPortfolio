
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    January 2019
 * program description: Prints the first letter of the input word
 */



import java.util.Scanner;

public class PrintFirstLetter{
	
	public static void main (String [] args){  
	
	printFirstInitial ("Test");  // call method and pass "Test" as parameter
	
	}
	

	
	
	
	// Methods
	
	public static void printFirstInitial (String x){  // method header
	
		System.out.println(x.charAt(0));  // print first element of actual parameter
		
	}
	
	
}  // end of public class
