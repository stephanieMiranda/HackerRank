package PersonalSolves;

/**
 * Created by Stephanie on 10/13/18.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicArray {

   // Complete the dynamicArray function below.
   static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
      List<Integer> aList = new ArrayList<>();
      List<Integer> bList = new ArrayList<>();
      List<Integer> seqList = new ArrayList<>();
      int lastAns = 0;
      System.out.println("This is queries: " + queries);
      int index = 0;
      for(int i = 0; i <= queries.size()-1; i++){
         List<Integer> temp = queries.get(index++);
         System.out.println("This is temp from for loop: " + temp);

         int queryType = temp.get(0);
         int x = temp.get(1);
         int y = temp.get(2);//At temp.get(2) keeps returning size of temp
         int lastAnswer = lastAns;

         //System.out.println("This is x: " + x + " This is y: " + y);
         //int tempAns = tempList.get(tempList.size() - 1);

         //Query 1
         if(queryType == 1){
            int thingie = ((x^lastAnswer)%n);
            //System.out.println("This is thingie in queries list: " + thingie);
            if(thingie > 0){
               aList.add(y);
               //System.out.println("This is aList: " + aList);
               //System.out.println("This is lastAns in Q1: " + lastAnswer);
            }
            else if(thingie == 0){
               bList.add(y);
               //System.out.println("This is bList: " + bList);
            }
         }
         //Query 2
         if(queryType == 2){
            //int tempLast = 0;
            //int tempLast = y%temp.size();
            if(!(seqList.isEmpty())){
               lastAnswer = seqList.get(seqList.size()-1);
            }
            int thingie = ((x^lastAnswer)%n);
            //System.out.println("This is thingie in queries list: " + thingie);
            //System.out.println("This is tempLast in beginning Q2: " + tempLast);
            //System.out.println("This is y in Q2:  " + y);
            //System.out.println("This is lastAns in beginning Q2: " + lastAnswer);
            //System.out.println("This is tempLast in beginning Q2: " + tempLast);
            //if((y^lastAnswer) % temp.size() == 1){
            if(thingie > 0){
               lastAnswer = aList.get(aList.size()-1);
               seqList.add(lastAnswer);
               //System.out.println("This is lastAns in Q2 % = 1: " + lastAnswer);
            }
            //if((y^lastAnswer) % temp.size() == 0){
            else if(thingie == 0){
               lastAnswer = bList.get(bList.size()-1);
               //int tempLast = y % temp.size();
               seqList.add(lastAnswer);
               //System.out.println("This is lastAns in Q2 % = 0: " + lastAnswer);
            }
         }
      }
      /*
      * Lamba that returns a sequential Stream with queries as it's source. Then we save that
      * to an actual list. Next we'll look at the final index, and XOR with lastAnswer then
      * % n. If it is = to 1, we'll append to appendList and return that.
      * */
      //queries.forEach((List<Integer> temp) -> {
         //System.out.println("This is temp: " + temp);
         //Assign all pertinent vars as described in problem statement.

      //});
      System.out.println("This is aList: " + aList);
      System.out.println("This is bList: " + bList);
      System.out.println("This is seqList: " + seqList);


      return seqList;
   }

   public static void main(String[] args) throws IOException {
      //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
      File file = new File("./resources/dynamic-array-testcases/input/input05.txt");
      Scanner scanner = new Scanner(file);
      //String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
      //String [] nq = scanner.useDelimiter("/s+$", "").split(" ");

      //int n = Integer.parseInt(nq[0]);

      //int q = Integer.parseInt(nq[1]);
      int n = scanner.nextInt();
      int q = scanner.nextInt();
      //These will keep track of the indices.
      int MIN = 0;
      int MAX = 0;
      int temp = 0;

      //The list of numbers from each query.
      List<Integer> nums = new ArrayList<>();
      List<List<Integer>> queries = new ArrayList<>();

      //for(int i = 0; i < (n-1); i++){
         while(scanner.hasNext()) {
            int thing = scanner.nextInt();
            nums.add(thing);
            //System.out.println("This is thing: " + thing);
         }
         //System.out.println("This is nums in main: " + nums);
         //System.out.println(nums.size());
         for(int j = 0; j < q; j++){
            while(MAX < nums.size()-1){
               MIN = MIN + temp;
               temp = 3;
               MAX = MIN + 3;
               queries.add(nums.subList(MIN, MAX));
            }
         }
      //}
      //Checking to make sure I've got the correct list, since this came from HackerRank.
      //System.out.println("This is queries in main: " + queries);

      /* HackerRank code.
      IntStream.range(0, q).forEach(i -> {
         try {
            queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
            );
         } catch (IOException ex) {
            throw new RuntimeException(ex);
         }
      });
      */

      List<Integer> result = dynamicArray(n, queries);
      System.out.println(result);
      scanner.close();
      /*
      bufferedWriter.write(
              result.stream()
                      .map(Object::toString)
                      .collect(joining("\n"))
                      + "\n"
      );

      bufferedReader.close();
      bufferedWriter.close();
      */
   }
}
