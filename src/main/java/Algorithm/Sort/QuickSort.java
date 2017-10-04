package Algorithm.Sort;

/**
 * Created by muthuselvan on 2/7/17.
 */

/*
Ω(n log(n))  - Ave case
o(n^2) - Worst case

If the array contains only one element or zero
elements than the array is sorted.

If the array contains more than one element than:

1. Select an element from the array.
This element is called the "pivot element".
 For example select the element in the middle of the array.

2 .All elements which are smaller then the pivot element are placed
in one array and all elements which are larger are placed
in another array.

3. Sort both arrays by recursivel   y applying Quicksort to them.

4. Combine the arrays.

Quicksort can be implemented to sort "in-place".
This means that the sorting takes place in the array and that no additional
array needs to be created
 */
public class QuickSort {
    private int[] numbers;
    private int number;

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] input = {10,2,5,12};
        quickSort.sort(input);
        quickSort.printResult(input);
    }


    private void printResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("->"+numbers[i]);
        }

    }

    public void sort(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];
        System.out.println("Pivot Index : " +pivot);
        System.out.println("Initial i " +i);
        System.out.println("Initial j " +j);


        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j

            System.out.println("After pivot check i " +i);
            System.out.println("After pivot checj j " +j);

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}




