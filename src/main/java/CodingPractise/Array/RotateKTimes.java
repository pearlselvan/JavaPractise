package CodingPractise.Array;

/**
 * Created by muthuselvan on 2/9/17.
 *
 *
 *Problem:
 N=6 and k=2
 If Arr[] = {1, 2, 3, 4, 5, 6} and k=2
 then rotated array will be  {5, 6, 1, 2,  3,  4}

 * Algorithm for this approach works as below:
   1.Reverse whole array.
   2.Reverse first k elements
   3.Reverse rest n-k elements.
 For example:
 let's say Array is {1,2,3,4,5,6,7,8}
 You want to rotate by k position.
 It will work as below:
 You rotate the whole array. So array became: {8,7,6,5,4,3,2,1}
 Reverse first k elements, so array became : {7,8,6,5,4,3,2,1}
 Reverse rest of elements, so array became  : {7,8,1,2,3,4,5,6}

 Time complexity: o(n)
 Space complexity: o(1)

 >>in above approach reverse is common
 *
 * http://www.java2blog.com/2017/02/rotate-array-by-k-positions.html?m=1
 * http://www.geeksforgeeks.org/array-rotation/
 */
public class RotateKTimes {
    public RotateKTimes() {

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        rotate(arr); //This is the NOT optimized approach.

//         optimized approach.
        reverseOptimized(arr,2);
    }

    /*
    This is rotate one by one
    Time complexity: o(n*k)
    Where n is number of elements and k denotes position shift.
    Space complexity: o(1)
     */
    public static int[]  rotate(int[] input) {
        int rotateTimes= 2;
        printArrays(input);
        for (int rotateStart=0;rotateStart<=rotateTimes;rotateStart++) {
            for(int i=input.length-1;i>0;i--) {
                // move each number by 1 place
                int temp = input[i];
                input[i] = input[i-1];
                input[i-1] = temp;
//                System.out.print(input[i]+",");
            }
            printArrays(input);
            System.out.println();
        }
        return input;
    }


    /*
    Time complexity: o(n)
    Space complexity: o(1)
     */

    public static int[] reverseOptimized(int[] myArray,int rotateTimes) {
        int end = myArray.length ;
        if (rotateTimes > end)
        rotateTimes = rotateTimes % end ;
        myArray=reverse(myArray,0,end-1);
        myArray=reverse(myArray,0,rotateTimes-1);
        myArray=reverse(myArray,rotateTimes,end-1);
        return myArray;
    }

    public static int[] reverse (int[] myArray,int start,int end) {

        while(start < end) {
            int temp = myArray[start];
            myArray[start] = myArray[end];
            myArray[end] = temp ;
            start++;
            end --;

        }

        printArrays(myArray);

        return myArray;

    }

    public static void printArrays(int[] arr) {
               for(int i=0;i<=arr.length-1;i++) {
                System.out.print(arr[i]+",");
                }
    }


}
