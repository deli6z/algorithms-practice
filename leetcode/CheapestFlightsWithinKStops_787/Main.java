package leetcode.CheapestFlightsWithinKStops_787;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] flights = new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        System.out.println(s.findCheapestPrice(3, flights, 0, 2, 1));
//        int[][] flights = new int[][]{{4, 1, 1}, {1, 2, 3}, {0, 3, 2}, {0, 4, 10}, {3, 1, 1}, {1, 4, 3}};
//        System.out.println(s.findCheapestPrice(5, flights, 2, 1, 1));

    }

}
