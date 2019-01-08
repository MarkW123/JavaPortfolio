
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Asks users to enter and double and prints the double
 */



import java.util.Scanner;

public class ScannerExample2{
	
	public static void main (String [] args){
	
		//Create an instance of a scanner class
		Scanner scan = new Scanner( System.in );
		System.out.println("Enter a double > ");
		//Read in a string
		Double input = scan.nextDouble();
		System.out.println(input);
	
	}  // end of main class
	
	
	
}  // end of public class
