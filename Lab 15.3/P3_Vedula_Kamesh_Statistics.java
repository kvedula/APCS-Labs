import java.util.Scanner;
import java.io.*;

/**
 * @author Kamesh Vedula
 * @version 5.2.3 Time: 2hr 10min
 * @version This lab took a long time mainly because of the strategies that needed to be thought of for 
 * finding the different things. The mode was the hardest of all of them. It was the most difficult to
 * think of how to go about getting. The others were told how to do in the lab and the average was really
 * easy to find as we already did that before. After a lot of time spent thinking about a strategy for
 * each thing, I was able to get the end result to work. A lot of the time was spent thinking and not coding and 
 * working stuff out on paper.
 */
public class P3_Vedula_Kamesh_Statistics
{
    private int[] statsArray = new int[1000];
    private final static int MAX_VALUE = 100;
    private int numInts;
    
    public static void main(String[] args){
        P3_Vedula_Kamesh_Statistics f = new P3_Vedula_Kamesh_Statistics("numbers.txt");
 
        System.out.printf("Average: %.2f \n", f.average());
        System.out.printf("Standard Deviation: %.2f \n", f.findStdDev());
 
        int[] mode = f.findMode();
        System.out.print("Mode(s): ");
        for ( int m : mode )
        {
            System.out.print(m + " ");
        }
    }
    
    
    public P3_Vedula_Kamesh_Statistics(String fileName){
        numInts = 0;
        openFile(fileName);
        
    }
 

    public void openFile(String fileName){
        int index = 0;
        Scanner inFile;
 
        try
        {
            if (new File(fileName).isFile()){
                inFile = new Scanner(new File( fileName ));
                
            } else {
                inFile = new Scanner(fileName);
                
            }
 
            while (inFile.hasNext()){
                statsArray[index] = inFile.nextInt();
                index++;
                
            }
            
        }
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
        
        numInts = index;
        
    }
 
    
    public double average(){
        double sum = 0;
        for (int i = 0; i < statsArray.length; i++){
            sum += statsArray[i];
            
        }
 
        //System.out.println(sum);
        return sum/numInts;
        
    }
 
    public double findStdDev(){
        double average = average();
        double stdDevSum = 0.0;
        for ( int i = 0; i < numInts; i++ ){
            stdDevSum += Math.pow((statsArray[i] - average), 2);
            
        }
        double standardDeviation = stdDevSum/(numInts - 1);
        
        standardDeviation = Math.sqrt(standardDeviation);
        
        return standardDeviation;
        
    }
 
    public int[] findMode(){
        int[] smallList = new int[MAX_VALUE + 1];
        int[] modes = new int[2];
        for ( int i = 0; i <= numInts - 1; i++ ){
            smallList[statsArray[i]] += 1;
            
        }
        int lastMax = findMax(smallList);
        int x = 0;
        
        for (int j = 0; j <= smallList.length - 1; j++){
            if (lastMax == smallList[j]){
                modes[x] = j;
                x++;
                
            }
            
        }
        
        return modes;
 
    }
    
    public int findMax(int[] numbers){
        int max = numbers[0];
        for ( int i = 0; i <= numbers.length - 1; i++ ){
            if ( numbers[i] > max ){           
                max = numbers[i];
                
            }
            
        }
 
        return max;
        
    }
    
}