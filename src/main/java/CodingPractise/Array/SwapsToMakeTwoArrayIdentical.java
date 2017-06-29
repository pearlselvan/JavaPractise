package CodingPractise.Array;

import java.util.HashMap;

/**
 * Created by muthuselvan on 6/7/17.
 * http://www.geeksforgeeks.org/minimum-swaps-to-make-two-array-identical/
 */
public class SwapsToMakeTwoArrayIdentical {

    public static void main(String[] args) {

     int[] array1 = {4,1,2,1,1,2};
     int[] array2 = {3,6,3,3};
     for (int n : findSumBruteForce(array1,array2))
     System.out.println(n);

    }
  //This code is from book
    static int[] findSumBruteForce(int[] array1,int[] array2) {
        int sum1 = 11;
        int sum2 = 15;

        for (int one : array1) {
            for (int two : array2) {
                int newsum1 = sum1 - one + two ;
                int newsum2 =  sum2 - two + one ;

                if (newsum1 == newsum2) {
                    int[] values = {one,two};
                    return values;
                }

            }
        }
      return null;
    }





}
