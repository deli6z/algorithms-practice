import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {
    public static void main(String[] args) {

        Queue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("c");
        testStringsPQ.add("o");
        testStringsPQ.add("d");
//        System.out.println(testStringsPQ.poll());
        testStringsPQ.add("i");
        testStringsPQ.add("n");
//        System.out.println(testStringsPQ.poll());
        testStringsPQ.add("g");

        System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
        while (!testStringsPQ.isEmpty()) {
            System.out.println(testStringsPQ.poll());
        }

    }
}
