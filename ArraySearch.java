
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Searches an array for a specific number and if the 
 * number is found, it prints true
 */



public class ArraySearch{  // boilerplate
	  
	public static void main (String [] args){
		
		int [] numbers = {2, 20, 0, 5, 17, 8, 10, 23, 9}; 
		
		System.out.println(searchArray(numbers, 17));
		
		
	}  // end of main class
	
	
	//method
	
	public static boolean searchArray(int numbers [], int value){  
		
		boolean x = false;  // declare boolean
		
		for (int i=0; i<numbers.length; i++){
			if(numbers[i] == value){  // if value is found in array
				x = true;
			}
		}
		
		return x;  // return boolean
		
	}
	
	
	
}  // end of public class

