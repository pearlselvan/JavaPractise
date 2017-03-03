package CodingPractise;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by muthuselvan on 3/1/17.
 */
public class FindMaxTwo {

    public static void main(String[] args) {
        System.out.println( 2 >> 4);

        first2Max(new int[] {90,20,110,20,500});

        first3Max(new int[] {1,2,3,4,-5});

        first2MaxEfficientSolution(new int[] {1, 4, 3, 6, 7, 0},2);

    }

    public static void first2Max(int[] nums) {



        int firstMAX = 0 ;
        int secondMAX = 0 ;

        for (int data : nums) {

            if (data > firstMAX) {
                secondMAX = firstMAX;
                firstMAX = data;
            } else  if (data > secondMAX ){
                secondMAX = data;
            }

        }
        System.out.println("First Max : " +firstMAX);
        System.out.println("Second Max : " +secondMAX);

    }



    public static void first3Max(int[] datain) {
        if (datain.length < 2) {
            System.out.println("Lest then 2");
            return;
        }
//        printArray(data);
        Arrays.sort(datain);
        printArray(datain);
        int first3ProdcutMax = 1;
        for (int i = datain.length - 1; i > 1; i--) {
//            System.out.println("multiplying : " +datain[i]);
            first3ProdcutMax *= datain[i];
        }
        System.out.println("> First Max Three  : " + first3ProdcutMax);
    }

    /*
    The idea is to traverse the input array and keep track of following four values.
    a) Maximum positive value
    b) Second maximum positive value
    c) Maximum negative value i.e., a negative value with maximum absolute value
    d) Second maximum negative value.
    http://www.geeksforgeeks.org/return-a-pair-with-maximum-product-in-array-of-integers/
    Time complexity: O(n)
    Auxiliary Space: O(1)
     */
    public static void first2MaxEfficientSolution(int[] data,int n) {
        System.out.println("Effiencent way ...");
        // Iniitialize maximum and second maximum
        int positiveFirstMax = Integer.MAX_VALUE ;
        int positiveSecondMax = Integer.MIN_VALUE ;

        // Iniitialize maximum and second maximum
        int negativeFirstMax = Integer.MAX_VALUE ;
        int negativeSecondMax = Integer.MIN_VALUE ;

        //Traverse Array
        for (int i=0;i<n;i++) {
            // Update maximum and second maximum if needed
            if (data[i] > positiveFirstMax)
            {
                positiveSecondMax = positiveFirstMax;
                positiveFirstMax = data[i];
            }
            else if (data[i] > positiveSecondMax)
                positiveSecondMax = data[i];
            // Update minimum and second minimum if needed
            if (data[i] < 0 && Math.abs(data[i]) > Math.abs(negativeFirstMax))
            {
                negativeSecondMax = negativeFirstMax;
                negativeFirstMax = data[i];
            }
            else if(data[i] < 0 && Math.abs(data[i]) > Math.abs(negativeSecondMax))
                negativeSecondMax = data[i];
        }

        if (negativeFirstMax*negativeSecondMax > positiveFirstMax*positiveSecondMax) {
            System.out.println("Max product pair is {" +negativeFirstMax+ ":" +negativeSecondMax);
        } else {
            System.out.println("Max product pair is {" +positiveFirstMax+ ":" +positiveSecondMax);
        }

        }




    public static void printArray(int[] data) {
        for (int i=0;i<data.length;i++) {
            System.out.print("["+data[i]+"]");
        }

    }

}
