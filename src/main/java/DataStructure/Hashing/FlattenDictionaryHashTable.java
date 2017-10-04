package DataStructure.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Created by muthuselvan on 8/30/17.
 * https://technicalpractical.wordpress.com/2013/10/10/flatten-map-utility/
 *
 *
 *  Flatten a Dictionary
 *  -------------------
 *  A dictionary is a type of data structure that is supported natively
 *  in all major interpreted languages such as JavaScript, Python, Ruby
 *  and PHP, where it’s known as an Object, Dictionary, Hash and Array,
 *  respectively.
 *
 *  In simple terms, a dictionary is a collection of unique keys
 *  and their values. The values can typically be of any primitive type
 *  (i.e an integer, boolean, double, string etc) or other dictionaries
 *  (dictionaries can be nested).
 *  However, for this exercise assume that values are either a string
 *  or another dictionary.

 Question :
 ---------
 Given a dictionary dict, write a function flattenDictionary
 that returns a flattened version of it .

 If you’re using a compiled language such Java, C++, C#, Swift and Go,
 you may want to use a Map/Dictionary/Hash Table that maps strings (keys)
 to a generic type (e.g. Object in Java, AnyObject in Swift etc.)
 to allow nested dictionaries.

 Example :
 --------
 input:
 ------
 dict = {
 "Key1" : "1",
 "Key2" : {
 "a" : "2",
 "b" : "3",
 "c" : {
 "d" : "3",
 "e" : "1"
 }
 }
 }

 output:
 ------
 {
 "Key1" : "1",
 "Key2.a" : "2",
 "Key2.b" : "3",
 "Key2.c.d" : "3",
 "Key2.c.e" : "1"
 }


 Important:
 ----------
 when you concatenate keys, make sure to add the dot character
 between them.
 For instance concatenating Key2, c and d the result key would be
 Key2.c.d.


 Hints & Tips:
 -------------
 1. If your peer cannot come up with a solution, ask them to analyze
 the input and see if they see a pattern.
 2.If still no progress, try to direct them toward a recursive approach.
 3.If your peer makes some progress with the recursive approach,
 and is stuck at some other point, try to give some hints regarding
 how keys of the dictionary could be manipulated.
 Watch out of cases when the key is an empty string or null.
 For instance, the input dictionary itself isn’t associated with any key.
 In that

 https://stankirdey.com/2016/05/13/how-to-flatten-a-map-in-java/


 HASH :

 {
 "root": "value",
 "nested": {
 "key": {
 "subkey": "value"
 }
 },

 Input:

 {"Key1":"1","Key2":{"a":"2","b":"3","c":{"d":"3","e":"1"}}}
 Expected:

 {"Key1":"1","Key2.a":"2","Key2.b":"3","Key2.c.d":"3","Key2.c.e":"1"}
 Actual:

 StdError:
 Undefined variable: result
 Test Case #2
 Input: {"Key":{"a":"2","b":"3"}},Expected: {"Key.a":"2","Key.b":"3"},Actual:
 Test Case #3
 Input: {"Key1":"1","Key2":{"a":"2","b":"3","c":{"d":"3","e":{"f":"4"}}}},Expected: {"Key1":"1","Key2.a":"2","Key2.b":"3","Key2.c.d":"3","Key2.c.e.f":"4"},Actual:
 Test Case #4
 Input: {"":{"a":"1"},"b":"3"},Expected: {"a":"1","b":"3"},Actual:
 Test Case #5
 Input: {"a":{"b":{"c":{"d":{"e":{"f":{"":"pramp"}}}}}}},Expected: {"a.b.c.d.e.f":"pramp"},Actual:
 Test Case #6
 Input: {"a":"1"},Expected: {"a":"1"},Actual:



 Sudo :

 function flattenDictionary(dict):
 flatDictionary = {}
 flattenDictionaryHelper("", dict, flatDictionary)

 return flatDictionary


 function flattenDictionaryHelper(initialKey, dict, flatDictionary):
 for (key : dict.keyset()):
 value = dict.get(key)

 if (!isDictionary(value)): # the value is of a primitive type
 if (initialKey == null || initialKey == ""):
 flatDictionary.put(key, value)
 else:
 flatDictionary.put(initialKey + "." + key, value)
 else:
 if (initialKey == null || initialKey == "")
 flattenDictionaryHelper(key, value, flatDictionary)
 else:
 flattenDictionaryHelper(initialKey + "." + key, value, flatDictionary)
 ======

 JAVA :
 =====

 static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
 // your code goes here
 //if()

 HashMap<String, String> results = new HashMap<String, String>();

 flattenHelper(dict,"",results);

 return results;

 //step 1 get keyset  => for Key2 ? a,b,c

 //step 2 iterate on this key set
 //check the type of the value
 // if string, put

 // if Hashmap() //recursion

 // helper

 }

 static void flattenHelper(HashMap<String, Object> dict,String prefix, HashMap<String, String> results){

 //step 1 get keyset  => for Key2 ? a,b,c

 Set<String> keys = dict.keySet();

 for(String k: keys){
 Object val = dict.get(k);
 if(val instanceof String)
 results.put(k+prefix, (String)val);
 else
 flattenHelper(dict,k+".",results);
 }

 //step 2 iterate on this key set
 //check the type of the value
 // if string, put

 // if Hashmap() //recursion

 // helper

 }



 =======



 *
 */
public class FlattenDictionaryHashTable {
    public static void main(String[] args) {
        FlattenDictionaryHashTable flattenDictionaryHashTable = new FlattenDictionaryHashTable();
        HashMap<String, Object> result = new HashMap<>();
        flattenDictionaryHashTable.flattenMap(result);
    }

    public Map<String, Object> flattenMap(Map<String, Object> map) {
        HashMap<String,Object> child1 = new HashMap<>();
        child1.put("root","value");
        child1.put("b","3");
        HashMap<String,Object> child2 = new HashMap<>();
        HashMap<String,Object> child3 = new HashMap<>();
        child1.put("d","3");
        child1.put("e","1");


        //Adding parent and child
        map.put("Key1","1");
        map.put("Key2",child1);
        System.out.println(map);


        Set<Map.Entry<String,Object>> entry = map.entrySet();

        for (Map.Entry mapEntry:entry) {
            System.out.println(mapEntry.getKey());

            if (mapEntry.getValue() instanceof Object) {
                System.out.println("Object key : " +mapEntry.getKey());
            }



        }

        return map;

    }

}
