// Source code is decompiled from a .class file using FernFlower decompiler.
public class matrix_mul {
   public matrix_mul() {
   }

   public static void main(String[] args) {
      int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      int[][] b = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      int[][] c = new int[3][3];

      int i;
      int j;
      for(i = 0; i < 3; ++i) {
         for(j = 0; j < 3; ++j) {
            c[i][j] = 0;

            for(int k = 0; k < 3; ++k) {
               c[i][j] += a[i][k] * b[k][j];
            }
         }
      }

      for(i = 0; i < 3; ++i) {
         for(j = 0; j < 3; ++j) {
            System.out.print(c[i][j] + " ");
         }

         System.out.println(" ");
      }

   }
}
