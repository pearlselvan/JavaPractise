package CodingPractise;

import java.util.Scanner;

/**
 * Created by muthuselvan on 7/7/17.
 */
public class Practise4_Regx {

    public static final String EXAMPLE_TEST = "it is right";

    public static void main(String[] args) {


//        String s = "this is right";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        //        //https://stackoverflow.com/questions/30183807/java-string-replace-exact-word



        System.out.println(input.replaceAll("\\bis\\b", "is not"));



        System.exit(0);
        System.out.println(EXAMPLE_TEST.matches("\\w.*"));
        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);// should be 14
        for (String string : splitString) {
//            System.out.println(string);
        }
        // replace all whitespace with tabs
//        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
        System.out.println(EXAMPLE_TEST.replaceAll("is", "is not"));
    }
    }
