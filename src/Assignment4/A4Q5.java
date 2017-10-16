/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author droel8940
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create scanner for input
        Scanner input = new Scanner(System.in);
        
          //Ask the user how much the food cost
        System.out.println("Please enter your name: ");

        //create a string for the first variable 
        String userName = input.nextLine();
        
        //Ask the user what the first test was out of
        System.out.println("What was the first test out of?: ");
        
        //
        double testOne = input.nextDouble();
        
        //Ask the user what his test mark was
        System.out.println("What mark did you get?: ");
        
        // 
        double markOne = input.nextDouble();
        
        //Ask the user what the second test was out of
        System.out.println("What was the second test out of?: ");
        
        //
        double testTwo = input.nextDouble();
        
        //Ask the user what their mark on the second test was
        System.out.println("What mark did you get?: ");
        
        //
        double markTwo = input.nextDouble();
        
        //Ask the user what the first test was out of
        System.out.println("What was the third test out of?: ");
        
        //
        double testThree = input.nextDouble();
        
        //Ask the user what his test mark was
        System.out.println("What mark did you get?: ");
        
        // 
        double markThree = input.nextDouble();
        
        //Ask the user what the first test was out of
        System.out.println("What was the fourth test out of?: ");
        
        //
        double testFour = input.nextDouble();
        
        //Ask the user what his test mark was
        System.out.println("What mark did you get?: ");
        
        // 
        double markFour = input.nextDouble();
        
        //Ask the user what the first test was out of
        System.out.println("What was the fifth test out of?: ");
        
        //
        double testFive = input.nextDouble();
        
        //Ask the user what his test mark was
        System.out.println("What mark did you get?: ");
        
        // 
        int markFive = input.nextInt();
        
        //make a space between lines
        System.out.println(      );
        
        //Tell the user their test scores
        System.out.println("Test Scores for " + userName + ":");
        
        //find the users percentage for the first test
        double firstTest = markOne / testOne;
        double firstFinal = firstTest * 100;
        //output the information
        System.out.println("Test 1: " + firstFinal + "%");
        
        //find the users percentage for the second test
        double secondTest = markTwo / testTwo;
        double secondFinal = secondTest * 100;
        //output the information
        System.out.println("Test 2: " + secondFinal + "%");
        
        //find the users percentage for the third test
        double thirdTest = markThree / testThree;
        double thirdFinal = thirdTest * 100;
        //output the information
        System.out.println("Test 3: " + thirdFinal + "%");
        
        //find the users percentage for the fourth test
        double fourthTest = markFour / testFour;
        double fourthFinal = fourthTest * 100;
        //output the information
        System.out.println("Test 4: " + fourthFinal + "%");
        
        //find the users percentage for the fifth test
        double fifthTest = markFive / testFive;
        double fifthFinal = fifthTest * 100;
        //output the information
        System.out.println("Test 5: " + secondFinal + "%");
           
        //make a space between lines
        System.out.println(      );
        
        //find the users overall average
        double totalAdding = firstFinal + secondFinal + thirdFinal + fourthFinal + fifthFinal;
        double totalAverage = totalAdding / 5;
        //output the information
        System.out.println("Average: " + totalAverage + "%");
        
        //The End
        
    }
}
