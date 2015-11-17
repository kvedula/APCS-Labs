import java.util.ArrayList;
import java.util.Random; 

/**
 * 
 * @author Kamesh Vedula
 * @version Time: 30:00 minutes
 * @version This lab was pretty short since once I read how to go through with solving the lab, 
 * all I had to do was code it up and it took some trys since there were some errors in the logic 
 * as I coded it. But after refining it, it worked. The only thing that took me the longest time was to get 
 * rid of the last comma and I realized how dumb I was to spend a whole 10 minutes trying to figure
 * that out after I realized I just had to use the substing from 0 to the strings length - 1. 
 *
 */
public class P3_Vedula_Kamesh_Permutations {

	int size = 10;
	Random rand = new Random();

	public static void main(String[] args){

		P3_Vedula_Kamesh_Permutations p = new P3_Vedula_Kamesh_Permutations();

		p.nextPermutation();

	}

	public void nextPermutation(){

		System.out.println("Random Permutation List Generator \n");
		
		//Print 10 different random permutations
		for(int i = 0; i < size; i++){

			String str = "";
			
			str += "List " + (i + 1) + ": [";

			for( Integer p : getPerm() ){
				
				if(i == 10){
					str += p + " ";
				} else {
					str += p + ", ";
				}

			}
			
			str = str.trim();
	
			str = str.substring(0, str.length() - 1);
			
			str += "]";
			
			System.out.println(str);

		}
	}


	public ArrayList<Integer> getPerm() {
		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < size; i++){
			temp.add(i + 1);
			
		}

		ArrayList<Integer> p = new ArrayList<>();

		for (int j = 0; j < size; j++){
			
			int index = rand.nextInt(temp.size());
			p.add(temp.get(index));
			temp.remove(index);
			
		}

		return p;
	}

}




