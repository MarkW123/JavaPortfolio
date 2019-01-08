
package Point;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Tests point class
 */



public class PointTester {

    public static void main(String[] args) {
        
        //Create point object
        Point myCoordinate = new Point(5, 7);
        
        //get x coordinate and store in a variable
        int number = myCoordinate.getxCoordinate(); 
	//get y coordinate and store in a variable	
        int number1 = myCoordinate.getyCoordinate();
        
        //print statement
        System.out.println("The value of the Circle radius is " + number);
        
        myCoordinate.setxCoordinate(10);
		
        System.out.println("The value of y coordinate is " + number1);
        
        myCoordinate.setyCoordinate(10);
        
        number1 = myCoordinate.getyCoordinate();
        
        System.out.println("\n\nThe value of the x coordinate is now " + number1);
    
    }
}

