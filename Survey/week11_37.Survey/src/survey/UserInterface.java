package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox selectY = new JCheckBox("Yes!");
        JCheckBox selectN = new JCheckBox("No!");
        
        container.add(selectY);
        container.add(selectN);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(selectY);
        buttonGroup.add(selectN);
        
        container.add(new JLabel("Why?"));
        
        JRadioButton reason_1 = new JRadioButton("No reason!");
        JRadioButton reason_2 = new JRadioButton("Because it is fun!");
        
        container.add(reason_1);
        container.add(reason_2);
        
        ButtonGroup buttonGroup_2 = new ButtonGroup();        
        buttonGroup_2.add(reason_1);
        buttonGroup_2.add(reason_2);
        
        JButton push = new JButton("Done!");
        
        container.add(push);
    }


    public JFrame getFrame() {
        return frame;
    }
}
