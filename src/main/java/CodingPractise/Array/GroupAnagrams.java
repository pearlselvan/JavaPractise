package CodingPractise.Array;

import java.util.*;

/**
 * Created by muthuselvan on 8/31/17.
 * SET 1 : http://www.geeksforgeeks.org/given-a-sequence-of-words-print-all-anagrams-together/
 *
 * SET 2 : http://www.geeksforgeeks.org/given-a-sequence-of-words-print-all-anagrams-together-set-2/
 * (More efficient solution is discussed)
 *
 *
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        List<List<String>> result = new LinkedList<>();
        String[] data = {"cat", "dog", "tac", "god", "act"};
        result=new GroupAnagrams().groupAnagrams2(data);
        System.out.println(result.size());

        result.forEach(out-> System.out.println(out));

        System.out.println("==============================");

//        String[] data2 = {"tea"};
//        result=new GroupAnagrams().checkAnagraminDic(data2);
//        result.forEach(out-> System.out.println(out));
    }


    public List<List<String>> checkAnagraminDic(String[] strs) {
        List<List<String>> rst = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        System.out.println("Before Sorted : " +Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println("After Sorted : " +Arrays.toString(strs));

        for(int i = 0; i < strs.length; i++) {
            char[] strChar = strs[i].toCharArray();
            System.out.println("Before Sort Char " +Arrays.toString(strChar));
            Arrays.sort(strChar);
            System.out.println("After Sort Char --" +Arrays.toString(strChar));

            String str = new String(strChar);

            System.out.println("String " +str);



            if(map.containsKey(str)) {
                map.get(str).add(strs[i]);
            }
            else {
                List<String> list = new ArrayList<String>();
                list.add(strs[i]); // Adding values as list from original string array
                map.put(str, list); // Adding key / values
            }
        }

        for(List<String> val : map.values()) {
            rst.add(val);
        }

        return rst;


    }

    //If the average length of verbs is m and array length is n, then the time is O(n*m).

    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> rst = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        System.out.println("Before Sorted : " +Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println("After Sorted : " +Arrays.toString(strs));

        for(int i = 0; i < strs.length; i++) {
            char[] strChar = strs[i].toCharArray();
            System.out.println("Before Sort Char " +Arrays.toString(strChar));
            Arrays.sort(strChar);
            System.out.println("After Sort Char --" +Arrays.toString(strChar));

            String str = new String(strChar);

            System.out.println("String " +str);



            if(map.containsKey(str)) {
                map.get(str).add(strs[i]);
            }
            else {
                List<String> list = new ArrayList<String>();
                list.add(strs[i]); // Adding values as list from original string array
                map.put(str, list); // Adding key / values
            }
        }

        for(List<String> val : map.values()) {
            rst.add(val);
        }

        return rst;
    }

    //If the average length of verbs is m and array length is n, then the time is O(n*m).
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str: strs){
            char[] arr = new char[26];
            for(int i=0; i<str.length(); i++){
                arr[str.charAt(i)-'a']++;
            }
            String ns = new String(arr);


            if(map.containsKey(ns)){
                map.get(ns).add(str);
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                map.put(ns, al);
            }
        }

        result.addAll(map.values());

        return result;
    }

}
