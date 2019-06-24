/**
 * Coursera - Algorithms Part I
 * Week 1 - Interview Questions - Union Find
 * <p>
 * Question 2: Search in a bitonic array
 * An array is bitonic if it is comprised of an increasing sequence of integers
 * followed immediately by a decreasing sequence of integers. Write a program
 * that, given a bitonic array of N distinct integer values, determines whether
 * a given integer is in the array.
 * <p>
 * Standard version: Use ~3lgN compares in the worst case.
 * Signing bonus: Use ~2lgN compares in the worst case (and prove that no
 * algorithm can guarantee to perform fewer than ~2lgN compares in the worst case).
 * <p>
 * Solution:
 * <p>
 * Use three binary searches.
 * 1) Locate the point in the array where ascending switchines to descending
 * 2) Perform binary search on each half of the array for the target integer
 */

public class BitonicArray {

    public static int findBitonicPeak(int[] arr, int start, int end) {
        int mid = (end + start) / 2;
        if (start == end) {
            return mid;
        } else if (arr[mid] > arr[mid + 1]) {
            return findBitonicPeak(arr, 0, mid);
        } else {
            return findBitonicPeak(arr, mid + 1, end);
        }
    }

    public static boolean find(int[] arr, int peak, int key) {
        return BinarySearch.find(arr, 0, peak, key, false)
                || BinarySearch.find(arr, peak + 1, arr.length - 1, key, true);
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 15, 22, 35, 47, 68, 55, 42, 34, 12, 8};

        int peak = findBitonicPeak(arr, 0, arr.length - 1);
        boolean found = find(arr, peak, 42);
        System.out.println(found);
    }
}

