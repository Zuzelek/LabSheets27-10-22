package labsheet10.exercise1;

import labsheet10.sampleprogram1.Person;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.*;

public abstract class Lecturer implements Person {
    public String name;
    public String address;
    public GregorianCalendar dateOfBirth;
    public String staffID;
    public String[] coursesTaught;
    public GregorianCalendar dateOfAppointment;

    public Lecturer(String name,String address,GregorianCalendar dateOfBirth, String staffID,
                    String[] coursesTaught,GregorianCalendar dateOfAppointment ) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }
    public String getName() {
        return name;
    }
    public String getAddress(){
        return address;
    }
    public GregorianCalendar getDateOfBirth(){
        return dateOfBirth;
    }
    public String getStaffID(){
        return staffID;
    }
    public String[] getCoursesTaught(){
        return coursesTaught;
    }
    public GregorianCalendar getDateOfAppointment(){
        return dateOfAppointment;
    }
    public abstract String getStatus();
    public abstract int getPointOnScale();

    @Override
    public String toString() {
        String str = "Lecturer name is: "+getName() +
                "\nLecturer address is: "+getAddress() +
                "\nLecturer date of birth is: ";
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");

        if(getDateOfBirth() != null)
        {
            Date dob = getDateOfBirth().getTime();

            String strDateOfBirth = formatDate.format(dob);

            str += strDateOfBirth;
        }
        else
            str+="Undefined";

        str +="\nLecturer Staff ID is: "+getStaffID() +
        "\nLecturer courses Taught are: ";
            for(int i=0; i<coursesTaught.length; i++)
                {
                    coursesTaught[i].toString();
                }

        str += "Date of Appointment: "+getDateOfAppointment() +
                "Lecturer status is: "+getStatus() +
                "Lecturer point on scale is: "+getPointOnScale();


            return str;
    }
}

