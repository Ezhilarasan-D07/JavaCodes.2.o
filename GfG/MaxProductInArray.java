
/*

    Given an array arr[] that contains positive and negative integers (may contain 0 as well). 
    Find the maximum product that we can get in a subarray of arr[].

    Note: It is guaranteed that the answer fits in a 32-bit integer.

    Examples

    Input: arr[] = [-2, 6, -3, -10, 0, 2]   Output: 180
    Explanation: The subarray with maximum product is [6, -3, -10] with product = 6 * (-3) * (-10) = 180.

    Input: arr[] = [-1, -3, -10, 0, 6]      Output: 30
    Explanation: The subarray with maximum product is [-3, -10] with product = (-3) * (-10) = 30.

    Input: arr[] = [2, 3, 4]                Output: 24 
    Explanation: For an array with all positive elements, the result is product of all elements. 

*/

public class MaxProductInArray {

    static int findMaxProduct (int ... arr) {

        int lftSum = 1, rytSum = 1, max = Integer.MIN_VALUE;
        int len = arr.length; 

        for (int ind = 0; ind < len; ind ++) {

            lftSum *= arr[ind];
            rytSum *= arr[len - ind - 1];

            max = Math.max(max, Math.max(lftSum, rytSum));

            if (lftSum == 0) lftSum = 1;
            if (rytSum == 0) rytSum = 1;

        }   return max;

    }

    public static void main (String ... varChar) {
        System.out.println(findMaxProduct( -2, 6, -3, -10, 0, 2 ));
        System.out.println(findMaxProduct( -1, -3, -10, 0, 6 ));
        System.out.println(findMaxProduct( 2, 3, 4 ));
    }
}
