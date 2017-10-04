package CodingPractise.String;

/**
 * Created by muthuselvan on 9/6/17.
 * O(N) :
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_01_Is_Unique/QuestionB.java
 *
 */
public class IsUnique_No_DataStructureAllowedBook_192 {

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }
    }


    /* Assumes only letters a through z. */
    public static boolean isUniqueChars(String str) {
        if (str.length() > 26) { // Only 26 characters
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
//            System.out.println(val);
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

}
