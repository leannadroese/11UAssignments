package Assignment6;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author droel8940
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Create an array top store the two given numbers
        int[] numbas = new int[2];

        //Ask the user to enter two numbers
        System.out.println("Please Enter Two Integers:");
        numbas[0] = input.nextInt();
        numbas[1] = input.nextInt();

        //If the first number is larger than the second, make them switch places
        if (numbas[0] > numbas[1]) {
            //switch the variables by adding them together and then subtracting b from 
            numbas[0] = numbas[0] + numbas[1];
            numbas[1] = numbas[0] - numbas[1];
            numbas[0] = numbas[0] - numbas[1];
            //Ouput the info
            System.out.println("The integers in ascending order are: " + numbas[0] + ", " + numbas[1]);
        } else {
            //If the first number is smaller than the second number then make the, keep their place
            System.out.println("The integers in ascending order are: " + numbas[0] + ", " + numbas[1]);
        }
    }
}
