
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    
 * program description: 
 */



public class PrintArray{

	public static void main (String [] args){
	 
	 int [] [] myDataGrid = {{43, 0, 7, 9, 12}, {4, -5, 8, 17, 99}, 
             {-2, 36, 48, 76, 15}};
 
	 int [] [] myOtherList = new int [3][5];
 
	print2DArray(myDataGrid);
	
	addValueToArray(myDataGrid, 7);
	
	print2DArray(myDataGrid);
	
	copyContents(myOtherList, myDataGrid);
	
	print2DArray(myOtherList);
 
}

/*
print2DArray takes an int array reference parameter and then prints out each 
of the elements in the array
*/

public static void print2DArray(int[][] myDataGrid){
	
	for(int i=0; i<3; i++){
		for(int j=0; j<5; j++){
			System.out.println(myDataGrid[i][j] + ", ");
		}
		System.out.println();
	}
} // end of method

/*
addValueToArray takes 2 parameters: an array and an int. Then it adds the value
of the int to the array elements.
*/

public static void addValueToArray(int[][] myDataGrid, int x){
	
	
	
	for(int i=0; i<3; i++){
		for(int j=0; j<5; j++){
			myDataGrid[i][j] += x;
		}
		System.out.println();
	}
} // end of method


/*
copyContents takes 2 parameters: an array and an int. Then it adds the value
of the int to the array elements.
*/

public static void copyContents(int [][] myOtherList, int[][] myDataGrid){
	
	
	
	for(int i=0; i<3; i++){
		for(int j=0; j<5; j++){
			myOtherList[i][j] = myDataGrid[i][j];
		}
	}
} // end of method



}


