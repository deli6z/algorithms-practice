package leetcode.arrays.DuplicateZeros_1098;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        s.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
