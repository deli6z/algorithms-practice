package leetcode.arrays.FindNumbersWithEvenNumberOfDigits_1295;

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num > 0) {
                num /= 10;
                digits++;
            }
            if (digits > 0 && digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
