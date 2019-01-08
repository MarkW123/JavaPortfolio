
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Asks users for an integer and prints the integer
 */

import java.util.Scanner;

public class ScannerExample3{
	
	public static void main (String [] args){
	
		//Create an instance of a scanner class
		Scanner scan = new Scanner( System.in );
		System.out.println("Enter an integer > ");
		//Read in a string
		int input = scan.nextInt();
		
		int i = 0;
		int result = 1;
		
		while(input!=0)
		{	
			result *= input;
			System.out.println(result);
			input = scan.nextInt();
		}
		
        }
}
