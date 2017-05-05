package CodingPractise.String;

/**
 * Created by muthuselvan on 4/30/17.
 * http://www.geeksforgeeks.org/longest-common-prefix-set-1-word-by-word-matching/
 *
 * java impl : https://leetcode.com/articles/longest-common-prefix/#approach-4-binary-search
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {


        String[] data = {"apple", "ape", "april"};
        System.out.println(commonPrefix(data,data.length-1));
        System.out.println("-"+commonPrefixUsingMinStringlength(data));




    }
/*
Time Complexity : Since we are iterating through all the strings and for each string
we are iterating though each characters, so we can say that the time complexity is O(N M) where,
N = Number of strings
M = Length of the largest string string
//This is character by character
 */
    public static String commonPrefixUtil(String f1,String f2) {

        StringBuffer result = new StringBuffer();
        int n1=f1.length()-1;
        char[] str1 = f1.toCharArray();
        char[] str2 = f2.toCharArray();

        int n2 = f2.length() -1 ;
        for (int i=0, j=0; i<=n1-1&&j<=n2-1; i++,j++)
        {
            if (str1[i] != str2[j])
                break;
            result.append(str1[i]);

        }

        return result.toString();
    }


    public static int getMinLength(String[] data) {

        int min = data[0].length();

        for(int c=0;c<data.length-1;c++) {
            if (data[c].length() < min) {
                min=data[c].length();
            }
        }

        return min;
    }

    //Character by Character Matching)
    /*
    Algorithm: ( Character by character matching  :

1. Find minimum length String.
2 Iterate over array of String and if we find any mismatch with minimum length String,
 we break the loop and that index will give us longest common prefix of this array of String,

 http://www.geeksforgeeks.org/longest-common-prefix-set-2-character-by-character-matching/

 How is this algorithm better than the “Word by Word Matching” algorithm ?-


Suppose you have the input strings as- “geeksforgeeks”, “geeks”, “geek”, “geezer”, “x”.

Now there is no common prefix string of the above strings.
 By the “Word by Word Matching” algorithm discussed in Set 1,
  we come to the conclusion that there is no common prefix string by
   traversing all the strings. But if we use this algorithm,
   then in the first iteration itself we will come to know that
   there is no common prefix string, as we don’t go further to
    look for the second character of each strings.

This algorithm has a huge advantage when there are too many strings.

Time Complexity : Since we are iterating through all the characters of all
the strings, so we can say that the time complexity is O(N M) where,


     */
    public static String commonPrefixUsingMinStringlength(String[] strArr) {
        if(strArr.length==0) return "";
        String minStr=getMinString(strArr);

        int minPrefixStrLength=minStr.length();
        for(int i=0;i<strArr.length;i++){
            int j;
            for( j=0;j<minPrefixStrLength;j++){
                if(minStr.charAt(j)!=strArr[i].charAt(j))
                    break;
            }
            if(j<minPrefixStrLength)
                minPrefixStrLength=j;
        }
        return minStr.substring(0,minPrefixStrLength);
    }




    public static String getMinString(String[] strArr)
    {
        String minStr=strArr[0];
        for(int i=1;i<strArr.length;i++){
            if(strArr[i].length()<minStr.length())
                minStr=strArr[i];
        }
        return minStr;
    }

     public static String commonPrefix (String arr[], int n) {
         String prefix =  arr[0];

         for (int i=1; i<=n-1; i++)
             prefix = commonPrefixUtil(prefix, arr[i]);
         return prefix;



     }


//http://mantascode.com/java-how-to-compare-two-arrays/
    public static String compare(String first,String second) {

        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();
        StringBuffer sb= new StringBuffer();


        for(int i=0;i<first.length()-1;i++) {
            for(int j=0;j<second.length();j++) {

                if (firstChar[i]==secondChar[j])
                sb.append(firstChar[i]);

            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
