package Java8Demo.BiFunctionDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<String,String,String> addString = (s1, s2) -> {
          String s3 = s1+s2 ;
          return s3;
            };


        BiFunction<Integer,Integer,Integer> addTwoInterger = (i1,i2) -> {
            Integer i3 = i1+i2 ;
            return i3;
        };

        System.out.println(addString.apply("Muthu"," Selvan"));
        System.out.println(addTwoInterger.apply(10,20));




//            Map<String,String> map = Map.of("name1","Muthu",
//                    "name2","Muthu2",
//                    "name3","Muthu3"
//            );


        // How BiFunction used in merge in java.util.Map interface
        Map<String,String> map = new HashMap<>();

        map.put("name1","muthu1");
        map.put("name2","muthu2");

        String value = map.get("name1");
        String newvalue = value.concat("-verynew");
        System.out.println(newvalue);
//        Map unmodifiableMap = Collections.(map);


        if (value == null) {
            map.put("name1", "newmuthu1");
        }
        else {
            map.put("name1", newvalue);
        }
        System.out.println(map);
//        System.out.println(map.merge("name1", null,(v1,v2)-> v1+"R"));
        String str = map.merge("Key4","Value56",(v1,v2)->v1.substring(3).concat(v2));
        System.out.println(str);
        System.out.println(map);

        //   ===========
        Map<String, Integer> prices = new HashMap<>();
        System.out.println("Prices map: " + prices);

        // Integer::sum(a,b) is perfect two-argument
        // function (BiFunction)
        prices.merge("fruits", 3, Integer::sum);
        prices.merge("fruits", 5, Integer::sum);
        System.out.println("Prices map: " + prices);

        //http://www.topjavatutorial.com/java-8/java-8-map-merge/

        Map<String, Integer> counter = new HashMap<>();

        //Name Vs Points
        counter.put("name1",300);
        counter.put("name2",200);
        counter.put("name3",400);
        counter.put("name1",100);
        counter.put("apple",600);
        System.out.println(counter);
        //merge k,v , bifunction
        // The below code says if key = name1 found then add : 10 to value
//        counter.merge("name1",10,Integer::sum);
        counter.merge("name1",10,(x,y)-> x+y);
        System.out.println(counter);

        // if key == apple then value of the apple will added : 10

        counter.merge("apple",10,(x,y)-> x+y);
        System.out.println("Apple" +counter);

        //// Previous value for key=2 is less than new value. So, the old value
        // remains as per the BiFunction
        counter.merge("apple", 10, (x, y) -> x < y ? x : y);
        System.out.println("Apple conditionally : " +counter);











    }




}
