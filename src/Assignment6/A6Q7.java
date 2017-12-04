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
        int[] array = new int[1001];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //make all multiples of 2 equal zero ( except for 2 )
        for (int two = 2; two < array.length; two = two + 2) {
            while (array[two] != 0) {
                array[two] = 0;

            }
        }

        // Make all the multiples of 3 equal 0 ( except for 3 )
        for (int three = 3; three < array.length; three = three + 3) {
            while (array[three] != 0) {
                array[three] = 0;

            }
        }

        for (int five = 5; five < array.length; five = five + 5) {
            while (array[five] != 0) {
                array[five] = 0;
            }
        }

        for (int seven = 7; seven < array.length; seven = seven + 7) {
            while (array[seven] != 0) {
                array[seven] = 0;
            }
        }

        array[2] = 2;
        array[3] = 3;
        array[5] = 5;
        array[7] = 7;
        
        for ( int k = 1; k < array.length; k++){
            if(array[k] != 0){
                System.out.println(array[k]);
            }
        }

    }
}
