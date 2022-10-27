package labsheet1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {

        float height, allHeights=0, avgHeight=0, smallest=2147483647, highest=0;
        int counter=0;

        Scanner input = new Scanner(System.in);



        while(counter<6)
        {
            System.out.print("Please enter height: ");
            height = input.nextFloat();

            while(height <= 0.5464f || height >= 2.72f)
            {
                System.out.println("Height Value invalid!!! Please re-enter height: ");
                height = input.nextFloat();
            }

            if(height < smallest) {
                smallest = height;
            }
            if(height > highest) {
                highest = height;
            }
            allHeights += height;



            avgHeight = allHeights / 6;
            counter++;

        }
        System.out.println("The average of the heights entered is: "+String.format("%.1f",avgHeight));
        System.out.println("The smallest height value entered is: "+smallest);
        System.out.println("The highest height value entered is: "+highest);
    }
}
