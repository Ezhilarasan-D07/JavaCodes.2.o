
/*

    Given a string s consisting of lowercase English Letters. 
    return the first non-repeating character in s. 
    If there is no non-repeating character, return '$'.

    Input: s = "geeksforgeeks"  Output: 'f'
    Explanation: In the given string, 'f' is the first character in the string which does not repeat.

    Input: s = "racecar"    Output: 'e'
    Explanation: In the given string, 'e' is the only character in the string which does not repeat.


    Input: s = "aabbccc"    Output: '$'
    Explanation: All the characters in the given string are repeating.

*/

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingChar {

    static char findNonRepeatingCharacter (String str) {
        // map to find the counts of chars.
        HashMap <Character, Integer> strIntMap = new HashMap <> ();
        char charArr [] = str.toCharArray();
        // "geeksforgeeks" -> { 'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' }
        for (char ch: charArr) 
            strIntMap.put(ch, strIntMap.getOrDefault(ch, 0) + 1);
        // iterating again to get first non-repeating element in an order.    
        for (char ch: charArr)
        // only f, o, r where exist with count of 1, returns f.
            if (strIntMap.get(ch) == 1)     return ch;
        // returning $ if no non-repeating character exist.
        return '$';
    }

    public static void main (String ... args)   {
        Scanner input = new Scanner (System.in);
        System.out.print("enter the string :\t");
        String str = input.next();
        input.close();
        System.out.println(findNonRepeatingCharacter(str));
    }
}
