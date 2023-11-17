package week8.CurrencyConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter  extends JFrame{
    private JPanel mainPanel;
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JComboBox <String> currencyComboBox;

    private final String EUROS = "Euros";

    private final String REAIS = "Reais";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.93, REAIS, 4.93);
    /*
     1 dollar is equivalent to 0.93 Euros; as Nov 2023
     1 dollars is equivalent 4.93 Brazilian Real  Nov 2023
    */

    CurrencyConverter(){
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500, 300)); //Adding dimensions
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //The button will be clicked when the user press enter
        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(REAIS);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Read input from JTextField and convert to a double.
                String dollarString = dollarsTextField.getText();

                //Adding validation
                try{
                    double dollars = Double.parseDouble((dollarString));
                    String toCurrency = (String) currencyComboBox.getSelectedItem(); //Convert Selected Item to expected type
                    //double euros = dollars * dollarsToEurosExchangeRate;

                    //Get the exchange rate for this currency from the Hashmap, using whatever was selected from JComboBox as the key.
                    double exchangeRate = exchangeRates.get(toCurrency);

                    //And the math
                    double converted = dollars * exchangeRate;

                    // Use format String to show the values with 2 decimal places.
                    String resultString = String.format ("%.2f dollars is equivalent to %.2f %s", dollars, converted, toCurrency);
                    conversionResultLabel.setText(resultString);


                } catch (NumberFormatException nfe){
                    //Pop up a dialog box with error message.
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without $ symbol or other characters");

                    //In some circumstances, you may want to clear the JTextField of the invalid input like this,
                    //dollarsTextField.setText("");
                    //But here, you probably want to leave the invalid input so you can see what they typed
                }


            }
        });
    }
}
