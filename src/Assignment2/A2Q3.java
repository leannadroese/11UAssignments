/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author droel8940
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create city
        City kw = new City();
        
        //create a robot
        Robot karel = new Robot(kw, 4, 4, Direction.EAST);
        
        // make karel face north
       while(karel.getDirection()!= Direction.NORTH)
           
           //make karel turn 
           karel.turnLeft();
       
       while(karel.getStreet()!= 0)
           
           //make karel move
           karel.move();
       
       while(karel.getDirection()!= Direction.WEST)
           
           //make karel turn to face North
           karel.turnLeft();
       
       while(karel.getAvenue()!= 0)
           
           //make karel move
           karel.move();
       
          
       
       
       
       }
        
        
        
    }

