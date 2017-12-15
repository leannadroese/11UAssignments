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
public class A7Q5 {

    public void chaotic(int stars) {
        //If stars is not equal to 5.....which it never will be....follow this loop
        while (stars == 5) {

            int randomNum = (int) (Math.random() * (5 - 1 + 1)) + 1;

            //If the random number is 1 output one star
            if (randomNum == 1) {
                System.out.println("*");
            }

            //If the random number is 2 output two star
            if (randomNum == 2) {
                System.out.println("**");
            }

            //If the random number is 3 output three star
            if (randomNum == 3) {
                System.out.println("***");
            }

            //If the random number is 4 output four star
            if (randomNum == 4) {
                System.out.println("****");
            }

            //If the random number is 5 output five star
            if (randomNum == 5) {
                System.out.println("*****");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make an object
        A7Q5 test = new A7Q5();

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Create an int
        int bub = 5;

        //Test it 
        test.chaotic(bub);

    }
}
