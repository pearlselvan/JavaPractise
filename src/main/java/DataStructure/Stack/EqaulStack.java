package DataStructure.Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * Created by muthuselvan on 9/15/17.
 * https://www.hackerrank.com/challenges/equal-stacks/problem :
 * https://coderinme.com/equal-stacks-hackerrank-problem-solution/
 * http://javainterviewinvasion.blogspot.com/2016/07/equal-stacks.html
 *
 * I/P :
 S1 :3 2 1 1 1
 S2 :4 3 2
 S3 :1 1 4 1
 *
 */
public class EqaulStack {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        s1.push(3);
        s1.push(2);
        s1.push(1);
        s1.push(1);
        s1.push(1);

        s2.push(4);
        s2.push(3);
        s2.push(2);

        s3.push(1);
        s3.push(1);
        s3.push(4);
        s3.push(1);

        equalStack();

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

//        System.out.println("All-----" +getSumOfStack(s1));
//        System.out.println("All-----" +getSumOfStack(s2));
//        System.out.println("All----- : " +getSumOfStack(s3));
//        System.out.println("MAX Return" +getmax(getSumOfStack(s1), getSumOfStack(s2), getSumOfStack(s3)));
//        System.out.println("MAX Return : " +getmax(7,8,9));
    }
        /*

        1. Get sum of all n stack
        2. Get Max Sum of n stack from Step 1 , write the method that will return max of the all the stack
        3. Remove the top element from Max Stack
        4. Check if equalize or not
        5


         */

//        checkStack();





    public static int getmax(int stack1_sum, int stack2_sum, int stack3_sum) {
        // d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        int max = stack3_sum > (stack1_sum > stack2_sum ? stack1_sum : stack2_sum) ? stack3_sum : ((stack1_sum > stack2_sum) ? stack1_sum : stack1_sum);
        System.out.println("Max : " + max);
        return max;
    }


    public static int getSumOfStack(Stack<Integer> stack) {

        int sum = 0 ;
        int total = stack.size();
        System.out.println("Stack Size =====" +stack.size());
        for (int i=0;i<total;i++) {
            System.out.println("Sum " +sum);
            int current = stack.pop();
            System.out.println("Current poped " +current);
            sum = sum+current;
        }
        System.out.println("Sum === :" +sum);
        return sum;
    }


/*
 * I/P :
 S1 :3 2 1 1 1
 S2 :4 3 2
 S3 :1 1 4 1
 */
    public static void equalStack() {


        int[] stack1 = {3,2,1,1,1};
        int[] stack2 = {4,3,2};
        int[] stack3 = {1,1,4,1};

        int n1 = 5 ;
        int n2 = 3 ;
        int n3 = 4 ;

        int stack1_sum = 0 ;
        int stack2_sum = 0 ;
        int stack3_sum = 0 ;


        // finding total sum for stack1

        for (int i=0;i<stack1.length;i++) {
            stack1_sum+=stack1[i];
        }
        System.out.println("Stack 1 sum : " +stack1_sum);


        for (int i=0;i<stack2.length;i++) {
            stack2_sum+=stack2[i];
        }
        System.out.println("Stack 2 sum : " +stack2_sum);


        for (int i=0;i<stack3.length;i++) {
            stack3_sum+=stack3[i];
        }
        System.out.println("Stack 3 sum : " +stack3_sum);

        boolean stackBalanced = false;
        int val = 0;
        //when stackBalanced will true ?
        // what is the purpose of val ?
        while(!stackBalanced) {

            //when stackBalanced will true ? if sum of all stack same
            if (stack1_sum == stack2_sum && stack2_sum == stack3_sum) {
                stackBalanced=true;
                val=stack1_sum; // This is final sum which stack equal
                break;
            } else {
                int currentmax = Math.max(stack1_sum,Math.max(stack2_sum,stack2_sum));
                int bottom = -1; //what is the purpose of bottom and inilized with -1
                //check currentmax with  stack1_sum

                if (currentmax == stack1_sum) {
                    int index = 0;
                    while (index < n1 && stack1[index] == -1) {
                        ++index;
                    } //End index while loop : stack1
                    if (index < n1) {
                        stack1_sum -= stack1[index];
                        stack1[index] = -1;
                    } // End if for stack1
//                } --------? required to add

                } else if (currentmax == stack2_sum) {

                    int index = 0;
                    while (index < n2 && stack2[index] == -1) {
                        ++index;
                    } //End index while loop : stack2

                    if (index < n2) {
                        stack2_sum-=stack2[index];
                        stack2[index]=-1;
                    } // End if for stack2

                } else if (currentmax == stack3_sum) {

                    int index = 0;
                    while (index < n3 && stack3[index] == -1) {
                        ++index;
                    } //End index while loop : stack2

                    if (index < n3) {
                        stack3_sum-=stack3[index];
                        stack3[index]=-1;
                    } // End if for stack2

                }
            }
        } //End while
        System.out.println("Stack empty" +stack1_sum);
    } //End of the method

    } // End of the class



