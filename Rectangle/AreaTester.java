package Rectangle;

/**
 *
 * author:  Mark Williams
 * date:    November 2018
 * program description: 
 */

import java.awt.Rectangle;

public class AreaTester {

    public static void main(String[] args) {
        
        Rectangle tile = new Rectangle(5, 10, 15, 20);
        double tileWidth = tile.getWidth();
        double tileHeight = tile.getHeight();
        
        double tileArea = tileWidth*tileHeight;
        System.out.println("Expected: 300");
        System.out.println(tileArea);

        
    }

}
