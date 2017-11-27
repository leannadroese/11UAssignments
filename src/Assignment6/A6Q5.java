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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);

        //Ask the user how many numbers they will be inputting 
        System.out.println("How many marks will you be entering?");
        //Grab this information
        int a = input.nextInt();

        //Create an array
        int[] array = new int[a];

        //Create a loop that will collect all of the users marks
        for (int i = 0; i < array.length; i++) {
            //Ask the user to enter their marks
            System.out.println("Please enter marks: ");
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
        System.out.println("The numbers in ascending order are: ");
        //output the numbers now that they are in the right order using a loooooop
        for (int i = 0; i < array.length; i++) {
            //output the numbers to the user
            System.out.println(array[i]);
        }
       //Tell the user the class median 
        for (int k = 0; k < array.length; k++){
         int b = a / 2;
         
         System.out.println("The class median is: " + array[b]);
        }

    }
}
