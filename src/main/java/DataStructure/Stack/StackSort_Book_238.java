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
 * *  In the worst case, it makes O(n2) comparisons, though this behavior is rare.
 *
 * Book Solution :
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2003.%20Stacks%20and%20Queues/Q3_05_Sort_Stack/Question.java
 *
 *
 *
 */
public class StackSort_Book_238 {

    public static void main(String[] args) {
        Stack<Integer> unsorted = new Stack<>();
        unsorted.push(150);
        unsorted.push(40);
        unsorted.push(130);
        unsorted.push(20);
        unsorted.push(10);
        System.out.println(unsorted);
        sortstack(unsorted);
        System.out.println(unsorted);

    }


    // This is O(N^2 ) and O(N) Space , This code from cracking coding interview
    // original array will be changed

    /*

     Do unitl empty :
     1. Pick top (pop) element from unsorted stack
     2. Finding the position for the above poped element by doing :
         2.1 : result stack is not empty and result's peek greater then temp
         2.5.  pushing the unsorted by poping the resulr
     3. After the above step push the temp item in result :
     */

    public static void sortstack(Stack<Integer> unsorted) {
        System.out.println("Original Stack : " +unsorted);
        Stack<Integer> result = new Stack<>();


        while (!unsorted.isEmpty()) {
   /* insert the element in unsorted in sorted order in to result array */
            int temp = unsorted.pop(); //Creating tem variable to hold the poped item in unsorted stack

            while(!result.isEmpty() && result.peek() > temp) {
                unsorted.push(result.pop());

            }
            //push temp on result. Now result will be at its right position in sorted stack
            result.push(temp);
        }
        System.out.println("Result stack " +result);
        System.out.println("Beofre Copy" +unsorted);

        /* copy the element from result stack back into unsorted stack */
        while (!result.empty()) {
            unsorted.push(result.pop());
        }



    }





}
