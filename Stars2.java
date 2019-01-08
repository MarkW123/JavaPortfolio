
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Prints out a line of stars a decreasing number of times
 */



import java.util.Scanner;

public class Stars2{
	
	public static void main (String [] args){
	
		for (int x = 5; x > 0; x--)
		{
			for (int y = x; y > 0;  y--)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		
	}  // end of main class
	
	
	
}  // end of public class

