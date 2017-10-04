package CodingPractise.String;

import java.util.Stack;

/**
 * Created by muthuselvan on 9/6/17.
 * http://qa.geeksforgeeks.org/3734/qa.geeksforgeeks.org/3734/print-the-pretty-json-strings-facebook-microsoft
 *
 * Example 1:

 Input : {A:"B",C:{D:"E",F:{G:"H",I:"J"}}}
 Output :
 {
 A:"B",
 C:
 {
 D:"E",
 F:
 {
 G:"H",
 I:"J"
 }
 }
 }
 */
public class PrettyJson_PrintJson {

    public static void main(String[] args) {

        printJSON("{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}");



    }

    static void printJSON(String str) {
        Stack<Integer> space = new Stack<>();
        int i  = 1;
        int n = str.length() - 1;
        System.out.println(str.charAt(0));
        space.push(2);
        while (i < n) {
            int sp = 0;
            if (str.charAt(i) == '[') {
                sp = space.peek();
                space.push(sp + 2);
            }
            else {
                if (str.charAt(i) == ']')   {
                    space.pop();
                    sp = space.peek();
                }
                else {
                    sp = space.peek();
                }
            }
            while(sp > 0) {
                System.out.print(' ');
                sp--;
            }
            System.out.print(str.charAt(i));
            if ( i < n && str.charAt(i+1) == ',') {
                System.out.print(',');
                i++;
            }
            System.out.println();
            i++;
        }
        System.out.println(str.charAt(n));
    }

}
