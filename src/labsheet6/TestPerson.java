package labsheet6;

import labsheet6.Person;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {

        String name, surname;

        name = JOptionPane.showInputDialog("Please enter the first name of the second person: ");
        surname = JOptionPane.showInputDialog("Please enter the last name of the second person :");

        Person person = new Person();
        Person person1 = new Person(name, surname);
        JOptionPane.showMessageDialog(null,"****Person Class Tester****\n\nCalling the Person() constructor ...."+
                "\nValue of first Person object is: "+person.toString()+
                "\n\nCalling the Person(String, String), constructor after getting user-supplied values ...."+
                "\nValue of second person object is: "+person1.toString(),"",JOptionPane.INFORMATION_MESSAGE);
    }
}
