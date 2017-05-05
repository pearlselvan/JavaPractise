package CodingPractise;

import java.util.*;

/**
 * Created by muthuselvan on 4/4/17.
 * Asked in gooogle
 */
public class ShortestDistance_TwoWords {

    static String in = "You Yahoo     google me come google apple apple";
    static String word1 = "Yahoo";
    static String word2 = "Google";

    public static void main(String[] args) {
       buildmap(in);
    }

    public static void buildmap(String in) {

        Set<String> build = new LinkedHashSet<>();
        String[] temp = in.trim().split("\\s");

        for (String word : temp) {
            word = word.trim();
            if (!word.isEmpty()) {
                build.add(word);
            }
        }
//        build.forEach(out -> System.out.println(out));

        // build the mapping between pairs of words to
        // their shortest distances
        System.out.println("Total word " +build.size());

        for(int i=0;i<build.size();i++) {
            for(int j=i;j<build.size();j++) {
//                System.out.println(build.);

            }

        }



    }

}
