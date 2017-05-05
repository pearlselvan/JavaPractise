package CodingPractise;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by muthuselvan on 4/8/17.
 * http://www.java67.com/2015/10/java-program-to-find-repeated-words-and-count.html
 */
public class FindHighestRepeatedWord {

    public static void main(String[] args) {

    buildMap("/Users/muthuselvan/reader.txt");

    }


    public static void buildMap(String fileName) {
        File fin = new File("/Users/muthuselvan/reader.txt");
        HashMap<String,Integer> duplicateMap = new HashMap<>();
        FileReader fr;BufferedReader br = null;
        try {
            fr = new FileReader(fin);
            br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        String line ;
        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                Pattern pattern = Pattern.compile("\\s+");

                String[] words = pattern.split(line);

                for (String word : words) {

                    // if hasmap contains duplicate word
                    if (duplicateMap.containsKey(word)) {
                        duplicateMap.put(word,(duplicateMap.get(word)+1));
                        //wordMap.put(word, (wordMap.get(word) + 1));
                    } else {
                        duplicateMap.put(word,1);
                    }


                    duplicateMap.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findDup(String fileName) {
        File fin = new File(fileName);
        FileReader fr;BufferedReader br = null;
        Set<String> dupSet = new HashSet<>();
        List<String> dutList = new ArrayList<>();
        try {
            fr = new FileReader(fin);
            br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        String line ;
        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split(" ");

                for (String word : words) {
                    if (!dupSet.add(word)) {
                        dutList.add(word);
                    }

                }


                System.out.println("List Size (DUP)" +dutList.size());

                dutList.forEach(out-> System.out.println(out));



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
