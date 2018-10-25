package CodeDevilsSolves;
/**
 * The goal of this it to check an array, that must be odd in length,
 * for an integer that does not have a pair.
 * 
 * EASY
 */

import java.util.Arrays;
import java.util.Scanner;

public class LonelyInteger {
     private static int lonelyInteger(int[] a) {
    	int kemosabe = 0;
    	Arrays.sort(a);
    	
    	for(int i = 0; i < (a.length + 2); i+=2){
    		//put in some logic to check for pairs within the array length
    		if(a[i] == a[i+1]){
    			System.out.println("here's a0: " + a[i]);
    			System.out.println("here's a1: " + a[i+1]);
    		}else{
    			a[i] = kemosabe;
    		}
    	}
    	System.out.println("HERE'S KEMOSABE:" + kemosabe);
    	return kemosabe;
    }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int[] a = new int[n];
         
         for (int i = 0; i < n; i++) {
             a[i] = in.nextInt();
         }
         
         System.out.println(lonelyInteger(a));
         in.close();
     }
     
    /**
     * first try, fail:
     * 
     *  int min = 0;
    	 int max = a.length;
    	 int mid = (min + max) / 2;
    	 int kemosabe = 0;
    	 int[] temp = new int[max];
    	 
    	 for(int i = 0; i < a.length; i++){
    		 String target = Integer.toString(a[i]);
    		 if(Integer.toString(a[mid]).compareTo(target) == 0){
        		 temp[i] = a[i];
        	 }
    		 if(Integer.toString(a[mid]).compareTo(target) > 0){
    			 kemosabe = a[mid];
    		 }
    		 else{
    			 kemosabe = a[i];
    		 }
    	 }
        return kemosabe;
     */

}

