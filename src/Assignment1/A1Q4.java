/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author droel8940
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create new city
        City kitchener = new City();
        
        //create walls
        new Wall(kitchener, 0, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        
        //create robots
        Robot bob = new Robot(kitchener, 0, 0, Direction.SOUTH);
        Robot will = new Robot(kitchener, 0, 1, Direction.SOUTH);
        
        // make robots move
        bob.move();
        will.move();
        will.turnLeft();
        will.move();
        
        bob.move();
        
        
        
        
    }
}
