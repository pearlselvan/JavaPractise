package CodingPractise;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by muthuselvan on 6/18/17.
 *
 *
 * Problem :
 After reading 1st element of stream - 5 -> median - 5
 After reading 2nd element of stream - 5, 15 -> median - 10
 After reading 3rd element of stream - 5, 15, 1 -> median - 5
 After reading 4th element of stream - 5, 15, 1, 3 -> median - 4, so on..

 Solution :
 Making it clear, when the input size is odd, we take the middle element of sorted data.
 If the input size is even, we pick average of middle two elements in sorted stream.


Java code :
 http://www.programcreek.com/2015/01/leetcode-find-median-from-data-stream-java/

Methods :
 http://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/

 *
 */
public class Median {

    PriorityQueue<Integer> maxHeap;//lower half
    PriorityQueue<Integer> minHeap;//higher half

    public Median() {
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        minHeap = new PriorityQueue<Integer>();
    }

    public static void main(String[] args) {

        Median m = new Median();
        m.addNum(10);
        m.addNum(1000);
        m.addNum(30);
        System.out.println("Median for odd  / sort take middle " +m.findMedian());
        m.addNum(130);
        System.out.println("Median for even / sort and find avg for middle element " +m.findMedian());

    }

    // Adds a number into the data structure.
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (double)(maxHeap.peek()+(minHeap.peek()))/2;
        }else{
            return maxHeap.peek();
        }
    }

}
