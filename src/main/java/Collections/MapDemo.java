package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by muthuselvan on 2/3/17.
 */

/*
    Child Classes :
    HashMap
    TreeMap
    SortedMap
    LinkedHashMap
 */

public class MapDemo {
    public MapDemo() {

    }

    public static void main(String[] args) {
        mapContains();
    }

    public static void mapContains() {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Google");
        map.put(2,"Yahoo");
        map.put(3,"Facebook");

        if (map.containsKey(1) ) {
            System.out.println("Key present ");
        }
        map.clear();
        System.out.println(map.remove(1)); // will return null becaue the above methos will clear all entry in map

        if (map.containsValue("Google")) {
            System.out.println("Value present ");
        }
        System.out.println(map.entrySet().stream().filter(mapVal -> "Google".equals(mapVal.getValue())).map(mapVal -> mapVal.getKey()));
    }
}

//
//    String result = ipAddress.entrySet().stream()
//            .filter(map -> "SJC".equals(map.getValue()))
//            .map(map -> map.getKey())
//            .collect(Collectors.joining());
//        System.out.println("Result " +result);
