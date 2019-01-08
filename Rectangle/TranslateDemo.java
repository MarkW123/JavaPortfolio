package Rectangle;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Visually shows the translate method of the 
 * Rectangle class
 */

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TranslateDemo {

    public static void main(String[] args) {
        
        //Construct a frame and show it
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Rectangle r1 = new Rectangle(20, 20, 10, 20);
        double x = r1.getX();
        double y = r1.getY();
        int x1 = (int)x;
        int y1 = (int)y;
        double w = r1.getWidth();
        double h = r1.getHeight();
        int w1 = (int)w;
        int h1 = (int)h;
                
        frame.setBounds(x1, y1, w1, h1);
        
        JOptionPane.showMessageDialog(frame, "Click OK to continue");
        
        //your work
        //move rectangle
        r1.translate(5, 5);
        double x2 = r1.getX();
        double y2 = r1.getY();
        int x3 = (int)x2;
        int y3 = (int)y2;
        frame.setBounds(x3, y3, w1, h1);

    }

}
