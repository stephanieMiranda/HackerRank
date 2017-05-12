package sp17chlng3;

/**
 * A Beautiful Binary string is considered
 * Beautiful if it does NOT contain the 
 * substring "010". Print out the minimum
 * number of changes to make a string beautiful.
 * @author Stephanie Miranda
 *
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinary {
	public static int minChanges = 0;
	public static ArrayList<String> temp =  new ArrayList<>();
	public static int stringLen = 0;
	public static String str = " ";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the binary string in consideration: ");
		stringLen = scan.nextInt();
		System.out.println("Enter in a binary string: ");
		str = scan.next();
		int result = BeautifulBinary.analyzeString(str);
		System.out.println(result);
		scan.close();
	}
	

	
	/**
	 * A method that analyzes the binaryString for the pattern
	 * "010", and decipher's the minimum number of changes needed
	 * to convert it to a beautiful binary string.
	 * 
	 * 0100101010
	 */
	public static int analyzeString(String string){
		Pattern uglyString = Pattern.compile("010"); //uses regex to set the pattern looking for.
		Matcher matching = uglyString.matcher(string); // the string being checked for "ugliness"
		//boolean matches = matching.find();
		//System.out.println(matches);
		while(matching.find()){
			minChanges++;
		}
		//binaryString.add(string);
		//System.out.println("HERE'S BINARY STRING: " + binaryString);
		//System.out.println("HERE'S MIN CHANGES: " + minChanges);
		return minChanges;
	}
	

}
