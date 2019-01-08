
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Adds up the numbers in an array
 */



public class ArrayAddition{
	  
	public static void main (String [] args){
		
		int [] numbers = {2, 20, 0, 5, 17, 8, 10, 23, 9};  // declare and initialise array
		
		System.out.println(addUpArray(numbers));  // print return value of method
		
	}  // end of main class
	
	
	//method
	
	public static int addUpArray(int array[]){  
		
		int x = array.length;
		int result = 0;
		
		for (int i = 0; i < x; i++){
			result += array [i];
		}
		
		return result;  // return int to main method
		
	}
	
	
	
}  // end of public class

