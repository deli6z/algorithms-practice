package leetcode.arrays.RemoveDuplicatesFromSortedArray_26;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(s.removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
