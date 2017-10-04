package DataStructure.Hashing;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;


/**
 * Created by muthuselvan on 8/29/17.
    PUT / 

 */
public class HashTableIterationEntrySet {

    public static void main(String[] args) {

    	HashMap<String,String> project = new HashMap<>();
    	project.put("mobile","muthuselvan");
    	project.put("web","msr");
    	project.put("rest","srm");

    	Set<Map.Entry<String,String>> projectset = project.entrySet();

    	for (Entry projectentry: projectset) {
    		System.out.println("Key :" +projectentry.getKey());
    		System.out.println("Value :" +projectentry.getValue());
    		
    		if (projectentry.getValue() instanceof String) {
    			System.out.println( projectentry.getValue() +"is string");
    		}

    	}
    	
    	






    }

    public static void hashtableIteration(HashMap<String,String> hashtable) {


        

    }


}
