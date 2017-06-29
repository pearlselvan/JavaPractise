package CodingPractise;

import static java.util.Objects.hash;

/**
 * Created by muthuselvan on 2/7/17.
 * https://examples.javacodegeeks.com/core-java/palindrome-program-in-java/
 */
public class CheckPalindrome {

    public CheckPalindrome() {

    }

    public static void main(String[] args) {

        int x = hash("V");
        System.out.println("int x " +x);


        x = hash("V") ;
        System.out.println("int x " +x);


        System.out.println("Is Palindrom " +isPalindrome("RART"));
        System.out.println("Is Palindrom " +isPalindrome("RAR"));
    }


    /*
    A more efficient algorithm
    It’s not hard to see that in the above example, reversing a String requires double the memory
     along with some coping, and of course the additional computations of the equals method.

     Non of the above are particularly costly, but you could think of a more efficient and faster solution.
Our second approach is based on the intuition that a String is a palindrome if the first half of the String is “mirrored” by the other half. This means that the first half of the String read from left to right, is the same as the second half read from right to left.
If you imagine the String as a char array, then it’s straightforward to implement an algorithm that takes advantage of that idea:
Have a pointer pointing to the first element of the array, and a second pointer pointing at the last element of the array.
The first pointer will advance from left to right, and the second one from right to left.
At each step, check if the characters pointed by the two pointers are the same. If they are, move the first pointer one position to the right and the second pointer on position to the left. If the are not equal, then the String is not a palindrome.
If the two pointers meet half-way, then the String is a palindrome.

https://examples.javacodegeeks.com/core-java/palindrome-program-in-java/

     */

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

    //Program using recursion :  http://www.javaartifacts.com/efficient-way-check-string-palindrome/
    public static boolean isPalindromeUsingRecursion() {

        return true;

    }


}
