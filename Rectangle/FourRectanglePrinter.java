package Rectangle;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Constructs rectangle, prints its location and then 
 * translates and prints it three more times, forming one large rectangle.
 */


import java.awt.Rectangle;

public class FourRectanglePrinter {

    public static void main(String[] args) {
        
        Rectangle box = new Rectangle(5, 5, 10, 20);
        
        double w1 = box.getWidth();
        double h1 = box.getHeight(); 
        
        int w = (int)w1;
        int h = (int)h1;
        
        System.out.println(box);
        box.translate(w, 0);
        System.out.println(box);
        box.translate(0, h);
        System.out.println(box);
        box.translate(-w, 0);
        System.out.println(box);
        

        
        

    }

}
