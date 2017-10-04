package CodingPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by muthuselvan on 6/7/17.
 * http://www.programcreek.com/2014/04/leetcode-letter-combinations-of-a-phone-number-java/
 *
 * First : Recursion :
 * https://rekinyz.wordpress.com/2015/02/03/letter-combinations-of-a-phone-number/

 * Then
 * //https://leetcode.com/problems/letter-combinations-of-a-phone-number/discuss/
 *
 */
public class PhoneNumberLetterCombinations {

    public static void main(String[] args) {
        System.out.println(new PhoneNumberLetterCombinations().letterCombinations("23456789"));
        System.out.println(new PhoneNumberLetterCombinations().letterCombinations("23"));
        System.out.println("FIFO : " +letterCombinationsFIFO("23"));
    }




    public static List<String> letterCombinationsFIFO(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }


    public List<String> letterCombinations(String digits) {
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

        if (digits == "1") {
            return result;

        }

        if(digits == null || digits.length() == 0)
            return result;

        ArrayList<Character> temp = new ArrayList<Character>();
        getString(digits, temp, result, map);

        return result;
    }

    public void getString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map){
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
