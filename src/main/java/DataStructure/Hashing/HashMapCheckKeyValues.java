package DataStructure.Hashing;

import java.util.HashMap;
import java.util.*;

/**
 * Created by muthuselvan on 9/2/17.
 */
public class HashMapCheckKeyValues {

    public static void main(String[] args) {
        HashMap<String,Integer> language = new HashMap<>();
        language.put("Java",1);

//        if (language.KeySet().)


        if (language.keySet().contains("Java")) {
            System.out.print("Contains Java with values : " +language.get("Java"));
        }



//        language.forEach((k,v)-> System.out.println(k+ ":" +v));





    }

}
