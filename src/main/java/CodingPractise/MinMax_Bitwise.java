package CodingPractise;

/**
 * Created by muthuselvan on 6/5/17.
 * TRUTH Table : if bit is different then return 1
 * INPUT	OUTPUT
    A	B	A XOR B
    0	0	0
    0	1	1  =========>
    1	0	1  =========>
    1	1	0



 */
public class MinMax_Bitwise {

    public static void main(String[] args) {
        System.out.println(method1(10,7));
        System.out.println(getMax(10,7));
        System.out.println(smallestUsingDivision(11,7));

    }

    // Using Terniary opearator
    public static int method1(int x , int y) {
        return (x < y ) ? x : y ;

    }

//    public static int getMinXOR(int x , int y) {
//        return y ^ ((x ^ y) & -(x < y));
//
//    }

    //https://souvikpal.wordpress.com/2013/02/10/findmax-without-if-else/
    static int getMax(int a, int b) {
        int c = a - b;
        int k = (c >> 31) & 0x1;
        int max = a - k * c;
        return max;
    }


    static int smallestUsingDivision(int x , int y) {
//        System.out.println("X/Y-> " +x/y);

        if (y/x !=0) {
            return x;
        }


        return y;
    }



}
