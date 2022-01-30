package leetcode.arrays.ValidMountainArray_941;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) return false;

        int i = 0;
        int j = arr.length - 1;
        while (i < arr.length - 1 && j > 0) {
            if (arr[i] < arr[i + 1]) i++;
            if (arr[j] < arr[j - 1]) j--;

            if (i != arr.length - 1 && j != 0 &&
                    arr[i] >= arr[i + 1] && arr[j] >= arr[j - 1]) {
                return i == j;
            }
        }
        return false;
    }
}
