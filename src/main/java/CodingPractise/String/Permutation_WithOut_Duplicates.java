package CodingPractise.String;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by muthuselvan on 9/5/17.
 */
public class Permutation_WithOut_Duplicates {

    public static void main(String[] args) {

        ArrayList<String> list = getPerms("aabc");
        System.out.println("There are " + list.size() + " permutations.");
        for (String s : list) {
            System.out.println(s);
        }


    }

    public static ArrayList<String> getPerms(String str) {
        ArrayList<String> result = new ArrayList<String>();
        getPerms("", str, result);
        return result;
    }

    public static void getPerms(String prefix, String remainder, ArrayList<String> result) {
        if (remainder.length() == 0) {
            result.add(prefix);
        }
        int len = remainder.length();
        for (int i = 0; i < len; i++) {
            String before = remainder.substring(0, i);
            String after = remainder.substring(i + 1, len);
            char c = remainder.charAt(i);
            getPerms(prefix + c, before + after, result);
        }
    }




}
