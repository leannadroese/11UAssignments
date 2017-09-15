/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author droel8940
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    
    // create new City called kitchener
        City kitchener = new City();
        
        //create the walls
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        
        //create a robot
        Robot bob = new Robot(kitchener, 0, 2, Direction.WEST);
        bob.setColor(Color.blue);
        
        //make bob the robot move
        bob.move();
        bob.move();
        
        //get bob to turn left 
        bob.turnLeft();
        
        //make bob move 
        bob.move();
        bob.move();
        bob.move();
        
        // make bob turn left
        bob.turnLeft();
        
        //make bob move
        bob.move();
        bob.move();
        bob.move();
        
         // make bob turn left
        bob.turnLeft();
        
        //make bob move
        bob.move();
        bob.move();
        bob.move();
        
         // make bob turn left
        bob.turnLeft();
        
        // make bob move
        bob.move();
        
        
        
    }
}
