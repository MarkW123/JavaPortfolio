
package Portfolio;

/**
 *
 * author:  Mark Williams
 * date:    Jan 2019
 * program description: An array of 50 booleans and initializes every element 
 * of the array to 'true', initializes every third element as false; and then 
 * prints the contents of the array and the array index.
 */



public class TrueOrFalse{

    public static void main(String[] args) {
        
        boolean arrayX [] = new boolean [50];
		
            for(int i=0; i<50; i++)
            {
		if (i % 3 == 0)
                {
                    arrayX[i] = false;
		}
		else
                {
                    arrayX[i] = true;
		}
		System.out.println("index " + (i + 1) + " is " + 
                    arrayX[i]);
            }
    }
}
