/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author droel8940
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create new City called kitchener
        City kitchener = new City();
                 
        //create walls
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.EAST);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 3, 4, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.NORTH);
        new Wall(kitchener, 3, 2, Direction.WEST);
        
        //create Thing
        new Thing(kitchener, 3, 1, Direction.EAST);
        
        // create a robot
        Robot bob = new Robot (kitchener, 3, 0, Direction.EAST);
        
        //make bob move
        bob.move();
        
        // get bob to pick thing
        bob.pickThing();
        
        //Get bob to move
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();  
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move(); 
        
        // make bob put thing
        bob.putThing();
        
        //make bob move
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();  
        bob.move();
        bob.turnLeft();
        
        
               
        
        
        
        
        
                
                }
}
