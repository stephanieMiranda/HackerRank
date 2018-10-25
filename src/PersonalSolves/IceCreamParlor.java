package PersonalSolves;

/**
 * Created by Stephanie on 10/22/18.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class IceCreamParlor {

   // Complete the icecreamParlor function below.
   static int[] icecreamParlor(int m, int[] arr) {
         int[] result = new int[2];
         int tempM;
         //Put into a list to use List library's functionality.
         List<Integer> list = new ArrayList<>();
         for(int j: arr){
            list.add(j);
         }

         for(int i = 0; i <= arr.length - 1; i++){
            //this is the remainder we're looking for in the array.
            tempM = m - arr[i];
            //We'll use this to ensure that we're not looking at the same index, or same flavor.
            int index = list.indexOf(tempM);

            if(list.contains(tempM) && index == i){
               result[1] = (i);
               result[0] = (index-3);
            }else if(list.contains(tempM) && index != i){
               result[1] = (i + 1);
               result[0] = (list.indexOf(tempM) + 1);
            }
         }

         return result;

   }

   //private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) throws IOException {

      File file = new File("./resources/icecream-parlor-testcases/input/input00.txt");
      Scanner scanner = new Scanner(file);

      int t = scanner.nextInt();
      for(int tIterator = 0; tIterator < t; tIterator++){
         int m = scanner.nextInt();
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         int n = scanner.nextInt();
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         int[] arr = new int[n];
         String[] arrItems = scanner.nextLine().split("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])? ");

         for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
         }

         int[] result = icecreamParlor(m, arr);

         System.out.println(Arrays.toString(result));
      }

      /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int t = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int tItr = 0; tItr < t; tItr++) {
         int m = scanner.nextInt();
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         int n = scanner.nextInt();
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         int[] arr = new int[n];

         String[] arrItems = scanner.nextLine().split(" ");
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
         }

         int[] result = icecreamParlor(m, arr);

         for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
               bufferedWriter.write(" ");
            }
         }

         bufferedWriter.newLine();
      }

      bufferedWriter.close();
      */

      scanner.close();
   }
}
