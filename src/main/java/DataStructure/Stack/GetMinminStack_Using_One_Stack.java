package DataStructure.Stack;

import java.util.Stack;

/**
 * Created by muthuselvan on 9/18/17.
 */
public class GetMinminStack_Using_One_Stack {

    int min = Integer.MAX_VALUE;
    static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {

        GetMinminStack_Using_One_Stack mystack = new GetMinminStack_Using_One_Stack();
        mystack.push(10);
        mystack.push(2);
        mystack.push(7);
        mystack.push(5);
        mystack.push(3);
        mystack.push(6);
        mystack.push(1);
        System.out.println("So far Stack " +mystack);
        System.out.println("Min : " +mystack.getMin());
        mystack.pop(); printStack();
//        mystack.pop(); printStack();
//        mystack.pop(); printStack();
        System.out.println("Top "  +mystack.top());
        System.out.println("Min : " +mystack.getMin());
        printStack();

    }

    public static void printStack() {
        System.out.println("=>" +stack);
    }

    public void push(int x) {
        // only push the old minimum value when the current
        // minimum value changes after pushing the new value x
        if(x <= min){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value,
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop(); // if this false pop will not work
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }



}
