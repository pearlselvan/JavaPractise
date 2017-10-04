package CodingPractise.Array;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by muthuselvan on 9/1/17.
 * http://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/
 *
 * Using with auxilary array :
 * ----------------------------
 *
 * Using without auxilary array :
 * ----------------------------
 *
 * Expected time complexity O(n) and auxiliary space O(1)
 *
 *
 *
 */
public class ReOrderArrayAccordingtotheIndex {

    static int[] arr = new int[]{50, 40, 70, 60, 90};
    static int[] index = new int[]{3,  0,  4,  1,  2}; //data[1],data[0],data[2]
    public static void main(String[] args) {


        System.out.println("Before");
        System.out.println("Reordered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Modified Index array is:");
        System.out.println(Arrays.toString(index));


//        reorderObjectAccordingToIndex(arr,index);
        reorder();
        System.out.println("==== After ======");
        //100 200 10

        System.out.println("Reordered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Modified Index array is:");
        System.out.println(Arrays.toString(index));



    }

    public static void reorderObjectAccordingToIndex(Integer[] data,Integer[] index) {




    }

    static void reorder()
    {
        // Fix all elements one by one
        for (int i=0; i<arr.length; i++)
        {
            // While index[i] and arr[i] are not fixed
            while (index[i] != i)
            {
                // Store values of the target (or correct)
                // position before placing arr[i] there
                int  oldTargetI  = index[index[i]];
                char oldTargetE  = (char)arr[index[i]];

                // Place arr[i] at its target (or correct)
                // position. Also copy corrected index for
                // new position
                arr[index[i]] = arr[i];
                index[index[i]] = index[i];

                // Copy old target values to arr[i] and
                // index[i]
                index[i] = oldTargetI;
                arr[i]   = oldTargetE;
            }
        }
    }








}
