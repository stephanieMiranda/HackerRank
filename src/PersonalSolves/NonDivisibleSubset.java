package PersonalSolves;

/**
 * Created by Stephanie on 10/25/18.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NonDivisibleSubset {

   // Complete the nonDivisibleSubset function below.
   static int nonDivisibleSubset(int k, int[] S) {
      int result = 0;


      return result;
   }

   //private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) throws IOException {
      //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
      File file = new File("./resources/non-divisible-subset-testcases/input/input00.txt");
      Scanner scanner = new Scanner(file);

      String[] nk = scanner.nextLine().split(" ");

      int n = Integer.parseInt(nk[0]);

      int k = Integer.parseInt(nk[1]);

      int[] S = new int[n];

      String[] SItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
         int SItem = Integer.parseInt(SItems[i]);
         S[i] = SItem;
      }

      int result = nonDivisibleSubset(k, S);

      /*
      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedWriter.close();
      */

      scanner.close();
   }
}

