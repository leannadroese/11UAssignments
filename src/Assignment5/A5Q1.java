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

        //create String for translated word
        String translate = new String();
        //create String for letter a
        String a = new String("a");
        //create String for letter e
        String e = new String("e");
        //create String for letter i
        String i = new String("i");
        //create String for letter o
        String o = new String("o");
        //create String for letter u
        String u = new String("u");
        //create String for letters oo
        String oo = new String("oo");
        //create String for letters ou
        String ou = new String("ou");
        //create String for letters au
        String au = new String("au");

        //if the word does not have oo or ou, translate it with this 
        if (!(word.contains(oo)) || (!(word.contains(ou)))) {

            //replace the letter u with ubu
            if (word.contains(a) || word.contains(e) || word.contains(i) || word.contains(o) || word.contains(u)) {
                String transU = word.replaceAll(u, "ubu");
                String translated = new String(transU);

                //replace the letter a with uba
                if (translated.contains(a) || translated.contains(e) || translated.contains(i) || translated.contains(i) || translated.contains(o) || translated.contains(u)) {
                    String transA = transU.replaceAll(a, "uba");
                    String translatedA = new String(transA);

                    //replace the letter e with ube
                    if (translatedA.contains(a) || translatedA.contains(e) || translatedA.contains(i) || translatedA.contains(o) || translatedA.contains(u)) {
                        String transE = translatedA.replaceAll(e, "ube");
                        String translatedE = new String(transE);

                        //replace the letter i with ubi
                        if (translatedE.contains(a) || translatedE.contains(e) || translatedE.contains(i) || translatedE.contains(o) || translatedE.contains(u)) {
                            String transI = translatedE.replaceAll(i, "ubi");
                            String translatedI = new String(transI);

                            //replace the letter o with ubo
                            if (translatedI.contains(a) || translatedI.contains(e) || translatedI.contains(i) || translatedI.contains(o) || translatedI.contains(u)) {
                                String transO = translatedI.replaceAll(o, "ubo");
                                String translatedO = new String(transO);

                                System.out.println(translatedO);
                            }
                        }
                    }
                }
            }
        }
        //if word contains two OO's replace them with uboo
        if (word.contains(oo)) {
            String doubleO = word.replaceAll(oo, "uboo");
            System.out.println(doubleO);

        }
        //if the word contains ou replace it with ubou
        if (word.contains(ou)) {
            String doubleOU = word.replaceAll(ou, "ubou");
            System.out.println(doubleOU);
        }
    }
}
