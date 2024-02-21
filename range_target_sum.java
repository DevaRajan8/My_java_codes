// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class range_target_sum {
   public range_target_sum() {
   }

   public static void main(String[] args) {
      int sum = 0;
      int k = 0;
      Scanner deva = new Scanner(System.in);
      System.out.println("Enter the lower range :");
      int lower = deva.nextInt();
      System.out.println("Enter the upper range :");
      int upper = deva.nextInt();
      System.out.println("Enter the Target element :");
      int target = deva.nextInt();
      int[] a = new int[upper];

      int i;
      for(i = lower; i <= upper; ++i) {
         for(int j = i; j != 0; j /= 10) {
            int r = j % 10;
            sum += r;
         }

         if (sum == target) {
            a[k] = i;
            ++k;
         }

         sum = 0;
      }

      for(i = 0; i < k; ++i) {
         System.out.print(a[i] + " ");
      }

   }
}
