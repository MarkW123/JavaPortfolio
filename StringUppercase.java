
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: ASks the user to enter a string and prints it in 
 * uppercase letters
 */



import java.util.Scanner;

public class StringUppercase{
	  
	public static void main (String [] args){
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string >");
		String name = scan.nextLine();  //read in string
		
		for(int i=0; i <name.length(); i++){
			if(i%2 == 0){  // if i is even
				String x = name.toLowerCase();  // change string to lowercase
				System.out.println(x);
			}
			else{
				String y = name.toUpperCase();  // change string to uppercase
				System.out.println(y);
			}
		}
		
		
	}  // end of main class
	
	
	
}  // end of public class
