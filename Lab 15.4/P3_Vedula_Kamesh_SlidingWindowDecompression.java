import java.util.ArrayList;
import java.io.*;
/**
 * This lab was much easier than the first part. Compression was insanely hard. This was so much better. 
 * The only reason I turned this lab in late was because I turned in compression late and I forgot to 
 * do this lab over the weekend since the test was there and I compeltely forgot that I still need to do 
 * this lab. But once I started I realized the pseudocode that Jeremy and I worked on together was exactly
 * how I had to code this. We literally wrote out the code in pseudo code format with like some of the
 * declerations missing but the rest was there. I looked at the paper that we wrote the pseudo code on 
 * while coding this up and once finished, the only errors were to convert the bytes and characters properly
 * or import the arraylist class. Overall, this was a fun lab once I relaized I was able to successfuly 
 * complete it.
 * 
 * @author Kamesh Vedula 
 * @version 1 hours 30 min
 */
public class P3_Vedula_Kamesh_SlidingWindowDecompression
{

    
    public static void main(String[] args){

        int WINDOW = 30;
        
        ArrayList<Object> list = new ArrayList<Object>();

        fileToCharArray(list);

        ArrayList<Object> decompressed = new ArrayList<Object>();
        
        decompress(list, decompressed, WINDOW);

        
        try {

            FileWriter output = new FileWriter("P3_Vedula_Kamesh_SlidingWindow_Output_Decompression.txt");
            
            for(int i = 0; i < decompressed.size(); i++){
                output.write((char)decompressed.get(i));
            }
            
            output.close();

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        int original = list.size();
        int dc = decompressed.size();
        
        System.out.println("DONE");
        System.out.println("Original Size: " + original + " bytes --- Decompressed Size: " + dc + " bytes");
        System.out.println("Increased by this much: " + (dc - original) + " bytes");
    }
    
    
    public static void decompress(ArrayList<Object> list, ArrayList<Object> decompressed, int WINDOW){
       
        for(int i = 0; i < WINDOW; i++){
            decompressed.add(list.get(i));
        }
        
        for(int i = WINDOW; i < list.size(); i++){
            
            if((byte)(char)list.get(i) == 7){
                
                //reads the number whihc identifies the position
                int pos = (int)((byte)(char)(list.get(i + 1)));
                //reads the number which identifies the length of the string that was compressed
                int len = (int)((byte)(char)(list.get(i + 2))); 
                //reads the index posotion in the window that the compression was started
                int start = decompressed.size() - (WINDOW - pos);
                
                for(int x = start; x < start + len; x++){
                    decompressed.add(decompressed.get(x));
                }
                i += 2;
            } else {
                decompressed.add(list.get(i));
            }
            
        }
        
    }
    
    
    public static void fileToCharArray(ArrayList<Object> arr){
        try{

            FileReader inFile = new FileReader("input.txt");

            while(inFile.ready()) {
                byte c = (byte)inFile.read();
                arr.add((char)c);
            }

        } 
        catch(IOException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
