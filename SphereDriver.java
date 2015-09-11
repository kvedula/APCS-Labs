
/**
 * Write a description of class SphereDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SphereDriver
{
    
    public static void main (String [] args){
        
        P3_Vedula_Kamesh_Sphere sphere = new P3_Vedula_Kamesh_Sphere(100);
 
        sphere.initColors(63,124,172);
        sphere.initBG();
        sphere.initPosition(0,0);
        sphere.draw();
        
        //75,8,198 --> purple
        //63,124,172 --Uranus blue
        //58,81,206 --> Neptune
    }
}
