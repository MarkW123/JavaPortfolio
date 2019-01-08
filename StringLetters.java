
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: ASks user to enter a string and then prints out each
 * letter of the string on a separate line
 */



import java.util.Scanner;

public class StringLetters{
	  
	public static void main (String [] args){
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string >");
		String name = scan.nextLine();  //read in string
		
		for(int i=0; i <name.length(); i++){
			System.out.println(name.charAt(i));  // print letter in string
		}
		
		
	}  // end of main class
	
	
	
}  // end of public class


