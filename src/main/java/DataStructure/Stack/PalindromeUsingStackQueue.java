package DataStructure.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by muthuselvan on 6/2/17.
 *
 * Using : Recursion :
 * http://javarevisited.blogspot.com/2015/06/2-ways-to-check-if-string-is-palindrome-java.html
 *
 * https://www.cs.colorado.edu/~main/applications/Palindrome.java
 *
 *
 * // Ask only uppear or lower or mixed :
 * BF : 0(n)
 * http://www.growingwiththeweb.com/2014/02/determine-if-a-string-is-a-palindrome.html
 *
 */
public class PalindromeUsingStackQueue {

    public static void main(String[] args) {
        System.out.println(isPalindrome("GOOG"));

    }

    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        Character letter;
        int match =0;

        for (int i=0;i<input.length();i++) {
            letter = input.charAt(i);

            if (letter.isLetter(letter)) {
                stack.push(letter);
                queue.add(letter);
            }
        }

        while (!queue.isEmpty()) {
            System.out.println("Q -" +queue.peek());
            System.out.println("S -" +stack.peek());
            if (queue.remove() !=stack.pop()) {
                match++;
            }

        }

        return match==0;
    }

}
