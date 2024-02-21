// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class eg {
   public eg() {
   }

   public static void main(String[] args) {
      System.out.println("Enter the char :");
      Scanner deva = new Scanner(System.in);
      char a = deva.nextLine().charAt(0);
      switch (a) {
         case 'A':
         case 'E':
         case 'I':
         case 'O':
         case 'U':
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
            System.out.println("Vowels");
            break;
         default:
            System.out.println("invalid");
      }

   }
}
