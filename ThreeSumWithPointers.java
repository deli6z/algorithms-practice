/* 3-SUM in quadratic time.
 * Design an algorithm for the 3-SUM problem that takes time proportional to n^2
 * in the worst case. You may assume that you can sort the n integers in time proportional to n^2
 * or better.
 *
 * Solution: First we sort the array with make sure all the values are unique ( at most O(n^2) )
 * Then we use the solution with pointers where we set 2 pointers on both ends of array and iterate
 * over it once the solution is found moving the pointers towards each other. This solution also
 * guarantees there will be no duplicate triplets.
 *
 */

import java.util.Scanner;

public class ThreeSumWithPointers {

    public static void main(String args[]) {
        int arrLength = 8;
        int[] arr = new int[arrLength];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter elements...");
        for (int j = 0; j < arrLength; j++)
            arr[j] = sc.nextInt();

        // -40 -20 -10 0 5 10 30 40

        for (int i = 0; i < arrLength - 2; i++) {
            int a = arr[i];
            int start = i + 1;
            int end = arrLength - 1;
            while (start < end) {
                int b = arr[start];
                int c = arr[end];
                if (a + b + c == 0) {
                    System.out.println("Triplet is found, numbers are " + a + ", " + b + ", " + c);
                    start++;
                    end--;
                } else if (a + b + c < 0) {
                    start = start + 1;
                } else {
                    end--;
                }
            }
        }
    }

}
