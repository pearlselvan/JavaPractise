package CodingPractise.String;

import java.util.ArrayList;
import java.util.Arrays;
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

 //Input:Digit string "23", Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
        System.out.println("OUTPUT  >> " +letterCombinations("23"));

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


    /*
    Logic :
 ========
 The idea is for each digit in the input number,
 we consider strings formed by previous digit and append characters mapped
 to current digit to them. If this is not the first occurrence of the digit,
 we append same character as used in its first occurrence.

     */

    public static void getString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map){
        System.out.println("Digit will sub string : " +digits);
        System.out.println("TEMP array list : " +temp+ " - T Size : " +temp.size());

        if(digits.length() == 0){ // BASE CONDION + ADDING temp Array list values
            System.out.println("BASE CONDITON : Digit lenght is zero");
            char[] arr = new char[temp.size()];


            for(int i=0; i<temp.size(); i++){
                arr[i] = temp.get(i);
            }

            System.out.println("arr[i] : " + Arrays.toString(arr));

            result.add(String.valueOf(arr));
            System.out.println("result array list if digit length is not zero : " +result);
            return;
        }
        // STATEMENT WILL COME HERE FIRST :
        Integer curr = Integer.valueOf(digits.substring(0,1));
        System.out.println("Sub string after curr : " +curr);

        String letters = map.get(curr);
        System.out.println("Letter get from map : " +letters);
        for(int i=0; i<letters.length(); i++){
            temp.add(letters.charAt(i));
            // Each letter get the string and add into the map
            System.out.println(" TEMP array list became : " +temp);
            getString(digits.substring(1), temp, result, map); // ----> RECURSION
            System.out.println("After get string MAP : " +map);
            temp.remove(temp.size()-1);
        }
    }

}


