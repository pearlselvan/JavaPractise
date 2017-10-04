package DataStructure.Hashing;

import java.util.HashMap;

/**
 * Created by muthuselvan on 3/6/17.

 * http://javahungry.blogspot.com/2013/08/hashing-how-hash-map-works-in-java-or.html
 * * https://dzone.com/articles/hashmap-internal

 ----------------------------------------------- -----------------------------------------------
 Basic principle :
 ==================
 it works based on the hashing principle
 ----------------------------------------------- -----------------------------------------------
 What is Hashing ?
 ==================
 Hashing is the mechanism of assigning unique code to a variable or attribute
 using an algorithm
 to enable easy retrieval.

 A true hashing mechanism should always return the same hashCode() when
 it is applied to the same object.
 ----------------------------------------------- -----------------------------------------------


// if interview asking write methond for put / get then :
//    https://dzone.com/articles/how-hashmap-works-in-java

How are Duplicate Keys Prevented in HashMap?
 =============================================
As we all know, HashMap doesn't allow duplicate keys, even though
 when we insert the same key with different values, only the latest value is returned.

All the Entry Objects in the LinkedList will have the same hashcode, but HashMap uses equals() .
This method checks the equality, so if key.equals(k) is true, then it will
replace the value object inside the Entry class and not the key. So this way it prevents
the duplicate key from being inserted

  Ex :https://dzone.com/articles/how-hashmap-works-in-java
 ----------------------------------------------- -----------------------------------------------

/*
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


Hash map works on the principle of hashing ?
 -------------------------------------------

HashMap get(Key k) method calls hashCode method on the key object
and applies returned hashValue to its own static hash function to
find a bucket location(backing array) where keys and values are
stored in form of a nested class called Entry (Map.Entry) .

So you have concluded that from the previous line that Both key and value is stored
in the bucket as a form of  Entry object .
So thinking that Only value is stored  in the bucket is not correct and
will not give a good impression on the interviewer .

* Whenever we call get( Key k )
* method on the HashMap object . First it checks that whether key is null or not .
  * Note that there can only be one null key in HashMap


http://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/


 Hash Table Collision Handling :
 -------------------------------

 * Linear Probing:  Linear probing is a probe sequence in which the interval between probes is fixed
 * ---------------
 * Quadratic Probing:
 * Double Hashing:
 *



 */
public class HashMapWorks {

    public static void main(String[] args) {
        HashMap<String ,String> hashMap = new HashMap<>();
    }
}
