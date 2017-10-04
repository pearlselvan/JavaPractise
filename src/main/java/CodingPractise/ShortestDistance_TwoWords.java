package CodingPractise;

import java.util.*;

/**
 * Created by muthuselvan on 4/4/17.
 * Asked in gooogle
 */
public class ShortestDistance_TwoWords {

    static String in = "You Yahoo google me come apple orange";
    static String word1 = "orange";
    static String word2 = "google";



    public static void main(String[] args) {

        String[] splitword = in.split(" ");
        System.out.println(shortestDistance(splitword,word1,word2));



//        buildmap(in);
    }

//    public static void buildmap(String in) {
//
//        Set<String> build = new LinkedHashSet<>();
//        String[] temp = in.trim().split("\\s");
//
//        for (String word : temp) {
//            word = word.trim();
//            if (!word.isEmpty()) {
//                build.add(word);
//            }
//        }
////        build.forEach(out -> System.out.println(out));
//
//        // build the mapping between pairs of words to
//        // their shortest distances
//        System.out.println("Total word " +build.size());
//
//        for(int i=0;i<build.size();i++) {
//            for(int j=i;j<build.size();j++) {
////                System.out.println(build.);
//
//            }
//
//        }
//
//
//
//    }

  //Creating two lists storing indexes of each occurrence of the word1 and word2
  // accordingly.
  // After that finding minimum difference between two elements from these lists.
    public static int shortestDistance(String[] words, String word1, String word2) {
        List<Integer> w1occ=new ArrayList<Integer>();
        List<Integer> w2occ=new ArrayList<Integer>();

        //Checking index of the word1 in given word
        for (int i=0; i<words.length; ++i){
            if (words[i].equals(word1)){
                w1occ.add(i);
            }

            //Checking index of the word2 in given word
            if (words[i].equals(word2)){
                w2occ.add(i);
            }

        }



        System.out.println("word list 1 " +w1occ);
        System.out.println("word list 2 " +w2occ);


        // The below loop in case if word1 coming in end of the string and word2 present in begining of the word
        int min=words.length;
        int p1=0;
        int p2=0;
        while (p1<w1occ.size() && p2<w2occ.size()){
            System.out.println("w1occ.get(p1) : " +w1occ.get(p1));
            System.out.println("w2occ.get(p2) : " +w2occ.get(p2));
            min=Math.min(Math.abs(w1occ.get(p1)-w2occ.get(p2)), min);
            System.out.println("Min - " +min);
            if (w1occ.get(p1)<w2occ.get(p2)){
                p1++;
            } else
                p2++;
        }
        return min-1;
    }


}
