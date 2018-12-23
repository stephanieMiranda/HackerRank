package PersonalSolves;

/**
 * Created by Stephanie on 10/17/18.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {



   //private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) throws IOException{
      //String[] nd = scanner.nextLine().split(" ");
      File file = new File("./array-left-rotation-testcases/input/input00.txt");
      Scanner scanner = new Scanner(file);

      //int n = Integer.parseInt(nd[0]);

      //int d = Integer.parseInt(nd[1]);
      int n = scanner.nextInt();

      int[] a = new int[n];

      String[] aItems = scanner.nextLine().split(" ");
      //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
         int aItem = Integer.parseInt(aItems[i]);
         a[i] = aItem;
      }

      //scanner.close();
   }
}
