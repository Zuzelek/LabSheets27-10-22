package labsheet10.exercise1;

import java.util.GregorianCalendar;

public abstract class Lecturer {
    public String name;
    public String address;
    public GregorianCalendar dateOfBirth;
    public String staffID;
    public String[] coursesTaught;
    public GregorianCalendar dateOfAppointment;

    public  Lecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID,
                     String[] coursesTaught, GregorianCalendar dateOfAppointment) {

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
}

