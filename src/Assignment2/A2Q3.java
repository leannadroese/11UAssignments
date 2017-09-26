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
        Robot karel = new Robot(kw, 5, 5, Direction.EAST);
              
        //make karel move to Street 0 
        
        //if karels street is less than 0, and he is not facing East, make him turn until he is facing East
        while(karel.getStreet()<0 && karel.getDirection()!= Direction.EAST)
            
            //make karel face East
            karel.turnLeft();
        
        //if karels street is greater than 0, and he is not facing West, make him turn until he is facing West
        while(karel.getStreet()>0 && karel.getDirection()!=Direction.WEST)
            
            //make karel face West
            karel.turnLeft();
        
        
        while(karel.getAvenue()!= 0)
            
            //make karel move
            karel.move();
        
        //make karel move to Avenue 0
        
        //if karels street is less than 0, and he is not facing South, make him turn until he is facing South
        while(karel.getStreet()<0 && karel.getDirection()!=Direction.SOUTH)
            
            //make karel face South
            karel.turnLeft();
        
        //if karels street is greater than 0, and he is not facing North, make him turn until he is facing North
        while(karel.getStreet()>0 && karel.getDirection()!=Direction.NORTH)
            
            //make karel face North
            karel.turnLeft();
        
        while(karel.getStreet()!=0)
            
            //make karel move
            karel.move();
        
            
        
       
          
       
       
       
       }
        
        
        
    }


