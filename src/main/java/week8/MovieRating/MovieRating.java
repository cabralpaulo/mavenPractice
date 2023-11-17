package week8.MovieRating;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieRating extends JFrame {
    private JPanel mainPanel;
    private JCheckBox wouldSeeAgainCheckbox;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JSlider ratingSlider;
    private JTextField movieTitleTextField;
    private JButton quitButton;

    MovieRating(){
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        configureEventHandlers();
    }

    private void configureEventHandlers(){
        //Moving the rating Slider updates the sliderValueLabel and updates the opinion String
        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String valueLabelText = ratingSlider.getValue() + " Stars";
                sliderValueLabel.setText(valueLabelText);
                updateOpinion();
            }
        });

        //Checkbox change listener - updates the opinion String
        wouldSeeAgainCheckbox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }
        });

        //Typing in the text box - a little trickier. Add a listener to the JTextBox's document
        //Update the opinion String as the user types or deletes text

        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //Called when user types or adds text
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //Called when user deletes text
                updateOpinion();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //Needs this method, but no code
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(JOptionPane.showConfirmDialog(MovieRating.this, "Are you sure you want to quit",
                        "Quit", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    dispose();
                }
                //dispose(); // Close this JFrame
            }
        });
    }

    private void updateOpinion(){

        String title = movieTitleTextField.getText();

        //If the movie is blank, or just whitespace, clear opinion text
        if(title.trim().length() == 0){
            movieOpinionLabel.setText("Enter a movie title");
        } else{
            int rating = ratingSlider.getValue();

            boolean seeAgain = wouldSeeAgainCheckbox.isSelected();

            String template = "You rated '%s' %d stars. You %s see again.";

            String seeAgainStr = seeAgain ? "would" : "would not";

            String opinion = String.format(template, title, rating, seeAgainStr);

            movieOpinionLabel.setText(opinion);
        }
    }
}
