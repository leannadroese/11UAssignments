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
import java.awt.Color;

/**
 *
 * @author droel8940
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create new City called kitchener 
       City kitchener = new City();
       
       //create walls 
       new Wall(kitchener, 1, 1, Direction.NORTH);
       new Wall(kitchener, 1, 2, Direction.NORTH);
       new Wall(kitchener, 1, 1, Direction.WEST);
       new Wall(kitchener, 2, 1, Direction.WEST);
       new Wall(kitchener, 1, 2, Direction.EAST);
       new Wall(kitchener, 1, 2, Direction.SOUTH);
       new Wall(kitchener, 2, 1, Direction.SOUTH);
         //fhgf
       
       //create new Robot
       Robot bob = new Robot(kitchener, 1, 2, Direction.SOUTH);
       bob.setColor(Color.blue);
       
       //create a Thing
       new Thing(kitchener, 2, 2, Direction.SOUTH);
       
       //make bob turn left
       bob.turnLeft();
       bob.turnLeft();
       bob.turnLeft();
       
       //make bob move
       bob.move();
       
       // make bob turn left
       bob.turnLeft();
       
       //make bob move
       bob.move();
       
       //make bob turn left 
       bob.turnLeft();
       
      // make bob move
       bob.move();
       
       // make bob pick up the Thing
       bob.pickThing();
       
       //make bob turn around
         bob.turnLeft(); 
           bob.turnLeft();
           
       //make bob go back to bed
       bob.move();
       bob.turnLeft();
        bob.turnLeft();
         bob.turnLeft();
       bob.move();
       bob.turnLeft();
        bob.turnLeft();
         bob.turnLeft();
         bob.move();
          bob.turnLeft();
           bob.turnLeft();
            bob.turnLeft();
  
       
       
       
       
       
       
       
       
    }
}
