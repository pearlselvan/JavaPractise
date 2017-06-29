package Algorithm.Sort;

/**
 * Created by muthuselvan on 2/6/17.
 */
// Understnding : http://me.dt.in.th/page/Quicksort/
// Imple : http://www.java2novice.com/java-sorting-algorithms/quick-sort/

    /*
    Big : o(nlogn) -Avg case
    o(n^2) - Worst case

Quicksort can be implemented to sort "in-place".
This means that the sorting takes place in the array
and that no additional array needs to be created.

     */

    /*
    Steps :

1) Choose an element, called pivot, from the list.
 Generally pivot can be the middle index element.
2)Reorder the list so that all elements with values
 less than the pivot come before the pivot,
  while all elements with values greater than the pivot come after it
  (equal values can go either way). -- This is called partioning

  After this partitioning,

  the pivot is in its final position.
  This is called the partition operation.
3) Recursively apply the above steps to the sub-list of elements
 with smaller values and separately the sub-list
  of elements with greater values.

     */

    /*
     Example 1 :

Input :
[100] [34] [12] [22]
--Pivot  : 34
[22] [34] [12] [100]
[22] [12] [34] [100]
--Pivot  : 22
[12] [22] [34] [100]
 ---------Pivot  : 34
[12] [22] [34] [100]
SORTED :
[12] [22] [34] [100]
----

 Example 2 :
 INPUT :
 [5] [4] [10] [7] [8] [9] [2]
 Pivot  : 7
 [5] [4] [2] [7] [8] [9] [10]
 Pivot  : 4
 [2] [4] [5] [7] [8] [9] [10]
 Pivot  : 9
 [2] [4] [5] [7] [8] [9] [10]

     */

public class QuickSortExplained {

    static int[] sortedArray ;
    int length ;

    public static void main(String[] args) {

        int[] data = {5,4,10,7,8,9,2};
        QuickSortExplained quickSortExplained = new QuickSortExplained();

        printarray(data);

        quickSortExplained.sort(data);

        printarray(data);







    }

    public static void printarray(int[ ] data) {
        for (int in : data) {
            System.out.print("["+in+"] ");
        }

    }

    public void sort(int[] data) {

        if (data == null || data.length == 0 ) {
            return;
        }

        this.sortedArray = data ;
        this.length = data.length;
        partion(0,length-1);
    }


    public static void partion(int low,int high) {
        int left=low, right = high;
        int pivot = sortedArray[low + (high - low) /2 ];
        System.out.println("Pivot  : " +pivot);
        //Partionining : Divide the array in two list :  Left + Pivot + Right
        // Left : Less then Pivot
        // Right: Greater then Pivot
        while (left<=right) {
            //Left side move :
            // if the current value less then pivot then move the pointer of the current element
            // that is get the next element from the list
            while (sortedArray[left] < pivot) {
                left++ ;// if current from left side  < pivot then no need swap then move the pointer to check the next element
            }

            while (sortedArray[right] > pivot) {
                right--; // if the current from right side > pivot then no need swap then move the pointe to checn the next element
            }
          // if the above while condition not then what should i do ?
            // Yes swap the element so that left side will be lesser then pivot
            // greater will be right side of the pivot

            if (left<=right) {

                swap(left,right);
                left++;
                right--;
            }
            printarray(sortedArray);
            System.out.print("---------");
        } //End for outer loop
        //--------------- Partioning ends here -----------------
        // if you have the input array = [ 1 3,4,2,7 ] then end
        // if this partioning then your array will be changes as
        // 3 1 2  4 7 thats element lesser then pivot will be in left
        // right side will be greater then pivot

        // ok if partion done then my sortioning is done ? NO
        // need to apply partition logic on left side
        // and right side recursively

        //when my recursion will exit ? when
        if (low < right)
            partion(low,right);
        if (left < high)
            partion(left,high);
    }

    public static void swap(int leftindex , int rightindex) {
        int temp = sortedArray[leftindex];
        sortedArray[leftindex] = sortedArray[rightindex];
        sortedArray[rightindex] = temp;
    }



}
