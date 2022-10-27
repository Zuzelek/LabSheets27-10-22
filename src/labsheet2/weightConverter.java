package labsheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class weightConverter {
        //declare variables here
        JTextField poundField;
        JLabel kilos;
        public weightConverter() {
            JFrame jFrame = new JFrame("Weight Converter");

            FlowLayout flowLayout = new FlowLayout();

            jFrame.setLayout(flowLayout);

            jFrame.setSize(300, 100);

            JLabel label = new JLabel("Pounds");

            jFrame.add(label);

            JTextField poundField = new JTextField(10);

            JLabel kilos = new JLabel();

            jFrame.add(kilos);

            jFrame.add(poundField);

            TextFieldEventHandler handler = new TextFieldEventHandler();

            poundField.addActionListener(handler);

            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public static void main(String args[])
        {
            weightConverter guiApp = new weightConverter();
        }

        private class TextFieldEventHandler implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                String poundsAsString;
                float pounds;

                poundsAsString = poundField.getText();

                pounds = Float.parseFloat(poundsAsString);
                kilos.setText("This is equivalent to "+pounds*0.454f + "kg");
            }

        }
    }
