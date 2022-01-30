package leetcode.arrays.DuplicateZeros_1098;

class Solution {

//     O(N*N) solution
//     public void duplicateZeros(int[] arr) {
//         int i = 0;
//         int n = arr.length;

//         while (i < n - 1) {
//             if (arr[i] == 0) {
//                 for (int j = n - 1; j > i + 1; j--) {
//                     arr[j] = arr[j - 1];
//                 }
//                 arr[++i] = 0;
//             }
//             i++;
//         }
//     }

    public void duplicateZeros(int[] arr) {
        int length = arr.length - 1;
        int zeros = 0;

        for (int i = 0; i <= length - zeros; i++) {
            if (arr[i] == 0) {
                if (i == length - zeros) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                zeros++;
            }
        }

        for (int i = length - zeros; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zeros] = 0;
                zeros--;
                arr[i + zeros] = 0;
            } else {
                arr[i + zeros] = arr[i];
            }
        }
    }
}
