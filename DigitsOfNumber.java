
package Port;

import java.util.Scanner;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Asks user to input 3 digit number and then prints each
 * digit of the number on a separate line
 */



public class DigitsOfNumber {

    public static void main(String args[]){
       
    //Create an instance of a scanner class
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter an integer: ");
    //Read in a string
    int input = scan.nextInt();

    // Input 3 digit number and store as variable xyz
    int xyz = Integer.parseInt(args[0]);  
	
    // Divide xyz by 100 and store variable as x
    int x = xyz / 100;  
		
    System.out.println("First number is " + x);  // Print x to screen

    // Calculate xyz modulus 100 and divide by 10 and store result as y
    int y = (xyz % 100) / 10;  
		
    System.out.println("Second number is " + y);  // Print y to screen
		
    int z = xyz % 10;  // Calculate xyz modulus 10 and store result as z
		
    System.out.println("Third number is " + z);  // Print value of z          

    }
}
