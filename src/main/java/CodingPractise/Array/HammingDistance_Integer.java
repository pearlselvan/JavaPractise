package CodingPractise.Array;

/**
 * Created by muthuselvan on 9/4/17.

 https://leetcode.com/problems/hamming-distance/description/

 Example:
 --------
 Input: x = 1, y = 4

 Output: 2

 Explanation:
 1   (0 0 0 1)
 4   (0 1 0 0)
 ↑   ↑

 The above arrows point to positions where the corresponding bits are different.

 Solution :
 -----------
 https://leetcode.com/problems/hamming-distance/discuss/



 */
public class HammingDistance_Integer {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));

    }

    //Yes, XOR! Also, do not forget there is a decent function Java provided: Integer.bitCount() ~~~
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
