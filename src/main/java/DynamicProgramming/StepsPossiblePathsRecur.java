package DynamicProgramming;

/**
 * Created by muthuselvan on 3/24/17.
 * http://algorithms.tutorialhorizon.com/dynamic-programming-stairs-climbing-puzzle/


   Number of stairs : 3
   Number of ways = 4 ( {1,1,1}, {1,2}, {2,1}, {3} )
 */
public class StepsPossiblePathsRecur {

    public static void main(String[] args) {
        System.out.println(possibleWays(3));
        int n = 3 ;
        int[] dyn = new int[n + 1];
        System.out.println(poosibleWaysDyna(3,dyn));



    }

    public static int possibleWays(int n) {
        if (n < 1) {

            return 0;
        }

        return 1 + possibleWays(n - 1) + possibleWays(n - 2)
                + possibleWays(n - 3);
    }

    public static int poosibleWaysDyna(int n, int[] dyn) {
        if (n < 1) {
            return 0;
        }
        if (dyn[n] > 0) {
            return dyn[n];
        }
        dyn[n] = 1 + poosibleWaysDyna(n - 1, dyn) + poosibleWaysDyna(n - 2, dyn)
                + poosibleWaysDyna(n - 3, dyn);
        return dyn[n];
    }
}
