/*
 * 
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author droel8940
 */
public class A7Q4 {

    //Create a new method called compoundInterst that will find the compound interest
    public double compoundInterest(double P, double r, double n) {

        //Do the math
        //I split the math into parts
        //Do the math inside the brackets first 
        double start = r + 1;
        //Multiply the contents within the bracket by P
        double multi = start * P;
        //multiplay everything by the number of years
        double end = multi * n;

        return end;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an object
        A7Q4 test = new A7Q4();

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Ask the user for the balance
        System.out.println("Please enter the balance? ");
        //Grab the input information
        Double a = input.nextDouble();
        //Ask the user for the interest rate
        System.out.println("Please enter the interest rate? ");
        //Grab the input information
        Double b = input.nextDouble();
        //Ask the user for the number of years
        System.out.println("Please enter the number of years: ");
        //Grab the input information
        Double c = input.nextDouble();

        //Use the method compoundInterst
        double finish = test.compoundInterest(a, b, c);
        //Output the information to the screen
        System.out.println("The compound interest is: " + finish);

    }
}
