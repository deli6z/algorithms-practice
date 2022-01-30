package leetcode.arrays.ThirdMaximumNumber_414;

class Solution {
//     public int thirdMax(int[] nums) {
//         Set<Integer> set = new HashSet();

//         for (Integer num: nums) {
//             set.add(num);
//         }

//         if (set.size() < 3) {
//             return Collections.max(set);
//         }
//         set.remove(Collections.max(set));
//         set.remove(Collections.max(set));

    //         return Collections.max(set);
//     }
    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (Integer num : nums) {
            if (num.equals(first) || num.equals(second) || num.equals(third)) continue;

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }
        return third == null ? first : third;
    }
}
