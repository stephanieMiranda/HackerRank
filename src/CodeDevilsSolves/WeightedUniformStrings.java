package CodeDevilsSolves;
/**
 * Takes in a s, a string, and n, the number of queries.
 * For each lowercase letter from a-z, each has a weight.
 * (a = 1, b = 2, ... z = 26). A uniform string is one in
 * which it has a single character repeated 0 or more times.
 * @author Stephanie Miranda
 *
 */

import java.util.*;


public class WeightedUniformStrings {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashSet<Integer> subStrings = weight(scan.next());
		int n = scan.nextInt();

		System.out.println("HERE'S SUBSTRINGS: " + subStrings);
		
		for(int i = 0; i < n; i++){
			System.out.println(subStrings.contains(scan.nextInt()) ? "YES" : "NO");
		}
		
		scan.close();
	}
	
	
	/**
	 * A method to check the weights of each substring.
	 * @param sub, the ArrayList of subStrings.
	 */
	private static HashSet<Integer> weight(String s){
		
		System.out.println("HERE'S S: " + s);
		return null;
		
	}

}
