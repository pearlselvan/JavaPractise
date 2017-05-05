package CodingPractise.String;

/**
 * Created by muthuselvan on 5/2/17.
 * https://leetcode.com/articles/longest-common-prefix/#approach-4-binary-search
 * Complexity Analysis

   In the worst case we have n equal strings with length m

 Time complexity : O(S*log(n))O(S∗log(n)),
 where SS is the sum of all characters in all strings.
 The algorithm makes log(n)log(n) iterations,
 for each of them there are S = m*nS=m∗n comparisons,
 which gives in total O(S*log(n))O(S∗log(n)) time complexity.

 Space complexity : O(1)

 */
public class LongestCommonPrefixUsingBinarySearch {

    public static void main(String[] args) {

        String[] data = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("LCP : " +longestCommonPrefix(data));

    }


    private static String longestCommonPrefix(String[] data) {
        if (data == null || data.length == 0 )
            return "";

        int min = Integer.MAX_VALUE;

        for(int d=0;d<data.length;d++)
            min=Math.min(min,data[d].length());

        System.out.println("Min :" +min);

        int low = 1 ;
        int high = min;

        while (low <=high) {
            int middle = (low+high) / 2 ;

            if (isCommonPrefix(data,middle)) {
                low=middle+1;

            } else {
                high=middle-1;

            }


        }




        return data[0].substring(0,(low+high)/2);
    }

    private static boolean isCommonPrefix(String[] data,int len) {
        String subString=data[0].substring(0,len);
        for (int i=0;i<data.length;i++)
            if (!data[i].startsWith(subString))
                return false;
        return true;
    }
}
