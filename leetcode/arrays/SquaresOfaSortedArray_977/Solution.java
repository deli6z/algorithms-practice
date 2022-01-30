package leetcode.arrays.SquaresOfaSortedArray_977;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int n = nums.length - 1;
        int[] sorted = new int[nums.length];

        while (i <= j) {
            int iSqr = nums[i] * nums[i];
            int jSqr = nums[j] * nums[j];
            if (iSqr >= jSqr) {
                sorted[n--] = iSqr;
                i++;
            } else {
                sorted[n--] = jSqr;
                j--;
            }
        }
        return sorted;
    }
}
