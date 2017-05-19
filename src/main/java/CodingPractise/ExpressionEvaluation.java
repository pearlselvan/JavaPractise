package CodingPractise;

import java.util.Stack;

/**
 * Created by muthuselvan on 5/10/17.
 * http://www.geeksforgeeks.org/expression-evaluation/
 * https://www.youtube.com/watch?v=MeRb_1bddWg
 *
 * using postfix
 * using prefix
 *
 * what in prefix :
 * 1+2*4 will become 12+4*
 * after prefix how to evaluvate ?
 * for the given prefix : 12+4*
 * scan the item from left to right till operator (+,-, ,,)  add into the stack
 *
 * S= [ 1,2] if opeator + then pop last element from stack the do the manipulation and add the value to statck
 *
 * so now stacl S[ 3 ] then scan and add into stack S = [ 3,4 ..then next * then 3*4 = 12 ] ans = 12
 *
 *
 */
public class ExpressionEvaluation {

    public static void main(String[] args) {

//        usingPrefixEvaluvateExpression("e");

        char a = 1;
        char b = 2 ;
        usingPrefixEvaluvateExpression("23*54*+9");
//        System.out.println("Sum " +(a+b));
    }

    // 23*54*+9-  ==> 17
    public static void usingPrefixEvaluvateExpression(String exp) {
        Stack<Character> opearand = new Stack<>();
        char[] expArray = exp.toCharArray();
        char num1 = 0;
        char num2 = 0;
        char res = 0;
        for (int i=0;i<exp.length();i++) {

            if (Character.isDigit(expArray[i])) {
                opearand.push(expArray[i]);
            } else if (expArray[i] == '+') {
                num1=opearand.pop();
                num2=opearand.pop();
                res = (char) (num1+num2);
                opearand.push((char)res);


            } else if (expArray[i] == '-') {

                num1=opearand.pop();
                num2=opearand.pop();
                res = (char) (num1+num2);
                opearand.push((char)res);

            }else if (expArray[i] == '*') {
                num1=opearand.pop();
                num2=opearand.pop();
                res = (char) (num1+num2);
                opearand.push((char)res);

            } else if (expArray[i] == '/') {
                num1=opearand.pop();
                num2=opearand.pop();
                res = (char) (num1+num2);
                opearand.push((char)res);

            }
        }
        System.out.println("Result final : " +opearand.pop());

    }


    public int perform(char opr,char num1 , char num2) {
        int result = 0 ;
        if (opr == '+') {
           result=num1 + num2;
        } else  if (opr == '+') {
            result=num1 + num2;
        } else  if (opr == '-') {
            result=num1 - num2;
        } else  if (opr == '*') {
            result=num1 * num2;
        }  else  if (opr == '*') {
            result=num1 * num2;
        } else {
            System.out.println("invalid opearator");
        }
        return result;



    }
    public boolean isDigit(char c) {
        return Character.isDigit(c);

    }


}
