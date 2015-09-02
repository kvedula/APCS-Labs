import gpdraw.*;
import java.awt.Color;
/**
 * Write a description of class Benzene here.
 * 
 * @author Kamesh Vedula
 * @date 08/21/2015
 * @description This lab took 1 hour to finish. I made a for loop for all 
 * three parts of this lab. The only reason this lab took time was the math
 * that was involved in picking the right angles and numbers. Other than that
 * this lab was really simple to do. 
 */
public class Benzene
{
    SketchPad pad;
    DrawingTool p;
    
    
//     int sum1 = 10+5;
//     double sum2 = 10+5.0;
//     int quotient1 = 15/4;
//     double quotient2 = 15/4;
//     double quotient3 = 15/4.0;
//     int remainder1 = 15 % 4;
//     double remainder2 = 17.84 % 2.3;
    
    
    /**
     * Constructor for objects of class Benzene
     */
    public Benzene()
    {
       pad = new SketchPad(600,600);
       p = new DrawingTool(pad);
    }
    //Make Colors for each of the components of the benzene molecule
    Color carbon = new Color(0x446CB3);
    Color hydrogen = new Color(0xF4B350);
    Color bond = new Color(0x6C7A89);
    public static void main(String[] args){
        Benzene atom = new Benzene();
        
        
        
        //atom.drawP();
        //Make the molecule
        atom.drawCarbon();
        atom.drawHydrogen();
        //atom.doMath();
    }
    
    void drawP(){
        p.setDirection(270);
        p.forward(50);
    }
    
    void drawCarbon(){
        p.up();
        p.move(70, 150);
        p.down();
        p.setWidth(9);
        p.setColor(carbon);
        p.setDirection(0);
        //For Loop to create the carbon atoms
        for(int i = 0; i < 6; i++){
            p.fillCircle(40);
            p.turnRight(60);
            p.move(150);
        }
        p.setWidth(2);
        p.setColor(Color.white);
        p.setDirection(0);
        //For Loop to create the double bonds
        for(int i = 0; i < 3; i++){
            p.fillCircle(5);
            p.turnRight(60);
            p.move(150);
            p.fillCircle(5);
            p.up();
            p.turnRight(60);
            p.move(150);
            p.down();
        }
    } 
    void drawHydrogen(){
        p.setWidth(6);
        p.up();
        p.move(70, 150);
        p.down();
        p.setWidth(6);
        p.setDirection(0);
        //for loop to create the hydrogen bonds
        for(int i = 0; i < 6; i++){
            p.up();
            p.turnLeft(45);
            p.forward(42);
            p.down();
            p.setColor(bond);
            p.forward(50);
            p.setColor(hydrogen);
            p.fillCircle(25);
            p.turnRight(180);
            p.up();
            p.forward(92);
            p.turnLeft(135);
            p.down();
            p.up();
            p.turnRight(60);
            p.move(150);
            p.down();
        }
    }
    
//     void doMath(){
//         System.out.println("10 + 5 is " + sum1);
//         System.out.println("10 + 5.0 is " + sum2);
//         System.out.println("15/4 is " + quotient1);
//         System.out.println("15/4 is " + quotient2);
//         System.out.println("15/4.0 is " + quotient3);
//         System.out.println("15 % 4 is " + remainder1);
//         System.out.println("17.84 % 2.3 is " + remainder2);
//     
//     }
}
