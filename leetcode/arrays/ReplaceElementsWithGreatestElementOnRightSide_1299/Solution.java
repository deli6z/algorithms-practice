package leetcode.arrays.ReplaceElementsWithGreatestElementOnRightSide_1299;

class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if (n == 1) return new int[]{-1};

        int max = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                max = arr[i];
                arr[i] = -1;
            } else {
                int curr = arr[i];
                arr[i] = max;
                max = Math.max(max, curr);
            }
        }
        return arr;
    }
}
