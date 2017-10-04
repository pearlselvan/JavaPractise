package DataStructure.Queue;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by muthuselvan on 6/21/17.
 * https://www.interviewcake.com/question/java/queue-two-stacks
 */
public class QueueTwoStack {


    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();



    public static void main(String[] args) {

        QueueTwoStack queueTwoStack = new QueueTwoStack();
        queueTwoStack.enqueue(10);
        queueTwoStack.enqueue(20);
        queueTwoStack.enqueue(30);
        System.out.println(queueTwoStack.dequeue());



    }

    public void enqueue(int item) {
        inStack.push(item);
    }


    public int dequeue() {
        if (outStack.empty()) {

            // Move items from inStack to outStack, reversing order
            while (!inStack.empty()) {
                int newestInStackItem = inStack.peek();
                outStack.push(newestInStackItem);
                inStack.pop();
            }

            // If outStack is still empty, raise an error
            if (outStack.empty()) {
                throw new NoSuchElementException("Can't dequeue from empty queue!");
            }
        }
        return outStack.pop();
    }


    public static void queueUsingTwoStack() {





    }
}
