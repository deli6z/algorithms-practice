package leetcode.graphs.PathWithMinimumEffort_1631;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int minimumEffortPath(int[][] heights) {

        int[][] neighbors = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        int rows = heights.length;
        int cols = heights[0].length;

        int[][] effort = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                effort[i][j] = Integer.MAX_VALUE;
            }
        }
        effort[0][0] = 0;

        Queue<int[]> pq = new PriorityQueue<>((x, y) -> x[2] - y[2]);
        pq.add(new int[]{0, 0, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currRow = curr[0];
            int currCol = curr[1];

            if (currRow == rows - 1 && currCol == cols - 1) {
                return curr[2];
            }

            for (int[] nbr : neighbors) {
                int nbrRow = currRow + nbr[0];
                int nbrCol = currCol + nbr[1];
                if (nbrRow >= 0 && nbrRow < rows && nbrCol >= 0 && nbrCol < cols) {
                    int absDiff = Math.abs(heights[nbrRow][nbrCol] - heights[currRow][currCol]);
                    if (effort[nbrRow][nbrCol] > Math.max(effort[currRow][currCol], absDiff)) {
                        effort[nbrRow][nbrCol] = Math.max(effort[currRow][currCol], absDiff);
                        pq.add(new int[]{nbrRow, nbrCol, effort[nbrRow][nbrCol]});
                    }
                }
            }
        }

        return -1;
    }
}
