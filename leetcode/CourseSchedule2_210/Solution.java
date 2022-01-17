package leetcode.CourseSchedule2_210;

import java.util.LinkedList;
import java.util.Stack;

class Solution {

    Stack<Integer> reversePostOrder = new Stack<>();
    LinkedList<Integer>[] adj;
    boolean[] visited;
    boolean[] onStack;
    boolean hasCycle = false;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 1 && prerequisites.length == 0) {
            return new int[1];
        }

        adj = new LinkedList[numCourses];
        visited = new boolean[numCourses];
        onStack = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj[i] = new LinkedList<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adj[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        for (int v = 0; v < numCourses; v++) {
            if (!visited[v]) {
                dfs(v);
            }
        }

        if (hasCycle) {
            return new int[0];
        }

        int[] order = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            order[i] = reversePostOrder.pop();
        }

        return order;
    }

    public void dfs(int v) {
        visited[v] = true;
        onStack[v] = true;
        for (int w : adj[v]) {
            if (hasCycle) {
                return;
            } else if (onStack[w]) {
                hasCycle = true;
            } else if (!visited[w]) {
                dfs(w);
            }
        }
        reversePostOrder.push(v);
        onStack[v] = false;
    }
}
