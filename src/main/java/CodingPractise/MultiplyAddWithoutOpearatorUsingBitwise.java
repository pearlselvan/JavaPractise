package CodingPractise;

/**
 * Created by muthuselvan on 4/25/17.
 */
public class MultiplyAddWithoutOpearatorUsingBitwise {

    public static void main(String[] args) {
        System.out.println(multiply(3,2));
        System.out.println(Add(4,4));

    }

//http://www.geeksforgeeks.org/multiply-two-numbers-without-using-multiply-division-bitwise-operators-and-no-loops/
    static int multiply(int x,int y) {

        if (y==0)
            return 0;
        if (y>0)
            return (x+multiply(x,y-1));
//            return mul;

        if (y<0)
            return -(multiply(x,-y));
        return 1;
    }




    /*
    The XOR operator will return a 1, or TRUE, if both numbers being compared are different.
     But, if the numbers being compared are the same it will return a 0 for FALSE
    X	Y	Output
    0	0	0
    0	1	1
    1	0	1
    1	1	0

     */
    //http://www.geeksforgeeks.org/add-two-numbers-without-using-arithmetic-operators/
    static int Add(int x,int y ) {

        while (y!=0) {
            // carry now contains common set bits of x and y
            int carry = x & y ;
            // Sum of bits of x and y where at least one of the bits is not set
            x=x^y;
            // Carry is shifted by one so that adding it to x gives the required sum
            y=carry<<1 ;
        }

        return x;
    }
}
