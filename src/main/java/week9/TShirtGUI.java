package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TShirtGUI extends JFrame {
    private JPanel mainPanel;
    private JComboBox sizeComboBox;
    private JLabel selectSizeLabel;
    private JComboBox <String> colorComboBox; //Generic type for the JComboBox, can only add String
    private JLabel selectedColorLabel;

    TShirtGUI(){ // Constructor

        setTitle("T-Shirt Order Form");


        sizeComboBox.addItem("Small");
        sizeComboBox.addItem("Medium");
        sizeComboBox.addItem("Large");

        String[] colors = { "Red", "Purple", "Blue"};

        DefaultComboBoxModel<String> colorModel= new DefaultComboBoxModel<>(colors);
        colorComboBox.setModel(colorModel);

        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300, 150));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        sizeComboBox.setSelectedIndex(-1);
        colorComboBox.setSelectedIndex(-1);
        sizeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectSizeLabel.setText("You Selected "+ sizeComboBox.getSelectedItem());
            }
        });

        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedColorLabel.setText("You Selected " + colorComboBox.getSelectedItem());
            }
        });
    }
}


