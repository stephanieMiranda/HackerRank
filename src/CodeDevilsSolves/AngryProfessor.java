package CodeDevilsSolves;


/**
 * This is inteneded to count the number of on time students.
 * If the # of students, n,  == k (the min num needed to not cancel)
 * print "YES", else print "NO"
 * @author Stephanie Miranda
 * @version 1.0
 * 
 * Test 1: 10
 *	10 4
 *	-93 -86 49 -62 -90 -63 40 72 11 67
 *
 */

import java.util.*;


public class AngryProfessor {
	
	static int k, n, t = 0;
	static int counter = 0;
	static int time, tests = 0;
	
	public static void main(String[] args){
		AngryProfessor AP = new AngryProfessor();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter number of cases: ");
		t = scan.nextInt();
		
		for(int h = 0; h < t; h++){
			System.out.println("ENTER N AND K: " );
			Scanner student = new Scanner(System.in);
			n = student.nextInt();
			k = student.nextInt();
			AP.times(n);
		}	
	}
	
	
	/**
	 * This method takes in the number of student items,
	 * and tracks their time of arrival, and returns the 
	 * String "YES" or "NO" if the class is to be cancelled
	 * or not.
	 * @param items, the number of student itmes
	 * @return String result if class is cancelled or not.
	 */
	public String times(int items){
		String result = " ";
		
		Scanner arrival = new Scanner(System.in);
		System.out.println("ENTER THE STUDENT'S TIME: ");
		
		for(int i = 1; i <= items; i++){
			time = arrival.nextInt();
			
			if(time <= 0){
				counter++;
				System.out.println("HERE'S COUNTER: " + counter);
			}
		}
		
		if(counter >= k){
			result = "NO";
			System.out.println(result);
			counter = 0;
		}else{
			result = "YES";
			System.out.println(result);
			counter = 0;
		}
		return result;
	}
}
