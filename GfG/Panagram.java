
/*

    Given a string s, check if it is a "Panagram" or not. 
    Return true if the string is a Panagram, else return false.
    A "Panagram" is a sentence containing every letter in the 
    English Alphabet either in lowercase or Uppercase.

*/

public class Panagram {

    static boolean isPanagramString (String str) {
        // boolean array sized 26 each values false by default.
        boolean seen [] = new boolean [26];
        str = str.toLowerCase();

        // "Bawds jog, flick quartz, vex nymph" -> 'B', 'a', 'w', 'd', 's' . . . . .
        char charArr [] = str.toCharArray();
        // iter through charArr to check the chars present between a - z.
        for (char ch: charArr)  
            if (ch >= 'a' && ch <= 'z') 
                // c - 'a' → converts letter to index
                // so if every chars present array becomes true, else false.
                seen [ch - 'a'] = true; 
                
        // iter through seen to check the false present in an array.
        for (boolean bool: seen) 
            // return false if one of the alphabet not found 
            if (!bool) return false;
        // else true.
        return true;
    }

    public static void main (String ... args) {
        String str = "Bawds jog, flick quartz, vex nymph";
        System.out.println(isPanagramString(str)); 
    }

}
