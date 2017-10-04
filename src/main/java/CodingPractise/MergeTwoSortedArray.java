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
            System.out.println("First : " + first.peek() +" second : " +second.peek());
            if (first.peek() < second.peek()) {
                System.out.println("Pushing first stack : " +first.peek());
                result.push(first.pop());
            } else {
                System.out.println("Pushing second stack : " +second.peek());
                result.push(second.pop());
            }

        }

        System.out.println("So far result " +result);

        System.out.println(first.size());
        System.out.println(second.size());

        while (first.size() != 0) {
            result.push(first.pop());
        }
//
        while (second.size() != 0) {
            result.push(second.pop());

        }



    }
}
