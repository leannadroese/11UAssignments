/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author droel8940
 */
public class Game extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 600;
    static final int HEIGHT = 900;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 100;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    //Game Start 
    boolean gameStart = false;
    String openWords = "Press  ENTER  to  start!";
    //Make the player 
    int playerWidth = 60;
    int playerHeight = 60;
    Rectangle player = new Rectangle(WIDTH / 2 - playerWidth / 2, HEIGHT - playerHeight * 2, playerWidth, playerHeight);
    //Make the speed of the player
    int playerSpeed = 0;
    double playerSpeedy = 4;
    double playerZoom = 0.002;
    //Make the players score
    double playerScore = 0;
    int scorePlayer = 0;
    double scoreSpeed = 0.06;
    //Ice variables
    int iceDirectionY = 1;
    int iceSpeed = 0;
    double iceSpeedy = 2;
    double iceZoom = 0.0008;
    int iceSize = 40;
    int iceSpace = 0;
    //Make an array for your blocks
    Rectangle[] ice = new Rectangle[14];
    //Make the fonts
    Font scoreFont = new Font("arial", Font.BOLD, 42);
    Font wordsFont = new Font("Bernard MT Condensed", Font.PLAIN, 50);
    //Make sure the player does not move until they press a key
    boolean playerLeft = false;
    boolean playerRight = false;
    //Mak the image variables
    BufferedImage whale = loadImage("narwhal.png");
    BufferedImage iceberg = loadImage("iceberg.png");

    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Game() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    public BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return img;
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE


        //set the colour = LIGHT BLUE
        g.setColor(new Color(180, 200, 255));
        //set the background colour
        g.fillRect(0, 0, WIDTH, HEIGHT);

        //Change the colour = BLUE
        g.setColor(new Color(60, 128, 255));

        //Set the color = PURPLE
        g.setColor(new Color(128, 64, 128));

        //Draw the player
        //g.fillRect(player.x, player.y, player.width, player.height);
        g.drawImage(whale, player.x, player.y, player.width, player.height, null);

        //Set Color = Grey
        g.setColor(Color.WHITE);

        //make the blocks
        for (int i = 0; i < ice.length; i++) {
            g.drawImage(iceberg, ice[i].x, ice[i].y, ice[i].width, ice[i].height, null);
        }
        //Set the colour
        g.setColor(Color.WHITE);

        //Set the font for the words
        g.setFont(wordsFont);

        //Draw the opening words
        if (!(gameStart)) {
            g.drawString("" + openWords, WIDTH / 2 - 220, HEIGHT / 2 - 40);
        }

        //Set the font
        g.setFont(scoreFont);

        //Draw the score
        if (gameStart) {
            g.drawString("" + scorePlayer, WIDTH / 2 - 20, 80);

        }


        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {

        // Any of your pre setup before the loop starts should go here

        //Make the icebergs
        ice[0] = new Rectangle(180, -20 + iceSpace, iceSize, iceSize);
        ice[1] = new Rectangle(0, -90 + iceSpace, iceSize, iceSize);
        ice[2] = new Rectangle(380, -90 + iceSpace, iceSize, iceSize);
        ice[3] = new Rectangle(550, -160 + iceSpace, iceSize, iceSize);
        ice[4] = new Rectangle(280, -250 + iceSpace, iceSize, iceSize);
        ice[5] = new Rectangle(100, -320 + iceSpace, iceSize, iceSize);
        ice[6] = new Rectangle(450, -390 + iceSpace, iceSize, iceSize);
        ice[7] = new Rectangle(250, -490 + iceSpace, iceSize, iceSize);
        ice[8] = new Rectangle(0, -530 + iceSpace, iceSize, iceSize);
        ice[9] = new Rectangle(425, -625 + iceSpace, iceSize, iceSize);
        ice[10] = new Rectangle(150, -670 + iceSpace, iceSize, iceSize);
        ice[11] = new Rectangle(330, -770 + iceSpace, iceSize, iceSize);
        ice[12] = new Rectangle(550, -840 + iceSpace, iceSize, iceSize);
        ice[13] = new Rectangle(0, -880 + iceSpace, iceSize, iceSize);


    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 

            if (gameStart) {

                //make the players speed increse with time
                playerSpeedy = playerSpeedy + playerZoom;
                playerSpeed = (int) playerSpeedy;

                //Make the player move left 
                if (playerLeft && player.x > 0) {
                    player.x = player.x - playerSpeed;

                    //Make the player move right    
                } else if (playerRight && player.x < WIDTH - playerWidth) {
                    player.x = player.x + playerSpeed;
                }

                //Make the ice speed increase
                iceSpeedy = iceSpeedy + iceZoom;
                iceSpeed = (int) iceSpeedy;

                //Make the blocks move
                for (int i = 0; i < ice.length; i++) {
                    ice[i].y = ice[i].y + iceDirectionY * iceSpeed;
                }

                //Make ice go back to the top of the screen
                for (int i = 0; i < ice.length; i++) {
                    if (ice[i].y > HEIGHT) {
                        ice[i].y = 0;
                        //displace the blocks
                        if (ice[ i].x < 540) {
                            ice[i].x = ice[i].x + 100;
                        } else if (ice[i].x > 540) {
                            ice[i].x = 0;
                        }
                    }
                }

                //Make the game stop if the person hits an ice block
                for (int i = 0; i < ice.length; i++) {
                    if (player.intersects(ice[i])) {
                        iceZoom = 0;
                        iceSpeedy = 0;
                        iceSpeed = 0;
                        scoreSpeed = 0;
                        playerSpeed = 0;
                        playerSpeedy = 0;
                        playerZoom = 0;
                    }
                }
                //Make the score count up
                playerScore = playerScore + scoreSpeed;
                scorePlayer = (int) playerScore;
            }

            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {

            //Store the key being pressed
            int key = e.getKeyCode();

            //Find out what key is begin pressed
            if (key == KeyEvent.VK_LEFT) {
                playerLeft = true;

            } else if (key == KeyEvent.VK_RIGHT) {
                playerRight = true;

            } else if (key == KeyEvent.VK_ENTER) {
                gameStart = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

            //Store the key being pressed
            int key = e.getKeyCode();

            //Find out what key is begin pressed
            if (key == KeyEvent.VK_LEFT) {
                playerLeft = false;

            } else if (key == KeyEvent.VK_RIGHT) {
                playerRight = false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Game game = new Game();

        // starts the game loop
        game.run();
    }
}
