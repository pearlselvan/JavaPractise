package CodingPractise;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.HashSet;

class SumNumber {
    public SumNumber() {

    }

    public static void main(String[] args) {
        System.out.println("Starting ..");
        int[] data = {1,2,4,5,6,8,9};
        int target = 14 ;
        // System.out.println(combintionSum(data,target));
        ArrayList result = combintionSum(data,target);
        // LinkedHashSet<Integer> duplicateRemoved = new LinkedHashSet(result);
        // duplicateRemoved.addAll(result);
        // result.clear();
        // result.addAll(duplicateRemoved);
        HashSet set = new HashSet(result);
        ArrayList noduplicates = new ArrayList(set);
        System.out.println("Result" +noduplicates);
        // System.out.println("Result : " +result);
    }

    public static ArrayList<ArrayList<Integer>> combintionSum(int[] data,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (data == null || data.length == 0 ) return result ; {
            ArrayList<Integer> current = new ArrayList<Integer>() ;
            Arrays.sort(data);
            combinationSum(data,target,0,current,result);
            System.out.println("Recursion completed  2 ..");
//             List duplicateRemoved = result.stream().distinct().collect(Collectors.toList());
            // System.out.println("Duplicate removed " +duplicateRemoved);
            // Set duplicateRemoved = new LinkedHashSet(result);
            // result.clear();
            // result.addAll(duplicateRemoved);
            return result ;
        }
    }

    public static void combinationSum(int[] data,int target,int j,ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result ) {
        if (target == 0 ) {
            ArrayList<Integer> temp = new ArrayList<Integer>(curr);
            result.add(temp); // Adding the sum if target is zero , this is exit call for recursion
            System.out.println("Target -  " +target+ " - result  -  " +result + " - temp - " +temp);
            return ;
        } // end if

        for (int i=j;i<data.length;i++) {
            System.out.println("Target : " +target);
            System.out.println("i ->   " +i);
            System.out.println("data[i] ->  " +data[i]);
            if (target < data[i])
                return ;
            curr.add(data[i]);
            System.out.println("i - " +i);
            System.out.println("Current " +curr);
            System.out.println("data[i] " +data[i]);

            combinationSum(data,target-data[i],i,curr,result); // recursion to check the target
            System.out.println("Recursion completed .......");
            curr.remove(curr.size()-1);
            System.out.println("Current size : " +curr.size());
            System.out.println("After removed curr - " +curr);
        }
    } //end of the function call
} //class
