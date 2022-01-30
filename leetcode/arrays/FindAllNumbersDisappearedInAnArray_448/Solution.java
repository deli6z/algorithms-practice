package leetcode.arrays.FindAllNumbersDisappearedInAnArray_448;

import java.util.ArrayList;
import java.util.List;

class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         Set<Integer> set = new HashSet();

//         for (int i = 1; i <= nums.length; i++) {
//             set.add(i);
//         }

//         for (Integer n: nums) {
//             if (set.contains(n)) {
//                 set.remove(n);
//             }
//         }
//         List<Integer> list = new ArrayList();
//         for (Integer n: set) list.add(n);

//         return list;
//     }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
