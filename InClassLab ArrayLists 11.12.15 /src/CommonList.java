import java.util.ArrayList;

public class CommonList {

	
	public static void main(String[] args){
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		c.add(4);
		c.add(2);
		c.add(9);
		c.add(1);
		c.add(7);
		
		printList(c);
		
	}
	
	
	public static void printList(ArrayList<Integer> e){
		
		for(int i : e){
			
			System.out.print(i + " ");
			
		}
		
	}
	
}

