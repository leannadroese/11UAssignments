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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Ask the user how many people are in the class
        System.out.println("How many people are in your class?");
        //Grab the input info 
        int people = input.nextInt();

        int[] array = new int[people];

        //Ask the user to enter their marks
            System.out.println("Please enter marks: ");
            
        //Ask the user for the user for all the marks in the class 
        //Get the info with a loop
        for (int i = 0; i < array.length; i++) {
            
            //Grab the info that the user just input 
            array[i] = input.nextInt();
        }
        //make an Integer named i to locate the first number
        for (int i = 0; i < array.length - 1; i++) {
            //make an Integer named j to locate the second number 
            for (int j = i; j < array.length; j++) {
                //make a while loop to that will swap integers i and j if i is larger than j
                while (array[i] > array[j]) {
                    //do the math that will allow you to swap the numbers
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        //Tell the user the lowest mark in the class
        System.out.println("The lowest mark in the class is: " + array[0] + "%");
        //Leave a nice space
        System.out.println(" ");
        //Tell the user the highest mark in the class
        System.out.println("The highest mark in the class is: " + array[people - 1] + "%");
        //Leave a nice space
        System.out.println(" ");
        
        //Find the class average
        //make an Integer named i to locate the first number
        for (int i = 0; i < array.length; i++) {
                {
                  array[0] = array[0] + array[i];  
                }  
            }
        //make an sub int so that you can do the math
        double a = array[0];
        
        //Take the added total and divide it by the number of marks entered
        double b = a / people;

        //Tell the user the class average
        System.out.println("The class average is: " + b + "%");
    }
}
