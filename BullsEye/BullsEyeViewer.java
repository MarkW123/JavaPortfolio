
package BullsEye;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Creates frame and draws bullseye
 */

import javax.swing.JFrame;

public class BullsEyeViewer {

    public static void main(String[] args) {
        
        //Create frame
        JFrame frame = new JFrame();
        frame.setSize(150, 250);
        frame.setTitle("Bullseye!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BullsEye target = new BullsEye();
        frame.add(target);
        
        frame.setVisible(true);

    }

}
