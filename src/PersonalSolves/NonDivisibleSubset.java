package PersonalSolves;

/**
 * Created by Stephanie on 10/25/18.
 */
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NonDivisibleSubset implements Cloneable{

   // Complete the nonDivisibleSubset function below.
   static int nonDivisibleSubset(int k, int[] S) {
      int result = 0;
      int sum = 0;
      int index = 1;
      int item = 0;
      ArrayList<Integer> list = new ArrayList<>();
      List<List<Integer>> subList = new ArrayList<>();
      List<Integer> subSet = new ArrayList<>();


      for(int a : S) {
         list.add(a);
      }

      int bitLength = list.size();

      for(int i = 0; i < (1<<bitLength); i++){
         for(int j = 0; j < bitLength; j++){
            if((i && (1<<j) > 0)){
               System.out.println(S[j]);
            }
         }
      }



      /*
      for(int i = 0; i <= S.length - 1; i++){
         item = S[i];
         List<Integer> tempSubSet = new ArrayList<>();
         //List<Integer> tempList = (ArrayList<Integer>)list.clone();
         //System.out.println("This is subSet: " + subSet.toString());// + "\nThis is S: " + Arrays.toString(S));
         //tempSubSet.add(item);
         for(int j = i+1; j <= S.length -1; j++){
            int tempItem = S[j];
            //subSet.add(tempItem);
            //sum = (tempSubSet.get(i) + tempSubSet.get(j));
            System.out.println("This is item: " + item + "\nThis is tempItem: " + tempItem);
            sum = (item + tempItem);
            System.out.println("This is sum: " + sum);
            if(sum % k != 0){
                if(!(subSet.contains(item)) && !(subSet.contains(tempItem))) {
                   subSet.add(item);
                   subSet.add(tempItem);
                   System.out.println("This is subSet in loops(item): " + subSet);
                }
            }
            /*
            if(sum % k != 0  && !subSet.contains(tempItem)){
               subSet.add(tempItem);
               System.out.println("This is subSet in loops(tempItem): " + subSet);
            }
         }
         //subSet = tempSubSet;
         //System.out.println("This is subSet: " + subSet);
         //System.out.println("This is subList: " + subList);
      }
      //use this to compare the subSets for recursion.
      //subList.add(subSet);
      //System.out.println("This is subList: " + subList);

      /*
      int[] subSets = new int[subSet.size()];
      for(int i = 0; i <= list.size()-1; i++){
         subSets[i] = subSet.get(i);
      }


      //Use recursion.
      //nonDivisibleSubset(k, subSets);


      subSets(list, list.size());

      Set<Integer> powerset = new HashSet<Integer>();
      for(int i = 0; i<= S.length -1 ; i++){
         for(int j = 1; j <= S.length-1; j++){
            int[][] subSets = new int[list.size()][];
         }
         //subSets(list, list.size());
      }
      */
      System.out.println("This is the array: " + Arrays.toString(S));
      System.out.println("This is subSet.size(): " + subSet.size());
      System.out.println("This is k: " + k);
      //System.out.println("This is the resultList: " + list.toString());
      //System.out.println("This is resultList.size(): " + list.size());
      result = subSet.size();
      return result;
   }

   /**
    *This method will return the Powerset of the list of integers provided.
    * It will return a list of the subSets, so we can then examine those for
    * sums. It utilizes bit manipulaton to get all the subsets.
    */
   private static List<List<Integer>> subSets(List<Integer> aList, int listLength){
      Set<Set<Integer>> subSets = new HashSet<>();
      List<List<Integer>> newSubSetsList = new ArrayList<>();
      int numSets = 1 << listLength;
      Set<Integer> aSet = new HashSet<Integer>();

      for(int i = 0; i < numSets; i++){
         //This is the bit mask.
         int mask = 1;

         for(int j = 0; j < listLength; j++){
            if((mask & i) != 0){
               aSet.add(aList.get(j));
            }
            //moving the bit mask.
            mask = mask << 1;
         }
         subSets.add(aSet);
      }
      System.out.println("This is subSets in the method: " + subSets);
      //newSubSetsList.addAll(subSets);
      return newSubSetsList;
   }


   //private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) throws IOException {
      //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
      File file = new File("./resources/non-divisible-subset-testcases/input/input16.txt");
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

