// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class insurance {
   public insurance() {
   }

   protected static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("enter the status");
      char driver = in.next().charAt(0);
      if (driver == 'm') {
         System.out.println("insurance will be provided");
      }

   }
}
