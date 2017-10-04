package CodingPractise.String;

import java.util.HashMap;

/**
 * Created by muthuselvan on 9/6/17.
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_04_Palindrome_Permutation/QuestionC.java
 */
public class Palindrome_Permutation_Book_195 {

    public static void main(String[] args) {
//        System.out.println("Using BF " +canPermutePalindrome_BF("oooo"));
//        System.out.println("Using BF " +canPermutePalindrome_BF("mtutu"));
        System.out.println("Using HM " +canPermutePalindrome_HM("mtutu"));

    }

    public static boolean canPermutePalindrome_BF(String s) {
        int count = 0;
        //ASCII characters from 0 to 127.
        for (char i = 0; i < 128 && count <= 1; i++) {
            int ct = 0;
            for (int j = 0; j < s.length(); j++) {
                System.out.println("s.charAt(j) : " +s.charAt(j)+ " ascii  val " +i);
                if (s.charAt(j) == i) //checking current val in ascii table

                    ct++;
            }

            count += ct % 2;
        }
        return count <= 1;
    }


    public static boolean canPermutePalindrome_HM(String s) {
        HashMap< Character, Integer > map = new HashMap < > ();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println("HM :" +map);
        int count = 0;
        for (char key: map.keySet()) {
            System.out.println("HM Key : " +key + " map.get(key) : " +map.get(key));
            count += map.get(key) % 2;
            System.out.println("Count : " +count);
        }
        return count <= 1;
    }
}
