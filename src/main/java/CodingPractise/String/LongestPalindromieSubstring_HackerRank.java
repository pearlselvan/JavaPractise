package CodingPractise.String;

/**
 *
 * Approach 1 : BF :
 * http://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
 *
 ***** The BF code available here in method :  //Using bruit force : returnLongestPoly_BF
 *
 * Approach 2  : DP //Time complexity: O ( n^2 ) and Auxiliary Space: O ( n^2 )
   =================================================
 * http://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
 *
 * Approach 3 : Problem in above DP ...
 * ====================================
 * http://www.geeksforgeeks.org/longest-palindromic-substring-set-2/
 *
 *Time complexity: O ( n^2 ) where n is the length of input string.
 Auxiliary Space: O ( 1 )


 *
 *
 *
 * Created by muthuselvan on 9/26/17.
 *
 * Question : Ask interviewer ? what is max length ?
 *
 * Given a string s, find the longest palindromic substring in s. Y
 * ou may assume that the maximum length of s is 1000.

 Example 1:
 =========

 Input: "babad"
 Output: "bab"

 Note: "aba" is also a valid answer.
 Example:
 =========

 Input: "cbbd"
 Output: "bb"


 Summary :
 http://articles.leetcode.com/longest-palindromic-substring-part-i/


 Explain :
 Go to the middle character and check its polindrome or not ..
 here the catch would be we need check its odd / even string
 if it even we need to check index+1

 Eg ( firt take odd ) : babkd
 now go to check and go both direction , example if you 'a' then bab , this is poly
 so take the max_length with start_index for sub string values


 *
 */
public class LongestPalindromieSubstring_HackerRank {

    public static void main(String[] args) {
         //System.out.println("Longest Palindrome Substring :" +longestPalindrome("omadame"));
        System.out.println("Longest Palindrome Substring :" +longestPalindrome("babkd"));
//        System.out.println("Longest Palindrome Substring :" +longestPalindrome("hackerrekcahba"));
    //qdhcmtrrgntcenvilbnwdttewaeeepiihouihuxccjwmlmrdjaigerwwpxdvqgtseienkywkuhburikdseinyzujbmuogieeigousmbjuzyniesdkirubhukwykneiestgqmvdxpwwrcegiajdrmlmwjccxuiuohiipeeeawettdwblinectngriprtmchdq

        //using BF :
//        char[] in = "aba".toCharArray();
//        System.out.println("is poly : " +isPalindrome(in,0,in.length-1));
        System.out.println("===================================================");
//        System.out.println("Using BF >>>> : " +returnLongestPoly_BF("babad"));
        System.out.println("===================================================");

    }

    private static int lo, maxLen;


    /*

    http://articles.leetcode.com/longest-palindromic-substring-part-i/


    We observe that a palindrome mirrors around its center.
    Therefore, a palindrome can be expanded from its center,
    and there are only 2N-1 such centers.

You might be asking why there are 2N-1 but not N centers?
The reason is the center of a palindrome can be in between two letters.
Such palindromes have even number of letters (such as “abba”) and its center are between the two ‘b’s.

Since expanding a palindrome around its center could take O(N) time,
 the overall complexity is O(N2).

     */

    //    Time complexity: O ( n^2 ) where n is the length of input string.
    //  Auxiliary Space: O ( 1 )


    //The idea is to generate all even length and odd length palindromes
    //and keep track of the longest palindrome seen so far.
    public static String longestPalindrome(String s) {
        int len = s.length();
        System.out.println("String - "+s +" - Length of the string : " +len);
        if (len < 2)
            return s;


        // One by one consider every character as center
        // point of even and length palindromes
        for (int i = 0; i < len-1; i++) {
            //Fix a centre and expand in both directions for longer palindromes.
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible

            System.out.println("Even will Call ");
            //Fix two centre ( low and high ) and expand in both directions for longer palindromes.
            extendPalindrome(s, i, i+1); //assume even length.
        }
        System.out.println("Return :" +lo +" - max lenght : " +maxLen);
        return s.substring(lo, lo + maxLen);
    }


    private static void extendPalindrome(String s, int start, int end) {



        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {

            System.out.println("Check : " +s+ " start :" +start + " end : " +start);
            System.out.println( " Start character : " +s.charAt(start)+ " End Character "+s.charAt(end));
            start--;
            end++;
        } //----- END WHILE
//        int current_max_length = (end-start)-1;
        System.out.println("Max Length : "+maxLen +" - Offset : " +(end - start - 1 ));
        System.out.println(end-start-1);
        if (maxLen < end - start - 1) {
            System.out.println("max length : " +maxLen);
            System.out.println("end : " +end);
            System.out.println("start: " +start);
            lo = start + 1;
            maxLen = end - start - 1;
        }
    }




    //Using bruit force : /////////////////


    static String returnLongestPoly_BF(String in) {
        char[] inchar = in.toCharArray();
        int longestEnd = 0;
        int longestStart = 0 ;
        int length = in.length();

        // arbitary select start and end
        for (int start=0;start<length;start++) {
            for (int end=start+1;end<length;end++) { //notice we add one to end because substring in java ends
                // with endIndex-1
                System.out.println("start :" +start+ ": end " +end);

                if (isPalindrome(inchar,start,end-1)) {
                    System.out.println("start char :" +inchar[start]+ ": end char " +inchar[end-1]);

                    // if it palindrome update the glopal longestStart and longestEnd
                    if (end-start > longestEnd - longestStart) {
                        longestEnd = end;
                        longestStart = start;
                    } // End innter if

                } // End outer if
            } // E - inner for
        } //E-outer

        return in.substring(longestStart,longestEnd);
    }

    static boolean isPalindrome(char[] in,int start,int end) {

        for (int i=start;i<=(start+end)/2;i++) {
            System.out.println(in[i] +"," +in[start+end-i]);
            if (in[i] == in[start+end-i]) {
                continue;
            }else {
                return false;
            }
        }

        return true;
    }





}
