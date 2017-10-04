package CodingPractise.Array;

/**
 * Created by muthuselvan on 9/22/17.
 * http://www.geeksforgeeks.org/find-second-largest-element-array/
 */
public class SecondMaxInArray {

    public static void main(String[] args) {
        System.out.println(getSecondMax(new int[]{12, 35, 1, 10, 34, 1}));
//        System.out.println(getSecondMax(new int[]{10,2,55,72,15,34}));

    }

    static int getSecondMax(int[] data) {
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i=0;i<data.length;i++) {
            if (first_max < data[i]) {
                second_max = first_max ;
                first_max = data[i];
            }
         else if (data[i] > second_max && data[i] != first_max)
                second_max = data[i];
        }
        return second_max;

    }




}
