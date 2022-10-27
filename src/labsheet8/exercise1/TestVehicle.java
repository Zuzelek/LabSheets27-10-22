package labsheet8.exercise1;

public class TestVehicle {
    public static void main(String[] args) {

        String txt = "";

        Car car1 = new Car();

        txt += "Testing the Car no-arg constructor: \n\n"+car1;

        Car car2 = new Car(100000.0,4.5,1.25,2000.0,"Ferrari","F2",2,"05KY1");

        txt += "\n\n\nTesting the Car multi-arg constructor: \n\n" + car2;

        Bicycle bicycle1 = new Bicycle();

        txt += "\n\n\n Testing the Bicycle no-arg constructor: \n\n" + bicycle1;

        Bicycle bicycle2 = new Bicycle(500.0,1.5,1.0,50.0,"Raleigh","MountainBike",4,true);



        txt += "\n\n\n Testing the biycle mutli-arg constructor: \n\n" + bicycle2;

        System.out.println(txt);


    }
}
