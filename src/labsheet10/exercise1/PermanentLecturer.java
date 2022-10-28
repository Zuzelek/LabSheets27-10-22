package labsheet10.exercise1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer {
        private String pensionEntitlements;
        private String status;

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID,
                             String[] coursesTaught, GregorianCalendar dateOfAppointment,String pensionEntitlements,
                             String status){
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPensionEntitlements() {
        return pensionEntitlements;
    }
    public String getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLecturer Pension Entilements: " + getPensionEntitlements();
    }
    public int getPointOnScale(){
        Calendar today = GregorianCalendar.getInstance();
        int yearsWorked = today.get(Calendar.YEAR)-getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH) < getDateOfAppointment().get(Calendar.MONTH) ||
        today.get(Calendar.MONTH) == getDateOfAppointment().get(Calendar.MONTH)
        && today.get(Calendar.DATE) < getDateOfAppointment().get(Calendar.DATE))
            yearsWorked--;



        if(yearsWorked > 20)
            return 20;
        else
            return yearsWorked;



    }
}
