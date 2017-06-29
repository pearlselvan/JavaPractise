package CodingPractise;

/**
 * Created by muthuselvan on 3/12/17.
 * http://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-array-ii-java/
 */
public class RemoveDuplicateArray {

    public static void main(String[] args) {
//        int[] data = {1,1,3,4};
        int[] data = {1,1,3,3,4,5,6,7,7};
        printArray(remoreDuplicate(data));



    }

    public static int[] remoreDuplicate(int[] in) {
        int i=0;
        for (int j=1;j<=in.length-1;j++) {
            if (in[i] != in[j]) {
                i++;
                in[i] = in[j];
            }

        }
        return in;
    }

    public static void printArray(int[] data) {
        for (int i=0;i<data.length-1;i++) {
            System.out.println("["+data[i]+"]");
        }

    }

}
