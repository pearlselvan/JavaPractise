package DataStructure.TreeDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by muthuselvan on 8/29/17.
 *
 * Using BackTracking :
 * https://leetcode.com/problems/generate-parentheses/discuss/
 *
 */
public class GenerateParentheses {
    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        generateParentheses.generateParenthesis(2).forEach(out-> System.out.println("Using BackTracking :" +out));

        Set<String> list = generateParens(2);
        for (String s : list) {
            System.out.println("Book Solution - 1 " +s+ " and size : " +list.size());
        }
//        System.out.println(list.size());
    }

//    public List<String> generateParenthesis(int n) {
//        ArrayList<String> result = new ArrayList<String>();
//        dfs(result, "", n, n);
//        return result;
//    }

    /*
    left and right represents the remaining number of ( and ) that need to be added.
    When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops.

    */

    // O (V+E) : Java backtracking solution
//    public void dfs(ArrayList<String> result, String s, int left, int right) {
//        if (left > right)
//            return;
//        if (left == 0 && right == 0) {
//            result.add(s);
//            return;
//        }
//        if (left > 0) {
//            dfs(result, s + "(", left - 1, right);
//        }
//        if (right > 0) {
//            dfs(result, s + ")", left, right - 1);
//        }
//    }



    //The idea here is to only add '(' and ')' that we know will guarantee us a solution
    // (instead of adding 1 too many close). Once we add a '(' we will then discard it and try a ')'
    // which can only close a valid '('. Each of these steps are recursively called.
    // which can only close a valid '('. Each of these steps are recursively called.

//    What is backtracking ?
    //Backtracking is a general algorithm for finding all (or some) solutions to some computational problems,
    // notably constraint satisfaction problems, that incrementally builds candidates to the solutions,
    // and abandons each partial candidate ("backtracks") as soon as it determines that the candidate cannot
    // possibly be completed to a valid solution.[1][2]



    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max){

        if(str.length() == max*2){
            list.add(str);
            return;
        }
        System.out.println("op count :" +open);
        System.out.println("cl count :" +open);
        System.out.println("mx count :" +max*2);
        System.out.println("str length :" +str.length());

        if(open < max) // increasing open counter
            backtrack(list, str+"(", open+1, close, max);
        if(close < open) // increasing close counter , if close less then open then we need add  )
            backtrack(list, str+")", open, close+1, max);
    }
    //--------------------------- BOOK SOLUTION -----358-------------
    public static String insertInside(String str, int leftIndex) {
        System.out.println("Inserting inside");
        String left = str.substring(0, leftIndex + 1);
        String right = str.substring(leftIndex + 1, str.length());
        return left + "()" + right;
    }

    public static Set<String> generateParens(int remaining) {
        Set<String> set = new HashSet<String>();
        if (remaining == 0) {
            set.add("");
        } else {
            Set<String> prev = generateParens(remaining - 1);
            for (String str : prev) {
                System.out.println("Current string : " +str);
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '(') {
                        String s = insertInside(str, i);
						/* Add s to set if it is not already in there. Note:
						 * HashSet automatically checks for duplicates before
						 * adding, so an explicit check is not necessary. */
                        set.add(s);
                    }
                } // End for
                set.add("()" + str);
                System.out.println("Added in set");
            }
        }
        return set;
    }

    //--------------------------- BOOK SOLUTION -----358--------------


}
