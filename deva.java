// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class deva {
   public deva() {
   }

   public static void main(String[] args) {
      Scanner dev = new Scanner(System.in);
      System.out.println("enter a number(1) :");
      int a = dev.nextInt();
      if (a % 100 == 0) {
         if (a % 400 == 0) {
            System.out.println("" + a + " IS A LEAP YEAR");
         }
      } else if (a % 4 == 0) {
         System.out.println("" + a + " IS A LEAP YEAR");
      } else {
         System.out.println("" + a + "IS A NOT A LEAP YEAR");
      }

   }
}
