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
        for (int i = 1; i < array.length; i++) {
            array[i] = 1;
        }

        for (int i = 1; i < array.length; i++) {

            array[i] = array[i] + 1;

        }
        //mark all of the multiples of two
        for(int i =2; i < array.length; i++){
            for(int j = array[i] +2; j < array.length; j++){
            
                array[j] = 0;  
            }
             
        }

        System.out.println(array[2]);
        
    }
}
