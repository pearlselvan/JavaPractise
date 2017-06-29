package Collections;

/**
 * Created by muthuselvan on 2/3/17.
 * http://javarevisited.blogspot.com/2015/08/difference-between-HashMap-vs-TreeMap-vs-LinkedHashMap-Java.html
 *
 *
 * HashMap doesn't provide any ordering guarantee for entries, which means,
 * you can not assume any order while iterating over keys and values of HashMap.
 * This behavior of HashMap is similar to Hashtable while other two Map implementation
 * provides ordering guarante


 * LinkedHashMap can be used to maintain insertion order,
 * on which keys are inserted into Map or it can also be used to maintain an access order,
 * on which keys are accessed. This provides LinkedHashMap an edge over HashMap without
 * compromising too much performance.
 *
 *
 * TreeMap provides you complete control over sorting elements by passing custom Comparator of your choice,
 * but with the expense of some performance. Since entries are stored in a tree-based data structure,
 * it provides lower performance than HashMap and LinkedHashMap.
 *

 Thread-safety and Synchronization
 ----------------------------------

 All three Map implementation are not thread-safe, which means you can not use them safely
 in a multi-threaded application.
 Though you can synchronize them externally by using Collections.synchronizedMap(Map map) method.
 Alternatively, you can also use their concurrent counterpart e.g. ConcurrentHashMap which is
 also a better choice than HashMap in a concurrent Java application.

 When using synchronized Map e.g. synchronized LinkedHashMap or SortedMap,
 you must do at the time or creating the map to prevent accidental non-synchronized access.
 You can use the following idiom to create Synchronized Map in Java


 Internal Implementation
 -----------------------

 TreeMap is Red-Black tree based NavigableMap implementation
 while HashMap is internally backed by an array. It uses index[0] to store entries corresponding
 to null keys. In fact, questions related to the inner working of HashMap is very popular in Java,
 for example, How does get() method of HashMap works internally is one of the frequently used questions
 to Senior Java developers.

 On the other hand, LinkedHashMap extends HashMap and uses linked list to provide
 insertion order guarantee.
 It uses doubly-linked list running through all of its entries,
 which can also be used to maintain access-order.
 Remember, insertion order is not affected if a key is re-inserted into LinkedHashMap,
 but access order is affected if LinkedHashMap is created to maintain access-order.

 TreeMap is internally based upon Red-Black Tree and NavigableMap, introduced in JDK 6. The Red-Black tree is used to maintain the sorting order imposed by Comparable or Comparator, provided at the time of creation.  TreeMap provides guaranteed log(n) time cost for the get, put, containsKey and remove operations. Algorithms are adaptations of those in Cormen, Leiserson, and Rivest's Introduction to Algorithms.









 *
 *
 */
public class Whentouse_LinkedHashMap_TreeMap_HashMap {
}
