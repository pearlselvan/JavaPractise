package CodingPractise.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by muthuselvan on 6/6/17.
 * http://www.geeksforgeeks.org/find-strings-formed-characters-mapped-digits-number/
 *
 * For given input :
 * Consider below list where each digit from 1 to 9 maps to few characters.

 1 -> ['A', 'B', 'C']
 2 -> ['D', 'E', 'F']
 3 -> ['G', 'H', 'I']
 4 -> ['J', 'K', 'L']
 5 -> ['M', 'N', 'O']
 6 -> ['P', 'Q', 'R']
 7 -> ['S', 'T', 'U']
 8 -> ['V', 'W', 'X']
 9 -> ['Y', 'Z']

 Given a number, replace its digits with corresponding characters in given
 list and print all strings possible. Same character should be considered for
 every occurrence of a digit in the number. Input number is positive and doesn’t contain 0.

 Examples :

 Input : 121
 Output : ADA BDB CDC AEA BEB CEC AFA BFB CFC

 Input : 22
 Output : DD EE FF


 Logic :
 ========
 The idea is for each digit in the input number,
 we consider strings formed by previous digit and append characters mapped
 to current digit to them. If this is not the first occurrence of the digit,
 we append same character as used in its first occurrence.


 Java code : Two ways is available so please check the below code
 ==========
 http://www.programcreek.com/2014/04/leetcode-letter-combinations-of-a-phone-number-java/

 *
 */
public class CharactersMappedToDigitsOfNumbers {

    public static void main(String[] args) {

        letterCombinations("123");

    }

    public static List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        map.put(0, "");

        ArrayList<String> result = new ArrayList<String>();

        if(digits == null || digits.length() == 0)
            return result;

        ArrayList<Character> temp = new ArrayList<Character>();
        getString(digits, temp, result, map);

        return result;
    }

    public static void getString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map){
        if(digits.length() == 0){
            char[] arr = new char[temp.size()];
            for(int i=0; i<temp.size(); i++){
                arr[i] = temp.get(i);
            }
            result.add(String.valueOf(arr));
            return;
        }

        Integer curr = Integer.valueOf(digits.substring(0,1));
        String letters = map.get(curr);
        for(int i=0; i<letters.length(); i++){
            temp.add(letters.charAt(i));
            getString(digits.substring(1), temp, result, map);
            temp.remove(temp.size()-1);
        }
    }

}
