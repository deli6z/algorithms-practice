package leetcode.arrays.HeightChecker_1051;

class Solution {
// Trivial solution O(Nlog(N)) using java sort
//     public int heightChecker(int[] heights) {
//         int n = 0;
//         int[] sorted = heights.clone();
//         Arrays.sort(sorted);

//         if (heights.length == 1) return n;

//         for (int i = 0; i < heights.length; i ++) {
//             if (heights[i] != sorted[i]) {
//                 n++;
//             }
//         }
//         return n;
//     }

    public int heightChecker(int[] heights) {
        if (heights.length == 1) return 0;

        int[] counts = new int[101];
        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            counts[heights[i]]++;
        }

        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }

//      for (int i = 0; i< heights.length; i++) {
//      start of the beginning works too since we don't care if this is stable sort or not
        for (int i = heights.length - 1; i >= 0; i--) {
            if (heights[--counts[heights[i]]] != heights[i]) {
                result++;
            }
        }

        return result;
    }

}
