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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //create scanner for input
        Scanner input = new Scanner(System.in);
        
          //Ask the user how much the food cost
        System.out.println("How much does the food for prom cost?: ");
        
        //create a string for the first variable 
        int firstCost = input.nextInt();
        
        //Ask the user how much the DJ cost
        System.out.println("How much does the DJ cost?: ");
        
        //create a string for the second variable 
        int secondCost = input.nextInt();
        
        //Ask the user how much the Hall cost
        System.out.println("How much does it cost to rent the hall?: ");
        
        //create a string for the third variable 
        int thirdCost = input.nextInt();
        
        //Ask the user how much the Decorations cost
        System.out.println("How much does decorations cost?: ");
        
        //create a string for the fourth variable 
        int fourthCost = input.nextInt();
        
        //Ask the user how much the staff cost
        System.out.println("How much does it cost for staff?: ");
        
        //create a string for the fifth variable 
        int fifthCost = input.nextInt();
        
        //Ask the user how much the miscellaneous cost
        System.out.println("How much for miscellaneous costs?: ");
        
        //create a string for the sixth variable 
        int sixthCost = input.nextInt();
        
        //Add all the numbers to find out how much money they spent on Prom
        int totalNumber = firstCost + secondCost + thirdCost + fourthCost + fifthCost + sixthCost;
        
        //Create an equation to find out how many tickets will need to be sold
        int ticketNumber = totalNumber / 35;
        
        System.out.println( " The total cost is $" + totalNumber + ". Therefore you will need to sell " + ticketNumber + " tickets to break even.");
        
        //The End
        
    }
}
