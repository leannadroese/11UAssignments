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


        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Ask how many students are in their class
        System.out.println("How many students are in your class?");
        //Create a String to get the information
        String studentNumber = input.nextLine();
        //Convert String into a int
        int a = Integer.parseInt(studentNumber);
        //Then use this information to get the number that will determine the size of the array

        
        //Create an array to store the students scores
        double[] studentMarks = new double[a];

        //Create a loop that will get all of the student marks and store them in the array
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println("Enter student marks:");
            //store info into array
            studentMarks[i] = input.nextDouble();
        }
        //Make "added" double start at zero
        double added = 0;

        //Do the math to find out the class average
        for (int i = 0; i < studentMarks.length; i++) {
            //add the numbers together
            added = added + studentMarks[i];
        }
        //Convert StudentNumber into a double 
        Double b = Double.parseDouble(studentNumber);
        //Divide the total of the students added marks and divide it by the number of students
        double average = added / b;
        //Tell the user the class average
        System.out.println("Your class average is: " + average + "%");

    }
} 
