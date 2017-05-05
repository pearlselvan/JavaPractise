package CodingPractise;

/**
 * Created by muthuselvan on 5/2/17.
 * 	Given sorted array of unique elements. Find an element which is having value equal to its index.
 {-4,-2,2,4,6,9}
 Ans: 2

 http://www.geeksforgeeks.org/find-a-fixed-point-in-a-given-array/

 or the question is : Find a Fixed Point in a given array
 */
public class FindEqualIndex {
    public static void main(String[] args) {
        int[] data =  {-4,-2,2,4,6,9} ;
        System.out.println("Point is " +linearSearch(data));
        System.out.println("Point is using binary search " +binarySearch(data,0,data.length-1));
    }

    //Time Complexity: O(n)
    public static int linearSearch(int[] data) {
        int i;
        for (i=0;i<data.length;i++) {
            if (data[i] == i ) {
                System.out.println("Index : " +i + ": data : " +data[i]);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] data,int low,int high) {
        if (low <= high) {
            int mid = (low + high) /2 ;
            if (data[mid] == mid) return mid;
//assume that here mid is key so if key is greater then we need search seacon half
            if (mid > data[mid]) {
                return binarySearch(data, (mid+1), high);
            } else {
                return binarySearch(data, low, (mid-1));
            }
        }
        return -1;
    }
}
