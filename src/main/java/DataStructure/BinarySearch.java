package DataStructure;

/**
 * Created by muthuselvan on 2/6/17.
 *
 *
 * Big O Notation :
 * Worst case : o(log n)
 *
 * Binary Search (Worst Case)
 Number of elements Number of Comparisons
 15                  4
 31                  5
 63                  6
 127                 7
 255                 8
 511                 9
 1023               10
 1 million          20
 *
 */
public class BinarySearch {


    public static void main(String[] args) {

        int[] input = {10,20,30,31,35,50};
        int key = 20 ;
        System.out.println(binarySearch(input,key));

//        int start = 0 ;
//        int end = input.length -1 ;

//        while (start <= end ) {
//            System.out.println(start);
//            start++;
//        }


    }
//    public static  boolean binarySearchElement(int[] input,int key) {
//
//        int start = 0 ;
//        int end = input.length -1 ;
//        while (start <= end) {
//            int middle = input.length/2 ;
//
//            System.out.println("Middle : " +middle);
//
//            if (input[middle]  == key) {
//                return true ;
//            }
//            if (input[middle] > key) {
//                start = middle +1;
//            }
//
//            if ( input[middle] > key) {
//                end = middle -1 ;
//            }
//        }
//        return false ;
//
//
//    }



    public static boolean binarySearch(int[] data , int key)
    {
        int low = 0;
        int size = data.length ;
        int high = size - 1;

        while(high >= low) {
            int middle = (low + high) / 2;
            if(data[middle] == key) {
                return true;
            }
            if(data[middle] < key) {
                low = middle + 1;
            }
            if(data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }




}




