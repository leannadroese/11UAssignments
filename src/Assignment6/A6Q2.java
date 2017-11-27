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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Ask how many people the heights they are entering 
        System.out.println("How many people's heights are going to be entered?");
        //Create a string that will grab the information 
        String numberPeople = input.nextLine();
        //Covert this String into a integer
        int people = Integer.parseInt(numberPeople);

        //Now we have to create an array to store the information hahaha
        double[] heightInput = new double[people];

        //Make a loop that can store all the peoples heights into an array
        for (int i = 0; i < heightInput.length; i++) {
            //Tell user to enter the peoples heights
            System.out.println("Please enter the heights:");
            //Grab this information and throw it into the array
            heightInput[i] = input.nextDouble();
        }
        //Create a new double
        double adding = 0;
        
        //Add all of the heights together 
        //You use this to get the heights from the array
        for (int i = 0; i < heightInput.length; i++){
            //Add them together, yay!
            adding = adding + heightInput[i];
        }
        //Convert int numberPeople into a double so that it works with the format
        Double peoples = Double.parseDouble(numberPeople);
        //Now divide the added numbers with the number of people
        double average = adding / peoples;
        //Make it look nice with a empty line
        System.out.println("  ");
        //Output the heigth average
        System.out.println("The average height of your group is: " + average);
        
        //Write out that you are going to tell them the heights that are bigger than the average
        System.out.println("Here are the heights above average: ");
        
        //Output all the heights that are higher than the average
        for (int i = 0; i < heightInput.length; i++){
            if(heightInput[i] > average){
                    System.out.println(heightInput[i]);
            }
       }
    
    }
}
