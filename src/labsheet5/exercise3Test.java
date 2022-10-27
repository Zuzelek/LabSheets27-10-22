package labsheet5;

import javax.swing.*;

public class exercise3Test {
    public static void main(String[] args) {

        JOptionPane dialog = new JOptionPane();




        exercise3 temp = new exercise3();

        exercise3 temp1 = new exercise3();

        temp1.setTemperature(25);

        JOptionPane.showMessageDialog(null, "Calling the single-argument constructor...setting the temperature of the first thermometer to 35C \nFirst Thermometer"
        +temp.toString()+ "\n\nCalling setTemperature()...setting the temperature of second thermometer to 25C \nSecond Thermometer: \n"+ temp1.toString());

        int temperature = Integer.parseInt(dialog.showInputDialog("Please enter the current temperature of the first thermometer: "));

        exercise3 temp2 = new exercise3(temperature,temperature,35);
        dialog.showMessageDialog(null, "****Thermometer Testing****\n\nCalling setTemperature()...setting " +
                "the temperature of the first thermometer to 48C\nFirst Thermomter: "+temp2.toString(), "",dialog.INFORMATION_MESSAGE);
    }
}
