package Algorithm.Sort;

/**
 * Created by muthuselvan on 2/8/17.
 * https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm
 * Watch the video before : https://www.youtube.com/watch?v=TzeBrDU-JaY
 */

/*
o(nlog n ) - worst case running time
o(n) - space complexity (Required space depends upon
number of elemets to be sorted )
 */
public class MergerSort {

//    private int[] numbers;
    private int[] helper;

    private int number;
    static int[] numbers = {5,6,7,8,2};


    public static void main(String[] args) {



        MergerSort sorter = new MergerSort();
        sorter.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print("-" +numbers[i]);
        }

    }

    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {

            System.out.println("--------");

            System.out.println("High : " +high);
            System.out.println("low : " +low);
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            System.out.println("Middle : " +middle);
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low; // smallest un picked element from left side of the array
        int j = middle + 1; // smalled un picked element from  rgith side of the arrat
        int k = low; // for storing smallest element in destination to array to print
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) { // if left side has element to compare the move into destination array
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}
