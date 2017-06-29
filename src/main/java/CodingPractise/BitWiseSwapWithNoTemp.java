package CodingPractise;

/**
 * Created by muthuselvan on 6/1/17.
 */
public class BitWiseSwapWithNoTemp {
    public static void main(String[] args) {

        int first = 110 ;
        int second = 20 ;

        swapUsingSum(first,second);
        System.out.println("----");
        swapUsingBitwise(first,second);
        System.out.println(50<<1);  ///left shit mean multiply by 2
        System.out.println(50>>1);   // right mean divide by 2

    }

    public static void swapUsingSum(int first, int second) {
        System.out.println("Before Swap first : " +first  + "second : " +second );
        first = first + second ;
        second = first - second;
        first = second - first ;
        System.out.println("Before Swap first : " +first  + "second : " +second );

    }
 /*
 Binary String	Octal value
000	0
001	1
010	2
011	3
100	4
101	5
110	6
111	7
  */
    public static void swapUsingBitwise(int first,int second) {

        System.out.println("Before Swap first : " +first  + "second : " +second );
        first = first ^ second ;
        second = first ^ second ;
        first = first ^ second ;
        System.out.println("Before Swap first : " +first  + "second : " +second );


    }



}
