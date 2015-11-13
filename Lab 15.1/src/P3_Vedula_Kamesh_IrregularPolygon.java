
import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool

/**
 * 
 * @author Kamesh Vedula
 * @version 1.2.5 -- Time: 50:00 minutes
 * This lab took some time but it was mainly just implementing the formulas properly. The array practice was good and the
 * refresher of the drawing tool was also good. There was just a lot of repetition in the code and the formula provided on 
 * the lab website was all I really had to follow for the area part and it was common sense for the permimeter part. After finding the 
 * that I could use .distance to do a lot of the math it became easy too. Overall the lab was good. I commented out the main method I 
 * used to test the lab since the lab did not show any indication of telling me to keep it there. 
 */
public class P3_Vedula_Kamesh_IrregularPolygon{

	private DrawingTool pen = new DrawingTool(new SketchPad(200, 200));

	private ArrayList <Point2D.Double> myPolygon;

/*
	public static void main(String[] args){

		P3_Vedula_Kamesh_IrregularPolygon p = new P3_Vedula_Kamesh_IrregularPolygon();

		p.add(new Point2D.Double(20, 10));
		p.add(new Point2D.Double(70, 20));
		p.add(new Point2D.Double(50, 50));
		p.add(new Point2D.Double(0, 40));

		System.out.println(p.area());
		System.out.printf("%.1f", p.perimeter());
		p.draw();

	}
*/

	// constructors
	public P3_Vedula_Kamesh_IrregularPolygon() {
		myPolygon = new ArrayList<Point2D.Double>();

	}

	// public methods
	public void add(Point2D.Double aPoint) { 
		myPolygon.add(aPoint);

	}

	public void draw() { 
		if ( myPolygon.size() < 3 )
			return;

		pen.up();

		pen.move( myPolygon.get(0).getX(), myPolygon.get(0).getY() );

		pen.down();

		for (int i = 0; i < myPolygon.size() - 1; i++){
			pen.move( myPolygon.get(i + 1).getX(), myPolygon.get(i + 1).getY() );

		}

		pen.move( myPolygon.get(0).getX(), myPolygon.get(0).getY() );

	}



	public double perimeter() { 
		double perimeter = 0;

		if (myPolygon.size() < 3)
			return perimeter;

		for (int i = 0; i < myPolygon.size() - 1; i++){
			perimeter += myPolygon.get(i).distance( myPolygon.get(i + 1) );

		}

		perimeter += myPolygon.get(myPolygon.size() - 1).distance( myPolygon.get(0) );

		return perimeter;

	}

	public double area() { 

		double area = 0;

		if (myPolygon.size() < 3)
			return area;

		for (int i = 0; i < myPolygon.size() - 1; i++){
			area += myPolygon.get(i).x * myPolygon.get(i + 1).y;
			area -= myPolygon.get(i).y * myPolygon.get(i + 1).x;

		}

		area += myPolygon.get(myPolygon.size() - 1).x * myPolygon.get(0).y;
		area -= myPolygon.get(myPolygon.size() - 1).y * myPolygon.get(0).x;

		area = Math.abs(area / 2);

		return area;
		
	}
}

