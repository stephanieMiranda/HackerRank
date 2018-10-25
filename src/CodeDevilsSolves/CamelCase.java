package CodeDevilsSolves;

/**
 * The goal of this is to count the number of words
 * from an input string, that is entered in 
 * camel case style (first word starts lower case
 * each following word is upper case, with no spaces 
 * between words.
 * 
 * EASY
 */

import java.util.Scanner;

public class CamelCase{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int upCount = 0; 
        int totalWords = 0;
        
        //char[] letters = new char[s.length()];
        
        //for(char camelHump: letters){
        	//Character.isUpperCase(camelHump);
        	//upCount++;
        //}
        for(int i = 0; i < s.length(); i++){
            char camelHump = s.charAt(i);
            if(Character.isUpperCase(camelHump))
            	upCount++;
            //System.out.println(camelHump + " " + upCount);
        }
        totalWords = upCount + 1;
        System.out.print(totalWords);
        in.close();
    }
}