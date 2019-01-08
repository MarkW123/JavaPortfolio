package RectangleViewer;

/**
 * author:  Mark Williams
 * date:    December 2018
 * program description: 
 */

import javax.swing.JFrame;

public class RectangleViewer {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("Two rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }

}
