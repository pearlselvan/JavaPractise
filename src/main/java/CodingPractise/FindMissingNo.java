package CodingPractise;

/**
 * Created by muthuselvan on 2/7/17.
 */
public class FindMissingNo {

    public static void main(String[] args) {


        // if you know max of array element in array
        int[] a = {1,2,4,5};
        int sumOfNnumbers = sumOfN(maxinArray(a));
        //Step 2
        int sumOfElements = sumOfElements(a);
        int missingNumber = sumOfNnumbers - sumOfElements;
        System.out.println("Missing Number is = "+missingNumber);
        System.out.println("Max : " +maxinArray(a));


    }

    public static int maxinArray(int[] a) {
        int max = a[0];

        for (int i=0;i<=a.length-1;i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max : " +max);
        return max;

    }

    public static int sumOfN(int n) {
        int sum = (n * (n+1))/ 2;
        return sum;
    }

    static int sumOfElements(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        return sum;
    }

}


