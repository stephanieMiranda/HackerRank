package InterviewPrep;

/**
 * Created by Stephanie on 12/21/18.
 * The initial solution I had used bit manipulation to keep track of everything, but it
 * was not optimal, therefore, I changed my solutions to utilize Java's Collections
 * to make a more optimal solution. (Big O went from ~O(n^2) to O(n),
 * but binary search is O(log n).
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarkAndToys {

   // Complete the maximumToys function below.
   static int maximumToys(int[] prices, int k) {

      System.out.println("These are prices: " + Arrays.toString(prices).replaceAll(",", "").replace("[", "").replace("]", ""));
      System.out.println("This is how much Mark has to spend: " + k);

      int ans = 0;//This is the total number of toys that can be purchased.
      int totalPrices = 0;
      int counter = 0;
      List<Integer> list = new ArrayList<>();

      System.out.println("This is counter: " + counter);

      /*Make use of Java's Collections Framework to sort, and search, then find the right combo with remaining data.*/
      for(int i : prices){
         list.add(i);
      }

      /*Sort the list, then use binarySearch find the index of any prices > k.*/
      Collections.sort(list);
      System.out.println("This is sortedList: " + list);
      int pricey = 0;
      counter = 0;
      int indexOfPricey = Collections.binarySearch(list, k);
      if(pricey > indexOfPricey){
         System.out.println("This is indexOfPricey: " + indexOfPricey);
         //Make a new shorter list with the remaining prices in list.*/
         list.subList(Math.abs(indexOfPricey)-1, list.size()).clear();
         System.out.println("This is the list with removed items: " + list);
      }//else {
         System.out.println("This is list again: " + list);
         //find all the combos that are <= k.
         int val = 0;
         for(int a: list){
            if((val + a) <= k){
               val = val + a;
               counter++;
               System.out.println("This is val: " + val);
            }
         }

      //}
      ans = counter;
      return ans;
   }

   /*private static final Scanner scanner = new Scanner(System.in);*/

   public static void main(String[] args) throws IOException {
      /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));*/
      File file = new File("./resources/interview-prep/mark-and-toys-testcases/input/input00" +
              ".txt");
      Scanner scanner = new Scanner(file);

      String[] nk = scanner.nextLine().split(" ");

      int n = Integer.parseInt(nk[0]);

      int k = Integer.parseInt(nk[1]);

      int[] prices = new int[n];

      String[] pricesItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
         int pricesItem = Integer.parseInt(pricesItems[i]);
         prices[i] = pricesItem;
      }

      int result = maximumToys(prices, k);
      System.out.println(result);
/*
      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedWriter.close();
*/
      scanner.close();
   }
}

