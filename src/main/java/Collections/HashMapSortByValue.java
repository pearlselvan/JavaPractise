package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by muthuselvan on 7/11/17.
 * http://memorynotfound.com/sorted-map-example/
 */
public class HashMapSortByValue {
    public static void main(String[] args) {
        HashMap<String,Integer> phoneEntry = new HashMap<>();
        phoneEntry.put("AMuthu",12000);
        phoneEntry.put("Ram",1000);
        phoneEntry.put("Rev",3000);
        System.out.println(phoneEntry);
//        TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>(new HashMapComparatorByKeyDecending(phoneEntry)); ---------> OR using ananymous class in below
        TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return phoneEntry.get(o2).compareTo(phoneEntry.get(o1));
            }


        });
                treeMap.putAll(phoneEntry);
         System.out.println(treeMap);
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





//        int[] grades =  {100,80};
//        int sum =  0 ;
//        for (int i=0;i<grades.length;i++) {
//            sum = sum + grades[i];
//        }
//        System.out.println(sum/2);
