package CodingPractise.Array;

import java.util.Arrays;

/**
 * Created by muthuselvan on 8/31/17.
 * I/P = [11, 0, 0, 8 ,5]
 * O/P = [11,8,5,0,0]
 *
 */
public class MoveAllZeroAtEnd {
    public static void main(String[] args) {
        int[] data = {0, 0, 0, 8, 5};
        moveZero(data);
        moveZeroWitnAddionalSpace(data);


    }


    public static void moveZeroWitnAddionalSpace(int[] data) {
        int[] result = new int[data.length];
        for (int  i=0;i<data.length;i++) {
            if (data[i] == 0) {
                data[i]=data[i++];
            }
        }
        System.out.println("Array " + Arrays.toString(data));


    }

    public static void moveZero(int[] data) {
        int zero_count= 0 ;
        int length = data.length;
        int index=0;
        while(index<length) {
            if (data[index] == 0 && zero_count < length-(index+1)) { //swap
                data[index] = data[length-(zero_count +1)];
                data[length-(zero_count +1 )] = 0;
                zero_count+=1;
            } // End if
            index++;
        } // End while

        System.out.println(Arrays.toString(data));

    }




}
