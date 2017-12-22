/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author droel8940
 */
public class A7Q8 {

    //Create a new method
    public void allDigitsOdds(int number) {

        while (number > 9) {
            int remove = number / 10;
            //Now take this number and multiple it by ten so that the last digit will = 0
            int without = remove * 10;
            //Now subtract the without from the input number - this will only leave the last digit
            int subtract = number - without;
            //take away the last digit
            int numba = number - subtract;
            int divide = numba / 10;
            number = divide;

            if (number <= 9) {
                if (divide % 2 == 0) {
                    System.out.println("false");

                } else if (!(divide % 2 == 0)) {
                    System.out.println("true");
                }
            }
   
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make an object to test my new method :)
        A7Q8 test = new A7Q8();

        //Make a scanner 
        Scanner input = new Scanner(System.in);

        //Ask the user to input a number 
        System.out.println("Please input a number: ");
        //Grab the number
        Integer numbers = input.nextInt();
        //Use method allDigitsOdd
        test.allDigitsOdds(numbers);


    }
}
