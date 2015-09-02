//Kamesh Vedula Aug 20, 2015, Period 3
//Time it took: 2hrs 10min
//This program was pretty simple given the task to draw a house. I was
//able to use my creativity and think of something cool to make.
//I felt like a night scenery would look nice so I went with that.
//Hop you like it!

import gpdraw.*;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;

public class DrawHouse{
   SketchPad paper;
   DrawingTool pen; 
    
   public DrawHouse(){
       paper = new SketchPad(1000,600);
       pen = new DrawingTool(paper);
   }
   
   public static void main(String[] args){
       DrawHouse house = new DrawHouse();
       
       //Make the Scene
       house.initBG();
       house.drawStar();
       house.drawTree();
       house.drawMoon();
       house.drawHouse();
       house.drawLake();  
   }
   
   
   Random rn = new Random();
   
   int minX = -480;
   int maxX = -100;
   
   void initBG(){
       pen.fillRect(1000, 600);
   }
   
   void drawStar(){
       pen.setColor(new Color(255,255,255));
       pen.up();
       pen.move(-100,100);
       pen.down();
       pen.setDirection(0);
       pen.turnRight(36);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       
       pen.up();
       pen.move(250,220);
       pen.down();
       pen.setDirection(0);
       pen.turnRight(36);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       
       
       pen.up();
       pen.move(-260,180);
       pen.down();
       pen.setDirection(0);
       pen.turnRight(36);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       
       
       pen.up();
       pen.move(-430,140);
       pen.down();
       pen.setDirection(0);
       pen.turnRight(36);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       
       
       pen.up();
       pen.move(80,235);
       pen.down();
       pen.setDirection(0);
       pen.turnRight(36);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       pen.turnRight(144);
       pen.forward(20);
       
   }
   
   void drawTree(){
       
       for(int i = 0 ; i < 19 ; i++){
           
           pen.up();
           //pen.setDirection(90);
           pen.move(randIntX(minX, maxX), -100);
           pen.down();
           pen.setDirection(90);
           pen.setColor(new Color(74,65,58));
           pen.forward(100);
           pen.setColor(new Color(112,174,110));
           pen.drawRect(30,30);
        
       }
       
   }
   
   void drawMoon(){
       pen.up();
       pen.move(355, 175);
       pen.down();
       pen.setColor(new Color(255,255,255));
       pen.fillCircle(80);
       
       pen.up();
       pen.move(385, 190);
       pen.down();
       pen.setColor(new Color(0,0,0));
       pen.fillCircle(78);
       
    
   }
   
   int distance = -1;
   void drawHouse(){
       //House Body
       pen.up();
       pen.move(75, -25);
       pen.setDirection(0);
       pen.setColor(new Color(100,88,83));
       pen.down();
       pen.fillRect(250,150);
       
       //House Roof
       pen.setColor(new Color(255,255,255));
       pen.up();
       pen.move(-50, 50);
       pen.setDirection(0);
       pen.down();
       
       //Draw the first half of the roof
       for(int i = 0 ; i < 127 ; i++){
           pen.setDirection(90);
           pen.setColor(new Color(56,61,59));
           pen.forward(1 + i);
           pen.turnRight(180);
           pen.setColor(new Color(255,255,255));
           pen.move(-50 + i, 50);
       }
       
       pen.setDirection(0);
       pen.forward(125);
       
       //Draw the second half of the roof
       for(int i = 0 ; i < 127 ; i++){
           pen.setDirection(90);
           pen.setColor(new Color(56,61,59));
           pen.forward(1 + i);
           pen.turnRight(180);
           pen.setColor(new Color(255,255,255));
           pen.move(200 - i, 50);
       }
       
       //Make the door
       pen.setColor(new Color(189, 195, 199));
       pen.up();
       pen.move(75, -60);
       pen.down();
       
       pen.setDirection(0);
       pen.turnRight(180);
       pen.fillRect(40,80);
       
       //Make the doornob
       pen.setColor(new Color(0, 0, 0));
       pen.up();
       pen.move(87, -60);
       pen.down();
       
       pen.fillCircle(3);
       
       pen.setColor(new Color(240,201,135));
       //Make the left window
       pen.up();
       pen.move(10, 10);
       pen.down();
       
       pen.setDirection(0);
       pen.turnRight(180);
       pen.fillRect(40,40);
       
       //Make the right window
       pen.up();
       pen.move(140, 10);
       pen.down();
       
       pen.setDirection(0);
       pen.turnRight(180);
       pen.fillRect(40,40);
   }
   
   
   void drawLake(){
       pen.up();
       pen.move(0, -200);
       pen.down();
       pen.setColor(new Color(68,108,179));
       pen.fillRect(1000, 180);
       
       //Draw a fish
       pen.up();
       pen.move(0, -250);
       pen.down();
       pen.setColor(new Color(255,255,255));
       pen.drawOval(50,30);
       pen.up();
       pen.move(-25,-250);
       pen.down();
       pen.turnRight(30);
       pen.forward(20);
       pen.turnLeft(120);
       pen.forward(20);
       pen.turnLeft(120);
       pen.forward(20); 
       
       
       pen.up();
       pen.move(225, -200);
       pen.down();
       pen.setColor(new Color(255,255,255));
       pen.drawOval(50,30);
       pen.up();
       pen.move(200 ,-200);
       pen.down();
       pen.turnRight(30);
       pen.forward(20);
       pen.turnLeft(120);
       pen.forward(20);
       pen.turnLeft(120);
       pen.forward(20); 
       
       
       pen.up();
       pen.move(-350, -180);
       pen.down();
       pen.setColor(new Color(255,255,255));
       pen.drawOval(50,30);
       pen.up();
       pen.move(-375 ,-180);
       pen.down();
       pen.turnRight(30);
       pen.forward(20);
       pen.turnLeft(120);
       pen.forward(20);
       pen.turnLeft(120);
       pen.forward(20);
       
   }
   
   //Get the randomX position
   public static int randIntX(int min, int max) {
        Random randX = new Random();

        int randomNumX = randX.nextInt((max - min) + 1) + min;    
        return randomNumX;
    }
  
}







