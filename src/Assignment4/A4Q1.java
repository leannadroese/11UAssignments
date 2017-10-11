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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Ask the user to type their name
        System.out.println("Please enter your name: ");
        
        //create scanner for input
        Scanner input = new Scanner(System.in);
        
        //create a string for the variable 
        String firstName = input.nextLine();
        
        //Output the variable along with asking, "How are you today?"
        System.out.println("Hello " + firstName + ". How are you today?");
        
        //The End
    }
}
