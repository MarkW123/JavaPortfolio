package EmptyFrameViewer;
import javax.swing.JFrame;
/**
 *
 * author:  Mark Williams
 * date:    November 2018
 * program description: 
 */


public class EmptyFrameViewer {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("An Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }

}
