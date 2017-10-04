package CodingPractise.String;

/**
 * Created by muthuselvan on 10/2/17.
 *
 * http://techieme.in/make-anagrams-from-two-strings/
 *
 *
 * import java.io.*;
 import java.util.*;

 class Solution {

 static int deletionDistance(String src, String des) {
 // your code goes here
 char[] srcChar = src.toCharArray();
 char[] desChar = des.toCharArray();
 int[] counts = new int[26];
 char a = 'a';

 for (int i=0;i<srcChar.length;i++) {
 counts[srcChar[i]-a]++;

 } // End first

 for (int i=0;i<desChar.length;i++) {
 counts[desChar[i]-a]--;
 } // End first


 int sum = 0;
 for (int i=0;i<counts.length;i++) {
 sum+=Math.abs(counts[i]);
 }


 return sum;
 } //fin
 public static int deleteDistance(String word1, String word2){
 if(word1.equals("") && word2.equals("")){
 return 0;
 } else if(word1.equals("") && !word2.equals("")){
 return word2.length();
 } else if(!word1.equals("") && word2.equals("")){
 return word1.length();
 }
 int [][] dp = new int[word1.length()+1][word2.length()+1];
 for(int i=0; i<dp[0].length; i++){
 dp[0][i] = i;
 }
 for(int j=0; j<dp.length; j++){
 dp[j][0] = j;
 }

 for(int i=1; i<dp.length; i++){
 for(int j=1; j<dp[0].length; j++){

 if(word1.charAt(i-1) == word2.charAt(j-1)){
 dp[i][j] = dp[i-1][j-1];
 } else {
 dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
 }
 }
 }
 return dp[word1.length()][word2.length()];

 }
 /*
 0 e a t
 0  0 1 2 3
 a  1 2 1 2
 t  2 3 2 1
 e  1 2 3 2
 */


// d=1 0=1 g=1
// f=1 r=1 o=2 g=2

//



public class MakeAnagram {

    public static void main(String[] args) {
        System.out.println("Using DB >> " +deleteDistanceUsingDB("eat","ate"));

    }

    /*
   0 e a t
0  0 1 2 3
a  1 2 1 2
t  2 3 2 1
e  1 2 3 2

  if matched : Example in above the a and a matched so take value diagonally
*/
    public static int deleteDistanceUsingDB(String word1, String word2){
        if(word1.equals("") && word2.equals("")){
            return 0;
        } else if(word1.equals("") && !word2.equals("")){
            return word2.length();
        } else if(!word1.equals("") && word2.equals("")){
            return word1.length();
        }
        int [][] dp = new int[word1.length()+1][word2.length()+1];
        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = i;
        }
        for(int j=0; j<dp.length; j++){
            dp[j][0] = j;
        }

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){

                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[word1.length()][word2.length()];

    }
}
