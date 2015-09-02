
/**
 * Write a description of class RectangleDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectangleDriver
{
    
    public static void main(String[] args){
        P3_Vedula_Kamesh_Rectangle rectA = new P3_Vedula_Kamesh_Rectangle();
		System.out.println("Rectngle A\'s perimeter: " + rectA.getPerimeter());
		System.out.println("Rectangle A\'s area: " + rectA.getArea());
		
		P3_Vedula_Kamesh_Rectangle rectB = new P3_Vedula_Kamesh_Rectangle(0, -80, 400, 160);
		System.out.println("Rectangle B\'s perimeter: " + rectB.getPerimeter());
		System.out.println("Rectangle B\'s area: " + rectB.getArea());
		rectB.draw();
		
		P3_Vedula_Kamesh_Rectangle rectC = new P3_Vedula_Kamesh_Rectangle(100, -100, 20, 300);
		System.out.println("Rectangle C\'s perimeter: " + rectC.getPerimeter());
		System.out.println("Rectangle C\'s area: " + rectC.getArea());
		rectC.draw();
    }
    
}
