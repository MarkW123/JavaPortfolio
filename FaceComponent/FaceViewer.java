package FaceComponent;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Face viewer
 */

import FaceComponent.FaceComponent;
import javax.swing.JFrame;

public class FaceViewer {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(150, 250);
        frame.setTitle("An Alien Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FaceComponent component = new FaceComponent();
        frame.add(component);
        
        frame.setVisible(true);

    }

}
