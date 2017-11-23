/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author droel8940
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //Create a scanner
        Scanner input = new Scanner(System.in);
        
        //Create an array
        double[] numbers = new double[10];
        
        //Create a loop that will collect all ten of the numbers
        for(int i =0; i < numbers.length; i++){
        //Ask the user to enter 10 marks
        System.out.println("Please enter 10 marks: ");
        //Grab the info that the user has input and throw it into the array you just created
        numbers[i] = input.nextDouble();
        }
        //make a loop that will switch the numbers
        
        for (int i = 0; i < numbers.length; i++){
            //make int j 
            for( int j = 1; j < numbers.length; j++)
                
                while(numbers[i] > numbers[j]){   
                
                numbers[i] = numbers[i] + numbers[j]; 
                numbers[j] = numbers[i] - numbers[j];
                numbers[j] = numbers[i] - numbers[j];
  
                    
            }
        
         System.out.println(numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9]);       

        }    
        }
        }
            
    



        
    

