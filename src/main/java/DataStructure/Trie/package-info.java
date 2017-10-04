/**
 * Created by muthuselvan on 9/3/17.
 *
 * What Trie ?:
 * Every node of trie consists of multiple branches.
 * Each branch represents a possible character of keys.
 * We need to mark the last node of every key as leaf node.
 * A trie node field value will be used to distinguish the node as leaf node
 *
 * Ref : http://www.geeksforgeeks.org/trie-insert-and-search/
 *
 *
 * BST Vs Trie :
   --------------
 *  If we store keys in binary search tree, a well balanced BST will need
 *  time proportional to M * log N, where M is maximum string length and N is number
 *  of keys in tree.
 *
 *  Using trie,
 *  -----------
 *   we can search the key in O(M) time.
 *   However the penalty is on trie storage requirements.
 *
 *  Memory issue in Trie :
 *  ----------------------
 *  Insert and search costs O(key_length), however the memory requirements of trie is O(ALPHABET_SIZE * key_length * N)
 *  where N is number of keys in trie.
 */
package DataStructure.Trie;
