package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by muthuselvan on 9/8/17.
 */
public class    Memoize_Fib_Map {


    public static void main(String[] args) {
        System.out.println(fib(4));
    }


    public static int fib(int n) {
        Map<Integer, Integer> memo = new HashMap<>();

        // edge case: negative index
        if (n < 0) {
            throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
        }

        // base case: 0 or 1
        else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fib(n-1) + fib(n-2);

        // memoize
        memo.put(n, result);

        return result;
    }

}
