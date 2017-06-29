package CodingPractise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by muthuselvan on 6/20/17.
 *
 * Generate n times random number with max limit and sort that number
 * Example , if n = 6 with max = 9 then
 * it should 6 random number between 0 to 9 then sort that 6 numbers
 *
 */
public class GenerateRandomNumberAndSort {

    public static void main(String[] args) {

        int ar[] = new int[6];
        Random random = new Random();
        for (int i=0;i<=5;i++) {
            int ran= random.nextInt(9);
            ar[i] = ran;
            System.out.println(i +":"+ar[i]);
        }
        Arrays.sort(ar);
        printArray(ar);


//        generateRandomInteger(6);
//        generateRandomIntegerUsingArray(6);

    }


    private static void printArray(int[] in) {

        for (int i=0;i<in.length;i++) {
            System.out.print(in[i]);

        }

    }


    private static int[] generateRandomIntegerUsingArray(int num) {

        int[] results = new int[num];
        Random random = new Random();
        for (int i=0;i<=num;i++) {
            Arrays.fill(results,0,num,random.nextInt(9));

        }

        for (int i=0;i<=num;i++) {
            System.out.println("Array" +results[i]);

        }

        return results;

    }



    private static ArrayList<Integer> generateRandomInteger(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i=0;i<=num;i++) {
            arrayList.add(random.nextInt(9));
        }
        Collections.sort(arrayList);

        for (int alist:arrayList) {
            System.out.println(alist);
        }
        return arrayList;
    }


}


