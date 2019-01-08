
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Prints numbers 1 to 100 and indicates if the number
 * is odd or even
 */



import java.util.Scanner;  // import scanner class

public class OddOrEven{  // boilerplate
	
	public static void main (String [] args){
	
	int count = 0;   // declare and initialise int
	boolean i = false;  // declare and initialise boolean
	
	while(count <= 100){  // while loop
		
		if (checkEven(count) == false){  // if method evaluates to false
			System.out.println(count + " is an odd number");
		}
		else{  // if method evaluates to true
			System.out.println(count + " is an even number");
		}
		count++;
	}
	
	}  // end of main class

	
	
	
	
	// Methods
	
	public static boolean checkEven (int num){
	
		boolean i = false;
		
		if (num % 2 == 0){  // if actual parameter is even
			i = true;
		}
		else {
			i = false;
		}
		
		return i;  // return boolean to main method
	
	}
	
	
}  // end of public class
