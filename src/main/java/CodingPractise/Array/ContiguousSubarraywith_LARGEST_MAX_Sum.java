package CodingPractise.Array;

/**
 * Created by muthuselvan on 9/7/17.
 *
 *  O(N SQR) and O(N) :
 *
 * http://algorithms.tutorialhorizon.com/kadanes-algorithm-maximum-subarray-problem/
 */
public class ContiguousSubarraywith_LARGEST_MAX_Sum {
    public static void main(String[] args) {
//        int arrA[] = { 1, 2, -3, -4, 2, 7, -2, 3 };
//        int arrA[] = { 1, 2, 3, 4, 2, 7, -2, 3 };
        int arrA[] = {-2, -3, 4, -1, -2, 1, 5, -3}; // 4+(-1)+(-2)+1+5
        ContiguousSubarraywith_LARGEST_MAX_Sum i = new ContiguousSubarraywith_LARGEST_MAX_Sum();
        System.out.println("Maximum subarray is  " + i.kandane(arrA));
//        int arrB[] = { -2, -3, -4, -2, -7, -2, -3,-11 };
        int arrB[] = { 2,3,4,5,1,7,1 };
        System.out.println("Maximum Subarray when all elements are negative : " + i.KandaneModify(arrB));
    }
    public int kandane(int[] arrA) {
        int max_end_here = 0;
        int max_so_far = 0;
        for (int i = 0; i < arrA.length; i++) {
            max_end_here += arrA[i];
            if (max_end_here < 0) {
                max_end_here = 0;
            }
            if (max_so_far < max_end_here) {
                max_so_far = max_end_here;
            }
        }
        return max_so_far;
    }

//    / Below modification will allow the program to work even if all the
    // elements in the array are negative

    /*
start:
    max_so_far = a[0]
    max_ending_here = a[0]

loop i= 1 to n
  (i) max_end_here = Max(arrA[i], max_end_here+a[i]);
  (ii) max_so_far = Max(max_so_far,max_end_here);

return max_so_far
 */

    public int KandaneModify(int[] arrA) {
        int max_end_here = arrA[0];
        int max_so_far = arrA[0];
        for(int i=1;i<arrA.length;i++){
            System.out.println("i :" +i +"," +arrA[i]);
            max_end_here = Math.max(arrA[i], max_end_here+arrA[i]);
            max_so_far = Math.max(max_so_far,max_end_here);

            System.out.println("max_end_here :" +max_end_here);
            System.out.println("max_so_far :" +max_so_far);
        }
        return max_so_far;
    }

}
