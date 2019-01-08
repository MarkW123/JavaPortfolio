
package Point;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description:  Represents x-y coordinate with getter and setter 
 * methods
 */



public class Point
{
    private int xCoordinate;
	 
    private int yCoordinate;
	
    /**
     * Creates a point object with x, y coordinates
     * @param x x coordinate
     * @param y y coordinate
     */
    public Point(int x, int y)
    {
        xCoordinate = x; 
	yCoordinate = y; 
	}
    
    /**
     * This gets the radius of the circle
     * @return the radius of the circle.
     */   
    public int getxCoordinate(){
        return xCoordinate;
    }
    
    /**
     * This sets the radius of the circle
     * @param num the new value for the radius of the circle.
     */
    public void setxCoordinate(int num){
        
        xCoordinate = num;
    }

    /**
     * Getter method to return y coordinate
     * @return y coordinate
     */
    public int getyCoordinate(){
    return yCoordinate;
    }
    
    /**
     * Seeter method for y coordinate
     * @param num1 y coordinate
     */
    public void setyCoordinate(int num1){ 
        yCoordinate = num1;
    }
}


