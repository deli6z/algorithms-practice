package leetcode.MinimumHeightTrees_310;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n < 2) {
            List<Integer> leaves = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                leaves.add(i);
            }
            return leaves;
        }

        List<Integer>[] adj = new ArrayList[n];
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
            indegree[edge[0]]++;
            indegree[edge[1]]++;

        }
        Queue<Integer> q = new LinkedList();
        for (int i = 0; i < n; i++) {
            if (adj[i].size() == 1) {
                q.add(i);
            }
        }
        List<Integer> remaining = new ArrayList<>();
        while (!q.isEmpty()) {
            Integer size = q.size();
            remaining = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Integer node = q.poll();
                indegree[node]--;
                remaining.add(node);
                for (Integer nbr : adj[node]) {
                    indegree[nbr]--;
                    if (indegree[nbr] == 1) {
                        q.add(nbr);
                    }
                }
            }
        }
        return remaining;
    }
}
