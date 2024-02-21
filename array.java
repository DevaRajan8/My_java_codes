// Source code is decompiled from a .class file using FernFlower decompiler.
public class array {
   public array() {
   }

   public static void main(String[] args) {
      int[] a = new int[]{50, 500, 123, 450, 1};
      int a1 = a.length;

      int i;
      for(i = 0; i < a1; ++i) {
         for(int j = i + 1; j < a1; ++j) {
            if (a[i] > a[j]) {
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
         }
      }

      for(i = 0; i < a1; ++i) {
         System.out.println(a[i]);
      }

   }
}
