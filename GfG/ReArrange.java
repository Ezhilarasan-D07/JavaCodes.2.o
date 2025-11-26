/*
// Arrange array such that:
// even numbers → even indices
// odd numbers  → odd indices
*/

import java.util.Arrays;
public class ReArrange {
    static void reArrangeOddAndEven (int ... arr) {  
        int i = 0, j = 1; 
        while (i < arr.length && j < arr.length) {
            if (arr[i] % 2 == 0)   i += 2;    
            else if (arr[j] % 2 == 1)   j += 2;    
            arr[i] = arr[j] + arr[i] - (arr[j] = arr[i]);          
            i += 2;
            j += 2;    
        }
    }
    public static void main (String ... args) {
        int arr[] = { 9, 3, 8, 8 };
        reArrangeOddAndEven(arr);
        System.out.println(Arrays.toString(arr));
    }
}
