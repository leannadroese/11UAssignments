/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author droel8940
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create new City
        City kw = new City();

        //create walls 
        new Wall(kw, 3, 0, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Wall(kw, 3, 0, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 6, Direction.EAST);

        //create thing
        new Thing(kw, 3, 8, Direction.NORTH);

        //create robot
        Robot karel = new Robot(kw, 3, 0, Direction.EAST);

        //create while loop
        while (!(karel.frontIsClear())) {

            //make karel go over the wall
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();

            //make karel move forward if the way is clear
            while (karel.frontIsClear() && !karel.canPickThing()) {

                //make karel move
                karel.move();


            }


        }
    }
}