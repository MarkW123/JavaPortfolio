
package BullsEye;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: A bullseye drawing
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class BullsEye extends JComponent{

    public void paintComponent(Graphics g)
    {
        
        //Recover Graphics 2D
        Graphics2D g2 = (Graphics2D) g;
        
        //Draw the outer ring
        g2.setColor(Color.BLACK);
        Ellipse2D.Double outer = new Ellipse2D.Double(5, 10, 100, 100);
        g2.draw(outer);
        g2.fill(outer);
        
        //Draw the outer ring
        g2.setColor(Color.WHITE);
        Ellipse2D.Double inner = new Ellipse2D.Double(30, 50, 50, 50);
        g2.draw(inner);
        g2.fill(inner);
        
    }

}
