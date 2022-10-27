package labsheet6;

import javax.swing.*;

public class Person {
    private String firstName;
    private String lastName;

    public Person(){
        this("Not Supplied","Not Supplied");
    }
    public Person(String firstName, String lastName){
        //2 arg mutator method to access attributes
        setFirstName(firstName);
        setLastName(lastName);
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return "First Name: "+getFirstName() + "  Last Name: "+getLastName();
    }
}
