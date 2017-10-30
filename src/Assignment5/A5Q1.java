/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author droel8940
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user to input a word
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        //convert word to lower case
        word = word.toLowerCase();
        
        //put ub in infront of the word if it starts with a vowel
       if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")){
           //create a string
           String translated = "ub" + word;
           //output to user
           System.out.println(translated);
       }
            //not a vowel, special rule time
            //find the first vowel by going through each letter
            for (int i = 0; i < word.length(); i++) {
                //look for vowel at spot i
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    
                    String front = word.substring(0, i);
                    String ending = word.substring(i);
                   
                    String translatedd = front + "ub" + ending;
                    
                    System.out.println(translatedd);
                   
                    break;
     
      }
       
    }
       }
}
    

        
    
           
       
       
        
    

