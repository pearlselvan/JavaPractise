package CodingPractise.String;

/**
 * Created by muthuselvan on 4/27/17.
 */
class SearchPatternInString {

public static void main(String args[]) {


        System.out.println(containsPattern("Welcome","sir welcome"));


        }

public static boolean containsPattern(String source,String pattern) {

        char[] sourceChar=source.toCharArray();
        char[] patternChar=pattern.toCharArray();

        char sourceC ;
        char destC ;

        boolean match = true ;

        for (int i=0;i<source.length();i++) {
        sourceC = source.charAt(i);
        for (int j=0;j<pattern.length();j++) {
        destC = pattern.charAt(j);
        if (sourceC == destC){
        // System.out.println("Found pattern");
        match=true;

        } else {
        // System.out.println("No Found pattern");
        match=false;
        }



        }
        }
        return match;

        }



        }
