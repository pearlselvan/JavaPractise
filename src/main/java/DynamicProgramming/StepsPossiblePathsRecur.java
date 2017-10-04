package DynamicProgramming;

/**
 * Created by muthuselvan on 3/24/17.
 *
 * Number of stairs : 3

 Number of ways = 4 ( {1,1,1}, {1,2}, {2,1}, {3} )
 *
 * http://algorithms.tutorialhorizon.com/dynamic-programming-stairs-climbing-puzzle/


   Number of stairs : 3
   Number of ways = 4 ( {1,1,1}, {1,2}, {2,1}, {3} )
 */
public class StepsPossiblePathsRecur {

    public static void main(String[] args) {
        System.out.println(possibleWaysRecursion(3));
        int n = 3 ;
        int[] dyn = new int[n + 1];
        System.out.println("possbile way : " +poosibleWaysDyna(3,dyn));
//        int a = 8 ;
//        int b = 7 ;
//        int c = a < b ? b : a ;
//        int d = a < b ? a : b ;
//        System.out.println(c);
//        System.out.println(d);

    }

    public static int possibleWaysRecursion(int n) {
        if (n < 1) {
            return 0;
        }
        return 1 + possibleWaysRecursion(n - 1) + possibleWaysRecursion(n - 2)
                + possibleWaysRecursion(n - 3);
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
