package CodingPractise;

import java.util.Arrays;

/**
 * Created by muthuselvan on 3/31/17.
 */
public class GreatestDifference {

    /*
    For example, if our input is [5,8,6,1], the greatest difference we can get is 8-1, which is 7. So we should return 7.
     */

    public static void main(String[] args) {
        int[] array = {5,8,6,1};
        System.out.println("Max 1: " +new GreatestDifference().greatestDiff(array));
        System.out.println("Max  2: " +new GreatestDifference().greatestDiffBetter(array));
        System.out.println("Max  3: " +new GreatestDifference().greatestDiffBest(array));

    }

    //“order of n²” or O(n²)!
    public int greatestDiff(int[] data) {
        int currentMax=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                int max = data[j] - data[i] ;

                if (max > currentMax) {
                currentMax = max;
                }



            }
//            System.out.println("Max : " +currentMax);

        }
        return currentMax;
    }
  //It turns out that in general sorting costs O(n * log2(n)) time
    //0(n)
    public int greatestDiffBetter(int[] data) {
        Arrays.sort(data);
        int diff = data[data.length-1] - data[0];
        return diff;

    }


    public int greatestDiffBest(int[] data) {
        int max=data[0];
        int min = data[0] ;

        for (int i=1;i<data.length;i++) {

            if (max < data[i]) {
                max= data[i];
            } else if (min > data[i]) {
                min=data[i];
            }
        }
        System.out.println("Max : " +max);
        System.out.println("Min : " +min);

      return max-min;

    }




    }

