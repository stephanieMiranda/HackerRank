package InterviewPrep;

/**
 * Created by Stephanie on 12/19/18.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort {
   /**Creating a global arrayList to use for the new sorted array.**/
   // Complete the countSwaps function below.
   static void countSwaps(int[] a) {
      int size = a.length;
      int counter = 0;
      int[] sortedArr = new int[size];
      int[] temp = a;

      //System.out.println("This is size: " + size);

      /*This is checking the elements of the passes array, and
      if the comparision returns true, it implements the swap method.*/
      for(int i = 0; i < size; i++){
         System.out.println("This is a[i]: " + String.valueOf(a[i]));
         for (int j = 0; j < size-1; j++){
            System.out.println("This is a[j]: " + String.valueOf(a[j]));
            System.out.println("This is a[j+1]: " + String.valueOf(a[j+1]));
            if(a[j] > a[j+1]){
               int[] swapped = swap(a[j], a[j+1]);
               temp[j] = swapped[j];
               temp[j+1] = swapped[j+1];
               System.out.println("This is temp: " + Arrays.toString(temp));
               counter++;
               sortedArr = temp;
            }
         }
      }
      System.out.println("This is counter: " + counter);
      System.out.println("This is sortedArr: " + Arrays.toString(sortedArr));

   }

   static int[] swap(int a, int b){
      List<Integer> newList = new ArrayList<>();
      newList.add(b);
      newList.add(a);
      int[] newArr = new int[newList.size()];
      System.out.println("This is newList: " + newList);

      for(int i = 0; i <= newList.size() - 1; i++){
         newArr[i] = newList.get(i);
      }
      //System.out.println("This is newArr: " + Arrays.toString(newArr));
      return newArr;
   }

   /*private static final Scanner scanner = new Scanner(System.in);*/

   public static void main(String[] args) throws IOException{

      File file = new File("./resources/interview-prep/ctci-bubble-sort-testcases/input/input01.txt");
      Scanner scanner = new Scanner(file);

      int n = scanner.nextInt();
      //System.out.println("This is n: " + n);
      /*scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/

      int[] a = new int[n];

      /*
      From list creation to first for loop that follows, this replaces HackerRanks'
      input reader.
       */
      List<Integer> aList = new ArrayList<>();

      while(scanner.hasNext()){
         int m = scanner.nextInt();
         aList.add(m);
      }

      int[] aItems = new int[aList.size()];

      for(int i=0; i <= aList.size()-1; i++){
         aItems[i] = aList.get(i);
      }
      /*String[] aItems = scanner.nextLine().split(" ");*/
      /*scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/
      //Checking input.
      System.out.println("This is aItems: " + Arrays.toString(aItems));

      for (int i = 0; i < n; i++) {
         int aItem = aItems[i];//Integer.parseInt(aItems[i]);
         a[i] = aItem;
      }

      countSwaps(a);

   }
}
