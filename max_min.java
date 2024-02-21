// Source code is decompiled from a .class file using FernFlower decompiler.
public class max_min {
   public max_min() {
   }

   public static void main(String[] args) {
      int[] a = new int[]{9, 8, 12, 88, 4, 23, 78, 55};
      int d = a.length;
      int max = a[0];
      int min = a[1];

      for(int i = 0; i < d; ++i) {
         if (a[i] > max) {
            max = a[i];
         }

         if (min > a[i]) {
            min = a[i];
         }
      }

      System.out.println("Maximum element is :" + max);
      System.out.println("Minimum element is :" + min);
   }
}
