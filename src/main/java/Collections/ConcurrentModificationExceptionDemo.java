package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by muthuselvan on 2/2/17.
 *
 * What is Concurrent modification exception ?
 * ---------------------------------------------
 * Java Collection classes are fail-fast, which means if the Collection will be changed
 * while some thread is traversing over it using iterator, the iterator.next() will throw ConcurrentModificationException.
 *
 * Concurrent modification exception can come in case of multithreaded as well as single threaded java programming
 * environment.
 *
 * How to avoid ?
 * ----------------
 *
 * 1.You can convert the list to an array and then iterate on the array. This approach works well for small or medium
 * size list but if the list is large then it will affect the performance a lot.
   2. You can lock the list while iterating by putting it in a synchronized block.
    This approach is not recommended because it will cease the benefits of multithreading.
   3.If you are using JDK1.5 or higher then you can use ConcurrentHashMap and CopyOnWriteArrayList classes.
    This is the recommended approach to avoid concurrent modification exception.



 *
 *
 */
public class ConcurrentModificationExceptionDemo {

    public static void main(String[] args) {

        concurrentModificationExceptionDemo();
//        concurrent();

    }


    public static void concurrentModificationExceptionDemo() {
//        Map<Integer,String> emp = new ConcurrentHashMap<>();
        Map<Integer,String> emp = new HashMap<>();
        emp.put(1,"muthu");
        emp.put(2,"selvan");
        emp.put(3,"selvan");
        Iterator<Integer> myKey = emp.keySet().iterator();

        while (myKey.hasNext()) {
//            System.out.println("Key" +myKey.next());
            Integer nextKey = myKey.next();

            if (nextKey.equals(2)) {
                emp.remove(3);
                emp.put(3,"revanth");
//                emp.put(4,"revanth1");

            }
        }



    }


    public static void concurrent() {

        Map<String,String> myMap =
                new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");

        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("1")){
                myMap.remove("3");
                myMap.put("4", "4");
                myMap.put("5", "5");
            }
        }

        System.out.println("Map Size:"+myMap.size());

    }

}
