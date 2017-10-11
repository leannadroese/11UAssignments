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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create scanner for input
        Scanner input = new Scanner(System.in);
        
        //Ask the user to input their measurement in inches
        System.out.println("Please enter your measurement in inches: ");
        
        //let the user input desim
       double inchNumber = input.nextDouble();
       
       double cmNumber = inchNumber * 2.54;
       
       System.out.println( inchNumber + " inches, is equal to " + cmNumber);
        
       //The End
        
        
        
    }
}
