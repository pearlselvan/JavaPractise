package CodingPractise.Array;

/**
 * Created by muthuselvan on 3/6/17.
 *
 * o(n+m)
 * =======
 * http://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
 *
 * Java Solution 1 - HashSet
 * ==========================
 https://www.programcreek.com/2015/05/leetcode-intersection-of-two-arrays-java/
 Time = O(n).
 Space = O(n).

 Java Solution 2 - Binary Search
 ===============================

 Time = O(nlog(n)).
 Space = O(n).



 */
public class IntersectionOfUnsortedArray {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5, 7};
        int[] array2 = {2, 3, 5, 6};


//        int[] array1 = {1,5,8};
//        int[] array2 = {2,5,6};

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
