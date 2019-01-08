
package Name;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: 
 */

import javax.swing.JFrame;

public class NameViewer {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        
        frame.setTitle("My Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        NameComponent name = new NameComponent();
        frame.add(name);
        
        frame.setVisible(true);

    }

}
