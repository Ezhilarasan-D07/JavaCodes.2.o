
/*

Sample Input 0

    -> lftEndOfHouse = 7, rytEndOfHouse = 11
    -> appleTree = 5, orangeTree = 15
    -> apples { -2, 2, 1 }
    -> oranges { 5, -6 }
    
    -> Sample Output 1: apple, 1 orange

    Explanation 0

    The first apple falls at position .
    The second apple falls at position .
    The third apple falls at position .
    The first orange falls at position .
    The second orange falls at position .
    Only one fruit (the second apple) falls within the region between  and , so we print  as our first line of output.
    Only the second orange falls within the region between  and , so we print  as our second line of output.

    Solution : 
    -> add all [apples, oranges] separately with appleTree and count if it's fallen (in between the range of) given length - 7, 11.
*/

import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {

    static void countApplesAndOranges   (

        int lft, int ryt, 
        int lftTree, int rytTree, 
        List <Integer> apples , 
        List <Integer> oranges

        )   {
        
        int countOne = 0, countTwo = 0;

        for (int num: apples)    
        if ((lftTree + num) >= lft && (lftTree + num) <= ryt)   
        countOne ++;
        
        for (int num: oranges)   
        if ((rytTree + num) >= lft && (rytTree + num) <= ryt)   
        countTwo ++;
        
        System.out.println(countOne + ", " + countTwo);
        
    }

    public static void main (String ... varChar) {

        countApplesAndOranges (
            7, 11, 
            5, 15, 
            Arrays.asList(-2, 2, 1), 
            Arrays.asList(5, -6));

        countApplesAndOranges (
            7, 10, 
            4, 12, 
            Arrays.asList(2, -3, 4), 
            Arrays.asList(3, -2, -4));
    }
}
