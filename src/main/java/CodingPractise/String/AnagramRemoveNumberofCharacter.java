package CodingPractise.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by muthuselvan on 5/31/17.
 * https://www.youtube.com/watch?v=3MwRGPPB4tw&index=8&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK
 *
 *  Sorting and counting way
       http://techieme.in/make-anagrams-from-two-strings/



 */
public class AnagramRemoveNumberofCharacter {

    public static int NUMBER_LETTER = 26 ;

    public static void main(String[] args) throws IOException {


//        System.out.println("ABS : "+Math.abs(11-10));
        int offset = (int) 'a';
        System.out.println(offset);


        String data1 = "come";
        String data2 = "welcome";
        countingway(data1,data2);


        System.out.println("No of character removed : "+numberofCharacterRemovedForAnagram("muthu","muthusr"));




    }

    public static void countingway(String d1,String d2) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();
        String aString = d1;
//        line = br.readLine();
        String bString = d2;

        int[] counts = new int[26];
        char a = 'a';

        char[] charArray = aString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            counts[charArray[i] - a]++;
        }

        charArray = bString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            counts[charArray[i] - a]--;
        }

        int sum = 0;
        for(int i = 0 ; i < counts.length ;i++){
            sum+= Math.abs(counts[i]);
        }

        System.out.println("S - " +sum);
    }


    public static int[] getCharCount(String s) {
        int[] charCounts = new int[NUMBER_LETTER];
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i); //for A= 65 M == 77
            int offset = (int) 'a'; // for a its 97
            int code = c-offset; //
            charCounts[code]++;
        }
        return charCounts;
    }

    public static int getDelta(int[] array1,int[] array2) {
        //walkthorugh array
        if (array1.length!= array2.length) {
            return -1;
        }

        int delta = 0 ;
        for (int i=0;i<array1.length;i++) {
            int different = Math.abs(array1[i]-array2[2]);
            delta+=different;

        }
        return delta;
    }

    public static int numberofCharacterRemovedForAnagram(String first,String second) {
        int[] charCount1 = getCharCount(first);
        int[] charCount2 = getCharCount(second);
        return getDelta(charCount1,charCount2);
    }


}



