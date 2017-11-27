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
        int[] numbers = new int[10];

        //Create a loop that will collect all ten of the numbers
        for (int i = 0; i < numbers.length; i++) {
            //Ask the user to enter 10 marks
            System.out.println("Please enter 10 marks: ");
            //Grab the info that the user has input and throw it into the array you just created
            numbers[i] = input.nextInt();
        }
        //make a loop that will switch the numbers

        //make an Integer named i to locate the first number
        for (int i = 0; i < numbers.length - 1; i++) {
            //make an Integer named j to locate the second number 
            for (int j = i; j < numbers.length; j++) {
                //make a while loop to that will swap integers i and j if i is larger than j
                while (numbers[i] > numbers[j]) {
                    //do the math that will allow you to swap the numbers
                    numbers[i] = numbers[i] + numbers[j];
                    numbers[j] = numbers[i] - numbers[j];
                    numbers[i] = numbers[i] - numbers[j];
                }
            }
        } 
        //tell the user what the numbers are in ascendijng order
        System.out.println("The numbers in ascending order are: ");
        //output the numbers now that they are in the right order using a loooooop
        for (int i = 0; i < numbers.length; i++) {
            //output the numbers to the user
            System.out.println(numbers[i]);
        }
    }
}
