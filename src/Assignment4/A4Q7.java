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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //create scanner for input
        Scanner input = new Scanner(System.in);

        
        int dice = 0;
            
            for( int moveCount = 1; moveCount > 100; moveCount = moveCount + dice){
    System.out.println("Enter dice roll: ");    
        String diceNumber = input.nextLine();
        dice = Integer.parseInt(diceNumber);

            
            if(moveCount = 54){
                moveCount = 19;
            }
            if(moveCount = 90){
                moveCount = 48;
            }
        if(moveCount = 99){
                moveCount = 77;
            }
            if(moveCount = 9){
                moveCount = 34;
            }
            if(moveCount = 40){
                moveCount = 64;
            }
            if(moveCount = 67){
                moveCount = 86;
            }
}
        
if(moveCount = 100){
            System.out.println("You Won!!");

        
          
    }
    }
}
