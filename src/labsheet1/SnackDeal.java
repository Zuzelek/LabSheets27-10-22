package labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {

        String name, course, snacksAsString;
        int snacks, price;


       name = JOptionPane.showInputDialog("Please enter your name: ", "Input");

       course = JOptionPane.showInputDialog("Please enter your course: ", "Input");

       snacksAsString = JOptionPane.showInputDialog("How many snacks would you like: ", "Input");
        snacks = Integer.parseInt(snacksAsString);

       price = snacks * 2;


        JOptionPane.showMessageDialog(null,"Name: "+name+"\n"+"Course: "+course+"\n"+"Snacks: "+snacks + "\nCost: "+price,"Receipt",JOptionPane.INFORMATION_MESSAGE);


    }
}
