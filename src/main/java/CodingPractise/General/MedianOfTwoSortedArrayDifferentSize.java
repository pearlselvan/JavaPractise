package CodingPractise.General;

/**
 * Created by muthuselvan on 9/4/17.
 *
 * BELOW JAVA CODE : O(log(k)). solution with explanation)
 * https://www.programcreek.com/2012/12/leetcode-median-of-two-sorted-arrays-java/
 *
 *
 * Solution 1:
 * This problem can be converted to the problem
 * of finding kth element, k is (A's length + B' Length)/2.
 *
 *
 *
 *
 *
 * O(log(min(m,n)) solution with explanation
 * https://leetcode.com/problems/median-of-two-sorted-arrays/discuss/
 *
 * Time Complexity: O(LogM + LogN) :
 * http://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/
 *
    PLEAES PLEASE PLEASE :
 *  https://www.youtube.com/watch?v=MHNTl_NvOj0
 *
 * if n==2 that Array 1 has 2 element and Array 2 has elements
 *
 * Example :
 *  A1 = {a1,a2}
 *  B1 = {b1,b2}
 *
 *  so sorted array looks like :
 *  first step  : min(a1,b1) , ? , ? max(a2,b2)
 *  final step (to fill question mark) :  min(a1,b1) , { max(a1,b1) , min(a1,b2) } , max(a2,b2}
 *                                                         | why this is max because this element will be which is not in first index
 *
 *   MEDIAN : max(a1,b1) + min(a2,b2) / 2
 *
 *   if n > 2
 *   A1= {a1,a2,m1,a4,a5}
 *   B1= {b1,b2,m2,b4,b5}
 *
 *   if (m1==m2)
 *   sorted (A1+B1) looks like :
 *   {a1,b1,a2,b2} m1 , m2 {a4,b4,a5,b5}
 *
 * if m1==m2 :
   -----------
 *      ..then median m1 or m2 :
 *
 * A1={1,2,3,4,5}
 * B1={6,7,8,9,10}
 *
 * if m1 < m2 :
 * -----------
 * then sorted array will be : sort (a+b) :
 * {a1,a2 ..element from b} , M1 {..} ,M2 , {b4,b5}
 *                                | This could be some element place M1 and M2
 *
 * CASE 1 for m1 < m2 :
 * --------------------
 * a1, a2 is left side because its lesser then M1

 * CASE 2 for m1 < m2 :
 --------------------
 * b1, ,b2 is right side because its lesser then M2
 *
 * * CASE 3 for m1 < m2 :
 ------------------------
 * a1 , b2 will be less then m2 but not sure whether < ,  > to m1
 *
 * * CASE 4 for m1 < m2 :
 -----------------------
 * b1 , b2 will come before m1 or after m1
 *
 * CASE 5 : SIZE :
 ------------------
  the size would be 4 ( if array A size is 5 ) so N-1 before M1
   0 to N-1 : { a1 , a2 element from b } M1 {..} M2 { b4 , b5 element from a}

 How to search ?
 ---------------
 so we can narrow down the searching the median using binary search

 which portion of array will be eliminated for searching ? ( if m1 < m2 )
 ----------------------------------------------------------------------
 BY modifying start and end index ?
 ----------------------------------
 so remove a1 , a2 from array A and remove b4 , b5 from array B .
 and remove b4 , b5 from array B  so modify start index


 A : a1, a2 , M1 , a4 , a5 ---> Eliminate a1, a2 so start index second half , from M1
 B : b1 , b2 , M2 m b4 ,b5 ---> Eliminate b4,b5 so end index would till M2


 ***M1 > M2 .. similary to above
 * ---------




 *
 *
 * CASE 4 for m1 < m2 :
 * --------------------
 * b1 , b2 will come before m1 or after m1
 *
 *

 *
 * if m1 > m2 :
 *
 */





public class MedianOfTwoSortedArrayDifferentSize {

    public static void main(String[] args) {
//        int[] data1= {1,3};
//        int[] data2= {2,4};


        int[] data1= {1,3,5};
        int[] data2= {12,14,18};

        //1 3 5 12 14,18

        System.out.println(findMedianSortedArrays(data1,data2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length+nums2.length;
        System.out.println("Length : " +total); // find array is even
        if(total%2==0){
            System.out.println("Array is even ");
            return (findKth(total/2+1, nums1, nums2, 0, 0)+findKth(total/2, nums1, nums2, 0, 0))/2.0;
        }else{
            System.out.println("Array is Odd");
            return findKth(total/2+1, nums1, nums2, 0, 0);
        }
    }

    public static int findKth(int k, int[] nums1, int[] nums2, int s1, int s2){
        System.out.println("K is  " +k+ " for length ");
        if(s1>=nums1.length) {
            System.out.println("S1 : " +s1 + " num1.length : " +nums1.length);
            return nums2[s2 + k - 1];
        }

        if(s2>=nums2.length) {
            System.out.println("S2 : " + s2 + " num1.length : " + nums1.length);
            return nums1[s1 + k - 1];
        }

        if(k==1)
            return Math.min(nums1[s1], nums2[s2]);

        int m1 = s1+k/2-1;
        int m2 = s2+k/2-1;

        int mid1 = m1<nums1.length?nums1[m1]:Integer.MAX_VALUE;
        int mid2 = m2<nums2.length?nums2[m2]:Integer.MAX_VALUE;

        if(mid1<mid2){
            return findKth(k-k/2, nums1, nums2, m1+1, s2); // Recursion is binary search by discarding element
        }else{
            return findKth(k-k/2, nums1, nums2, s1, m2+1); // Recursion
        }
    }



}
