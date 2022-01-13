import java.util.Arrays;

public class BinarySearch {
    public static boolean find(int[] arr, int start, int end, int key, boolean desc) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < key) {
                if (desc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > key) {
                if (desc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int key = 10;
        int arr[] = {10, 20, 15, 22, 35};
        Arrays.sort(arr);
        // for testing descending array search
        // arr = IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();

        System.out.println("key " + key + " is " + (find(arr, 0, arr.length - 1, key, false) ? "found" : "not found"));
    }
}
