
package Name;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: A component that draws a name
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class NameComponent extends JComponent{

    public void paintComponent(Graphics g)
    {
        //Recover Graphics 2D
        Graphics2D g2 = (Graphics2D) g;
        
        //Draw a blue rectangle
        g2.setColor(Color.BLUE);
        Rectangle window = new Rectangle(50, 50, 200, 100);
        g2.draw(window);
        
        //Draw a name in red
        g2.setColor(Color.RED);
        g2.drawString("MARK", 50, 150);
    }

}
