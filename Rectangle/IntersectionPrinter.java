package Rectangle;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Computes the intersection of two rectangles
 */

import java.awt.Rectangle;

public class IntersectionPrinter {

    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(5, 5, 10, 20);
        Rectangle r2 = new Rectangle(0, 0, 10, 20);

        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectangle 2: " + r2);

        Rectangle r3 = r1.intersection(r2);
        System.out.println("Rectangle 3: " + r3);
        
        //returns false if r3 is empty
        boolean z = r1.intersects(r2);
        
        if(z == false){
            System.out.println("The rectangles don't intersect");
        }

    }

}
