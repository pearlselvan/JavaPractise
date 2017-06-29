package CodingPractise;

import java.util.Scanner;

/**
 * Created by muthuselvan on 3/28/17.
 * http://www.geeksforgeeks.org/horners-method-polynomial-evaluation/
 * This is a Java Program to Implement Horner Algorithm. Horner’s method is an efficient method for calculating polynomials.
  Here is the source code of the Java Program to Implement Horner Algorithm. The Java program is successfully
 compiled and run on a Windows system. The program output is also shown below.



 Horner’s Method for Polynomial Evaluation
 Given a polynomial of the form cnxn + cn-1xn-1 + cn-2xn-2 + … + c1x + c0 and a value of x, find the value of polynomial for a given value of x. Here cn, cn-1, .. are integers (may be negative) and n is a positive integer.

 Input is in the form of an array say poly[] where poly[0] represents coefficient for xn and poly[1] represents coefficient for xn-1 and so on.

 Examples:

 // Evaluate value of 2x3 - 6x2 + 2x - 1 for x = 3
 Input: poly[] = {2, -6, 2, -1}, x = 3
 Output: 5

 // Evaluate value of 2x3 + 3x + 1 for x = 2
 Input: poly[] = {2, 0, 3, 1}, x = 2
 Output: 23





 */
public class PolynomialEvaluation {
    private int sum;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Horner Algorithm Test\n");
        System.out.println("Enter highest power");
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("\nEnter "+ (n + 1) +" coefficients in increasing order");
        for (int i = 0; i <= n; i++)
            arr[i] = scan.nextInt();
        System.out.println("\nEnter x");
        int x = scan.nextInt();
        PolynomialEvaluation h = new PolynomialEvaluation(arr, x);

    }

    public void display()
    {
        System.out.println("Evaluated sum = "+ sum);
    }
    /** constructor **/
    public PolynomialEvaluation(int[] cof, int x)
    {
        sum = 0;
        calcSum(cof, x, cof.length - 1);
        display();
    }

    /** Calculate sum **/
    private void calcSum(int[] cof, int x, int N)
    {
        sum = cof[N] * x;
        for (int i = N - 1; i >= 1; i--)
            sum = (sum + cof[i]) * x;
        sum += cof[0];
    }


}
