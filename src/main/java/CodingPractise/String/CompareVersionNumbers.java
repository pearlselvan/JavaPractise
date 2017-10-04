package CodingPractise.String;

import java.util.Arrays;

/**
 * Created by muthuselvan on 6/21/17.
 * http://www.programcreek.com/2014/03/leetcode-compare-version-numbers-java/
 * Compare two version numbers version1 and version2. If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences. Here is an example of version numbers ordering:
 *
 * 0.1 < 1.1 < 1.2 < 13.37
 *
 */
public class CompareVersionNumbers {

    public static void main(String[] args) {

        System.out.println(compareVersion("0.1","1.1"));

    }

    public static int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        System.out.println("After Split ARRAY 1 : " + Arrays.toString(arr1));
        System.out.println("After Split ARRAY 2 : " +Arrays.toString(arr2));

        int i=0;
        while(i<arr1.length || i<arr2.length){
            if(i<arr1.length && i<arr2.length){
                if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
                    return -1;
                }else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
                    return 1;
                }
            } else if(i<arr1.length){
                if(Integer.parseInt(arr1[i]) != 0){
                    return 1;
                }
            } else if(i<arr2.length){
                if(Integer.parseInt(arr2[i]) != 0){
                    return -1;
                }
            }

            i++;
        }

        return 0;
    }

}
