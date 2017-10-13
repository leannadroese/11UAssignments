/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author droel8940
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create City
        City kw = new City();

        //create walls of mine
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 7, Direction.NORTH);
        new Wall(kw, 1, 7, Direction.EAST);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 3, Direction.SOUTH);

        //create Things
        new Thing(kw, 1, 3, Direction.SOUTH);
        new Thing(kw, 1, 4, Direction.SOUTH);
        new Thing(kw, 1, 5, Direction.SOUTH);
        new Thing(kw, 1, 6, Direction.SOUTH);
        new Thing(kw, 1, 7, Direction.SOUTH);

        //create a miner(robot)
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);

        //turn on thing counter
        kw.showThingCounts(true);

        //make bob walk to thing
        while (!(bob.canPickThing()) && bob.frontIsClear()) {
            bob.move();

            //make bob pick thing and turn around
            while (bob.canPickThing()) {
                bob.pickThing();
                bob.turnLeft();
                bob.turnLeft();

                //make bob go back to his starting place
                while (bob.getAvenue() != 1 && bob.getDirection() == Direction.WEST) {
                    bob.move();

                    if (!(bob.frontIsClear())) {
                        bob.putThing();
                    }

                    while (!(bob.frontIsClear())) {
                        bob.turnLeft();
                        bob.turnLeft();
                        bob.move();
                    }

                }

            }



        }
        //make bob face WEST
        while (bob.getDirection() != Direction.WEST) {
            bob.turnLeft();
        }

        //make bob go back to his starting place
        while (bob.getAvenue() != 1 && bob.getDirection() == Direction.WEST) {
            bob.move();
        }

        //make bob face EAST
        while (bob.getDirection() != Direction.EAST) {
            bob.turnLeft();
        }
    }
}           //The End
