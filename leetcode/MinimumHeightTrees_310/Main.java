package leetcode.MinimumHeightTrees_310;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[][] edges = new int[][]{{1, 0}, {1, 2}, {1, 3}};
//        int[][] edges = new int[][]{{0, 1}, {0, 2}, {0, 3}, {3, 4}, {4, 5}};
        int[][] edges = new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        System.out.println(s.findMinHeightTrees(6, edges));
    }
}
