/**
 * Coursera - Algorithms Part I
 * Week 2 - Interview Questions - Stacks and Queues
 * <p>
 * Question: Queue with two stacks. Implement a queue with two stacks so that each queue
 * operations takes a constant amortized number of stack operations.
 * <p>
 * Solution: To enqueue add element to stack1, to dequeue in stack2 is empty when loop over stack1
 * and move all elements from stack1 to stack2, then pop the element from stack2
 */

import edu.princeton.cs.algs4.LinkedStack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.NoSuchElementException;

public class TwoStackQueue {
    private LinkedStack<String> stack1 = new LinkedStack<String>();
    private LinkedStack<String> stack2 = new LinkedStack<String>();

    public void enqueue(String s) {
        stack1.push(s);
    }

    public String dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) throw new NoSuchElementException("Stack underflow");
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                queue.enqueue(item);
            else if (!queue.isEmpty())
                StdOut.print(queue.dequeue() + " ");
        }
    }

}
