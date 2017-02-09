package CodingPractise;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by muthuselvan on 2/7/17.
 */

/*
1. Scan the string from left and check if this open parenthis
2. if yes then push
3. else ( if close parenthisis)
4. then peek and check with current char
5. finally : if stack is empty then valid
 */
public class ValidParentheses {

    public ValidParentheses() {

    }

    public static void main(String[] args) {
        System.out.println("Valied " +isValid("{(<>}"));
        System.out.println("Valied without using HM : " +checkBalance("{(<>)}"));
    }

    //Using HashMap
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

      //  System.out.println("KEY" +map.entrySet().contains('}'));

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    //Without using HashMap - Recommended
    public static String  checkBalance(String str) {
        Stack stack = new Stack();
        // iterate the string and convert into char using charAt
        for (int i = 0; i < str.length(); i++) {
            // Get the current char
            char ch = str.charAt(i);
            // check if current char contains open parenthisis
            if (ch == '[' || ch == '(' || ch == '{') {
            //then push
                stack.push(ch);
             //else check the current char is close parenthis and stack is not empty
            } else if ((ch == ']' || ch == '}' || ch == ')')
                    && (!stack.isEmpty())) {
                // check with peek the element with current chart then pop
                if (((char) stack.peek() == '(' && ch == ')')
                        || ((char) stack.peek() == '{' && ch == '}')
                        || ((char) stack.peek() == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    return "Not Balanced";
                }
            } else {
                if ((ch == ']' || ch == '}' || ch == ')')) {
                    return "Not Balanced";
                }
            }
        }
        if (stack.isEmpty())
            return "Balanced Parenthisis";
        else
            return "Not Balanced";
    }
}
