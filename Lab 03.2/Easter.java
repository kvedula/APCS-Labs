/*
 * @name Kamesh Vedula
 * @date 8/25/15 
 * @time Amt of Time: 15:00 minutes
 * @description The only time taking part of this lab was converting the English 
 * directions to Code. After that, I made a simple if-else statement to pick out the 
 * correct month and set it as a string. 
 */

public class Easter {
  
     private int y;

     public Easter(int year) {     
          y = year;
          calculate();
     }

     public void calculate() {
          int a = y % 19;
          System.out.println("a = " + a);
          int b = y / 100;
          System.out.println("b = " + b);
          int c = y % 100;
          System.out.println("c = " + c);
          int d = b / 4;
          System.out.println("d = " + d);
          int e = b % 4;
          System.out.println("e = " + e);
          int f =  (b + 8) / 25;
          System.out.println("f = " + f);
          int g = (b - f + 1) / 3;
          System.out.println("g = " + g);
          int h = (19 * a + b - d - g + 15) % 30;
          System.out.println("h = " + h);
          int i = c / 4;
          System.out.println("i = " + i);
          int k =  c % 4;
          System.out.println("k = " + k);
          int r = (32 + 2 * e + 2 * i - h - k) % 7;
          System.out.println("r = " + r);
          int m = (a + 11 * h + 22 * r) / 451;
          System.out.println("m = " + m);
          int n = (h + r - 7 * m + 114) / 31;
          System.out.println("n = " + n);
          int p = (h + r - 7 * m + 114) % 31;
          System.out.println("p = " + p);
          
          String month = "";
          int day = p + 1;
          
          if(n == 1){
              month = "January";
          } else if (n == 2){
              month = "February";
          } else if (n == 3){
              month = "March";
          } else if (n == 4){
              month = "April";
          } else if (n == 5){
              month = "May";
          } else if (n == 6){
              month = "June";
          } else if (n == 7){
              month = "July";
          } else if (n == 8){
              month = "August";
          } else if (n == 9){
              month = "September";
          } else if (n == 10){
              month = "October";
          } else if (n == 11){
              month = "November";
          } else if (n == 12){
              month = "December";
          }
          
          System.out.println("In " +  y + " Easter fell on " + month + " " + day + ".");
     }
     
}









