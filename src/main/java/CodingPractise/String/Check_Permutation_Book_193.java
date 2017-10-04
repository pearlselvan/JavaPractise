package CodingPractise.String;

import java.util.Arrays;

/**
 * Created by muthuselvan on 9/6/17.
 * Given two string write a method if one string is permution of another stirng
 * https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_02_Check_Permutation
 *
 *
 * Method 1: Time Com­plex­ity — O(nlgn) :
 * Sort both the strings and com­pare it.
 *
 * Method 2 : Using Hash Table — Time Com­plex­ity — O(n):
 * 1.Check if both Strings are hav­ing the same length, if not , return false.
   2.Cre­ate a Hash Table, make char­ac­ter as key and its count as value
   3.Nav­i­gate the string one tak­ing each char­ac­ter at a time
   4.check if that char­ac­ter already exist­ing in hash table, if yes then increase its count by 1 and if it doesn’t exist insert into hash table with the count as 1.
   5.Now nav­i­gate the sec­ond string tak­ing each char­ac­ter at a time
   6.check if that char­ac­ter exist­ing in hash table, if yes then decrease its count by 1 and if it doesn’t exist then return false.
   7.At the end nav­i­gate through hash table and check if all the keys has 0 count against it if yes then return true else return false.

 *
 *
 */
public class Check_Permutation_Book_193 {

    public static void main(String[] args) {

        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }

    }

    //similar to count sort so o(n)
    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) return false; // Permutations must be same length

        int[] letters = new int[128]; // Assumption: ASCII
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }
        System.out.println("Letter : " + Arrays.toString(letters));

        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0) {
                return false;
            }
        }

        System.out.println("Alter Letter : " + Arrays.toString(letters));

        return true; // letters array has no negative values, and therefore no positive values either
    }


}
