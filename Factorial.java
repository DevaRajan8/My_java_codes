// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Factorial {
   public Factorial() {
   }

   public static void main(String[] args) {
      int fact = 1;
      System.out.println("Enter the number :");
      Scanner deva = new Scanner(System.in);
      int a = deva.nextInt();

      for(int i = 1; i <= a; ++i) {
         fact *= i;
      }

      System.out.println("Factorial of " + a + " is " + fact);
   }
}
