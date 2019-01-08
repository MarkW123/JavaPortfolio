
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    
 * program description: 
 */



import java.util.Scanner;  // import scanner class 

public class PrintWarningMessage{  // boilerplate
	
	public static void main (String [] args){
		
	
	printWarningMessage();  // call method
	
	
	}  // end of main class
	

	
	
	
	
	// Methods
	
	public static void printWarningMessage(){  // method header
		
		int count = 0;
	
		while(count <= 6){
		count++;
		System.out.println("This is a warning message: " + count);	
		}
		
	}

	
	
}  // end of public class
