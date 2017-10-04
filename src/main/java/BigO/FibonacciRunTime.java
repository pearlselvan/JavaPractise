package BigO;

/**
 * Created by muthuselvan on 8/24/17.
 *
 *           F(6)
 *         /     \
 *       F(5)     F(4)
        /    \      |  \
    F(4)      F(3) F(3)  F(2)
   /   \      /  \
 F(3)  F(2)  F(2)  F(1)
 /
 F(2)

 EACH LEVL DOUBLE THE NUMBER OF NODES

 O(2 ^ K ) -> EXPONNETIAL

 https://www.youtube.com/watch?v=UxICsjrdlJA
 http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

 */




public class FibonacciRunTime {

    static int[] memo = new int[50];

    public static void main(String[] args) {
        System.out.println(fib(9));
        System.out.println(fibM(10));
        System.out.println(FibDynamic(10));


    }

    static int fib(int n) {

        if (n < 0 ) return -1;

//        if ((n==0) || (n==1)) {
          if (n<=1) {
            return 1;
           }
            return fib(n - 1) + fib(n - 2);

    }

    /*
      in Memoization , each level has only one node so runtime O(K)
      Sedo :
      fib(n) {
        if n is 1 or 2, return 1;
        if memo[n] is not zero, return memo[n];
        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
        }


      https://www.youtube.com/watch?v=UxICsjrdlJA
      http://ycpcs.github.io/cs201-fall2014/lectures/lecture22.html
     */


    public static int fibM(int n) {
//        return fibMemo(n, new int[n + 1]);
        return fibMemofromBook(n, new int[n + 1]);
    }


    public static int fibMemo(int n, int[] memo) {
        if (n == 0 || n == 1)
            return n;

        int answer = memo[n];
        if (answer == 0) { // ===> if answer value is not zero then value will be in memory ( calculated
            // already so not required to go to in recursion loop
            answer = fibMemo(n-2, memo) + fibMemo(n-1, memo);
            memo[n] = answer;
//              memo[n] = fibMemo(n-2, memo) + fibMemo(n-1, memo);
        }

        return answer;
    }


     static int fibMemofromBook(int n,int[] memo) {

//        if ( n == 0 || n==1) return n; [ or ]
         if (n<=1) return n;

        if (memo[n] == 0) {
            memo[n] = fibMemofromBook(n-1,memo) + fibMemofromBook(n-2,memo);
        }
        return memo[n];

    }

    //http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
    //https://blog.pramp.com/how-to-solve-any-dynamic-programming-problem-603b6fbbd771
    static int FibDynamic(int n) {

        if (n==0) return 0;
        else if (n==1) return 1;

        int[] fib = new int[n+1];
        fib[0] = 0 ;
        fib[1] = 1 ;

        for (int i=2;i<=n;i++) {
            fib[i] = fib[i-1] +fib[i-2];
        }
        return fib[n];


    }




}
