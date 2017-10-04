package DataStructure.Trie;



/**
 * Created by muthuselvan on 5/31/17.
 *
 * Understanding : https://www.youtube.com/watch?v=AXjmTQ8LEoI
 *
   What is Trie ?
   ================
 Trie is an ordered tree structure, which is used mostly for storing strings (like words in dictionary) in a compact way.

   Trie Structure ?
  ================
  In a trie, every node (except the root node) stores one character.
  By traversing up the trie from a leaf node to the root node, a string can be constructed.
  By traversing down the trie from the root node to a node nn, a common prefix can be constructed
  for all the strings that can be constructed by traversing down all the descendant nodes (including the leaf nodes)
  of node nn.
 *
 * Trie Example :
 * ==============
 * Trie is used store large number of string (10000, 20000) , example : phone book
 *
 * The String who is having common prefix can share the ancestor in Trie DS :
 * Ex : ab ,abc
 *
 * Big(o) :
 * ========
 * o(l*n )
 *
 * l = Average length of the word
 * n = total number of word
 *
 *  Code for insert and search recursively :
 *  ---------------------------------------
 *  https://github.com/mission-peace/interview/blob/master/src/com/interview/suffixprefix/Trie.java
 *
 *
 *    Code for Prefix based search :
 *    ==============================
 *    http://www.geeksforgeeks.org/longest-prefix-matching-a-trie-based-solution-in-java/
 *
 *    Suffix :
 *    -------
 *    http://www.geeksforgeeks.org/pattern-searching-using-trie-suffixes/
 *
 *
 * Structure of Tried Node :
 * --------------------------
 *
  class TrieNode {
    public TrieNode(char ch)  {
    value = ch;
    children = new HashMap<>();    // for maining parent child realation
    bIsEnd = false; // This flag will indicate for indicating end of the word reached or not

                        [ ROOT ,(a) ]          word ab and ac in Trid DS , every node contain boolean flag for end of the word
                     /           \
                    /            \
 }                [ b]           [ c ]



 * Opearation :
 * -----------
 * 1. insert
 * 2. search ( prefix based search , whole word search )
 *
 *   Prefix based search means : search string start with ab
 *   of prefix is match no need look further nodes in tree
 *
 *   When searching the whole word check the boolean is true or not , if its reached true
 *   then whole word exist
 *
 * 3. Delete :
 *   if we want delete the word , don't delete the node just mark end of the character in word as false
 *   if the end of the character is True then we can delete the all the nodes
 *
 */
public class TrieDemo {

    public TrieDemo() {

    }


}

