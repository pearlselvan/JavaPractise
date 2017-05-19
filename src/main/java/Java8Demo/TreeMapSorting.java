package Java8Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by muthuselvan on 5/8/17.
 */
public class TreeMapSorting {

    public static void main(String[] args) {

        treeMapOrdered();
        hashMapOrdered();

    }

    //A TreeMap is sorted by keys
//    Implementation : TreeMap internally uses Red-Black tree implementation.
    //TreeMap provides guaranteed log(n) time cost for the get and put method.
    //Functionality :   Just like TreeSet , TreeMap is rich in functionality.
    // Functions like pollFirstEntry() , pollLastEntry() , tailMap() , firstKey() , lastKey() etc.
    // are not present in HashMap.
    public static void treeMapOrdered() {
        System.out.println("TreeMap..");
        TreeMap<Integer,String> fruits= new TreeMap<>();
        fruits.put(3,"Carrot");
        fruits.put(2,"Banana");
        fruits.put(1,"Apple");
//        fruits.put(null,"Carrot"); // This will throw NPE because tree map will not null key
        fruits.put(4,null);
        fruits.put(5,null); // This will not throw any NPE because value can be NULL


        fruits.forEach((k,v) -> System.out.println("K - " +k +": " +v));
        System.out.println(fruits.pollFirstEntry());
        System.out.println(fruits.pollLastEntry());
        System.out.println(fruits.tailMap(2));
    }

 //Implementation : Internal HashMap implementation use Hashing.
//    Performance : HashMap  take constant time performance for the basic operations like get and put i.e O(1).
//HashMap is much faster than TreeMap


    public static void hashMapOrdered() {
        System.out.println("HashMap..");
        Map<Integer,String> fruits= new HashMap<>();
        fruits.put(3,"Carrot");
        fruits.put(2,"Banana");
        fruits.put(1,"Apple");

        fruits.put(null,null); // This will NOT throw any NPE because hashmap key can by null
        fruits.put(4,null);// This will NOT throw any NPE because hashmap value can by null


        fruits.forEach((k,v) -> System.out.println("K - " +k +": V -  " +v));
    }

}
