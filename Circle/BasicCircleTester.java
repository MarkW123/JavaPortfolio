
package Circle;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Tests circle class
 */



public class BasicCircleTester {
        
    public static void main(String [] args){
        
        // Declare a variable to be a link reference to a BasicCircle
        Circle myCircle;
        
        myCircle = new Circle(5); // Step (2)
        
        int number = myCircle.getRadius();// use getRadius to access radius
        
        System.out.println("The value of the Circle radius is " + number);
        // myCircle.radius = 10; // is an error as Radius is a private variable
        myCircle.setRadius(10); // use setRadius to change the radius value
        
        number = myCircle.getRadius(); // use getRadius again
        
        System.out.println("\n\nThe value of the Circle radius is now " + number);
    
    }

}
