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
public class A7Q6 {

    //Create a new method
    public void lastNumber(int numba) {

        if (numba > 0) {
            //Get rid of the last digit
            int remove = numba / 10;
            //Now take this number and multiple it by ten so that the last digit will = 0
            int without = remove * 10;
            //Now subtract the without from the input number - this will only leave the last digit
            int subtract = numba - without;
            //Output the last digit to the screen
            System.out.println(subtract);

        } else {
            //Get rid of the last digit
            int remove = numba / 10;
            //Now take this number and multiple it by ten so that the last digit will = 0
            int without = remove * 10;
            //Now subtract the without from the input number - this will only leave the last digit
            int subtract = numba - without;
            //Change the negative into a positive number
            int finish = subtract * -1;
            //Output the last digit to the screen
            System.out.println(finish);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an object
        A7Q6 test = new A7Q6();

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Ask the user to input a number
        System.out.println("Please enter a number below: ");
        //Grab the number that they input
        Integer number = input.nextInt();
        //test your method
        test.lastNumber(number);

    }
}
