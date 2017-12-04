/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author droel8940
 */
public class A7Q1 {

    //make a new method that will find the area of a circle
    public double circleArea(double radius) {
        //Do the math to find the area of the circle
        double area = 3.14 * Math.pow(radius, 2);
        //return the answer
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an object
        A7Q1 test = new A7Q1();

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Ask the user for the radius of the circle
        System.out.println("What is the radius of the circle?:");
        //grab the input info 
        double a = input.nextDouble();
        //find the area of the circle
        double total = test.circleArea(a);
        //Output the area to the user
        System.out.println(total);
    }
}
