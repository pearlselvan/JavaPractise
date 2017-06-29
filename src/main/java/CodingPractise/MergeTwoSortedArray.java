package CodingPractise;

import java.util.Stack;

/**
 * Created by muthuselvan on 6/2/17.
 */
public class MergeTwoSortedArray {

    public static void main(String[] args) {

        Stack<Integer> fStack = new Stack<>();
        Stack<Integer> sStack = new Stack<>();

        fStack.push(3);
        fStack.push(4);
        fStack.push(6);
        sStack.push(1);
        sStack.push(5);
        sStack.push(7);

        merge(fStack,sStack);


    }

    public static void merge(Stack<Integer> first,Stack<Integer> second) {
        Stack<Integer> result = new Stack<>();
        while (!first.empty() && !second.empty()) {
            if (first.peek() < second.peek()) {
                System.out.println("F" + first.peek());
                result.push(first.pop());
            } else {
                System.out.println("S" + second.peek());
                result.push(second.pop());
            }

        }
        System.out.println(result);

    }
}
