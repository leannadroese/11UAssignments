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
public class A7Q3 {

    //Make a new Method called divideBy
    public void divideBy(double info) {

        //Tell the user what it can be divided by
        System.out.println("Can evenly be divided by: ");

        //Make a variable called i that is equal to info - that will decrease by 1 each time
        for (double i = info; i > 0; i--) {
            //if the remainder of the info divided by i is equal to 0 ....
            if (info % i == 0) {
                //Output i to the screen
                System.out.println(i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an object
        A7Q3 test = new A7Q3();

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Ask the user to input a number
        System.out.println("Please enter a number: ");
        //Grab the number they have input
        Double number = input.nextDouble();
        //Output the info to the screen
        test.divideBy(number);
    }
}
