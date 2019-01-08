
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Asks the user to input a string, prints the string and
 * the length of the string
 */



import java.util.Scanner;

public class InputString{
	  
	public static void main (String [] args){
	
	
		Scanner scan = new Scanner(System.in);  // create new scanner object
		System.out.println("Enter a string >");
		String name = scan.nextLine();  // read in string
		
		System.out.println("You entered: " + name);
		
		int x = name.length();  // assign string length to x
		System.out.println("String length: " + x);
		
		
	}  // end of main class
	
	
	
}  // end of public class


