package CodingPractise.String;

/**
 * Created by muthuselvan on 9/6/17.
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_09_String_Rotation/Question.java
 *
 * OUTPUT :
 apple, pleap: true
 waterbottle, erbottlewat: true
 camera, macera: false
 *
 *
 * Runtime :
 * ---------
 * O(A+B) for isSubString
 * O(N) for isRotation
 *
 * Example :https://coding-interview-solutions.hackingnote.com/problems/rotate-string.html
 ==========
 Given "abcdefg".
 ---------------
 offset=0 => "abcdefg"
 offset=1 => "gabcdef"
 offset=2 => "fgabcde"
 offset=3 => "efgabcd

 Example 2 :
 -----------
 Given : apple
 ==============
 offset=0 => "apple" ----Removing e and adding into first index
 offset=1 => "eappl" ----Removing l and adding int first index
 offset=2 => "leapp" ----Removing p and adding into first index
 offset=3 => "pleap" ----Removing p and adding into first index


 *
 */


public class StringRotation_Book_205 {

    public static void main(String[] args) {

        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
        //Example
//      =========
        //offset=0 => "abcdefg"
        //offset=1 => "gabcdef"
        //offset=2 => "fgabcde"
        //offset=3 => "efgabcd
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = isRotation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }
    }

    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isRotation(String s1, String s2) {
        int len = s1.length();
	    /* check that s1 and s2 are equal length and not empty */
        if (len == s2.length() && len > 0) {
	    	/* concatenate s1 and s1 within new buffer */
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }
        return false;
    }




}
