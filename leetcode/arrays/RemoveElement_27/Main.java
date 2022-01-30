package leetcode.arrays.RemoveElement_27;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(s.removeElement(arr, 2));
        System.out.println(Arrays.toString(arr));
    }
}
