


/*
1: Between two sets.
==========================

Example :

a = {2, 6}
b = {24, 36}

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array

6 % 2 = 0, 6  % 6 = 0;
24 % 6 = 0, 36 % 6 = 0;

*/

import java.util.*;
public class BetweenTwoSets {

    static int getTotalX (List <Integer> a, List <Integer> b) {

        int start = a.get(0);
        for (int num: a)
            if (num > start) 
                start = num;

        int end = b.get(0);
        for (int num: b)
            if (num < end) 
                end = num;

        int count = 0;
        for (int x = start; x <= end; x++) {

            boolean valid = true;
            for (int num: a) {
                if (x % num != 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                for (int num: b) {
                    if (num % x != 0) {
                        valid = false;
                        break;
                    }
                }                
            }

            if (valid) count ++;
        }   return count;
    }

    public static void main (String ... args) {
        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);
        System.out.println(getTotalX(a, b)); // Output: 3
    }

}

