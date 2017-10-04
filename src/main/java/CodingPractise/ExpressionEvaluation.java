package CodingPractise;

import java.util.Stack;

/**
 * Created by muthuselvan on 5/10/17.
 * http://www.geeksforgeeks.org/expression-evaluation/
 * https://www.youtube.com/watch?v=MeRb_1bddWg
 * https://www.tutorialspoint.com/data_structures_algorithms/expression_parsing.htm
 *
 *
 * Sr. No.	Infix Notation	Prefix Notation	Postfix Notation
    1	        a + b	        + a b	        a b +
    2	     (a + b) ∗ c	∗ + a b c	      a b + c ∗
    3	     a ∗ (b + c)	∗ a + b c	      a b c + ∗
    4	  a / b + c / d	  + / a b / c d	    a b / c d / +
    5	(a + b) ∗ (c + d)	∗ + a b + c d	a b + c d + ∗
    6	((a + b) ∗ c) - d	- ∗ + a b c d	a b + c ∗ d -
 *
 * using postfix
 * using prefix
 *
 * what in prefix :
 * 1+2*4 will become 12+4*
 * after posfix how to evaluvate ?
 * for the given prefix : 12+4*
 * scan the item from left to right till operator (+,-, ,,)  add into the stack
 *
 * S= [ 1,2] if opeator + then pop last element from stack the do the manipulation and add the value to statck
 *
 * so now stacl S[ 3 ] then scan and add into stack S = [ 3,4 ..then next * then 3*4 = 12 ] ans = 12
 *
 *
 * Why postfix representation of the expression?
 * =============================================
    The compiler scans the expression either from left to right or from right to left.

    Example :
    =========
    Consider the below expression: a op1 b op2 c op3 d
    If op1 = +, op2 = *, op3 = +

    The compiler first scans the expression to evaluate the expression b * c,
    then again scan the expression to add a to it. The result is then added to d after another scan.
    The repeated scanning makes it very in-efficient. It is better to convert the expression to postfix(or prefix)
     form before evaluation.

    The corresponding expression in postfix form is: abc*+d+.
    The postfix expressions can be evaluated easily using a stack.
    We will cover postfix expression evaluation in a separate post.
 *
 *  STEPS ( maintain opearator stack / value stack /
 *  =====
 *  1. While there are still tokens to be read in,
    1.1 Get the next token.
    1.2 If the token is:
      1.2.1 A number: push it onto the value stack.
      1.2.2 A variable: get its value, and push onto the value stack.
      1.2.3 A left parenthesis: push it onto the operator stack.
      1.2.4 A right parenthesis:
        1 While the thing on top of the operator stack is not a
 left parenthesis,
            1 Pop the operator from the operator stack.
            2 Pop the value stack twice, getting two operands.
            3 Apply the operator to the operands, in the correct order.
            4 Push the result onto the value stack.
       2 Pop the left parenthesis from the operator stack, and discard it.
     1.2.5 An operator (call it thisOp):
            1 While the operator stack is not empty, and the top thing on the
 operator stack has the same or greater precedence as thisOp,
        1 Pop the operator from the operator stack.
        2 Pop the value stack twice, getting two operands.
        3 Apply the operator to the operands, in the correct order.
        4 Push the result onto the value stack.
      2 Push thisOp onto the operator stack.
    2. While the operator stack is not empty,
       1 Pop the operator from the operator stack.
       2 Pop the value stack twice, getting two operands.
       3 Apply the operator to the operands, in the correct order.
       4 Push the result onto the value stack.
    3. At this point the operator stack should be empty, and the value
 stack should have only one value in it, which is the final result.
 *
 *
 *
 */
public class ExpressionEvaluation {

    public static void main(String[] args) {

        System.out.println(EvaluateString.evaluate("10 + 2 * 6"));
//        System.out.println(EvaluateString.evaluate("100 * 2 + 12"));
//        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 )"));
//        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 ) / 14"));

//        usingPrefixEvaluvateExpression("e");

//        char a = 1;
//        char b = 2 ;
//        usingPrefixEvaluvateExpression("23*54*+9");
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


class EvaluateString {
    public static int evaluate(String expression)
    {
        System.out.println("Expression : " +expression);
        char[] tokens = expression.toCharArray();


        // Stack for numbers: 'values'
        Stack<Integer> values = new Stack<Integer>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++)
        {
            // Current token is a whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            // Current token is a number, push it to stack for numbers
            if (tokens[i] >= '0' && tokens[i] <= '9')
            {
                StringBuffer sbuf = new StringBuffer();
                // There may be more than one digits in number
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                System.out.println("String Buffer : " +sbuf);
                values.push(Integer.parseInt(sbuf.toString()));
                System.out.println("Value Stack :" +values);
            }


            // Current token is an opening brace, push it to 'ops'
            else if (tokens[i] == '(')
                ops.push(tokens[i]);

                // Closing brace encountered, solve entire brace
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }

            // Current token is an operator.
            else if (tokens[i] == '+' || tokens[i] == '-' ||
                    tokens[i] == '*' || tokens[i] == '/')
            {
                // While top of 'ops' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'ops'
                // to top two elements in values stack
                System.out.println("Values " +values);
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                // Push current token to 'ops'.
                ops.push(tokens[i]);
                System.out.println("Opearator : " +ops);
            }
        }

        // Entire expression has been parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));

        // Top of 'values' contains result, return it
        return values.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    // A utility method to apply an operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static int applyOp(char op, int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

}
