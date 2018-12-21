package InterviewPrep;

/**
 * Created by Stephanie on 12/20/18.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

   // Complete the makeAnagram function below.
   static int makeAnagram(String a, String b) {
      int ans = 0;
      //List<Character> newString = new ArrayList();
      //System.out.println("This is string a: " + a + "\nThis is sting b: " + b);
      //String longerString = findLongerString(a, b);
      //String shorterString;
      //String newStr = "";
      //int deletions = 0;

      int[] allLetters = new int[26];
      for(char chrtr : a.toCharArray()){
         allLetters[chrtr-'a']++;
      }
      for(char chrtr : b.toCharArray()){
         allLetters[chrtr-'a']--;
      }
      for(int i : allLetters){
         ans += Math.abs(i);
      }

      /*Compare lengths to be able to shorten the number of comparisons, because our answer will
      at the very least be as long as the shorter string.

      if(a == longerString){
         shorterString = b;
      }else {
         shorterString = a;
      }

      System.out.println("This is longerString: " + longerString + "\nThis is shorterSting: " + shorterString);

      //makeAnagram(newString.toString(), shorterString);

      //Pattern pattern = Pattern.compile(shorterString);
      //Matcher matcher = pattern.matcher(longerString);
      //boolean bool = matcher.matches();
      /*The above expression, and the one following this comment are equivalent.

      boolean testing = Pattern.matches(tempChar,testingChar);*/

      return ans;

   }

   /* A method to shorten string and recompare. */
    static String deleteChars(String aStr){
       int start = 1;
       String newStr = aStr.substring(start,aStr.length());
       System.out.println("This is newStr: " + newStr);
       return newStr;
   }

   /*A method that determines which of the strings may be longer.*/
   static String findLongerString(String a, String b) {
      String thisOne;
      if(a.length() > b.length()){
         thisOne = a;
      }else{
         thisOne = b;
      }

      return thisOne;
   }

   /*private static final Scanner scanner = new Scanner(System.in);*/

   public static void main(String[] args) throws IOException {
      /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));*/
      File file = new File("./resources/interview-prep/ctci-making-anagrams-testcases/input/input01.txt");
      Scanner scanner = new Scanner(file);

      String a = scanner.nextLine();

      String b = scanner.nextLine();

      int res = makeAnagram(a, b);

      System.out.println(res);

      /*
      bufferedWriter.write(String.valueOf(res));
      bufferedWriter.newLine();

      bufferedWriter.close();

      scanner.close();
      */
   }
}
