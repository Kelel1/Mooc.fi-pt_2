package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator) {
        
        this.calculator = calculator;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        GridLayout gridLayout = new GridLayout(2,1);
        container.setLayout(gridLayout);
        
        JLabel toCount = new JLabel(this.calculator.giveValue() + "");
        JButton countUp = new JButton("Click!");        
        
        ClickListener listen = new ClickListener(this.calculator, toCount);
        countUp.addActionListener(listen);
        
        
        container.add(toCount);        
        container.add(countUp);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
