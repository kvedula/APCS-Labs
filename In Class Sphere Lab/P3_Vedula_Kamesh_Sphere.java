import gpdraw.*;
import java.awt.Color;
/**
 * Name: Kamesh Vedula
 * Time: 1hr 20min
 * Description:This lab was actually really fun. I liked how we had to take multiple steps
 * before actually writing down any code. The brainstorm was good to get different ideas
 * on how to draw the sphere, but I did not have to have 100% correct code. The next part,
 * where I had to write the pseudo-code and some real methods and functions that I wanted
 * to use took a little more time since I had to think about how to implement the idea I
 * had to draw the sphere into real code. After writing down a couple methods and noting
 * variables that I needed, I was able to continue on to coding up the program on my 
 * computer. As I started to code it, I realized I got most of the program correct. All I
 * had to do was fix some of the logic, such as making all the r g and b values go to
 * 255,255,255 and the stopping. As well as getting the shine point at the correct spot. 
 * Overall, this lab was challenging but enjoyable and it was a fun experience. 
 */

/** To run this program the DRIVER needs to call a couple functions
 * 
 * Makes a sphere and gives it a certain radius
 * P3_Vedula_Kamesh_Sphere sphere = new P3_Vedula_Kamesh_Sphere(50);
 * 
 * //Initializes the color of the sphere
 * sphere.initColors(75,8,198);
 * 
 * //Makes the background black
 * sphere.initBG();
 * 
 * //Positions the pen wherever the user wants the sphere on the screen
 * sphere.initPosition(0,0);
 * 
 * //Draws the sphere
 * sphere.draw();
 */
public class P3_Vedula_Kamesh_Sphere
{
   
    /* Initialize variables here */
    
    //The rgb values
    private int redColor;
    private int greenColor; 
    private int blueColor;
    
    //Radius of circle
    private int myRadius;
    
    private int myX;
    private int myY;
    
    private DrawingTool pen;
    private SketchPad pad;

    /* Methods */
    
    //Make the window where the sphere will show and take in the radius value
    public P3_Vedula_Kamesh_Sphere(int radius){
  
        pad = new SketchPad(600, 600);
        pen = new DrawingTool(pad);
        
        setDiameter(radius);
        
    }
    
    
    //Make the background black
    public void initBG(){
        pen.fillRect(600,600);
    }
    
    
    //Initialize the color to draw the Sphere
    public void initColors(int r, int g, int b){
        setRedColor(r);
        setGreenColor(g);
        setBlueColor(b);
    }
    
    
    //Move the pen to where the Sphere needs to be drawn
    public void initPosition(int x, int y){
        setPos(x, y);
        
        pen.up();
        pen.move(myX, myY);
        pen.down();
    }
    
    
    //Draw the Sphere
    public void draw(){
        pen.setColor(new Color(redColor, greenColor, blueColor));
   
        pen.setDirection(45);
        
        //For loop to make the multiple circles to form the sphere
        for(int i = 0 ; i < 400; i++){
            pen.fillCircle(myRadius);
            changeColor();
            changeRadius();
        }
    }
    
    
    /*Change the r,g,b values and increment them until they all get to (255, 255, 255)
     * which is white.
    */
    public void changeColor(){
        pen.up();
        if(redColor < 255){
            redColor++;
        }
        
        if(greenColor < 255){
            greenColor++;
        }
        
        if(blueColor < 255){
            blueColor++;
        }
        
        pen.setColor(new Color(redColor, greenColor, blueColor));
        pen.down();
    }
    
   
    //Constantly decrement the radius of the circle so that smaller circles are drawn
    public void changeRadius(){
        pen.up();
        myRadius -= 1;
        pen.move(0.7);
        pen.down();
    }
    
    
    /* Setter Methods */
    
    //Set the Colors 
    public void setRedColor(int r){
        redColor = r;
    }
    
    public void setGreenColor(int g){
        greenColor = g;
    }
    
    public void setBlueColor(int b){
        blueColor = b;
    }
    
    //Set the x and y position
    public void setPos(int x, int y){
        myX = x;
        myY = y;
    }
    
    //Set the diameter
    public void setDiameter(int radius){
         myRadius = radius * 2;
    }
    

}
