package leetcode.graphs.MaximumDepthOfNaryTree_559;

import java.util.List;
import java.util.PriorityQueue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution1 {
    PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        pq.add(dfs(root, count));

        return pq.poll();

    }

    public int dfs(Node node, int count) {
        count++;
        if (node.children != null) {
            for (Node child : node.children) {
                pq.add(dfs(child, count));
            }
        }
        return --count;
    }
}
