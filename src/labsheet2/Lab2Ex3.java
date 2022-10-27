package labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class Lab2Ex3 {
    public static void main(String[] args) {


        String names[] = new String[5], list;
        String longestName = "";
        int total=0,avg;
        populateArray(names);





        for(int i=1; i< names.length; i++)
        {
            if(names[i].length() > longestName.length())
            {
                longestName = names[i];

                total  += names[i].length();

            }

        }
        avg = total / names.length;

        Arrays.sort(names);

        list = Arrays.toString(names);

        JOptionPane.showMessageDialog(null, "The longest name is: "+longestName+"\n\nAverage characters per name is: "+avg+"\n\nThe array sorted in ascending order is: "+list,"Results",JOptionPane.INFORMATION_MESSAGE);



    }

    public static void populateArray(String n[])
    {
        for(int i=0; i<n.length; i++)
        {
            n[i] = JOptionPane.showInputDialog("Please enter the name of person: "+(i+1));
        }
    }

}
