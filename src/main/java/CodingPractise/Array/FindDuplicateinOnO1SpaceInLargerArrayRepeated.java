package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/16/17.
 *
 * traverse the list for i= 0 to n-1 elements
    {
    check for sign of A[abs(A[i])] ;
    if positive then
    make it negative by   A[abs(A[i])]=-A[abs(A[i])];
    else  // i.e., A[abs(A[i])] is negative
    this   element (ith element of list) is a repetition
 }


 Method 1 : http://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
 Method 2 : http://www.geeksforgeeks.org/duplicates-array-using-o1-extra-space-set-2/



 Another Practical probelam would be : BOOK : 406
 ====================================
 FIND DUPLICATE IN ARRAY 1 TO N , WHERE N IS 32,000 .
 THE ARRAY MAY HAVE DUPLICATE YOU DON'T KNOW N
 WITH ONLY 4 KB MEMORY AVAIABLE

 NOTE : USE JAVA BitSet




 *
 */
public class FindDuplicateinOnO1SpaceInLargerArrayRepeated {

    public static void main(String[] args) {

    }
}
