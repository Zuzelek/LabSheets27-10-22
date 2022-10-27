package labsheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {

    String name, kmsAsString;
    float kms, kmsNormal = 1.75f, kmsOver = 2.50f, amountDue = 0;

    name = JOptionPane.showInputDialog("Please enter your name: ", "Input");

    kmsAsString = JOptionPane.showInputDialog("Please enter the kms cycled: ","Kilometres");
    kms = Float.parseFloat(kmsAsString);

    if(kms < 10) {

    }
    if(kms > 10)





    JOptionPane.showMessageDialog(null,"Name: "+name+"\nDistance Cycled: "+ "\nSponsorship amount due: "+amountDue,"Due",JOptionPane.INFORMATION_MESSAGE);
    }
}
