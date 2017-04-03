package DynamicProgramming;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by muthuselvan on 3/26/17.
 * http://www.geeksforgeeks.org/dynamic-programming-set-32-word-break-problem/
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/dynamic/BreakMultipleWordsWithNoSpaceIntoSpace.java
 *
 * *
 * Given a string and a dictionary, split this string into multiple words such that
 * each word belongs in dictionary.
 *
 * e.g peanutbutter -> pea nut butter
 * e.g Iliketoplay -> I like to play
 *
 * Solution
 * DP solution to this problem
 * if( input[i...j] belongs in dictionary) T[i][j] = i
 * else{
 *     T[i][j] = k if T[i][k-1] != -1 && T[k][j] != -1
 *
 * Test cases
 * 1) Empty string
 * 2) String where entire string is in dictionary
 * 3) String which cannot be split into words which are in dictionary
 * 3) String which can be split into words which are in dictionary
 *
 *
 *
 *
 */

public class WordBreakDictionary {

    private static String data[] = {"muthu","is","a","good", "per","son","in","the","world"} ;

    public static void main(String[] args) {


//        dictionaryContains("ok");

        Set<String> dictionary = new HashSet<String>();
        dictionary.add("I");
        dictionary.add("like");
        dictionary.add("had");
        dictionary.add("play");
        dictionary.add("to");
        dictionary.add("a");
        dictionary.add("food");
        dictionary.add("am");
        dictionary.add("ball");
        dictionary.add("ace");
        dictionary.add("in");
        dictionary.add("morning");
        String str = "Iamace";
//        String str = "Ihadliketoplay";

        WordBreakDictionary wordBreakDictionary = new WordBreakDictionary();
        String result = wordBreakDictionary.breakWordDP(str,dictionary);
        System.out.println("Result : " +result);


    }




    /**
     * Dynamic programming version for breaking word problem.
     * It returns null string if string cannot be broken into multipe words
     * such that each word is in dictionary.
     * Gives preference to longer words over splits
     * e.g peanutbutter with dict{pea nut butter peanut} it would result in
     * peanut butter instead of pea nut butter.
     */

    public String breakWordDP(String word, Set<String> dict){
        int T[][] = new int[word.length()][word.length()];

        MaxSizeSubMatrix print2D = new MaxSizeSubMatrix();


        for(int i=0; i < T.length; i++){
            for(int j=0; j < T[i].length ; j++){
                T[i][j] = -1; //-1 indicates string between i to j cannot be split
            }
        }

        print2D.printArray(T);

        //fill up the matrix in bottom up manner
        for(int l = 1; l <= word.length(); l++){
            for(int i=0; i < word.length() -l + 1 ; i++){
                int j = i + l-1;
                String str = word.substring(i,j+1);
                //if string between i to j is in dictionary T[i][j] is true
                if(dict.contains(str)){
                    T[i][j] = i;
                    continue;
                }
                //find a k between i+1 to j such that T[i][k-1] && T[k][j] are both true
                for(int k=i+1; k <= j; k++){
                    if(T[i][k-1] != -1 && T[k][j] != -1){
                        T[i][j] = k;
                        break;
                    }
                }
            }
        }

        print2D.printArray(T);
        // This loop will check the whether match found or not .
        // that in 2D array zero th 0 index and length -1 index is  -1 then no match
        if(T[0][word.length()-1] == -1){
            return null;
        }

        //create space separate word from string is possible
        // This loop will check what are NOT -1 in available in 2D

        StringBuffer buffer = new StringBuffer();
        int i = 0; int j = word.length() -1;
        while(i < j){
            int k = T[i][j];
            if(i == k){
                buffer.append(word.substring(i, j+1));
                break;
            }
            buffer.append(word.substring(i,k) + " ");
            i = k;
        }

        return buffer.toString();
    }


    /*
    /* A utility function to check whether a word is present in dictionary or not.
  An array of strings is used for dictionary.  Using array of strings for
  dictionary is definitely not a good idea. We have used for simplicity of
  the program*/

    public static boolean dictionaryContains(String data) {

        if (data.equals(data)) {
            System.out.println("Found " +data);
        }

        return true;
    }
}
