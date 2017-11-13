package Java8Demo;

//import com.sun.tools.javac.util.List;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by muthuselvan on 2/2/17.
 */

/*
  http://howtodoinjava.com/core-java/collections/java-8-tutorial-streams-by-examples/
  sorted()
   map()
   filter()
   match()
   count()

   Good Example : https://www.mkyong.com/java8/java-8-streams-filter-examples/
   http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html



 */

interface Mylambda {
    void foo();
}


interface AddTwo {

    int sum(int a, int b);

}
public class FilderDemo {



    public static void main(String[] args) {

        hashMapStream();
        filterByLength();
        mapExample();

        Mylambda name = () -> System.out.println("My first lamda");
//        System.out.println("L" +name.);
        name.foo();

        AddTwo addTwo = ( a , b ) ->  a+b ;
        System.out.println("Sum using lamda " +addTwo.sum(10,12));
       // System.out.println("Sum using lamda inline " +addTwo.sum(10,12));

         callsum((a,b) -> a+b);
        System.out.println("Range :" + Arrays.toString(IntStream.range(1,10).toArray()));




    }

    public static void callsum(AddTwo addTwo) {
        System.out.println("Using inline : " +addTwo.sum(10,12));

    }


    //https://www.mkyong.com/java8/java-8-filter-a-map-examples/
    public static void hashMapStream() {
        HashMap<String,String> ipAddress = new HashMap<>();
        ipAddress.put("10","SJC");
        ipAddress.put("11","SF");
        System.out.println(ipAddress.entrySet().stream().count());
//        System.out.println(ipAddress.entrySet().stream().filter(map->map.getValue());

        String result = ipAddress.entrySet().stream()
                        .filter(map -> "SJC".equals(map.getValue()))
                        .map(map -> map.getKey())
                        .collect(Collectors.joining());
        System.out.println("Result " +result);





    }

    public static void filterByLength() {

        Set<String> name = new TreeSet<>();
        name.add("muthu");
        name.add("welcome");
        name.add("chella");
        name.add("ch");
        System.out.println(name.stream().filter(s -> s.startsWith("m")).count());
        name.stream().filter(s -> s.startsWith("m")).forEach(System.out::println);
        name.stream().filter(s->s.length() > 2 ).forEach(System.out::println);


    }



    public static void mapExample() {
        LinkedList<String> city = new LinkedList<>();
        city.add("chennai");
        city.add("madurai");
        city.add("trichy");
        city.stream().sorted().forEach(name -> System.out.println(name));
        city.stream().map(s-> s.toUpperCase()).forEach(s -> System.out.println(s));





    }
}


