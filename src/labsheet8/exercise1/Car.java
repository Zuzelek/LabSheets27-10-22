package labsheet8.exercise1;

public class Car extends Vehicle {
    private int maxPassengers;
    private String registrationNumber;

    public Car(){
        //super();
        setMaxPassengers(0);
        setRegistrationNumber("No registration Specified");
    }
    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassengers, String registrationNumber){
        super(price,length,height,weight,manufacturer,model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMax passengers: " + getMaxPassengers() + "\nRegistration Number : "+getRegistrationNumber();
    }
}
