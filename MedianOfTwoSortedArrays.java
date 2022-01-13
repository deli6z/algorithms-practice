public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0;
        int high = nums1.length;
        int length1 = nums1.length;
        int length2 = nums2.length;
        double median = 0;

        while (low <= high) {

            int partition1 = (low + high) / 2;
            int partition2 = (length1 + length2 + 1) / 2 - partition1;

            int maxLeft1 = partition1 == 0 ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = partition1 == length1 ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = partition2 == 0 ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = partition2 == length2 ? Integer.MAX_VALUE : nums2[partition2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((length1 + nums2.length) % 2 == 0) {
                    median = ((double) Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
                } else {
                    median = ((double) Math.max(maxLeft1, maxLeft2));
                }
                break;
            } else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            } else {
                low = partition1 + 1;
            }
        }

        return median;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 3, 5};
        int[] nums2 = new int[]{2, 7, 13};

        MedianOfTwoSortedArrays med = new MedianOfTwoSortedArrays();
        double median = med.findMedianSortedArrays(nums1, nums2);

    }
}
