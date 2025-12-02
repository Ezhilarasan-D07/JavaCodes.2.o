import java.util.Arrays;
import java.util.Scanner;
// Given an array arr[]. Rotate the array to the left (counter-clockwise direction)
// by d steps, where d is a positive integer. Do the mentioned change in the array in place.
public class RotateArray {
    // reversing the elements until it meets middle element.
    static void reverse (int arr [], int lftEnd, int rytEnd) {

        // length and starting points passed as an argument. (rytEnd, lftEnd)
        while (lftEnd <= rytEnd) {

            // swapping using arithemetic calculation (a = b + a - (b = a))
            arr[lftEnd] = arr[rytEnd] + arr[lftEnd] - (arr[rytEnd] = arr[lftEnd]);
            lftEnd ++;
            rytEnd --;

        }
    }
    
    // Using reverse method we use 
    static void rotateArr (int arr [], int x) {

        // Avoiding eccess length.
        x = x % arr.length;
        // Reverse first d elements
        reverse (arr, 0, x - 1);
        // Reverse remaining n-d elements
        reverse (arr, x, arr.length - 1);
        // Reverse the whole array
        reverse (arr, 0, arr.length - 1);

    }

    public static void main (String ... args) {
        int arr [] = { 1, 2, 3, 4, 5 };
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        input.close();
        rotateArr(arr, x);
        System.out.println(Arrays.toString(arr));
    }
}
