import gpdraw.*;
/**
 * Write a description of class P3_Vedula_Kamesh_Rectangle here.
 * 
 * @author Kamesh 
 * @date 08/31/15
 * @time 0hr 40min
 * @description This lab took me a bit longer than usual because it took me a while
 * to figure out how to get it to function properly and how to get the driver to 
 * do what I wanted it to do. As well it took me sometime to make it so that a rectangle 
 * no given parameters would work since I didnt have two separate methods. Once I 
 * understood what to do and got the concept down the rest became really easy. But for the
 * first 20 min I had to think of what to do. 
 */
public class P3_Vedula_Kamesh_Rectangle
{
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private static DrawingTool pen;
    private static SketchPad paper;
    
    //
    public P3_Vedula_Kamesh_Rectangle() 
	{
		paper = new SketchPad(500,500);
		pen = new DrawingTool(paper);
	}
    
	//aassigns the attributes given to the class into the variables initialized above
    public P3_Vedula_Kamesh_Rectangle(double x, double y, double width, double height)
    {
       myX = x;
       myY = y;
       myWidth = width;
       myHeight = height;
        
       paper = new SketchPad(500,500);
       pen = new DrawingTool(paper);
    }
    
    //Draws the rectangle at the place that is specified
    public void draw(){
       
       pen.up();
       pen.move(myX + myWidth/2, myY + myHeight/2);
       pen.down();
       pen.drawRect(myWidth, myHeight);
        
    }
    
    //returns the perimeter of the rectangle drawn
    public double getPerimeter(){
        return (myWidth * 2) + (myHeight * 2);
    }
    
    //returns the area of the rectangle drawn
    public double getArea(){
        return myWidth * myHeight;
    }
    
}
