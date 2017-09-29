/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author droel8940
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create new city
        City kw = new City();
                
        //create walls of square
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        
        //create a new robot
        Robot bob = new Robot(kw, 0, 2, Direction.WEST);
        
        
        // create int move counter loop thing
        for(int count = 0; count < 8; count = count + 1){
            
            //make bob move 2 times and then turn left and then move again
            bob.move();
            bob.move();
            bob.turnLeft();
            bob.move();
        }
      
                
                
    }
}
