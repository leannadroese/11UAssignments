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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create a city
        City kw = new City();
                
        //create new walls
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        
        //create first robot
        Robot karel = new Robot(kw, 3, 3, Direction.EAST);
             
        //create string or karel's label
        String a = "k";
        
        //label robot bob
        karel.setLabel(a);
        
        //create second robot
        Robot maria = new Robot(kw, 0, 1, Direction.WEST);
        
        //create string or karel's label
        String b = "m";
        
        //label robot maria
        maria.setLabel(b);
                
        //create things
        new Thing(kw, 0, 0, Direction.EAST);
        new Thing(kw, 1, 0, Direction.EAST);
        new Thing(kw, 1, 1, Direction.EAST);
        new Thing(kw, 1, 2, Direction.EAST);
        new Thing(kw, 2, 2, Direction.EAST);
        
        //make maria move
        maria.move();
        
        //make maria pick thing up
        maria.pickThing();
        
        //make karel turn 
        karel.turnLeft();
        karel.turnLeft();
        
        //make maria turn left
        maria.turnLeft();
        
        //make karel move
        karel.move();
        
        //make maria move
        maria.move();
        
        //make karel turn 
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        //make maria pick thing up
        maria.pickThing();
        
        //make maria turn left
        maria.turnLeft();
        
        //make karel move
        karel.move();
        
        //make karel pick thing
        karel.pickThing();
        
        //make karel move
        karel.move();
        
        //make maria move
        maria.move();
        
        //make karel turn 
        karel.turnLeft();
        
        //make maria pick thing up
        maria.pickThing();
        
        //make karel pick thing
        karel.pickThing();

              
    }
}
