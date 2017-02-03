package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by muthuselvan on 2/2/17.
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
