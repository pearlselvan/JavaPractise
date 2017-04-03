package DynamicProgramming;

/**
 * Created by muthuselvan on 3/25/17.
 * http://buttercola.blogspot.com/2014/10/leetcode-wildcard-matching.html
 * https://www.youtube.com/watch?v=3ZDZ-N0EPV0
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/dynamic/WildCardMatching.java
 */

/*

         ---------ROW IS PATTERN ------------------------------

     PATTERN : X?Y*Z  STRING : XAYLMZ

    in below T[0]0] will TRUE , indicate that will be true because two empty will be match
   then its true

         How to fill T[1][1] , according to the first condition
         if String[1] == pattern[1] || pattern[1] = '?' then T[1][1] = T[0][0]

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

 T[i][j] will take the one the following falues :

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
        System.out.println(wcm.isMatch("xbbylmz", "x?y*z"));
        System.out.println(wcm.isMatch("ABC", "AB*C"));
        System.out.println(wcm.isMatch("AAB", "C*A*B"));

    }

    public boolean isMatch(String s, String p) {

        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();

        MaxSizeSubMatrix print2d = new MaxSizeSubMatrix();


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
            } else {
                pattern[writeIndex++] = pattern[i];
                isFirst = true;
            }
        }
        // intialize 2D boolean
        // writeIndex is size of new pattern length after removed multiple *
        boolean T[][] = new boolean[str.length + 1][writeIndex + 1];

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


