package CodingPractise.String;

import java.util.HashMap;

/**
 *
 * http://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
 * http://articles.leetcode.com/finding-minimum-window-in-s-which/
 *
 * Created by muthuselvan on 9/15/17.
 * Input: "aaaaaaaaaabbbbbbbbccccccccsbabbbccc"
 Alphabet: {'a', 'b', 'c’}
 Output: "csba"

 t: "aabbcb"
 Alphabet: {'a', 'b', 'c’}
 Output: "abbc"


 Logic is : creating dictionary for Target  : Key : character from string , Value :  How many character
 Check if Target length == Target Dictionalry , if true then found first min ..then contiune search
 if target character available in string , if yes then update the dictionary values with matched value by
 replacing existing values thats first min values ..finally return min by ...

 Example :
 SRC = ADOBECODEBANC
 TARGET =ABC

 | A | D | O | B | E | C | O | D | E | B | A | N | C
 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11| 12

 DICT_VALUES = { A=0 , B=3, C=5 } on first iteration ( after matched all target _
 DICT_VALUES in second iteration = { A =10  B=9 C=12 } so take min : 9 and max : 12
 so find the sub string of 9 and 12 , that will be result : BANC

  Ref: Python code


 */
public class MinGetMinimumSubStringSource {

    public static void main(String[] args) {
//        System.out.println(minWindow("aaaaaaaaaabbbbbbbbccccccccsbabbbccc","abd"));
//        System.out.println(minWindow("this is a test string","tist"));
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }

    public static String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        String result = "";

        //character counter for t
        HashMap<Character, Integer> target = new HashMap<Character, Integer>();
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(target.containsKey(c)){
                target.put(c,target.get(c)+1);
            }else{
                target.put(c,1);
            }
        }
        System.out.println("Get min target first  : " +target);

        // character counter for s
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0;
        int minLen = s.length()+1;

        int count = 0; // the total of mapped characters

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            System.out.println("Char : " +c +" at " +i);

            if(target.containsKey(c)){
                if(map.containsKey(c)){
                    if(map.get(c)<target.get(c)){
                        count++;
                    }
                    map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                    count++;
                }
            }
            System.out.println("After Added map : " +map);

            if(count == t.length()){
                char sc = s.charAt(left);
                while (!map.containsKey(sc) || map.get(sc) > target.get(sc)) {
                    if (map.containsKey(sc) && map.get(sc) > target.get(sc))
                        map.put(sc, map.get(sc) - 1);
                    left++;
                    sc = s.charAt(left);
                }

                if (i - left + 1 < minLen) {
                    result = s.substring(left, i + 1);
                    minLen = i - left + 1;
                }
            }
        }

        return result;
    }

}
