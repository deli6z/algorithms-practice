public class RemoveLinkedListElements {

    public class Node {
        int val;
        Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node createNode(int val, Node node) {
        return new Node(val, node);
    }

    public static void main(String[] args) {
        RemoveLinkedListElements instance = new RemoveLinkedListElements();
        Node three = instance.createNode(3, null);
        Node four = instance.createNode(4, three);
        Node five = instance.createNode(5, four);
    }


}
