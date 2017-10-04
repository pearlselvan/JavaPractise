package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/21/17.
 * http://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/
 *
 * Method 1 (Basic)
 *
 * Time Complexity: O(n*n)
 Auxiliary Space: O(1)

 Method 2 (Use Count array)
 Time Complexity: O(n)
 Auxiliary Space: O(n)

 Method 3 (Make two equations)

 *
 *
 */
public class TwoRepeatingInArray_Duplicate {

    public static void main(String[] args) {

        TwoRepeatingInArray_Duplicate repeat = new TwoRepeatingInArray_Duplicate();
        int arr[] = {4, 2, 4, 5, 2, 3, 1,9,100,100,-1,-1};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
    }








    void printRepeating(int arr[], int size)
    {
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }
}
