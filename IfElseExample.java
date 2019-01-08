package Portfolio;

/* 

Student Name: Mark Williams
Student Id: 18145329
Date: 3-09-2018

Program Description: 
if-else statement example

*/

public class IfElseExample{	// Start of template class
	
	public static void main (String args[]){  // Start of main method
	
	int x = 5;
	int y = 5;
	
	System.out.println("x is " + x);  // print out the value of x
	System.out.println("y is " + y);  // print out the value of y
	
	if (x < y){
		System.out.println("x is less than y");  // if x is less than y, print statement
	}
	else if (x == y){
		System.out.println("x is equal to y");  // if x is equal to y, print statement
	}
	else if (x > y){
		System.out.println("x is greater than y");  // if x is greater than y, print statement
	}
	
	int number = 5;
	
	if (number%2 == 0){  // if the value of number is divided by two and there is no remainder, print the statement
	System.out.println("The number " + number + " is EVEN");  
	}
	else if (number%2 != 0){  // if the value of number is divided by two and there is a remainder, print the statement
		System.out.println("The number " + number + " is ODD");
	}
	
	
	} // End of main method.

}  // End of the Template class