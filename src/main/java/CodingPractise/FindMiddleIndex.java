package CodingPractise;

/**
 * Created by muthuselvan on 2/8/17.
 */
public class FindMiddleIndex {
    public static void main(String[] args) throws Exception{
        Integer[] myInput = {4,4,1,5,4};
        System.out.println("Middle Index is : " +findMiddle(myInput));
    }

    public static int findMiddle(Integer[] input) throws Exception {
         int startIndex = 0 ;
         int endIndex = input.length -1 ;
         int rightSum = 0 ;
         int leftSum = 0 ;

         while (true) {
             if (leftSum > rightSum) {
                 rightSum+=input[endIndex--];
             } else {
                 leftSum+=input[startIndex++];
             }

             if (startIndex > endIndex) {
                 if (leftSum == rightSum) {
                     break;
                 } else {
                     throw new Exception("Array is not proper");
                 }
             }
         }
        return endIndex ;
    }
}
