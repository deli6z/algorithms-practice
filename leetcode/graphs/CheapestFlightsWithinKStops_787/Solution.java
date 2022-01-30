package leetcode.graphs.CheapestFlightsWithinKStops_787;

import java.util.Arrays;

public class Solution {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] current = new int[n];
        Arrays.fill(current, Integer.MAX_VALUE);
        current[src] = 0;
        int[] previous = current.clone();
        for (int i = 0; i <= k; i++) {
            for (int[] f : flights) {
                if (previous[f[0]] < Integer.MAX_VALUE)
                    current[f[1]] = Math.min(current[f[1]], previous[f[0]] + f[2]);
            }
            previous = current.clone();
        }
        return current[dst] == Integer.MAX_VALUE ? -1 : current[dst];
    }
}
