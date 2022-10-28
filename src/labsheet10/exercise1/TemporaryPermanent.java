package labsheet10.exercise1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TemporaryPermanent extends Lecturer {

    private int hoursWorked;

    public TemporaryPermanent(String name, String address, GregorianCalendar dateOfBirth, String staffID,
                              String[] coursesTaught, GregorianCalendar dateOfAppointment)
    {
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        setHoursWorked(hoursWorked);
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    public String getStatus(){
        return "Contracted temporary lecturer on part-time hours";
    }

    @Override
    public String toString() {
        return super.toString() + "\nHours worked: "+getHoursWorked();
    }

    @Override
    public int getPointOnScale() {
        Calendar today = GregorianCalendar.getInstance();
        int yearsWorked = today.get(Calendar.YEAR)-getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH) < getDateOfAppointment().get(Calendar.MONTH) ||
                today.get(Calendar.MONTH) == getDateOfAppointment().get(Calendar.MONTH)
                        && today.get(Calendar.DATE) < getDateOfAppointment().get(Calendar.DATE))
            yearsWorked--;

        if(yearsWorked > 4 && hoursWorked > 1500)
        {
            return 4;
        }
        else if(yearsWorked <= 3 && hoursWorked > 1000)
        {
            return (int) ((hoursWorked * 1.33f / 700) + 1);
        }
        else
        {
            return yearsWorked;
        }
    }
}
