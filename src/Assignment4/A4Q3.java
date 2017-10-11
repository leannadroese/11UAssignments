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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Ask the user to type their name
        System.out.println("Please enter 4 numbers, each on seperate lines: ");
        
        //create scanner for input
        Scanner input = new Scanner(System.in);
        
        //create a string for the variable 
        String firstNumber = input.nextLine();
        String secondNumber = input.nextLine();
        String thirdNumber = input.nextLine();
        String fourthNumber = input.nextLine();
        
        //tell the user what their numbers were on one line
        System.out.println("Your numbers were, " + firstNumber + ", " + secondNumber + ", " + thirdNumber + ", " + fourthNumber +"!");
       
        //The End
        
    }
}
