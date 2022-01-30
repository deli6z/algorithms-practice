package leetcode.arrays.MaxConsecutiveOnesII_487;

class Solution {
// Bruteforce solution O(N*N), O(1)
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int result = 0;
//         int n = nums.length;

    //         for (int i = 0; i< n; i++) {
//             int zeros = 0;
//             for (int j = i; j < n; j++) {
//                 if (nums[j] == 0) {
//                     zeros++;
//                 }
//                 if (zeros <= 1) {
//                     result = Math.max(result, j - i + 1);
//                 }
//             }
//         }
//         return result;
//     }

    public int findMaxConsecutiveOnes(int[] nums) {
        int r = 0, l = 0, s = 0, z = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                z++;
            }
            while (z == 2) {
                if (nums[l] == 0) {
                    z--;
                }
                l++;
            }
            s = Math.max(s, r - l + 1);
            r++;
        }
        return s;
    }

}
