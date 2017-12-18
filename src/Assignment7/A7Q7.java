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
public class A7Q7 {

    public void firstNumber(int numba) {

        //If the number is positive and two digits
        if (numba > 0 && numba > 9) {
            //Get rid of the last digit
            int remove = numba / 10;
            //Make a loop that will stop removing the last digit once it only has one digit
            while (remove > 9) {
                //Remove the last digit
                remove = remove / 10;
            }
            //Once the only digit left is the first digit of the number - Output it to the user
            System.out.println("The first digit is: " + remove);

        } else {
            //If the number they entered is only one digit then just output their number
            if (numba > 0 && numba < 9 || numba == 9) {
                //Output their number
                System.out.println("The first digit is: " + numba);
            }
        }
        //If the number is negative and two digits
        if (numba < 0 && numba < -9) {
            //Get rid of the last digit
            int remove = numba / 10;
            //Make a loop that will stop removing the last digit once it only has one digit
            while (remove < -9) {
                //Remove the last digit
                remove = remove / 10;
            }
            //Turn it into a positive number
            int positive = remove * -1;
            //Output the first digit of the number to the screen
            System.out.println("The first digit is: " + positive);

        } else {
            //If the number they entered is only one digit then just output their number
            if (numba < 0 && numba > -9 || numba == -9) {
                //Make their number a positive integer
                int change = numba * -1;
                //Output the info onto the screen 
                System.out.println("The first digit is: " + change);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new object 
        A7Q7 test = new A7Q7();

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Ask the user to inout a number
        System.out.println("Please input a number: ");
        //Grab the number that they just input
        Integer number = input.nextInt();
        //Test your new method
        test.firstNumber(number);

    }
}
