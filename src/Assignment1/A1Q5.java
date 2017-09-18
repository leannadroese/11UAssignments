/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/**
 *
 * @author droel8940
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create City
        City kw = new City();
        
        //create walls
        new Wall(kw, 3, 1, Direction.NORTH);
        
    }
}
