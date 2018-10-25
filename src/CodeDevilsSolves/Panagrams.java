package CodeDevilsSolves;


/**
 * A program that reads in a string and decipher's if
 * it is a panagram, that is a sentence that contains
 * every letter of the alpahbet.
 * Created by Stephanie on 4/12/17.
 *
 * NOT THE RIGHT ANSWER! GROWL, MISSED ABOUT HALF THE TESTS.
 */

import java.util.*;

public class Panagrams {

    public static String s = " ";
    public static boolean result = false;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to check: ");
        s = scan.nextLine();

        Panagrams.checkString(s);
    }

    /**
     * This method holds the logic for checking the
     * string.
     * @param string, the string being checked
     */
    public static void checkString(String string){
        HashSet<Character> thingie = new HashSet<>();

        for(char c : string.toCharArray()){
            if(Character.isLetter(c))
                thingie.add(c);
        }
        if(thingie.size() == 26){
            System.out.println("pangram");
        }
        else
            System.out.println("not pangram");
        System.out.println(thingie);
    }
}
