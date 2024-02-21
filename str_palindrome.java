// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class str_palindrome {
   public str_palindrome() {
   }

   public static void main(String[] args) {
      int count = 0;
      System.out.println(Enter the String :");
      Scanner deva = new Scanner(System.in);
      String input = deva.next();
      char[] a = input.toCharArray();
      int d = a.length;

      for(int i = 0; i < d / 2; ++i) {
         if (a[i] != a[d - i - 1]) {
            count = 0;
            break;
         }

         ++count;
      }

      if (count == 0) {
         System.out.println("Not a Palindrome");
      } else {
         System.out.println("Palindrome");
      }

   }
}
