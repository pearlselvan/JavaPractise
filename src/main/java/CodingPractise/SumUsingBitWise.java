package CodingPractise;

/**
 * Created by muthuselvan on 3/22/17.
 */

/*

^ in Java is the exclusive-or ("xor") operator.

Let's take 5^6 as example:

(decimal)    (binary)
     5     =  101
     6     =  110
------------------ xor
     3     =  011
This the truth table for bitwise (JLS 15.22.1) and logical (JLS 15.22.2) xor:

^ | 0 1      ^ | F T
--+-----     --+-----
0 | 0 1      F | F T
1 | 1 0      T | T F
More simply, you can also think of xor as "this or that, but not both!".
 */
public class SumUsingBitWise {

    public static void main(String[] args) {
        System.out.println("ADD : " +new SumUsingBitWise().Add(5,6));
    }

    int Add(int x, int y)
    {
        // Iterate till there is no carry
        while (y != 0)
        {
            // carry now contains common set bits of x and y
            int carry = x & y;

            // Sum of bits of x and y where at least one of the bits is not set
            x = x ^ y;

            // Carry is shifted by one so that adding it to x gives the required sum
            y = carry << 1;
        }
        return x;
    }
}
