package PersonalSolves; /**
 * Created by Stephanie on 10/11/18.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArrayDS {
   public static ArrayList sumList = new ArrayList();
   // Complete the hourglassSum function below.
   static int hourglassSum(int[][] arr) {
      int [][] tempArray = new int[3][3];
      ArrayList list = new ArrayList();
      int sum = 0;
      int tempNum = 0;
      int item = 0;

      for(int i = 0; i < arr.length -1; i++){
         for(int j = 0; j < arr[j].length -1; j++) {
            //System.out.println(arr[z][y]);
            //item = arr[i][j];

            //tempNum = item;
            //sum = sum + tempNum;
            //sumList.add(sum);
            //sum = 0;
         }
      }

      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            //tempArray[i][j] = item;
            System.out.println("This is item: " + item);
            item = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                    arr[i + 1][j + 1] +
                    arr[i + 2][j] + arr[i+2][j + 1] + arr[i+2][j + 2];
            tempNum = item;
            sum = sum + tempNum;
            sumList.add(sum);
            sum = 0;
            //list.add(item);
            //System.out.println(Arrays.toString(tempArray));
            //if (tempArray[i][j] != tempArray[1][0]){
            //}
         }
      }

      System.out.println("This is sumList: " + sumList);
      //for(int[] row : tempArray){
      //   System.out.println(Arrays.toString(row));
      //}

      Collections.sort(sumList, Collections.reverseOrder());
      //return greatestSum;
      return (int)sumList.get(0);

   }



   public static void main(String[] args) throws IOException {
      File file1 = new File("./resources/2d-array-testcases/input/input01.txt");
      Scanner scanner = new Scanner(file1);
      //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int[][] arr = new int[6][6];

      for (int i = 0; i < 6; i++) {
         String[] arrRowItems = scanner.nextLine().split(" ");
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         for (int j = 0; j < 6; j++) {
            int arrItem = Integer.parseInt(arrRowItems[j]);
            arr[i][j] = arrItem;
         }
      }

      int result = hourglassSum(arr);

      //bufferedWriter.write(String.valueOf(result));
      //bufferedWriter.newLine();

      //bufferedWriter.close();
      System.out.println(String.valueOf(result));
      scanner.close();
   }
}