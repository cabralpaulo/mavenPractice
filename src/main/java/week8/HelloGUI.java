package week8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI  extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    protected HelloGUI (){ //Constructor
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() {
            //Anonymous inner class
            @Override
            public void actionPerformed(ActionEvent e) {
                myFirstLabel.setText("Paulo");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
