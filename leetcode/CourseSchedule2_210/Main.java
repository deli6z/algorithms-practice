package leetcode.CourseSchedule2_210;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};

        System.out.println(s.findOrder(4, prerequisites));
    }

}
