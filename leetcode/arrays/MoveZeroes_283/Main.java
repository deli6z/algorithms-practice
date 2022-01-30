package leetcode.arrays.MoveZeroes_283;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 0, 3, 12};
        s.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
