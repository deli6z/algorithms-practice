package leetcode.arrays.SortArrayByParity_905;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) return nums;

        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 1) {
                if (nums[j] % 2 == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else if (nums[i] % 2 == 0) {
                i++;
                if (nums[j] % 2 == 1) {
                    j--;
                }
            }
        }
        return nums;
    }
}
