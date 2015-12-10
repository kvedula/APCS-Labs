import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class P3_Vedula_Kamesh_Compact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compact
{
	public static void main(String[] args){

		Scanner in = null;

		int[] arr = null;
		ArrayList<Integer> list = new ArrayList<Integer>();

		try{
			in = new Scanner(new File("compact.txt"));

		}
		catch (FileNotFoundException e){
			System.out.println(e);

		}


		while(in.hasNextInt()){    
			list.add(in.nextInt());
		}

		arr = new int[list.size()];

		for(int i = 0; i < list.size(); i++){
			arr[i] = list.get(i);
		}

		System.out.println("ArrayList: ");
		System.out.println(list);
		compactList(list);
		System.out.println(list);

		System.out.println();
		System.out.println("Array: ");

		System.out.println(Arrays.toString(arr));
		compact(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void compactList(ArrayList<Integer> list) {
		Iterator<Integer> it = list.iterator();

		while(it.hasNext()){
			int num = it.next();

			if(num == 0){
				it.remove();

			}
		}
	}

	private static void compact(int[] arr) {

		int numZeros = 0;

		for (int i = 0; i < arr.length; i++){
		    
			if (arr[i] != 0){
				arr[numZeros++] = arr[i];
				
			}
		}

		while (numZeros < arr.length){
			arr[numZeros++] = 0;
			
		}
	}
}






