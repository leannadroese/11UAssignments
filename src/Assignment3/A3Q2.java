/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author droel8940
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create a new City called kw
        City kw = new City();

        //create robot named bob
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);

        // create things for bob to pick up  
        new Thing(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 1, Direction.NORTH);

        //turn on counter for things
        kw.showThingCounts(true);

        //create loop that will make bob pick up a thing and then place it in the next Avenue
        for (int count = 0; count < 10; count = count + 1) {

            //make bob pick thing and then place it in the next Avenue, and then circle back to his original pile of things
            bob.pickThing();
            bob.move();
            bob.putThing();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
        }

        //make bob sit on his pile of things
        bob.move();

        //The End
    }
}
