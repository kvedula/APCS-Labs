import gpdraw.*;
/**
 * Write a description of class RunRectangleKVedula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RunRectangleKVedula
{
    //
    public static void main (String[] args){
        
        SketchPad paper = new SketchPad(500,500);
        
        Rectangle rectA = new Rectangle(-150, -150, 300, 300, paper); 
        rectA.draw();
        System.out.println("Rectangle 1 Perimeter: " + rectA.calcPerimeter());
        System.out.println("Rectangle 1 Area: " + rectA.calcArea());
        
        Rectangle rectB = new Rectangle(-50, -150, 100, 300, paper); 
        rectB.draw();
        System.out.println("Rectangle 2 Perimeter: " + rectB.calcPerimeter());
        System.out.println("Rectangle 2 Area: " + rectB.calcArea());
        
        Rectangle rectC = new Rectangle(-150, -50, 300, 100, paper); 
        rectC.draw();
        System.out.println("Rectangle 3 Perimeter: " + rectC.calcPerimeter());
        System.out.println("Rectangle 3 Area: " + rectC.calcArea());
        
        
    }
}
