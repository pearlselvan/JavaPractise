package CodingPractise;

/**
 * Created by muthuselvan on 3/5/17.
 * http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 */

/*
Two approach :
1 . Recursion
2 . Iteration

 */
public class Permutations {

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();

        Permutations permutation = new Permutations();
        System.out.println("F" +permutation.fact(n));
        permutation.permute(str, 0, n-1);
    }




    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


    /*
    http://www.geeksforgeeks.org/permutations-string-using-iteration/
    How to print all permutations iteratively?
    Recursion is always costly and iteration is preferred.
    Below are steps of iterative approach.

  1. Find no of permutations of the string by calculating value of n!.
   Then use this value to iterate. ( Example : if ABC is string then number of permutaiton is 8
   so we need to itetate till 8 )
  2.Store the original string in an auxiliary string
  and use that string to do the math.

  3.Fix the first position(character), and swap all the j’th and (j+1)’th characters till (n-1)!.

  4.At the end of first (n-1)! all the (n-1)th characters will be permuted.

  5 Now again store the original string to the auxiliary string and swap i’th and (i+1)’th
  characters and repeat the 3rd and 4th process.

===========

Example : Consider a string “abcd”.

Concept Used : We keep swapping a character
only till it reaches the end

Fix ‘a’. Swap ‘b’ with its next neighbors till b reaches the end.
( “acbd”, “acdb”)
Now ‘c’ will be at the 2nd position, do the same thing with it.
( “adcb”, “adbc”)
Now ‘d’ will be at the 2nd position, do the same thing with it.
( “abdc”, “abcd”)
All 6 i.e., (4!/4)permutations of the first cycle obtained.
Repeat the above process by bringing swapping ‘a’ with ‘b’
The new string to “play” will be “bacd”.

     */

//    3!  = 3 * 2 * 1
//    4!  = 4 * 3 * 2 * 1
    public  int fact(int length) {
        System.out.println("lenth :" +length);
        if(length <= 1)
            //if the number is 1 then return 1
            return 1;
        else
            //else call the same function with the value - 1
            return length * fact(length-1);
    }

    public void swap1(String[] a,String[] b) {
        String[] temp = a ;
        a=b;
        b=temp;

    }

    public void printPermutationUsingIteration(String s) {
        // // Find length of string and factorial of length
        int n = s.length();
        int fc = fact(n);

        // Point j to the 2nd position
        int j = 1;

        // To store position of character to be fixed next.
        // m is used as in index in s[].
        int m = 0;

        // Iterate while permutation count is
        // smaller than n! which fc

        for (int perm_c = 0; perm_c < fc; )
        {
            // Store perm as current permutation
            String perm = s;

            // Fix the first position and iterate (n-1)
            // characters upto (n-1)!
            // k is number of iterations for current first
            // character.
            int k = 0;

            while (k != fc/n)
            {
                // Swap jth value till it reaches the end position
                while (j != n-1)
                {
                    // Print current permutation
//                    cout << perm << "\n";
                    System.out.println(perm);

                    // Swap perm[j] with next character
                    //TODO
//                    swap1(perm[j], perm[j+1]); //will it work ?

                    // Increment count of permutations for this
                    // cycle.
                    k++;

                    // Increment permutation count
                    perm_c++;

                    // Increment 'j' to swap with next character
                    j++;
                }
                // Again point j to the 2nd position
                j = 1;
            }
            m++;

            // If all characters have been placed at
            if (m == n)
                break;

            //TODO
            // Move next character to first position
//            swap1(s[0], s[m]); //will it work ?

        } // End for

    }

}
