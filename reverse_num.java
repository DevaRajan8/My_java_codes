// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class reverse_num {
   public reverse_num() {
   }

   public static void main(String[] args) {
      System.out.println("Enter the number :");
      Scanner deva = new Scanner(System.in);

      for(int n = deva.nextInt(); n != 0; n /= 10) {
         int r = n % 10;
         System.out.print(r);
      }

   }
}
