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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        
        //Create an array
        int[] array = new int[1000];
        
        //Make the first space in the array = 1
        array[0] = 1;
        
        //Put numbers into array
        for (int i = 0; i < array.length; i++){
            //make another int that will do the adding with the i
            for (int j =1; j < array.length - 1; j++){
             array[j]= array[i] + 1;   
            }
            
            
        }
        System.out.println(array[22]);
    }
    
}
