package ProblemSolving;

import java.util.Stack;

/**
 * Created by muthuselvan on 3/14/17.
 */
/*
1.To retrieve the current minimum,
 just return the top element from minimum stack.
2. Each time you perform a push operation, check if the pushed element is a new minimum.
  If it is, push it to the minimum stack too.
3. When you perform a pop operation,
check if the popped element is the same as the current minimum.
If it is, pop it off the minimum stack too.
http://leetcodesolution.blogspot.com/2014/11/leetcode-min-stack.html
 */
public class StackGetMinWhenPop {




    public static void main(String[] args) {
        MyStock myStock = new MyStock();
        myStock.push(10);
        myStock.push(20);
        myStock.push(2);
        myStock.push(1);
        myStock.push(30);
        myStock.push(310);
        System.out.println("Min in Stock : " +myStock.getMin());
    }




}

class MyStock {

    Stack<Integer> stack ;
    Integer data ;

    public MyStock() {
        this.stack = new Stack<Integer>();
    }

    public void push(int data) {
        stack.push(data);
    }

    public int getMin() {
        int min = 0;
        if (stack.isEmpty()) {
            return -1;
        }
        min = stack.get(0);
        for (int i=0;i<stack.size()-1;i++) {
            min = Math.min(stack.get(i+1),min);

        }
        System.out.println("Min " +min);


        return min;
    }

}
