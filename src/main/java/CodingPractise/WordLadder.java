package CodingPractise;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by muthuselvan on 6/1/17.
 *
 * Question :
 *==========
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

 Only one letter can be changed at a time.
 Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 For example,

 Given:
 ========
 beginWord = "hit"
 endWord = "cog"
 wordList = ["hot","dot","dog","lot","log","cog"]
 Return :
 -------
 As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 return its length 5.

 Note:
 -----x
 Return 0 if there is no such transformation sequence.
 All words have the same length.
 All words contain only lowercase alphabetic characters.
 You may assume no duplicates in the word list.
 You may assume beginWord and endWord are non-empty and are not the same.


 Solution :
 ----------
 * http://www.programcreek.com/2012/12/leetcode-word-ladder/
 * https://leetcode.com/problems/word-ladder/description/
 *
 *
    Word Ladder problem and solution :  BFS &
 http://javabypatel.blogspot.in/2015/10/word-ladder-doublets-word-links-word-golf.html

 BFS :
 =====
 So this was Breadth First approach, where all words at same levels are collected first,
 that is all words with one letter difference are collected in Queue, and then each paths are
 checked for next level words until we found the endWord.

 *
 *
 */
public class WordLadder {

    public static void main(String[] args) {

        Set<String> wordlist = new HashSet<>();
        wordlist.add("hot");
        wordlist.add("dot");
        wordlist.add("dog");
        wordlist.add("lot");
        wordlist.add("log");
        wordlist.add("cog");

        System.out.println(ladderLength("hit","cog",wordlist));



    }



    public static int ladderLength(String start, String end, Set<String> dict) {
        // Use queue to help BFS
        Queue<String> queue = new LinkedList<String>();
        queue.add(start);
        queue.add(null);

        // Mark visited word
        Set<String> visited = new HashSet<String>();
        visited.add(start); //Adding first start word into Q

        int level = 1; // This will return no of matches

        while (!queue.isEmpty()) {
            String str = queue.poll();

            if (str != null) {
                // Modify str's each character (so word distance is 1)
                for (int i = 0; i < str.length(); i++) {
                    char[] chars = str.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;
//                        System.out.println(chars);

                        String word = new String(chars);

                        // Found the end word
                        if (word.equals(end)) return level + 1;

                        // Put it to the queue
                        if (dict.contains(word) && !visited.contains(word)) {
                            queue.add(word);
                            visited.add(word);
                        }
                    }
                }
            } else {
                level++;

                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }
        }
        System.out.println("Word : " +queue);
        System.out.println("Word : " +visited);
        return 0;
    }

}
