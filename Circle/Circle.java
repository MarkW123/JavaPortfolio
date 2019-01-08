
package Circle;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Represents a circle and the radius can be retrieved or 
 * set
 */



public class Circle {

private int radius; 

    /**
     * Circle constructor : 
     * @param r the radius of the circle
     */
    public Circle(int r) //Notice there is NO return type for a class constructor.
    {
        radius = r; // set the class attribute (variable) radius equal to r
    }
    /**
     * This provides the radius of the circle
     * @return the radius of the circle.
     */
    public int getRadius(){ // getter method
        return radius; // return the value of the class attribute radius
    }
    /**
     * This sets the radius of the circle
     * @param num the new value for the radius of the circle.
     */
    public void setRadius(int num){ // Setter method
        radius = num; // set the class attribute (variable) radius equal to num
    } 

}
