package Collections;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by muthuselvan on 4/9/17.
 */
public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueueExample priorityQueueExample = new PriorityQueueExample();
        priorityQueueExample.sortNumbers();
    }


    public PriorityQueueExample() {

    }

    private void sortNumbers() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        Integer[] unsorted = {30,56,99,10,5,151,33};

        // Generate sample numbers:
//        Random rand = new Random();
        for (int i = 0; i < unsorted.length; ++i) {
            queue.add(unsorted[i]);
        }

        while (!queue.isEmpty()) {
//            System.out.printf("%d,", queue.remove());
            System.out.println(queue.poll());
//            System.out.printf("%d,", queue.remove());
        }
        System.out.println();
    }
}
