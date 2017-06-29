package CodingPractise;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by muthuselvan on 6/1/17.
 * http://www.geeksforgeeks.org/find-the-k-most-frequent-words-from-a-file/
 */
public class WordCount_WordFrequency {

    public static void main(String[] args) throws FileNotFoundException , IOException{
        System.out.println();

        readFile("/Users/muthuselvan/reader.txt");





    }

    /*
    A simple solution is to use Hashing. Hash all words one by one in a hash table. If a word is already present,
     then increment its count. Finally, traverse through the hash table and return the k words with maximum counts.
     */
    public static void readFile(String file ) throws FileNotFoundException,IOException {
//        Scanner console = new Scanner(System.in);
        System.out.print("What is the name of the text file? ");
//        String fileName = console.nextLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));
        String line =null;
        System.out.println("File " +file);

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println("-");
            System.out.println("["+line+"]");
        }

        Scanner input = new Scanner(new File(file));

        // count occurrences
        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            } else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }

        // get cutoff and report frequencies
        System.out.println("Total words = " + wordCounts.size());
        System.out.print("Minimum number of occurrences for printing? ");
//        int min = console.nextInt();
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
//            if (count >= min)
                System.out.println(count + "\t" + word);
        }
    }
    }

