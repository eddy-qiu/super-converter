import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {

    private JLabel inputLabel, outputLabel;
    private JTextField inputField, outputField;
    private JButton fahrenheitToCelsiusButton, celsiusToFahrenheitButton;

    public TemperatureConverter() {

        setTitle("Temperature Converter");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        inputLabel = new JLabel("Input Temperature: ");
        add(inputLabel);

        inputField = new JTextField();
        add(inputField);

        fahrenheitToCelsiusButton = new JButton("Fahrenheit to Celsius");
        fahrenheitToCelsiusButton.addActionListener(this);
        add(fahrenheitToCelsiusButton);

        celsiusToFahrenheitButton = new JButton("Celsius to Fahrenheit");
        celsiusToFahrenheitButton.addActionListener(this);
        add(celsiusToFahrenheitButton);

        outputLabel = new JLabel("Converted Temperature: ");
        add(outputLabel);

        outputField = new JTextField();
        outputField.setEditable(false);
        add(outputField);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double inputTemp, outputTemp;

        inputTemp = Double.parseDouble(inputField.getText());

        if (e.getSource() == fahrenheitToCelsiusButton) {
            outputTemp = (inputTemp - 32) * 5 / 9;
            outputField.setText(String.format("%.2f", outputTemp));
        }
        else if (e.getSource() == celsiusToFahrenheitButton) {
            outputTemp = (inputTemp * 9 / 5) + 32;
            outputField.setText(String.format("%.2f", outputTemp));
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
