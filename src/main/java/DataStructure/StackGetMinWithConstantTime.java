package DataStructure;

import java.util.Stack;

import org.junit.Assert;


/**
 * Created by muthuselvan on 3/16/17.
 */
/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.


push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

Analysis:

Apparently, we need to use extra space to store the minimum element of the stack.
We can use one stack s to store the pushed element and another stack sMin to store minimum elements appearing so far.

Whenever an element x is pushed, if it is less than current minimum (at the top of sMin stack), push x to the sMin;
otherwise, the top of the sMin is the minimum and we push it to sMin;



 */
public class StackGetMinWithConstantTime {
    public static void main(String[] args) {

        minStack minStack = new minStack(10);
        minStack.push(10);
        minStack.push(20);
        minStack.push(-5);
        minStack.push(-7);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(-100);
        System.out.println(minStack.getMin());

    }
}

class minStack {

     static Stack<Integer> currentStack ;
     static Stack<Integer> minStack ;

    public minStack(int capacity) {
        this.currentStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int data) {
        System.out.println("Pushing " +data);
        currentStack.push(data);

        if (minStack.empty() || data < minStack.peek()) {
            minStack.push(data);
        }
    }


    public int popSmall() {
        return minStack.peek();
    }

    public int pop() {
        if (currentStack.peek() <=minStack.peek()) {
            minStack.pop();
        }
        return currentStack.pop();
    }

    public int getMin() {
        return minStack.peek();
    }


    public int top() {
        return currentStack.pop();
    }




}
