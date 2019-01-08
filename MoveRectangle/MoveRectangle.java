package MoveRectangle;
import java.awt.Rectangle;

/**
 *
 * author:  Mark Williams
 * date:    November 2018
 * program description: Create a rectangle and move it
 */


public class MoveRectangle {

    public static void main(String[] args) {
        
        Rectangle box = new Rectangle(5, 10, 20, 30);
        
        //Move the rectangle
        box.translate(15, 25);
        
        //Print information about the moved rectangle
        System.out.println("x: ");
        System.out.println(box.getX());
        System.out.println("Expected: 20");
        
        System.out.println("y: ");
        System.out.println(box.getY());
        System.out.println("Expected: 35");



    }

}
