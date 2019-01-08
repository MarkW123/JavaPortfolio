
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Asks users to input a string and prints the string
 */



import java.util.Scanner;  // import scanner class

public class ScannerExample{
	
	public static void main (String [] args){
	
		//Create an instance of a scanner class
		Scanner scan = new Scanner( System.in );
		System.out.println("Enter a string > ");
		//Read in a string
		String input = scan.nextLine();
		System.out.println(input);
	
	}  // end of main class
	
	
	
}  // end of public class
