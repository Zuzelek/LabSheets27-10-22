package labsheet5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        String output = "";
        BankAccount acc1 = new BankAccount();

        output +=  "Calling the no-argument BankAccount constructor. The first BankAcount object details are: \n\n" + acc1.toString();

        BankAccount acc2 = new BankAccount("Richy Rich",0.75);

        output += "\n\nCalling the multi-argument BankAccount constructor. The second BankAccount object details are: \n\n"+acc2.toString();

        System.out.println(output);

        BankAccount acc3 = new BankAccount();

        acc2.setInterestRate(0.5);

       /* JOptionPane.showMessageDialog(null,"Calling the no-argument BankAccount constructor. The first BankAcount object details are: \n\n"+acc1.toString()+
                "\n\nCalling the multi-argument BankAccount constructor. The second BankAccount object details are: \n\n"+acc2.toString()+
                "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5.\n\n"+acc3.toString()+
                "\n\nThe first BankAccount details are: \n\n"+acc1.toString()+
                "\n\nThe second BankAccount details are: \n\n"+acc2.toString(),"BankAccount object data", JOptionPane.INFORMATION_MESSAGE);
    */

    }

}
