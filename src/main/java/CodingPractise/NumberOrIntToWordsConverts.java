package CodingPractise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by muthuselvan on 6/5/17.
 *
 * Ask question . How many digit ? if 4
 * http://www.geeksforgeeks.org/convert-number-to-words/
 *
 *
 *
 *
 * http://www.geeksforgeeks.org/program-to-convert-a-given-number-to-words-set-2/
    Time complexity of above solution is O(1).
    Auxiliary space used by the program is O(1).


    JAVE CODE :
 =================
 http://javahungry.blogspot.com/2014/05/convert-math-number-to-equivalent-readable-word-in-java-code-with-example.html
 *
 */
public class NumberOrIntToWordsConverts {

    public static void main(String[] args) {

      NumberOrIntToWordsConverts numberOrIntToWordsConverts = new NumberOrIntToWordsConverts();
//        System.out.println("*** " + numberOrIntToWordsConverts.convert(123456789));
        System.out.println("*** " + numberOrIntToWordsConverts.convert(-55));
//        System.out.println("*** " + numberOrIntToWordsConverts.convert(25));
//        System.out.println("*** " + numberOrIntToWordsConverts.convert(05));
//        System.out.println("*** " + numberOrIntToWordsConverts.convert(00));
//        System.out.println("*** " + numberOrIntToWordsConverts.convert(2100));
//        System.out.println("*** " + numberOrIntToWordsConverts.convert(100000));

    }




    private static final String[] specialNames = {
            "",
            " thousand",
            " million",
            " billion",
            " trillion",
            " quadrillion",
            " quintillion"
    };

    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private String convertLessThanOneThousand(int number) {
        String current;
        System.out.println("Actual Number : " +number);
        if (number % 100 < 20){
            System.out.println(" number % 100 : " +number%100);
            current = numNames[number % 100];
            number /= 100;
        }
        else {
            System.out.println("number % 10 - " +number%10);
            current = numNames[number % 10];
            number /= 10;

            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " hundred" + current;
    }

    public String convert(int number) {
        System.out.println("Actual Number : " +number);
        if (number == 0) { return "zero"; }

        String prefix = "";

        if (number < 0) {
            number = -number;
            prefix = "negative";
        }

        String current = "";
        int place = 0;

        do {
            int n = number % 1000;
            System.out.println("Number % 1000  " +n);
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                System.out.println("After convertLessThanOneThousand : " +s);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (prefix + current).trim();
    }



}
