
package Face;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Creates frame and draws faceComponent
 */

import javax.swing.JFrame;

public class FaceViewer {

    public static void main(String[] args) {
        
        //Create frame
        JFrame frame = new JFrame();
        frame.setSize(800, 400);
        
        frame.setTitle("A face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FaceComponent component = new FaceComponent();
        frame.add(component);
        
        frame.setVisible(true);

    }

}
