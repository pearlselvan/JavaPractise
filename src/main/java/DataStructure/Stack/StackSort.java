package DataStructure.Stack;

import java.util.Stack;

/**
 * Created by muthuselvan on 5/29/17.
 * http://www.geeksforgeeks.org/sort-a-stack-using-recursion/
 *
 * Algorithm
    We can use below algorithm to sort stack elements:

    sortStack(stack S)
    if stack is not empty:
    temp = pop(S);
    sortStack(S);
    sortedInsert(S, temp); ----------> Below is impl

 Below algorithm is to insert element is sorted order:
          sortedInsert(Stack S, element) <----------------
             if stack is empty OR element > top element
             push(S, elem)
             else
             temp = pop(S)
             sortedInsert(S, element)
             push(S, temp)
 *
 *
 *
 * Good impl :  using quick sort  : O(n log n) comparisons to sort n items.
 * http://blog.pengyifan.com/sort-a-stack-in-ascending-order-in-on-log-n/
 *
 *
 *
 */
public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> unsorted = new Stack<>();
        unsorted.push(150);
        unsorted.push(40);
        unsorted.push(130);
        unsorted.push(20);
        unsorted.push(10);
        System.out.println(unsorted);
        sortstack(unsorted);
    }


    // This is O(N^2 ) and O(N) Space , This code from cracking coding interview
    public static void sortstack(Stack<Integer> unsorted) {
        Stack<Integer> result = new Stack<>();

        while (!unsorted.isEmpty()) {
   /* insert the element in unsorted in sorted order in to r */
            int temp = unsorted.pop();

            while(!result.isEmpty() && result.peek() > temp) {
                unsorted.push(result.pop());

            }
            //push temp on result. Now result will be at its right position in sorted stack
            result.push(temp);
        }

        /* copy the element from result stack back into unsorted stack */
        while (!result.empty()) {
            unsorted.push(result.pop());
        }
        System.out.println(unsorted);

    }





}
