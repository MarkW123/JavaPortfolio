
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September
 * program description: Asks the user to enter a string and prints it backwards
 */



import java.util.Scanner;

public class StringBackwards{
	  
	public static void main (String [] args){
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string >");
		String name = scan.nextLine();  //read in string
		
		for(int i=0; i <name.length(); i++){
			System.out.println(name.charAt(i));  // print letter in string
		}
		
		
	}  // end of main class
	
	
	
}  // end of public class


