package CodingPractise.Array;

import java.util.ArrayList;

/**
 *
 * http://www.geeksforgeeks.org/power-set/
 * http://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/
 *
 * As per book
 * ----------
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2008.%20Recursion%20and%20Dynamic%20Programming/Q8_04_Power_Set/QuestionB.java
 *
 *Book Defination :
 * ===============
 * Total Subset : 2 Power N
 * Total Element  N * 2 Power N -1
 *
 *
 *
 * Created by muthuselvan on 8/27/17.
 * According to the book : 348 , Two approach
 *
 * Approach 1 :
 *
 *
 * Approach 2 :
 *
 *
 000	0
 001	1
 010	2
 011	3
 100	4
 101	5
 110	6
 111	7
 1000   8
 *
 */
public class PowerSet_Book_348 {

    public static void main(String[] args) {

//        char set[] = {'a'};
        char set[] = {'a', 'b', 'c'};
        printSubsets(set);


        /// Book Code :------------

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 2; i++) {
            list.add(i);
        }

        ArrayList<ArrayList<Integer>> subsets2 = getSubsets(list);
        System.out.println("Book Code " +subsets2.toString());




    }

    // Print all subsets of given set[]
    static void printSubsets(char set[])
    {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by obe
        System.out.print("Left :");
        System.out.println(1<<n);
        //1<<n is 8 because 2 power repeat the loop
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            // Print current subset

            for (int j = 0; j < n; j++)

                //If ith bit in counter is set :
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");

            System.out.println("}");
        }
    }



    //Book Code :
    public static ArrayList<Integer> convertIntToSet(int x, ArrayList<Integer> set) {
        ArrayList<Integer> subset = new ArrayList<Integer>();
        int index = 0;
        for (int k = x; k > 0; k >>= 1) {
            if ((k & 1) == 1) {
                subset.add(set.get(index));
            }
            index++;
        }

        subset.forEach(out-> System.out.println("Sub Set : " +out));

        return subset;
    }

    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
        int max = 1 << set.size(); /* Compute 2^n */
        for (int k = 0; k < max; k++) {
            ArrayList<Integer> subset = convertIntToSet(k, set);
            allsubsets.add(subset);
        }
        return allsubsets;
    }




}
