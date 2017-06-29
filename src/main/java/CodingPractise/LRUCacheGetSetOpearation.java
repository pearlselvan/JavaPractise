package CodingPractise;

/**
 * Created by muthuselvan on 6/11/17.
 * http://www.programcreek.com/2013/03/leetcode-lru-cache-java/
 *
 * http://chriswu.me/blog/a-lru-cache-in-10-lines-of-java/ (Adding Size)
 *
 * http://www.roseindia.net/java/example/java/util/LRUCacheExample.shtml
 *
 * https://alaindefrance.wordpress.com/2014/10/05/lru-cache-implementation/ (Best )
 *
 * (If your entry exceeds the size of the LRU Cache the the eldest element with key is removed)
 *
 * Remove the oldest page used
 * ---------------------------
 *
 * Discards the least recently used items first. This algorithm requires keeping track of what was used when,
 * which is expensive if one wants to make sure the algorithm always discards the least recently used item.
 *
 * Analysis
 * ========
     The key to solve this problem is using a double linked
     list which enables us to quickly move nodes.

 The LRU cache is a hash table of keys and double linked nodes.
 The hash table makes the time of get() to be O(1).
 The list of double linked nodes make the nodes adding/removal operations O(1).

 Big-O-Analysis:
 --------------

 Since it’s a cache you need to guarantee a O(1) for reading and writing. For a fast access,
 hash tables are very often the right data structure so we can consider it, but we need to keep
 the order and hash tables cannot do that.
 An LRU cache is also a FIFO (First In First Out) data structure,
 a queue looks very adapted too but we loose the O(1) access time.

 A good approach is to use both:
 -------------------------------
 1. An hash table for the O(1) lookup time
 2. A queue to keep the order

 Problem in above :
 ------------------
 The only one problem is that queues are very effective for enqueue and dequeue but very slow
 for random access,
 and since each hit has to reorder the queue, those operations would lead to a O(n) lookup time for
 rearranging the queue every time we access the cache.


 The good strategy is
 --------------------
 to keep this approach but use a double linked list instead of a queue because:

 1. Very easy to implement a queue with it
 2. Still slow for random access but easy to move a given node to the head and it’s all we need

 Which is one is remove ?
 =========================
 If your entry exceeds the size of the LRU Cache the the eldest element with key is removed

 Data Strucutre :
 ===============
 LRU Cache is implemented through the LinkedHashMap class.
 LinkedHashMap holds values with unique key.
 You you store values with a duplicate key then the LinkedHashMap replace the old value of that key
 with the new value of the key.

 ---
 Last Recently Used Cache Eviction
 ==================================
 To accomplish cache eviction we need to be easily able to:

 1.Query the last recently used item
 2.Mark an item as the most recently used item
 A linked list allows for both operations.
 Checking for the least recently used item can just return the tail.
 Marking an item as recently used can be simply removing it from its current position and moving it to the head.
 The missing puzzle piece is finding this item in the linked list quickly.


 *
 */
public class LRUCacheGetSetOpearation {
}
