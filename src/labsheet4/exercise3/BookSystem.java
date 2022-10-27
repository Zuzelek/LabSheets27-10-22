package labsheet4.exercise3;

import javax.swing.*;

public class BookSystem {
    public static void main(String[] args) {

        String output = "";

        Book book1 = new Book("HARRY POTTER",25.50,210102,255);

        output += "Calling the no-argument Book constructor. The first Book object details are: \n\n" + book1.toString();

        Book book2 = new Book("The Davicni Code",19.99,"3452617232",348);

        output += "\n\nCalling the multi-argument Book constructor. The second Book object details are: \n\n"+book2.toString();


        JOptionPane.showMessageDialog(null, output, "Book Object Data",JOptionPane.INFORMATION_MESSAGE);

    }
}
