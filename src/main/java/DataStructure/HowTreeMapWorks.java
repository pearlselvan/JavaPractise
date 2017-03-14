package DataStructure;

import java.util.HashMap;

/**
 * Created by muthuselvan on 3/12/17.
 * http://javahungry.blogspot.com/2014/06/how-treemap-works-ten-treemap-java-interview-questions.html
 *
 *
 * How Tree Map works ?
 *
 * TreeMap is a Red-Black tree based NavigableMap implementation.In other words ,
 * it sorts the TreeMap object keys using Red-Black tree algorithm.
 *
 * What is red blac tree ?
 * Red Black algorithm is a complex algorithm .
 * We should read the pseudo code of Red Black algorithm in order to understand the internal implementation .

 Red Black tree has the following properties :

 1. As the name of the algorithm suggests ,color of every node in the tree is either red or black.
 2. Root node must be Black in color.
 3. Red node can not have a red color neighbor node.
 4. All paths from root node to the null should consist the same number of black nodes .

 What is "natural ordering" in TreeMap ?
 "Natural" ordering is the ordering implied by the implementation of the Comparable
 interface by the objects used as keys in the TreeMap

 classcast exception in tree map ?

 Natural ordering is the order provided by the Comparable interface .
 If somebody puts the key  that do not implement natural order then it will throw ClassCastException.

 Internal HashMap implementation use Hashing.
 TreeMap internally uses Red-Black tree implementation.

 Null keys and null value : HashMap can store one null key and many  null values.
 TreeMap can not contain null keys but may contain many null values.

 HashMap Vs TreeMap :
 http://javahungry.blogspot.com/2015/11/difference-between-hashmap-and-treemap-with-example.html

 */


public class HowTreeMapWorks {

    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>(); //fater then tree map and HashMap does not maintain any order.
        hashMap.put("A","M1");
        hashMap.put("C","M2");
        hashMap.put("B","M3");
        hashMap.put("B1",null);
        System.out.println(hashMap);

        HashMap<String,String> treemap = new HashMap<>();
        treemap.put("A","M111");
        treemap.put("C","M12");
        treemap.put("B","M11");
        treemap.put("B1",null);
        System.out.println(treemap); //elements are sorted by keys in natureal order


    }
}
