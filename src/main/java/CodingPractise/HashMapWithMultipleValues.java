package CodingPractise;

import java.util.*;

/**
 * Created by muthuselvan on 4/28/17.
 */
public class HashMapWithMultipleValues {

    public static void main(String[] args) {

        HashMap<String,List> products = new HashMap<>();

        String template = "$Event $Started";


        List<String> firstEvent = new ArrayList<>();

        firstEvent.add("Lunch");
        firstEvent.add("10");
        List<String> appleProduct = new ArrayList<>();

        appleProduct.add("MAC");
        appleProduct.add("IPAD");
        appleProduct.add("IPHONE");

        products.put("APPLE",appleProduct);
        products.put("first",firstEvent);

        Set productSet = products.entrySet();

        Iterator productIteratr = productSet.iterator();

        while (productIteratr.hasNext()) {
            Map.Entry me =  (Map.Entry) productIteratr.next();
            System.out.println(me.getValue());

//            List<String> values = me.getValue();






        }

        for (Map.Entry<String, List> entry : products.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
        }



        HashMapEx();






    }

    public static void HashMapEx() {
        HashMap<Integer,String> emp = new HashMap<>();
        emp.put(1,"Muthu");
        emp.put(2,"Revanth");
        emp.put(3,"Rama");
//        Set hset = emp.entrySet();
//
//        Iterator iterator = hset.iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry me  = (Map.Entry) iterator.next();
//            System.out.println(me.getKey());
//        }


        for (Map.Entry<Integer,String> my : emp.entrySet()) {
            System.out.println("Using smart approach "+my.getKey());
            System.out.println("Using smart approach "+my.getValue());

        }

        //Java 8 approach
         emp.forEach((k,v)-> System.out.println(" Java 8 Key : " +k+ " : Value " +v));

        emp.forEach((k,v)-> {
            if ("Muthu".equals(v)) {
                System.out.println("Key " +k);
            }
        });




//        Map.Entry<Integer,String> my = emp.
    }
}
