
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    January 2019
 * program description: Prints a warning message a number of times
 */



import java.util.Scanner;  // import scanner class

public class PrintWarningXTimes{
	
	public static void main (String [] args){  // start of main class
	
	Scanner sc = new Scanner(System.in);  // creates a scanner object, links to the input device
	System.out.println("Enter a number : ");  // ask the user to enter a number
	int  inNumber = sc.nextInt();  // uses the nextInt() method call to obtain an int value from the user
	
	int count = 1;
	while (count <=inNumber){
	printWarningMessage();
	count++;
	}

	}  // end of main class

	// Methods
	
	public static void printWarningMessage(){
	
		System.out.println("This is a warning message");	
	}
	
}  // end of public class