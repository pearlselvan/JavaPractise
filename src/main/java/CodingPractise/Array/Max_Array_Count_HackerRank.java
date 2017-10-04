package CodingPractise.Array;

/**
 * Created by muthuselvan on 9/21/17.
 */
public class Max_Array_Count_HackerRank {

    public static void main(String[] args) {

        int[] data = {12, 14, 18, 90 ,90 ,13, 90, 75 ,90 ,8 ,90 ,43};
        System.out.println("Max Count : " +getMaxCount(data));
        /*
        def birthdayCakeCandles(n, ar):
    # Complete this function
    max = 0
    count = 0
    for ele in ar:
        if ele > max:
            max = ele
            count = 1
        elif ele == max:
            count = count+ 1
    return count
         */
    }

    static int getMaxCount(int[] data) {
        int count = 0 ;
        int currentMax = data[0];
        for (int i=0;i<data.length;i++) {
            if (currentMax <= data[i]) {
                currentMax = data[i];
                count++;
            }

        }
        return count ;
    }
}
