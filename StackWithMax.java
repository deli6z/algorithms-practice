/**
 * Coursera - Algorithms Part I
 * Week 2 - Interview Questions - Stacks and Queues
 * <p>
 * Question: Stack with max. Create a data structure that efficiently supports the stack
 * operations (push and pop) and also a return-the-maximum operation.
 * Assume the elements are real numbers so that you can compare them.
 * <p>
 * Solution: To maintain the stack max value we will need to have a second stack.
 * We will update it with the value if new element in bigger than the last element in second stack
 */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StackWithMax {
    private Node first = null;
    private Node max = null;

    private class Node {
        private double item;
        private Node next;
    }

    private double max() {
        return max.item;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private void push(double item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        if (max == null || item > max()) {
            Node oldmax = max;
            max = new Node();
            max.item = item;
            max.next = oldmax;
        }
    }

    private double pop() {
        double item = first.item;
        first = first.next;
        if (item == max.item) {
            max = max.next;
        }
        return item;
    }

    public static void main(String[] args) {
        StackWithMax stack = new StackWithMax();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                stack.push(Double.parseDouble(item));
            else if (!stack.isEmpty()) {
                StdOut.println(stack.pop() + " ");
            }
            if (!stack.isEmpty()) {
                StdOut.println("Current Max is " + stack.max() + " ");
            } else {
                StdOut.println("Stack is empty");
            }
        }
    }
}
