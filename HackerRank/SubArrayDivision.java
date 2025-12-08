

/*

    Sample Input  -> arr = 1 2 1 3 2, date = 3, month = 2 ; ---> output : 2;
    explaination : index o, 1 has sum of 3 is = date 3. 
    so count every sub array gives the result 3. -> 2.

*/

import java.util.*;

public class SubArrayDivision {

public static int birthday(List<Integer> arr, int date, int month) {

    int sum = 0, count = 0;

    // Step 1: Build first window
    for (int i = 0; i < month; i++) {
        sum += arr.get(i);
    }
    if (sum == date) count++;

    // Step 2: Slide the window
    for (int i = month; i < arr.size(); i++) {

        sum += arr.get(i) - arr.get(i - month);

        if (sum == date)
            count++;
    }

    return count;
}


    public static void main (String ... varChar) {
        System.out.println(birthday( Arrays.asList(1, 2, 1, 3, 2 ), 3, 2));
        System.out.println(birthday( Arrays.asList(2, 2, 1, 3, 2 ), 4, 2));
        System.out.println(birthday( Arrays.asList(4, 5, 4, 5, 1, 2, 1, 4, 3, 2, 4, 4, 3, 5, 2, 2, 5, 4, 3, 2, 3, 5, 2, 1, 5, 2, 3, 1, 2, 3, 3, 1, 2, 5), 18, 6));
        System.out.println(birthday( Arrays.asList(4), 4, 1));
    }
}
