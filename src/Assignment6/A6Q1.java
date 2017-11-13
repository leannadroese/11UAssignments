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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    //create a scanner
    Scanner input = new Scanner(System.in);
    
    //ask how many students are in their class
    System.out.println("How many students are in your class?");
    //create a String to get the information
    String studentNumber = input.nextLine();
    //convert String into a int
    int a = Integer.parseInt(studentNumber);
    //Then use this information to get the number that will determine the size of the array
    
    
    //create an array to store the students scores
    double[] studentMarks = new double[a];
    
    //create a loop that will get all of the student marks
    for(int i = 0; i < studentMarks.length; i++){
        System.out.println("Enter student marks:");
        //store info into array
        studentMarks[i] = input.nextDouble();
    }
  
    
    }  
    
}
