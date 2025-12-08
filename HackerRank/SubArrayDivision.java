

/*

    Sample Input  -> arr = 1 2 1 3 2, date = 3, month = 2 ; ---> output : 2;
    explaination : index o, 1 has sum of 3 is = date 3. 
    so count every sub array gives the result 3. -> 2.

*/

import java.util.*;

public class SubArrayDivision {

    public static int birthday (List <Integer> arr, int date, int month) {

        int sum = 0, count = 0;
        // sum the first month length elements and check it gives the sum of dates = month.
        for (int ind = 0; ind < month; ind ++) {
            sum += arr.get(ind);
            if (sum == date) {
                count ++;
            }
        }
        // traverse the array with fixed length of month and check the sum again. cont ++;
        for (int ind = 0; ind < arr.size() - month; ind ++) {
            sum += arr.get(month + ind) - arr.get(ind);
            if (sum == date)
                count ++;
        }   return count;

    }

    public static void main (String ... varChar) {
        System.out.println(birthday( Arrays.asList(1, 2, 1, 3, 2 ), 3, 2));
        System.out.println(birthday( Arrays.asList(2, 2, 1, 3, 2 ), 4, 2));
        System.out.println(birthday( Arrays.asList(1, 1, 1, 1, 1, 1 ), 3, 2));
        System.out.println(birthday( Arrays.asList(4), 4, 1));
    }
}
