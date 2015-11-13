import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Kamesh Vedula
 * Time Taken: 4 hours 10 min
 * This lab took a lot of time as it was difficult for me to understand since I have never had much 
 * experience with the File Writer and we did not learn it in class. After being able to learn about it
 * better in class today, I was able to do this lab. I was not able to turn in the lab on time yesterday
 * since my wifi was not allowing me to since it was incredibly slow and I was unfinished with the lab
 * as it was not working at all. After spending another hour on it today I was able to succesfully complete
 * it and it works 100% after being able to see how to make it work in class today.
 */
public class P3_Vedula_Kamesh_Squeeze {

    public static void main(String[] args) throws IOException{

        Scanner in;
        FileWriter output = null;

        try {
            in = new Scanner(new File("LeetSpeak.java"));
            output = new FileWriter("P3_Vedula_Kamesh_Squeeze_Output.txt");
            int numTabs = 0;

            while(in.hasNextLine()){
                String currentLine = in.nextLine();
                int i = 0;
                
                while(i < currentLine.length()){
                    if(currentLine.charAt(i) == '\t'){
                        numTabs++;
                        i++;
                        
                    } else {
                        break;
                    }
                }
                
                output.write(numTabs + " ");
                output.write(currentLine.substring(numTabs));
                
                if(in.hasNextLine()){
                    output.write("\n");
                }
                
                numTabs = 0;
                i = 0;

            }
        } 
        catch (IOException e){
            throw new IOException(e.getMessage());            
        }

        output.close();
    }

}
