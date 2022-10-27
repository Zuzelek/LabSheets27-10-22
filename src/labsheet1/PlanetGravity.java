package labsheet1;

import java.io.InputStream;
import java.util.Scanner;



public class PlanetGravity {
    public static void main(String[] args) {


        double massOther, mass, radius, radiusOther, acceleration;
        float g = 9.81f;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the mass of planet Earth: ");
        mass = input.nextDouble();

        System.out.print("Please enter the radius of planet earth: ");
        radius = input.nextDouble();

        System.out.print("Please enter the mass of the other planet: ");
        massOther = input.nextDouble();

        System.out.print("Please enter the radius of the other planet: ");
        radiusOther = input.nextDouble();

        acceleration = (g*massOther*(radius*radius) / (mass*(radiusOther*radiusOther)));

        System.out.println("The acceleration due to gravity on the other planet is "+String.format("%.2f",acceleration)+" m/s/s");
    }
}
