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
public class A7Q2 {

    //Make a method that will sort the info and give their mark a letter name
    public int examGrade(int a) {
        //if their mark is lower than 50 , output "F"
        if (a < 50) {
            System.out.println("F");
        } else {
            //if their mark is lower than 60 , output "D"
            if (a < 60) {
                System.out.println("D");
            } else {
                //if their mark is lower than 70 , output "C"
                if (a < 70) {
                    System.out.println("C");
                } else {
                    //if their mark is lower than 80 , output "B"
                    if (a < 80) {
                        System.out.println("B");
                    } else {
                        //if their mark is greater than 79 , output "A" 
                        if (a > 79) {
                            System.out.println("A");
                        }
                    }
                }
            }
        }
        return a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an object
        A7Q2 test = new A7Q2();

        //Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their grade
        System.out.println("What is your mark?: ");
        //Grab this information
        Integer info = input.nextInt();

        //Make it look nice
        System.out.println("    ");

        //Tell the user what you are outputting to the screen
        System.out.println("Your grade: ");
        //Output the info to the screen
        Integer total = test.examGrade(info);

    }
}
