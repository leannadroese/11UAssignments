/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author droel8940
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the user what the first test was out of
        System.out.println("What is the speed limit?: ");

        // Create int for speed limit
        int speedLimit = input.nextInt();

        //Ask the user what his test mark was
        System.out.println("Enter the recorded speed of the car?: ");

        // Create int for drivers speed
        int driverSpeed = input.nextInt();

        // if the driver is within the speedlimit, say Congrats!
        if (speedLimit > driverSpeed) {
            System.out.println("Congrats! You are within the speed limit!");

        }

        //make an int for 1-20 above the speed limit
        int twentyOver = speedLimit + 21;

        //if the driver is over the speed limit by 1-20
        if (driverSpeed < twentyOver) {
            System.out.println("You are speeding and your fine is $100!");
        }

        //make an int for 21 - 30 above the speed limit
        int thirtyOver = speedLimit + 31;

        //if the driver is over the speed limit by 21 - 30, tell them the fine
        if (driverSpeed < thirtyOver) {
            System.out.println("You are speeding and your fine is $270!");
        }

        //if the driver is over the speed limit by 31 - more, tell them their fine
        if (driverSpeed > thirtyOver) {
            System.out.println("You are speeding and your fine is $500!");

            //The End
        }
    }
}
