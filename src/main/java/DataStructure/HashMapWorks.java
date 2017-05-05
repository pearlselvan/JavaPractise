package DataStructure;

import java.util.HashMap;

/**
 * Created by muthuselvan on 3/6/17.
 * https://dzone.com/articles/hashmap-internal
 */

/*
HashMap works internally?

Below is the static inner class in HashTable
---------------------------------------------

Array of linked list data structure will be used in HT / HM

 transient Node<K,V>[] table;

 static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;
        final K key;
        V value;
        Node<K,V> next;  // pointer to the next node

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        }

HashMaps use an inner class  to store data: the Node<K, V>.(As per java 8 )
This entry is a simple key-value pair with two extra data:

A HashMap stores data into multiple singly linked lists of entries (also called buckets or bins).
All the lists are registered in an array of Entry (Entry<K,V>[] array) and the default capacity of this inner array
is 16.

What is collision ? : http://javarevisited.blogspot.com/2016/01/how-does-java-hashmap-or-linkedhahsmap-handles.html?m=1
f a key end up in same bucket location where an entry is already stored
 then this entry is just added at the head of the linked list there.
 In the worst case this degrades the performance of the get()
 method of HashMap to O(n) from O(1).

http://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/



 */
public class HashMapWorks {

    public static void main(String[] args) {
        HashMap<String ,String> hashMap = new HashMap<>();
    }
}
