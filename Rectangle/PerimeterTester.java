package Rectangle;

/**
 *
 * author:  Mark Williams
 * date:    November 2018
 * program description: 
 */

import java.awt.Rectangle;

public class PerimeterTester {

    public static void main(String[] args) {
        
        Rectangle card = new Rectangle(2, 4, 6, 8);
        double cardWidth = card.getWidth();
        double cardHeight = card.getHeight();
        double cardPerimeter = cardWidth*2 + cardHeight*2;
        
        System.out.println("Expected: 28");
        System.out.println(cardPerimeter);
        
    }

}
