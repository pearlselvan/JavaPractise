package DynamicProgramming;

import java.util.Arrays;

/**
 * Created by muthuselvan on 3/25/17.
 * http://buttercola.blogspot.com/2014/10/leetcode-wildcard-matching.html
 * https://www.youtube.com/watch?v=3ZDZ-N0EPV0
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/dynamic/WildCardMatching.java
 *
 * ================================================================================================================
 *
 * Analysis: if you are not able to following this analysis , please look linear time
 * =========

 For each element in s
 If *s==*p or *p == ? which means this is a match, then goes to next element s++ p++.
 If p=='*', this is also a match, but one or many chars may be available, so let us save this *'s position and the matched s position.
 If not match, then we check if there is a * previously showed up,
 if there is no *,  return false;
 if there is an *,  we set current p to the next element of *, and set current s to the next saved s position.

 e.g.

 abed
 ?b*d**

 a=?, go on, b=b, go on,
 e=*, save * position star=3, save s position ss = 3, p++
 e!=d,  check if there was a *, yes, ss++, s=ss; p=star+1
 d=d, go on, meet the end.
 check the rest element in p, if all are *, true, else false;

 ================================================================================================================
 *
 *
 * CASES Handling :
 * http://www.geeksforgeeks.org/wildcaard-pattern-matching/
 * Case 1: The character is ‘*’
 * Case 2: The character is ‘?’
 * Case 3: The character is not a wildcard character
 *
 * Solution :
 * ===============
 * Let T[row_string][col_pattern] is true if first 'row' characters in given string matches
 * the first 'col' characters of pattern.
 *

 * DP Initialization:
 * ===================

 // both text and pattern are null
 T[0][0] = true;

 // pattern is null
 T[i][0] = false;

 // text is null
 T[0][j] = T[0][j - 1] if pattern[j – 1] is '*'


 DP relation :
===============
 // If current characters match, result is same as
 // result for lengths minus one. Characters match
 // in two cases:
 // a) If pattern character is '?' then it matches
 //    with any character of text.
 // b) If current characters in both match
 if ( pattern[j – 1] == ‘?’) ||
 (pattern[j – 1] == text[i - 1])
 T[i][j] = T[i-1][j-1]

 // If we encounter ‘*’, two choices are possible-
 // a) We ignore ‘*’ character and move to next
 //    character in the pattern, i.e., ‘*’
 //    indicates an empty sequence.
 // b) '*' character matches with ith character in
 //     input
 else if (pattern[j – 1] == ‘*’)
 T[i][j] = T[i][j-1] || T[i-1][j]

 else // if (pattern[j – 1] != text[i - 1])
 T[i][j]  = false

  col = pattern , row=string
      0    1    2     3   4  5   6
  --------------------------------------------
  0  T    0    0     0   0  0    0
 --------------------------------------------
1
 --------------------------------------------
2
 --------------------------------------------
3
 --------------------------------------------
4
 --------------------------------------------

 */



/*

         ---------ROW IS PATTERN ------------------------------

      STRING  (ROW) : XAYLMZ   PATTERN (COL)  : X?Y*Z


    in below T[0]0] will TRUE , indicate that will be true because two empty will be match
   then its true

 T[0][0] is TRUE : is NULL or  empty patten as same as with empty string is going match so thats why
 is going always match


         How to fill T[1][1] , according to the first condition
         if String[1] == pattern[1] || pattern[1] = '?' then T[1][1] = T[0][0]

         T[0][1] = false because empty string does not match with any string  similarly
         for colum that will be always

             0     1    2    3     4     5      6

                   X    ?   Y     *       Z
            |----|----|----|----|------|-----|------|--------
0 Nul       | T  |  F |  F | F  |   F  |  F  |      |               COLUMN
            |----|----|----|----|------|-----|------|--------         S
   1 X      | F  | T  | F  | F  | F    | F   |      |                 T
            |----|----|----|----|------|-----|------|--------         R
 2 A        | F  | F  | T  | F  | F    | F   |      |                 I
            |----|----|----|----|------|-----|------|--------         N
 3 Y        | F  | F  |F   | T  | T    | F   |      |                 G
            |----|----|----|----|------|-----|------|--------
 4  L       | F  |F   | F  | F  |  T   | F   |      |
            |----|----|----|----|------|-----|------|-------
5 M         | F  |F   |F   | F  | T    | F   |      |
            |----|----|----|----|------|-----|------|--------
 6 Z        | F  | F  |F   | F  | T    | T   |      |
            |----|----|----|----|------|-----|------|--------

T is 2D array boolean
and T[i][j] indicating that is a substring in the string from 0 till i
and substring in pattern 0 to till j are mathced or not

 T[i][j] will take the one the following values :

 1. T[i][j] => T[i-1][j-1] (from diagonal), if String[i] == pattern[j] || pattern[j] = '?'
     ( This mean that till i and j the values at i and j is already same so then we check
     excluding i and j is rest of the sub string matching or not to get that we need look
     T[i-1][j-1] which is diagonally cross value in the two dimentional value)
 2. T[i][j] = T[i-1][j] || T[i][j-1] ,if pattern[j] == '*'
       ( This case T[i][j-1] indicate that till i th value in the string and till j-1
        in pattern which means that * indicate the zero seq pattern .. when we are looking
         T[i][j-1] is zero sequence pattern

 3. T[i][j] = false

 space complexitiy : o( m * n ) : m is length of string and n is lengh of pattern
  in case if you are using one dim array instead of 2D then spance woud be o(n) where n is lenth of hte pattern
 time : o(m * n )









 */
public class WildCardMatch {

    public static void main(String[] args) {

        WildCardMatch wcm = new WildCardMatch();
        System.out.println(wcm.isMatch("xbylmz", "x?y*z"));
        System.out.println("is match including zero : " +wcm.isMatch("xbylmz", "*"));
        System.out.println("is match with NULL / empty : " +wcm.isMatch("", "*"));
//        System.out.println("is match with NULL / empty : " +wcm.isMatch(null, "*"));
        System.out.println(wcm.isMatch("xbbylmz", "x?y*z"));
        System.out.println(wcm.isMatch("ABC", "AB*C"));
        System.out.println("M 2 : " +wcm.isMatch("ABC", "AB*C"));
        System.out.println(wcm.isMatch("AAB", "C*A*B"));
        System.out.println();

        System.out.println("Methond  2  EASY TO Understand DB : " +wcm.isMatch2("CAB", "C****A*B"));

        System.out.println();
        System.out.println("LINEAR TIME .........");

//        System.out.println(" LINEAR TIME : " +wcm.matchUsingLinearTime("CAB","C****A*B"));
//        System.out.println(" LINEAR TIME : " +wcm.matchUsingLinearTime("CAB","C****A*B"));
        System.out.println(" LINEAR TIME : " +wcm.matchUsingLinearTime("MUTHU","M*U"));

//        matchUsingLinearTime

    }

    public boolean isMatch(String s, String p) {

        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();

        MaxSizeSubMatrix print2d = new MaxSizeSubMatrix();



        if (s.equals(null) || s.length() == 0 || p.equals(null) || p.length() ==0) return true;


        //replace multiple * with one *
        //e.g a**b***c --> a*b*c
        // conver multple * into single * in pattern
        int writeIndex = 0;
        boolean isFirst = true;
        for ( int i = 0 ; i < pattern.length; i++) {
            if (pattern[i] == '*') {
                if (isFirst) {
                    pattern[writeIndex++] = pattern[i];
                    isFirst = false;
                }
            } else { // if it '?'
                pattern[writeIndex++] = pattern[i];
                isFirst = true;
            }
        }
        System.out.println("Patten >>> " +Arrays.toString(pattern));
        System.out.println("String >>> " +s);
        // intialize 2D boolean
        // writeIndex is size of new pattern length after removed multiple *
        boolean T[][] = new boolean[str.length + 1][writeIndex + 1];
        System.out.println("T matrix row size : " +T.length);
        System.out.println("T matrix col size : " +T[0].length);

        // T[0][1] will true if the first character in pattern is *
        if (writeIndex > 0 && pattern[0] == '*') {
            T[0][1] = true;
        }

        T[0][0] = true;



        for (int i = 1; i < T.length; i++) {
            for (int j = 1; j < T[0].length; j++) {
                if (pattern[j-1] == '?' || str[i-1] == pattern[j-1]) {
                    T[i][j] = T[i-1][j-1];
                } else if (pattern[j-1] == '*'){
                    T[i][j] = T[i-1][j] || T[i][j-1];
                }
            }
        }
        //

//        print2d.printArray(T);
        return T[str.length][writeIndex];
    }


    //LINEAR TIME : https://leetcode.com/problems/wildcard-matching/discuss/
    //The basic idea is to have one pointer for the string and one pointer for the pattern.
    // This algorithm iterates at most length(string) + length(pattern) times, for each iteration, at least one pointer advance one step.

    /*
    Analysis:

For each element in s
If *s==*p or *p == ? which means this is a match, then goes to next element s++ p++.
If p=='*', this is also a match, but one or many chars may be available, so let us save this *'s position and the matched s position.
If not match, then we check if there is a * previously showed up,
       if there is no *,  return false;
       if there is an *,  we set current p to the next element of *, and set current s to the next saved s position.

e.g.

abed
?b*d**

a=?, go on, b=b, go on,
e=*, save * position star=3, save s position ss = 3, p++
e!=d,  check if there was a *, yes, ss++, s=ss; p=star+1
d=d, go on, meet the end.
check the rest element in p, if all are *, true, else false;
     */

    /*
     Analysis: if you are not able to following this analysis , please look linear time
 * =========

    For each element in s
    If *s==*p or *p == ? which means this is a match, then goes to next element s++ p++.
    If p=='*', this is also a match, but one or many chars may be available, so let us save this *'s position and the matched s position.
    If not match, then we check if there is a * previously showed up,
            if there is no *,  return false;
 if there is an *,  we set current p to the next element of *, and set current s to the next saved s position.
*/

    boolean matchUsingLinearTime(String str, String pattern) {
        int strPointer = 0, patPointer = 0, match = 0, starIdx = -1;
        System.out.println("STRING : " +str+ " PATTERN  : " +pattern);
        //For each element in s
        while (strPointer < str.length()){
            System.out.println("while loops check sPointer < str.length() : " +strPointer + " string length : " +str.length());


            // advancing both pointers : If *s==*p or *p == ? which means this is a match, then goes to next element s++ p++.
            if (patPointer < pattern.length()  && (pattern.charAt(patPointer) == '?' || str.charAt(strPointer) == pattern.charAt(patPointer))){
                System.out.println("Found ? at index pPointer  " +patPointer  +" or matched char");
                strPointer++;
                patPointer++;
                System.out.println("Advancing Pattern Pointer to : " +patPointer);
                System.out.println("Advancing String Pointer to : " +strPointer);
            }
            // * found, only advancing pattern pointer
            //If p=='*', this is also a match, but one or many chars may be available, so let us save this *'s position and the matched s position.
            else if (patPointer < pattern.length() && pattern.charAt(patPointer) == '*'){
                System.out.println("Found * at index pPointer : " +patPointer  );
                starIdx = patPointer; // for tracking * in pattern
                match = strPointer;
                patPointer++;
                System.out.println("Storing starIdx=pPointer for tracking * , starIdx :" +starIdx);
            }
            // last pattern pointer was *, advancing string pointer
            //If not match, then we check if there is a * previously showed up,
            else if (starIdx != -1){
                System.out.println("Last pattern was *");
                patPointer = starIdx + 1;
                match++;
                strPointer = match;
            }
            //current pattern pointer is not star, last patter pointer was not *
            //characters do not match
            //if there is no *,  return false;
            else return false;    // ----- DON'T FORGET
        } // END WHILE FOR STRING

        //check for remaining characters in pattern
//        if there is an *,  we set current p to the next element of *, and set current s to the next saved s position.
        while (patPointer < pattern.length() && pattern.charAt(patPointer) == '*') {
            System.out.println("Checking remaining pattern for * ");
            patPointer++;
        System.out.println("Advanced Pattern pointer : " +patPointer);
        } // END WHILE FOR PATTERN
        System.out.println("Finall : " +patPointer +" Pattern Length : " +pattern.length());
        return patPointer == pattern.length();
    }





//    http://buttercola.blogspot.com/2014/10/leetcode-wildcard-matching.html
    public boolean isMatch2(String s, String p) {
        if (p == null || p.length() == 0) {
            return s == null || s.length() == 0;
        }

        int rows = s.length();
        int cols = p.length();

        boolean[][] dp = new boolean[rows + 1][cols + 1];

        dp[0][0] = true;
        for (int j = 1; j <= cols; j++) {  // pattern check if *
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (p.charAt(j - 1) != '*') {
                    if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                } else {
                    dp[i][j] = dp[i - 1][j - 1] || dp[i][j - 1] || dp[i - 1][j];
                }
            }
        }

        return dp[s.length()][p.length()];
    }


    /**
     * Recursive and slow version of wild card matching.
     */
    public boolean isMatchRecursive(String s, String p) {
        return isMatchRecursiveUtil(s.toCharArray(), p.toCharArray(), 0, 0);
    }

    private boolean isMatchRecursiveUtil(char[] text, char[] pattern, int pos1, int pos2) {
        if (pos2 == pattern.length) {
            return text.length == pos1;
        }

        if (pattern[pos2] != '*') {
            if (pos1 < text.length && (text[pos1] == pattern[pos2]) || pattern[pos2] == '?') {
                return isMatchRecursiveUtil(text, pattern, pos1 + 1, pos2 + 1);
            } else {
                return false;
            }
        } else {
            //if we have a***b then skip to the last *
            while (pos2 < pattern.length - 1 && pattern[pos2 + 1] == '*') {
                pos2++;
            }
            pos1--;
            while (pos1 < text.length) {
                if (isMatchRecursiveUtil(text, pattern, pos1 + 1, pos2 + 1)) {
                    return true;
                }
                pos1++;
            }
            return false;
        }
    }









}


