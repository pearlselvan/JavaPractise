package CodingPractise;

import java.util.Arrays;

/**
 * Created by muthuselvan on 3/6/17.
 * sol 1 :
 * sol 2 : http://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/
 */
public class IntersectionOfUnsortedArray {

    public static void main(String[] args) {
//        int[] array1 = {1, 3, 4, 5, 7};
//        int[] array2 = {2, 3, 5, 6};


        int[] array1 = {1,5,8};
        int[] array2 = {2,5,6};

//        int[] array1 = {4, 3, 5, 7};
//        int[] array2 = {2,9,5, 4};
//        Arrays.sort(array1);  // if the array not sorted then please sort first
//        Arrays.sort(array2);  // if the array not sorted then please sort first
//        Intersection as {3, 5} mean matching

        new IntersectionOfUnsortedArray().printIntersection(array1,array2);

        System.exit(0);

        /* Below is worst case impl */

        int[] result = new int[array1.length];
        for (int i=0;i<array1.length;i++) {
            for (int j=0;j<array2.length;j++) {
                if (array1[i] == array2[j]) {
                    result[j] = array1[i];
                }
            }
        } // end for loop

        for (int p=0;p<array1.length;p++) {
            System.out.println(result[p]);
        }
    }

    //Time Complexity: O(m+n)
    public void printIntersection(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;

        while (i < m && j < n)
        {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else /* if arr1[i] == arr2[j] */
            {
                System.out.println(arr2[j++]);
                i++;
            }
        }

    }
}
