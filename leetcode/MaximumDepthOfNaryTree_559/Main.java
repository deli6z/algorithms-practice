package leetcode.MaximumDepthOfNaryTree_559;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> nodeList2 = new ArrayList<>();
        nodeList2.add(node5);
        nodeList2.add(node6);
        Node node3 = new Node(3, nodeList2);
        List<Node> nodeList1 = new ArrayList<>();
        nodeList1.add(node3);
        nodeList1.add(node2);
        nodeList1.add(node4);
        Node root = new Node(1, nodeList1);

        System.out.println(s.maxDepth(root));
    }
}
