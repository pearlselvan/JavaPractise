package CodingPractise.General;

import java.util.Collections;
import java.util.PriorityQueue;
/**
 * Created by muthuselvan on 6/18/17.
 * Problem :
 After reading 1st element of stream - 5 -> median - 5
 After reading 2nd element of stream - 5, 15 -> median - 10
 After reading 3rd element of stream - 5, 15, 1 -> median - 5
 After reading 4th element of stream - 5, 15, 1, 3 -> median - 4, so on..

 Solution :
 Making it clear, when the input size is odd,
 we take the middle element of sorted data.

 If the input size is even,
 we pick average of middle two
 elements in sorted stream.


 Traded off :
 http://www.ardendertat.com/2011/11/03/programming-interview-questions-13-median-of-integer-stream/


 Analysis
 --------
 First of all, it seems that the best time complexity we can get for
 this problem is O(log(n)) of add() and O(1) of getMedian().
 This data structure seems highly likely to be a tree.

 We can use heap to solve this problem. In Java,
 the PriorityQueue class is a priority heap.
 We can use two heaps to store the lower half and the higher half of
 the data stream. The size of the two heaps differs at most 1.

 Methods : ( Different Approach )
 ================================
 http://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/


 Java code :
 ===========
 http://www.programcreek.com/2015/01/leetcode-find-median-from-data-stream-java/

 What is max heap ?
 --------------------
 Max number will be added in root (index = 0 )

 What is min heap ?
 --------------------
 Min number will added in root (index = 0 )


 Logic :

 we can use a max heap on left side to represent elements that are less than effective median,
 and a min heap on right side to represent elements that are greater than effective median.

 After processing an incoming element, the number of elements in heaps differ utmost by 1 element.
 When both heaps contain same number of elements, we pick average of heaps root data as effective median.
 When the heaps are not balanced, we select effective median from the root of heap containing more elements.

 Time Complexity:
 -----------------
 If we omit the way how stream was read, complexity of median finding is O(N log N),
 as we need to read the stream, and due to heap insertions/deletions.

 At first glance the above code may look complex. If you read the code carefully, it is simple algorithm.



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
        m.addNum(5);
        m.addNum(15);
        m.addNum(1);
        m.addNum(3);
        System.out.println("Median for odd  / sort take middle " +m.findMedian());
//        m.addNum(130);
//        System.out.println("Median for even / sort and find avg for middle element " +m.findMedian());

    }

    // Adds a number into the data structure :  O(log(n)) of add()
    public void addNum(int num) {
        maxHeap.offer(num);

        System.out.println("Max heap Size before polling :" +maxHeap.size()+ " value " +maxHeap);

        //The poll() method is used to retrieve and remove the head of this queue, or returns null if this queue is empty.
        minHeap.offer(maxHeap.poll());  //Why we are adding num to minHeap which is from maxHeap ?
        System.out.println("Max Heap" +maxHeap);
        System.out.println("Min Heap" +minHeap);

        if(maxHeap.size() < minHeap.size()){
            System.out.println("Max heap size less then min heap");
            System.out.println("Max heap Size :" +maxHeap.size());
            System.out.println("Min heap Size :" +minHeap.size());
            maxHeap.offer(minHeap.poll());
            System.out.println("Max Heap after size : " +maxHeap);
        } else {
            System.out.println("Min heap size less THEN Max heap");
        }
    }

    // Returns the median of current data stream
    //O(1) of getMedian()
    public double findMedian() {

        System.out.println("Find median - Max heap Size :" +maxHeap.size() +" Min heap Size " +minHeap.size());

        /*After processing an incoming element, the number of elements in heaps differ utmost by 1 element.
                When both heaps contain same number of elements, we pick average of heaps root data as effective median.
                When the heaps are not balanced, we select effective median from the root of heap containing more elements.*/
        if(maxHeap.size()==minHeap.size()){ // if its odd
            return (double)(maxHeap.peek()+(minHeap.peek()))/2;
        }else{
            return maxHeap.peek();
        }
    }

}
