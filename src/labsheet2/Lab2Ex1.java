package labsheet2;

import javax.swing.*;
import java.awt.Font;

public class Lab2Ex1 {
    public static void main(String[] args) {

        String serialNumber, discSpaceAsString, processorPriceAsString, close = "", processorTypeNew;
        int discSpace, average = 0;
        float processorPrice, lowest = 2000000, highest = -2000000, counter = 0;


        {
            do {
                serialNumber = JOptionPane.showInputDialog("Please enter the serial number(<CR> to exit)");

                discSpaceAsString = JOptionPane.showInputDialog("Please enter the hard-disc space");
                discSpace = Integer.parseInt(discSpaceAsString);

                while (discSpace < 50 || discSpace > 5000) {
                    discSpaceAsString = JOptionPane.showInputDialog("Invalid! Please re-enter hard-disk space");
                    discSpace = Integer.parseInt(discSpaceAsString);
                }

                processorTypeNew = JOptionPane.showInputDialog("Please enter the processor type");

                processorPriceAsString = JOptionPane.showInputDialog("Please enter the price");
                processorPrice = Float.parseFloat(processorPriceAsString);


                if (processorPrice < lowest)
                    lowest = processorPrice;
                if (processorPrice > highest)
                    highest = processorPrice;


            } while (!serialNumber.equals(close));


            JOptionPane.showMessageDialog(null, "The average disk space available on the computers processed is: " + averageDiskSpace(discSpace, counter) + "\nThe price range of the computers is from E" + lowest + " to " + highest, "Computer Stats", JOptionPane.INFORMATION_MESSAGE);
            counter++;
        }

    }
    public static float averageDiskSpace (float a, float b)
    {
        float avg;
        return avg = a / b;
    }
}

