package CodingPractise.String;

/**
 * Created by muthuselvan on 9/4/17.
 * https://leetcode.com/problems/permutation-in-string/discuss/
 *
 * Example 1:
 Input:s1 = "ab" s2 = "eidbaooo"
 Output:True
 Explanation: s2 contains one permutation of s1 ("ba").

 */
public class CheckPermutationOfStringInAnotherString {

    public static void main(String[] args) {
        CheckPermutationOfStringInAnotherString c = new CheckPermutationOfStringInAnotherString();
        System.out.println(c.checkInclusion("ab","eidbaooo"));

    }

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) return true;

        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count)) return true;
        }

        return false;
    }

    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }


}
