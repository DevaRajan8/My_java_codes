// Source code is decompiled from a .class file using FernFlower decompiler.
public class lower_triangle {
   public lower_triangle() {
   }

   public static void main(String[] args) {
      int[][] a = new int[][]{{1, 0, 0}, {2, 3, 0}, {6, 0, 0}};
      int count = 0;

      for(int i = 0; i < 3; ++i) {
         for(int j = 0; j < 3; ++j) {
            if (a[i][j] != 0 && i < j) {
               ++count;
            }
         }
      }

      if (count == 0) {
         System.out.println("Lower triangle !");
      } else {
         System.out.println("Not Lower triangle !");
      }

   }
}
