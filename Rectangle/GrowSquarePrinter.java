package Rectangle;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Constructs rectangle, prints location and then uses 
 * translate and grow methods to produce square double the size, in the same 
 * location as the first.
 *  
 */

import java.awt.Rectangle;

public class GrowSquarePrinter {

    public static void main(String[] args) {
        
        Rectangle square = new Rectangle(100, 100, 50, 50);
        
        double w1 = square.getWidth();
        double h1 = square.getHeight();
        
        int w = (int)w1;
        int h = (int)h1;
        
        System.out.println(square);
        square.translate(w/2, h/2);
        square.grow(w/2, h/2);
        System.out.println(square);
        
    }

}
