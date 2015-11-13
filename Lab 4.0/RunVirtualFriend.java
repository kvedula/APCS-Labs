/*
 * Driver to run the Virtual Friend class
 */

public class RunVirtualFriend {

	public static void main(String[] args) {
		
		//LIZZY
		P3_Vedula_Kamesh_VirtualFriend lizzy = new P3_Vedula_Kamesh_VirtualFriend("Lizzy", 17, "Lavender");
		
		System.out.println("Hello there. I\'m  " + lizzy.getName() + " and my favorite color is " + lizzy.getFavColor() + "!" );
		
		System.out.println("I am " + lizzy.getAge() + " years old. \n");
		
		//Elsa
		P3_Vedula_Kamesh_VirtualFriend elsa = new P3_Vedula_Kamesh_VirtualFriend("Elsa", 8, "White");
		
		System.out.println("Hi. I\'m  " + elsa.getName() + " and my favorite color is " + elsa.getFavColor() + "!" );
		
		System.out.println("I am " + elsa.getAge() + " years old. \n");
		
		//The girls introduce themselves
		lizzy.greet(elsa);
		elsa.greet(lizzy);
		
		System.out.println("");
		
		
		//Play Soccer
		lizzy.playSoccer();
		lizzy.playSoccer();
		lizzy.playSoccer();
		lizzy.printHungerLevel();
		
		//Feed
		lizzy.feed();
		lizzy.feed();
		lizzy.feed();
		
		System.out.println("");
		
		//Sleep
		elsa.sleep();
		elsa.sleep();
		elsa.sleep();
		elsa.printHungerLevel();
		elsa.feed();
		System.out.println("I love math!  Did you know 1024 + 2048 equals " + elsa.add(1024, 2048) + "\n" );
		
		
		//Other Methods
		
		//Run
		lizzy.goRun();
		elsa.dance();
		
	}
}