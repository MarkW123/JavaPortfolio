
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Prints the number 20 to 0 and indicates if its 
 * odd or even
 */



import java.util.Scanner;

public class OddOrEven2{
	  
	public static void main (String [] args){
		
		int x = 20;
		while( x > 0){
			if(x%2 == 0){
				System.out.println(x + " is even");
			}
			else{
				System.out.println(x + " is odd");
			}
			x--;
		}
		
		
	}  // end of main class
	
	
	
}  // end of public class

