
public class MPGDriver
{
    public static void main(String[] args){
       int odometerReading = 15;
        
       P3_Vedula_Kamesh_Car auto = new P3_Vedula_Kamesh_Car(odometerReading);
       
       System.out.println("New car odometer reading: " + auto.getStartMiles());
        auto.fillUp(150,8);
        System.out.println("Miles per gallon: " + auto.calculateMPG());
        System.out.println("Miles per gallon: " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(350, 10);
        auto.fillUp(450, 20);
        System.out.println("Miles per gallon: " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(603, 25.5);
        System.out.println("Miles per gallon: " + auto.calculateMPG());


    }
}
