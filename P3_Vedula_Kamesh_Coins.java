/*
 * @name Kamesh Vedula
 * @date 8/25/15 
 * @time Amt of Time: 5:00 minutes
 * @description This was a really simple program to complete. Had no difficulty in 
 * writing it. 
 */

public class P3_Vedula_Kamesh_Coins {

     private int c;
     
     int q = 0;
     int d = 0;
     int n = 0;
     int p = 0;

     public P3_Vedula_Kamesh_Coins(int cents) {     
          System.out.println(cents + " cents => ");

          q = cents / 25;
          cents -= (q * 25);
          
          d = cents / 10;
          cents -= (d * 10);
          
          n = cents / 5;
          cents -= (n * 5);
          
          c = cents / 1;
          
          System.out.println("Quarters: " + q);
          System.out.println("Dimes: " + d);
          System.out.println("Nickels: " + n);
          System.out.println("Cents: " + c);
          System.out.println("-------------");
     }  
}









