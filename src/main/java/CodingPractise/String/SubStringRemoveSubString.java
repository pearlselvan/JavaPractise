package CodingPractise.String;

import java.util.Stack;

/**
 * Created by muthuselvan on 2/8/17.
 * Question : https://www.careercup.com/question?id=5197969674469376
 * Given a string Sting="ABCSC" Check whether it contains a Substring="ABC"?

 1)If no , return "-1".
 2)If yes , remove the substring from string and return "SC".



 */
public class SubStringRemoveSubString {

    public SubStringRemoveSubString() {

    }

    // return offset of first match or n if no match
//    O((n-m)(m+2))
    public static int subStringUsingBruitForce(String pat, String txt) {
        int patLength = pat.length();
        int txtLength = txt.length();

        for (int sindex = 0; sindex <= txtLength - patLength; sindex++) {
            int pindex; //// Declare this inside outer loop bcz this will reset to 0

            for (pindex = 0; pindex < patLength; pindex++) {
                System.out.println(txt.charAt(sindex+pindex)+ ":" +pat.charAt(pindex));
                if (txt.charAt(sindex+pindex) != pat.charAt(pindex))
                    break; // Please note this break inside for loop
            } // inner for loop

            // found at offset i
            if (pindex == patLength)
                System.out.println(pindex);
                System.out.println(patLength);

                return sindex; //Please note this inside outer for loop

        } //outer for loop
        return -1;                            // not found
    }

 //https://leetcode.com/problems/remove-duplicate-letters/discuss/
    public static String removeDuplicateLetters(String sr) {

        int[] res = new int[26]; //will contain number of occurences of character (i+'a')
        boolean[] visited = new boolean[26]; //will contain if character (i+'a') is present in current result Stack
        char[] ch = sr.toCharArray();
        for(char c: ch){  //count number of occurences of character
            res[c-'a']++;
        }
        Stack<Character> st = new Stack<>(); // answer stack
        int index;
        for(char s:ch){
            index= s-'a';
            res[index]--;   //decrement number of characters remaining in the string to be analysed
            if(visited[index]) //if character is already present in stack, dont bother
                continue;
            //if current character is smaller than last character in stack which occurs later in the string again
            //it can be removed and  added later e.g stack = bc remaining string abc then a can pop b and then c
            while(!st.isEmpty() && s<st.peek() && res[st.peek()-'a']!=0){
                visited[st.pop()-'a']=false;
            }
            st.push(s); //add current character and mark it as visited
            visited[index]=true;
        }

        StringBuilder sb = new StringBuilder();
        //pop character from stack and build answer string from back
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }


    public static void main(String[] args) {
//        String name = "Muthu";
//        System.out.println(name.substring(1)); //will print "uthu"
//        System.out.println(name.substring(1,3)); //will print "ut"
        System.out.println(subStringUsingBruitForce("ABC","ABCSC"));
        System.out.println(removeDuplicateLetters("bcabc"));
//        System.out.println(subStringUsingBruitForce("LO","ABCSC"));
    }


}
