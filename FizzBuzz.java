/* 

Author: Mark Williams
Date: September 2018

Program Description: 
FizzBuzz - Print the numbers from 1 to 100. But when the number is
divisible by 3 print Fizz, when divisible by 5, print Buzz and when 
divisble by both, print FizzBuzz.

*/


public class FizzBuzz{	// boilerplate
	public static void main (String args[]){  
		
		int counter = 1;  // initialise counter
		
		while (counter <= 100){  // set limit
			if ((counter % 3 == 0) && (counter % 5 == 0)){  // if counter is divisible by 3 and 5
				System.out.println("FizzBuzz");    // print FizzBuzz
			}
			else if (counter % 3 == 0){  // if counter is divisible by 3
				System.out.println("Fizz");  // print Fizz
			}
			else if (counter % 5 == 0){  // if counter is divisible by 5
				System.out.println("Buzz");  // print Buzz
			}
			else{  // if the counter doesn't satisfy the above conditions
				System.out.println(counter);  // print the number
			}
			counter++;  // increment the counter
		}
	
	} // End of main method.
}  // End of the Template class.