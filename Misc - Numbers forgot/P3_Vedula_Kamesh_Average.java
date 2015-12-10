import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Kamesh Vedula
 * @version 1.1.3 Time: 40 minutes
 * 
 * UPDATE: Turned this in a second time since I forgot the output.txt file and rounding. I fixed it
 * and have submitted this one.
 * 
 * --- Had to import a lot of things to do this lab ---
 * 
 * Description: The only part of this lab that took a long time was figuring out
 * how to read and scan a text file that is imported from outside. I found the syntax to do 
 * so and after that the lab was pretty straight forward. After that reading the file for numbers
 * and adding them together, all I did was iterate count every time the scanner read a number and 
 * added that number to the total sum. In the end I didvided the two and found the average.
 * 
 * I had to search up how to write to a file and make a new output file but after reading the 
 * documentation, I was able to do it fairly easily and round the decimal in it as well.
 */
public class P3_Vedula_Kamesh_Average {
    int count = 0; //used to count the number of numbers from the text file
    long sum = 0; //used long in case the sum became a very large number
    static double average = 0;

    static Scanner in;

    public static void main(String[] args) throws IOException{

        try {
            in = new Scanner (new File("numbers.txt")); 
        } 
        catch (IOException e){
            throw new IOException("The text file does not exist");
        }

        P3_Vedula_Kamesh_Average f = new P3_Vedula_Kamesh_Average();

        System.out.printf("Average: %.2f", f.runAverage()); 

    }


    public double runAverage(){

        while(in.hasNext()){
            sum += in.nextInt();
            count++;
            
        }

        average = (double) sum / (double) count;
        //System.out.println(sum);
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
            out.write(String.format("Average: %.2f",average));
            out.close();
        } catch (IOException e) {

        }
        
        return average;
    }
}
