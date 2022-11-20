/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingtempconverterapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author alabaganne
 */
public class SwingTempConverterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("App container");
        
        JLabel labelCelcius = new JLabel("Celcius:");
        labelCelcius.setSize(75, 0);
        JTextField inputCelcius = new JTextField("", 10);
        JPanel panelCelcius = new JPanel();
        panelCelcius.add(labelCelcius);
        panelCelcius.add(inputCelcius);
        panelCelcius.setLayout(new FlowLayout());
        
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        labelFahrenheit.setSize(75, 0);
        JTextField inputFahrenheit = new JTextField("", 10);
        JPanel panelFahreneit = new JPanel();
        panelFahreneit.add(labelFahrenheit);
        panelFahreneit.add(inputFahrenheit);
        panelFahreneit.setLayout(new FlowLayout());
        
        JButton btnConvertToCelcius = new JButton("Convert to Celcius");
        btnConvertToCelcius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // convert value from celcius to fahreneit
                float fahrenheitValue = Float.parseFloat(inputFahrenheit.getText());
                System.out.println("fahrenheitValue: " + fahrenheitValue);
                float result = ((fahrenheitValue - 32) * 5) / 9;
                inputCelcius.setText(Float.toString(result));
            }
        });
        JButton btnConvertToFahrenheit = new JButton("Convert to Fahrenheit");
        btnConvertToFahrenheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // convert value in celcius feld to fahreneit and display it in the fahrenheit text field
                float celciusValue = Float.parseFloat(inputCelcius.getText());
                System.out.println("celciusValue: " + celciusValue);
                float result = (celciusValue * 9 / 5) + 32;
                inputFahrenheit.setText(Float.toString(result));
            }
        });
        JPanel panelButtons = new JPanel();
        panelButtons.add(btnConvertToFahrenheit);
        panelButtons.add(btnConvertToCelcius);
        panelButtons.setLayout(new FlowLayout());
        
        frame.add(panelCelcius);
        frame.add(panelFahreneit);
        frame.add(panelButtons);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
    
}
