package DynamicProgramming;

/**
 * Created by muthuselvan on 3/24/17.
 * http://algorithms.tutorialhorizon.com/introduction-to-dynamic-programming-fibonacci-series/#top-down
 *
 * Fibonocii n th number
 * http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 */
public class FibonacchiDynamic {


    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34 55 -- Series so if i given x= 9 then 9 th position 34
        System.out.println(fibRecurr(4));
        System.out.println(fibDP(4));

    }

    //Extra Space: O(n) if we consider the function call stack size, otherwise O(1).
//    Time Complexity: o(2 ^ n ) which is exponential.
    public static int fibRecurr(int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        else {
            int f = fibRecurr(x - 1) + fibRecurr(x - 2);
            return f;
        }
    }

    //Time Com­plex­ity: O(n) , Space Com­plex­ity : O(n)
    //We can avoid the repeated work done is the method 1 by storing the Fibonacci numbers calculated so far.
    public static int fibDP(int x) {
        /* Declare an array to store Fibonacci numbers. */
        int fib[] = new int[x + 1];
        /* 0th and 1st number of the series are 0 and 1*/
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < x + 1; i++) {
            /* Add the previous 2 numbers in the series
         and store it */
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[x];
    }

}
