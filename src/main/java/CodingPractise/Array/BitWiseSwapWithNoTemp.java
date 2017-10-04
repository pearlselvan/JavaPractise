package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/1/17.
 *

 http://www.rapidtables.com/convert/number/decimal-to-binary.htm
 Decimal Binary Hex

 0	0	0
 1	1	1
 2	10	2
 3	11	3
 4	100	4
 5	101	5
 6	110	6
 7	111	7
 8	1000	8
 9	1001	9
 10	1010	A
 11	1011	B
 12	1100	C
 13	1101	D
 14	1110	E
 15	1111	F
 16	10000	10
 17	10001	11
 18	10010	12
 19	10011	13
 20	10100	14
 21	10101	15
 22	10110	16
 23	10111	17
 24	11000	18
 25	11001	19
 26	11010	1A
 27	11011	1B
 28	11100	1C
 29	11101	1D
 30	11110	1E
 31	11111	1F
 32	100000	20
 64	1000000	40
 128	10000000	80
 256	100000000	100




 *  Binary String	Octal value
 000	0
 001	1
 010	2
 011	3
 100	4
 101	5
 110	6
 111	7
 1000   8
 *
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

  */
    public static void swapUsingBitwise(int first,int second) {

        System.out.println("Before Swap first : " +first  + "second : " +second );
        first = first ^ second ;
        second = first ^ second ;
        first = first ^ second ;
        System.out.println("Before Swap first : " +first  + "second : " +second );


    }



}
