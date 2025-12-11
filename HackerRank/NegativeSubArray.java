
/*

    Print the number of subarrays of  having negative sums.

    Sample Input   : 1 -2 4 -5 1    Sample Output   :   9
    Explanation There are nine negative subarrays of :  1 -2 4 -5 1 
    
    -2
    -5

    1, -2 
    4, -5
    -5, 1

    -2, 4, -5

    1, -2, 4, -5
    -2, 4, -5, 1

    1, -2, 4, -5, 1

*/

import java.util.*;
public class NegativeSubArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // set the length of elements ex : 5
        int n = input.nextInt();
        int arr[] = new int[n];
        // iterate and get each elements
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        input.close();

        int count = 0;

        // Check all subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;
            // starts from 5 length and dec by -- 1;
            for (int end = start; end < n; end++) {
                sum += arr[end];

                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
