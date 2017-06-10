package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;


public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400, 250));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout gridLayout = new GridLayout(3, 1);
        container.setLayout(gridLayout);
        
        JTextField textTop = new JTextField("I was copied here from the JTextArea");        
        JLabel textBottom = new JLabel("");
        JButton copy = new JButton("Copy!");
        
        ActionEventListener listen = new ActionEventListener(textTop, textBottom);
        copy.addActionListener(listen);
        
        
        container.add(textTop);
        container.add(copy);
        container.add(textBottom);
        
        
    }
}
