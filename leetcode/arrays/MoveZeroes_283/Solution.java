package leetcode.arrays.MoveZeroes_283;

class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        int n = nums.length;
        for (int num : nums) {
            if (num == 0) {
                zeros++;
            }
        }
        if (zeros == n) {
            return;
        }

        int i = 0;
        int count = 0;
        while (count < n) {
            if (count < n - zeros) {
                if (nums[i] != 0) {
                    nums[count] = nums[i];
                    count++;
                }
                i++;
            } else {
                nums[count] = 0;
                count++;
            }
        }
    }
}
