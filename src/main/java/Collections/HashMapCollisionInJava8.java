package Collections;

/**
 * Created by muthuselvan on 6/21/17.
 * http://javarevisited.blogspot.com/2016/01/how-does-java-hashmap-or-linkedhahsmap-handles.html
 *
 * So far (until JDK 8) only ConcurrentHashMap, LinkedHashMap and HashMap will
 * use the balanced tree in case of a frequent collision.This is a dynamic feature which
 * means HashMap will initially use the linked list but when the number of entries crosses a certain
 * threshold it will replace the linked list with a balanced binary tree.
 *
 *
 * Java 8 performance improvement in HM :
 * -------------------------------------
 * What is the reason behind such a tremendous performance improvement, e
 * ven in terms of big-O notation? Well, this optimization is described in JEP-180.
 * Basically when a bucket becomes too big (currently: TREEIFY_THRESHOLD = 8),
 * HashMap dynamically replaces it with an ad-hoc implementation of tree map.
 * This way rather than having pessimistic O(n) we get much better O(logn).
 *
 * http://www.nurkiewicz.com/2014/04/hashmap-performance-improvements-in.html
 *
 * How does it work in JAVA 8 ?
 * ----------------------------
 * Well, previously entries with conflicting keys were simply
 * appended to linked list, which later had to be traversed.
 * Now HashMap promotes list into binary tree, using hash code as a branching variable.
 * If two hashes are different but ended up in the same bucket, one is considered bigger
 * and goes to the right. If hashes are equal (as in our case),
 * HashMap hopes that the keys are Comparable, so that it can establish some order.
 * This is not a requirement of HashMap keys, but apparently a good practice.
 * If keys are not comparable, don't expect any performance improvements
 * in case of heavy hash collisions.



 *
 */
public class HashMapCollisionInJava8 {
}
