/**Ryan Cavanaugh
  * 9 / 21 / 2018
  * Aaah.java
 */

import java.util.Scanner;

public class Aaah {
   
   public static void main(String[] args) { 
      
      String a, b;
      int a1, b1;
      
      Scanner keyboard = new Scanner(System.in);
      
      a = keyboard.next();
      b = keyboard.next();
      
      a1 = a.length();
      b1 = b.length();
      
      if (a1 < b1) {
       
         System.out.println("No");
         
      }
      
      else{
       
         System.out.println("Go");
         
      }
      
   }
   
}
