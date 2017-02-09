package CodingPractise;

/**
 * Created by muthuselvan on 2/7/17.
 * https://examples.javacodegeeks.com/core-java/palindrome-program-in-java/
 */
public class CheckPalindrome {

    public CheckPalindrome() {

    }

    public static void main(String[] args) {
        System.out.println("Is Palindrom " +isPalindrome("RART"));
        System.out.println("Is Palindrom " +isPalindrome("RAR"));
    }



    public static boolean isPalindrome(String in) {

        int start =  0 ;
        int end = in.length() -1 ;
        int mid = end / 2 ;
        System.out.println("Middle :" +mid);
//        System.out.println("Middle :" (2+4) >> 1);


        for (int i=0;i<=mid;i++,start++,end--) {
            if (in.charAt(start) != in.charAt(end)) {
                return false;
            }
        }

        return true;
    }


}
