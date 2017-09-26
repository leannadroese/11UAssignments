/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author droel8940
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create new City
        City kw = new City();

        //create new robot
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);

        //create things
        new Thing(kw, 1, 2, Direction.EAST);
        new Thing(kw, 1, 3, Direction.EAST);
        new Thing(kw, 1, 4, Direction.EAST);
        new Thing(kw, 1, 5, Direction.EAST);
        new Thing(kw, 1, 6, Direction.EAST);
        new Thing(kw, 1, 7, Direction.EAST);
        new Thing(kw, 1, 8, Direction.EAST);
        new Thing(kw, 1, 9, Direction.EAST);
        new Thing(kw, 1, 10, Direction.EAST);
        new Thing(kw, 1, 11, Direction.EAST);



        //if bob does not have 7 things in his backpack make him move and pick up a thing
        while (bob.countThingsInBackpack() != 7) {
            //make bob move and pick a thing
            bob.move();
            bob.pickThing();
            {

                // make if statement 
                if (bob.countThingsInBackpack() == 7) {
                    bob.move();
                }


                //if bob has 7 things in his backpack move three spaces
                while (bob.canPickThing()) {
                    //make bob move and pick a thing
                    bob.move();

                }
            }

        }
    }
}
