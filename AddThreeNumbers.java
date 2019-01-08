
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Adds three numbers and prints the result
 */



import java.util.Scanner;

public class AddThreeNumbers{  // boilerplate
	
	public static void main (String [] args){
		
		System.out.println(addThreeNumbers(5, 8, 9));  // call method
	
	}  // end of main class

	public static int addThreeNumbers (int a, int b, int c){  // method header
		int result = a + b + c;  // add actual parameters
		return result;  // return in to main method
	}
	
}  // end of public class
