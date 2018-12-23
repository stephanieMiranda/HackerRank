package InterviewPrep;

/**
 * Created by Stephanie on 12/21/18.
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
      int ans = 0;//This is the total number of toys that can be purchased.
      int len = prices.length;
      int max = 1 << prices.length;
      int totalPrices = 0;
      int counter = 0;
      int tempCount = 0;
      //int powerSetLen = Math.pow(prices.length, 2);
      //int powerSetArr = new int[powerSetLen];
      //List<List<Integer>> powerSetList = new ArrayList<>();
      int[][] powerSet = new int[max][];

      /*This nested for loop set uses bitCount method to get the powerSet of the prices array.*/
      for(int i = 0; i < max; ++i){
         powerSet[i] = new int[Integer.bitCount(i)];
         for(int j = 0, b = i, c = 0, m = 0; j < len; ++j, b >>= 1, m++){
            if((b & 1) != 0){
               powerSet[i][c++] = prices[j];
               if(totalPrices < k || totalPrices == k){
                  totalPrices = totalPrices + prices[m];
                  //System.out.println("This is totalPrices: " + totalPrices);
                  //counter++;//This is the number of sets in the powerSet.
               }

            }
         }
      }
      System.out.println(Arrays.deepToString(powerSet));// + "\nThis is the size of powerSet: " + powerSet.length);
      //System.out.println("This is totalPrices: " + totalPrices + "\nThis is counter: " + counter);

      //System.out.println(Arrays.toString(powerSet[3]));

      for(int i = 0; i < powerSet.length; i++){
         int sum = 0;
         int tempCounter = 0;
         for(int j = 0; j < powerSet[i].length; j++){
            sum = sum + powerSet[i][j];
            tempCounter++;
            //DONE: Find a way to keep track of the counter, making sure the highest count gets returned.
            if(sum <= k && tempCounter >= counter){
               counter = tempCounter;
            }
            System.out.println("This is sum: " + sum);
         }

      }

      System.out.println("This is counter: " + counter);


      System.out.println("These are prices: " + Arrays.toString(prices).replaceAll(",", "").replace("[", "").replace("]", ""));
      System.out.println("This is how much Mark has to spend: " + k);
      return ans;
   }

   /*private static final Scanner scanner = new Scanner(System.in);*/

   public static void main(String[] args) throws IOException {
      /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));*/
      File file = new File("./resources/interview-prep/mark-and-toys-testcases/input/input17.txt");
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

