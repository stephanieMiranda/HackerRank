package InterviewPrep;

/**
 * Created by Stephanie on 12/23/18.
 * Some base code provided by HackerRank.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNote {

   // Complete the checkMagazine function below.
   /*Now that we've ensured there are enough words in magazine to possibly create the ransom note,
   let's begin by putting the Strings of each array into a HashMap, then we'll compare ____.
    */
   static void checkMagazine(String[] magazine, String[] note) {
      Hashtable newTable = new Hashtable();
      int key = 1;
      int counter = 0;
      /*int longer;
      if(magazine.length > note.length){
         longer = magazine.length;
      }else{
         longer = note.length;
      }*/
      System.out.println("This is magazine: " + Arrays.toString(magazine).replaceAll(",", "").replace("[", "").replace("]", "")
              + "\nThis is note: " + Arrays.toString(note).replaceAll(",", "").replace("[", "").replace("]", ""));
      //System.out.println("This is hashCode: " + Arrays.hashCode(magazine));
      //System.out.println("This is hashCode: " + Arrays.hashCode(note));
      for(String n : note){
         newTable.put(key++, n);
      }

      for(int i = 0; i < magazine.length - 1; i++){
         if(newTable.containsValue(magazine[i]) == true){
          System.out.println("This is magzine[i] value: " + magazine[i]);
          counter++;
         }
      }

      System.out.println("This is newTable: " + newTable.toString() +
              "\nThis in newTable.size(): " + newTable.size());

      if(counter == newTable.size()){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }


   }


   //private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) throws IOException{
      File file = new File("./resources/interview-prep/ctci-ransom-note-testcases/input/input00.txt");
      Scanner scanner = new Scanner(file);

      String[] mn = scanner.nextLine().split(" ");

      /*According to the problem prompt, m and n are the number of words in the
         magazine and note, respectively, thus we ought to make sure there are even
         enough words in the magazine to make the note, not even looking at the
         strings of words each contain.
       */
      int m = Integer.parseInt(mn[0]);

      int n = Integer.parseInt(mn[1]);

      String[] magazine = new String[m];

      String[] magazineItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < m; i++) {
         String magazineItem = magazineItems[i];
         magazine[i] = magazineItem;
      }

      String[] note = new String[n];

      String[] noteItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
         String noteItem = noteItems[i];
         note[i] = noteItem;
      }

      if(m >= n){
         checkMagazine(magazine, note);
      }else{
         System.out.println("No");
      }

      scanner.close();
   }
}

