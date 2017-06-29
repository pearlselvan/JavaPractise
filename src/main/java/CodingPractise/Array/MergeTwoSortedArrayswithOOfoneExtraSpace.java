package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/6/17.
 * http://www.geeksforgeeks.org/merge-two-sorted-arrays-o1-extra-space/
 *
 Input: ar1[] = {10};
 ar2[] = {2, 3};

 Output: ar1[] = {2}
 ar2[] = {3, 10}
----------Example 2 -----------
 Input: ar1[] = {1, 5, 9, 10, 15, 20};
 ar2[] = {2, 3, 8, 13};

 Output: ar1[] = {1, 2, 3, 5, 8, 9}
 ar2[] = {10, 13, 15, 20}

 The idea is to begin from last element of ar2[] and search it in ar1[].
 If there is a greater element in ar1[], then we move last element of ar1[] to ar2[].
 To keep ar1[] and ar2[] sorted, we need to place last element of ar2[] at correct place in ar1[]. We can use Insertion Sort type of insertion for this. Below is algorithm:

 1) Iterate through every element of ar2[] starting from last
 element. Do following for every element ar2[i]
 a) Store last element of ar1[i]: last = ar1[i]
 b) Loop from last element of ar1[] while element ar1[j] is
 smaller than ar2[i].
 ar1[j+1] = ar1[j] // Move element one position ahead
 j--
 c) If any element of ar1[] was moved or (j != m-1)
 ar1[j+1] = ar2[i]
 ar2[i] = last

 *
 *
 */
public class MergeTwoSortedArrayswithOOfoneExtraSpace {
}
