package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/2/17.
 *
 *
 *
 *
 *  Examples:
 *  ---------
    Input: n = 5
    Output: 1
    Factorial of 5 is 20 which has one trailing 0.

    Input: n = 20
    Output: 4
    Factorial of 20 is 2432902008176640000 which has
    4 trailing zeroes.

    Input: n = 100
    Output: 24

    Simple and Problem :
    --------------------

    A simple method is to first calculate factorial of n,
    then count trailing 0s in the result (We can count trailing 0s by repeatedly dividing the factorial by 10 till
    the remainder is 0).

    The above method can cause overflow for a slightly bigger numbers as factorial of a number
     is a big number (See factorial of 20 given in above examples).
    The idea is to consider prime factors of a factorial n. A trailing zero is always produced
      by prime factors 2 and 5. If we can count the number of 5s and 2s, our task is done.

    Math approach :
    ----------------
    Trailing 0s in n! = Count of 5s in prime factors of n!
    = floor(n/5) + floor(n/25) + floor(n/125) + ....

    floor means : (5/2) = 2.5 ...this will return 2

     if n = 100 then o/p :
     count : 20's 5 + 4's 100 so count : 24


 *
 * Explanation :
 * http://www.purplemath.com/modules/factzero.htm
 *
 * Program :
 * http://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/
 *
 *
 *
 *
 */
public class CountTraillingZero_Factorial {

    public static void main(String[] args) {
        System.out.println("Trailling zero " +findTraillingZero(10));
        System.out.println(Factorial(12));



    }



    /* The factorial for a number ‘n’ would be n*(n-1)*(n-2)…*1 */

    public static int Factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            System.out.println(n);
            return n * Factorial(n-1);
    }

    /*
    Trailing 0s in n! = Count of 5s in prime factors of n!
                  = floor(n/5) + floor(n/25) + floor(n/125) + ....
     */
    public static int findTraillingZero(int number) {
        int count=0;
        for (int i=5;number/i>=1; i *= 5) {
            count += number/i;
            System.out.println("i : " +i);
            System.out.println("count : " +count);
        }
        return count;
    }
}
