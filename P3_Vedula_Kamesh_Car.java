/*
 * Kamesh Vedula P.3
 * Time: 20min
 * Description: This lab was a bit confusing to get started, but after that
 * it was easy to complete. 
 */
public class P3_Vedula_Kamesh_Car{
    public int myStartMiles;
    public int myEndMiles;
    public double myGallonsUsed;
    
    P3_Vedula_Kamesh_Car(int odometerReading){
        myStartMiles = odometerReading;
    }
    
    
    //Simple method that returns the value thats wanted, in this case, the starting miles.
    int getStartMiles(){
        return myStartMiles;
    }
    
    
    //Fills the car as much as the driver specifies.
    void fillUp(int odometerReading, double gallons){
        myEndMiles += odometerReading;
        myGallonsUsed += gallons;
    }
    
    
    //Used to calculate the MPG at a given time
    double calculateMPG(){
        int difference = myEndMiles - myStartMiles;
        double gallons = myGallonsUsed;
        return difference / gallons;
    }
    
    //Reset all the values to 0
    void resetMPG(){
        myGallonsUsed = 0;
        myStartMiles = 0;
        myEndMiles = 0;
    }
}