/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Droel8940
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create new City
        City kw = new City();

        //create a robot that is carrying 20 Things
        Robot bob = new Robot(kw, 1, 1, Direction.EAST, 20);

        //create a loop that will make bob plant his seeds in 4 rows of 5
        for (int count = 0; count < 2; count = count + 1) {

            //make a path that will make plant 2 rows of five

            //make bob plant 5 seeds
            bob.putThing();
            bob.move();
            bob.putThing();
            bob.move();
            bob.putThing();
            bob.move();
            bob.putThing();
            bob.move();
            bob.putThing();
            bob.move();

            //make bob move down to the next street
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();

            bob.move();

            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();

            //make bob plant 5 seeds
            bob.move();
            bob.putThing();
            bob.move();
            bob.putThing();
            bob.move();
            bob.putThing();
            bob.move();
            bob.putThing();
            bob.move();
            bob.putThing();
            bob.move();

            //make bob move down to the next street
            bob.turnLeft();
            bob.move();
            bob.turnLeft();

            bob.move();

            //The End
        }
    }
}
