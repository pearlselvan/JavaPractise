package Collections;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by muthuselvan on 7/4/17.
 */
public class MaxHeapJavaExample {

    public MaxHeapJavaExample() {

    }


    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(Collections.reverseOrder());
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(30);
        System.out.println("PQ : "+priorityQueue);
        System.out.println("PQ Peek : "+priorityQueue.peek());

    }
}
