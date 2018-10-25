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
         //int index;

         //use List functionality on array.
         List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
         //for(item : list){
            System.out.println("This is m: " + m + "\nThis is list: " + list.toString());
         //}

         for(int i = 0; i <= arr.length - 1; i++){
            //System.out.println("This is arr[i]: " + arr[i]);
            tempM = m - arr[i];//this is the remainder we're looking for in the array.
            //int index = i;//We'll use this to ensure that we're not looking at the same index, or same flavor.
            System.out.print("This is list.indexOf(tempM): " + list.indexOf(tempM) + "\n");
            //System.out.println("This is index: " + index + "\n");

            //do{
               System.out.println("This is result[0]: " + result[0]);
               if(arr[i] + list.indexOf(tempM) == m){
                  result[0] = i;
                  result[1] = list.indexOf(tempM);
               }
               //put the index of "index" into result, and check the rest of the array for sum
            //}while(result[0] + result[1] != m);

            /*
            if(list.contains(tempM) && (list.indexOf(index) + list.indexOf(tempM) == m)){
               System.out.println("HERE WE ARE!");
               result[0] = list.indexOf(index);
               result[1] = list.indexOf(tempM);
            }
            */
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
