/* This is a comment.  You can write notes here.
 * And here...
 */

import gpdraw.*;

public class Smiley {
	
	public static void main(String[] args) {

		SketchPad paper;				// declare a SketchPad variable
		DrawingTool p;				// declare a DrawingTool variable
  
		paper = new SketchPad(200,200);	// create the SketchPad
		p = new DrawingTool(paper);// create the DrawingTool
		
		p.drawRect(60,60);
		p.up();
		p.move(0,5);
		p.down();
		
		p.turnRight(120);
		p.forward(6);
		p.turnRight(120);
		p.forward(6);
		p.turnRight(120);
		p.forward(6);
		
		p.up();
		p.move(-15,15);
		p.down();
		p.drawCircle(5);
		
		p.up();
		p.move(15,15);
		p.down();
		p.drawCircle(5);
		
		p.up();
		p.move(-15,-10);
		p.down();
		
		p.setDirection(270);
		p.forward(10);
		p.turnLeft(90);
		p.forward(30);
		p.turnLeft(90);
		p.forward(10);
		
	}	
}











