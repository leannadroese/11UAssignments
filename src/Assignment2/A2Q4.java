/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author droel8940
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new city
        City kw = new City();
        
        //create walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 2, 2, Direction.WEST);
        
        //create a robot
        Robot bob = new Robot(kw, 2, 1, Direction.NORTH);
        
        //create while loop to make bob go around walls
        while(!(bob.frontIsClear())){
            
            //make karel move around the castle
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.move();
            
        }
        
    }
}
