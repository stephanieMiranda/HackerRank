package InterviewPrep;

/**
 * Created by Stephanie on 12/23/18.
 * Some base code provided by the HackerRank solution setup.
 * @author Stephanie Miranda, HackerRank ctci.Array.LeftRotation.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {

   // Complete the rotLeft function below.
   static int[] rotLeft(int[] a, int d) {
      int[] ans = new int[a.length];
      System.out.println("This is array: " + Arrays.toString(a).replaceAll(",", "").replace("[", "").replaceAll("]", "") +
              "\nThis is d, the number of rotations we need to make: " + d);
      List<Integer> list = new ArrayList<>();
      for(int i : a){
         list.add(i);
      }

      Collections.rotate(list, -d);
      //System.out.println("This is rotated list: " + list.toString());

      for(int j = 0; j < list.size(); j++){
         ans[j] = list.get(j);
      }
      System.out.println("This is rotated array: " + Arrays.toString(ans).replaceAll(",", "").replace("[", "").replaceAll("]", ""));

      return ans;
   }

   //private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) throws IOException {
      //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
      File file = new File("./resources/interview-prep/ctci-array-left-rotation-testcases/input/input00.txt");
      Scanner scanner = new Scanner(file);
      String[] nd = scanner.nextLine().split(" ");

      int n = Integer.parseInt(nd[0]);

      int d = Integer.parseInt(nd[1]);

      int[] a = new int[n];

      String[] aItems = scanner.nextLine().split(" ");
      //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
         int aItem = Integer.parseInt(aItems[i]);
         a[i] = aItem;
      }

      int[] result = rotLeft(a, d);

      //for (int i = 0; i < result.length; i++) {
         //bufferedWriter.write(String.valueOf(result[i]));
         /*The following output probably needs to be formatted, no '[' ']' or ','. */
         System.out.println(Arrays.toString(result).replaceAll(",", "").replace("[", "").replace("]", ""));

         //if (i != result.length - 1) {
            //bufferedWriter.write(" ");
        // }
      //}

      //bufferedWriter.newLine();

      //bufferedWriter.close();

      scanner.close();
   }
}
