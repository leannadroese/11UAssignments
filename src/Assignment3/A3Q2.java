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

        //create a new City
        City kw = new City();

        //create robot
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);

        // create things
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

        for (int count = 0; count < 10; count = count + 1) {

            //make bob pickthing, move, put thing, and then circle back around to his pile and repeat
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
