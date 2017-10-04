package Collections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by muthuselvan on 6/22/17.
 *
 * Question :
 * How to sort multiple columns with Single Comparator based on specific attribute & specific need?
 *
 *
 *
 * Code :
 * https://github.com/jeevatkm/generic-repo/tree/master/genericComparator
 *
 *
 */
public class GenericComparator {


    public GenericComparator() {



    }

    public static void main(String[] args) {
        HashMap<String,Integer> appleProdcuts = new HashMap<>();
        appleProdcuts.put("MAC",3000);
        appleProdcuts.put("IPAD",2000);
        appleProdcuts.put("IPHONE",1000);
        System.out.println("Original " +appleProdcuts);

         //Using ananymous class
//        TreeMap<String,Integer> sortedmap = new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return appleProdcuts.get(o2).compareTo(appleProdcuts.get(o1));
//            }
//        });

        TreeMap<String,Integer> sortedmap = new TreeMap<>(new mycomparator(appleProdcuts));
        TreeMap<String,Integer> sortedGenericmap = new TreeMap<>(new ValueGenericComparator(appleProdcuts));

        sortedmap.putAll(appleProdcuts);
        System.out.println("Using Non Generic : " +sortedmap);// This will print key with decending order actual this is not possbile in hashmap


        sortedGenericmap.putAll(appleProdcuts);  //** Don't forget this
        System.out.println("Using Generic : " +sortedGenericmap);

    }


}

//http://www.programcreek.com/2013/03/java-sort-map-by-value/ --> Check last
class mycomparator implements Comparator {

    Map<String,Integer> mymap ;
    public mycomparator(Map<String,Integer> mymap) {
        this.mymap=mymap;
    }

    @Override
    public int compare(Object o1,Object o2) {
        return mymap.get(o2).compareTo(mymap.get(o1));
    }

}

// a comparator using generic type
class ValueGenericComparator<K, V extends Comparable<V>> implements Comparator<K>{

    HashMap<K, V> map = new HashMap<K, V>();

    public ValueGenericComparator(HashMap<K, V> map){
//        this.map.putAll(map);
        this.map=map;
    }

    @Override
    public int compare(K s1, K s2) {
        return map.get(s2).compareTo(map.get(s1));//descending order
    }
}


//class HashMapComparatorByKeyDecending implements Comparator {
//    private Map<String,Integer> map ;
//    public HashMapComparatorByKeyDecending(Map<String,Integer> map) {
//        this.map=map;
//    }
//    @Override
//    public int compare(Object o1, Object o2) {
//        return map.get(o2).compareTo(map.get(o1));
//    }
//}
