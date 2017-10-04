package Algorithm;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

/**
 * Created by muthuselvan on 2/1/17.
 * Ref : https://tekmarathon.com/2013/05/14/algorithm-to-find-substring-in-a-string-kmp-algorithm/ (understand flow )
 * Ref : http://jakeboxer.com/blog/2009/12/13/the-knuth-morris-pratt-algorithm-in-my-own-words/ ( understand How works )
 * Ref : https://github.com/ntallapa12/java_algos/blob/master/src/main/java/com/forum/java/algos/KMPAlgo.java
 * Knuth–Morris–Pratt algorithm
 */

//find substring in a string
//KMP algorithm does pre processing over the pattern
// so that the pattern can be shifted by more than one.
/*
This algorithm is executed in two phases.
1. Pre processing Phase :
---------------------
In this phase, KMP algorithm creates a temporary array
which is prepared from the pattern.
We call this temporary array as Partial Match Table (PMT),
lets call this PMT as b[i].

Big - O - Notation :
---------------------
Time complexity for building PMT table : o(n)
Space complexity for building PMT table : o(n)


a         : no prefix and no suffix since there is only one letter
ab        : prefixes[a]
            suffixes[b]
abc       : prefixes[a,ab]
            suffixes[c,bc]
abca      : prefixes[a,ab,abc]
            suffixes[a,ca,bca]
abcab     : prefixes[a,ab,abc,abca]
            suffixes[b,ab,cab,bcab]
abcabd    : prefixes[a,ab,abc,abca,abcab]
            suffixes[d,bd,abd,cabd,bcabd]
abcabda   : prefixes[a,ab,abc,abca,abcab,abcabd]
            suffixes[a,da,bda,abda,cabda,bcabda]
abcabdab  : prefixes[a,ab,abc,abca,abcab,abcabd,abcabda]
            suffixes[b,ab,dab,bdab,abdab,cabdab,bcabdab]
abcabdabc : prefixes[a,ab,abc,abca,abcab,abcabd,abcabda,abcabdab]
            suffixes[c,bc,abc,dabc,bdabc,abdabc,cabdabc,bcabdabc,abcabdabc

a         : no prefix and no suffix since there is only one letter
ab        : 0
abc       : 0
abca      : 1 [a]
abcab     : 2 [ab] --- THIS IS LENGTH longerst THATS length(ab)
abcabd    : 0
abcabda   : 1 [a]
abcabdab  : 2 [ab]
abcabdabc : 3 [abc] --- THIS IS LENGTH longest THATS length(abb)


2. Search Phase
*/

public class KMP {
    public static void main(String[] args) {
            ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
            long[] threadIds = threadBean.findMonitorDeadlockedThreads();
            int deadlockedThreads = threadIds != null? threadIds.length : 0;
            System.out.println("Number of deadlocked threads: " + deadlockedThreads);


//        patternMatchNonKMP("Google is world fast search engine","engine");

//        preProcessPattern("aba".toCharArray());

        char[] ptrn = "sel".toCharArray();

        char[] text = "muthuselvan".toCharArray();
        System.out.print(" ");
        for (char c : text) {
            System.out.print(c + "   ");
        }
        System.out.println();
        // search for pattern in the string
        searchSubString(text, ptrn);



    }

/*
The preprocessing algorithm inner while loop:
If p(j) == p(i), A border of width j can be extended by p(i),
here it doesnt go into inner while loop.
If p(j) != p(i), the next-widest border is examined by setting j = b[j].
The loop terminates at the latest if no border can be extended (j = -1).
Now let us look at how partial match table is prepared:
Provided that the values b[0], …, b[i] are already known,
the value of b[i+1] is computed by checking if a border of the prefix p[0] … p[i-1]
can be extended by p[i]. This is the case if p[b(i)] = p(i).
The borders to be examined are obtained in decreasing order
from the values b[i], b[b[i]] etc.
 */

/*
Note: Why a prefix should match suffix of the pattern?
its because when we shift the pattern its the prefix
of P which comes towards the suffix.

And also the key idea is that if we have successfully
matched prefix P[1…i-1] of the pattern with
the substring T[j-(i-1)…j-1] of the input string
and P(i)!=T(j), then we dont need to reprocess
any of the suffix T[j-(i-1)…j-1] since we know this portion
of the text string is the prefix of the pattern
that we have just matched.

Time complexity of KMP algorithm is O(n) in worst case.
 */
   //This will retuen integer of array
    public static  int[] preProcessPattern(char[] ptrn) {

        // i is the first pointer from pattern that move from starting to end ..
        // j is the laster pointer from pattern that move from backward to forward direction
        int i = 0, j = -1;
        int ptrnLen = ptrn.length;
        int[] pmtTable = new int[ptrnLen + 1];


        pmtTable[i] = j; // initialized pmt table
        while (i < ptrnLen) {
            while (j >= 0 && ptrn[i] != ptrn[j]) {
                // if there is mismatch consider next widest border
                System.out.println("i :" +i);
                System.out.println("j :" +j);
                System.out.println("ptrn[i] : " +ptrn[i]);
                System.out.println("ptrn[j] : " +ptrn[j]);
                System.out.println("b[i] : " +pmtTable[j]);
                j = pmtTable[j]; //set j = -1
                System.out.println("j after " +j);
            }
            i++;
            j++;
            pmtTable[i] = j;
        }
        // print pettern, partial match table and index
        System.out
                .println("printing pattern, partial match table, and its index");
        System.out.print(" ");
        for (char c : ptrn) {
            System.out.print(c + "   ");
        }
        System.out.println(" ");
        for (int tmp : pmtTable) {
            System.out.print(tmp + "   ");
        }
        System.out.print("\n ");
        for (int l = 0; l < ptrn.length; l++) {
            System.out.print(l + "   ");
        }
        System.out.println();
        return pmtTable;
    }


    /**
     * Based on the pre processed array, search for the pattern in the text
     * @param text
     *            text over which search happens
     * @param ptrn
     *            pattern that is to be searched
     */

    /*
    This is pretty simple once we get the partial match table
    from preprocessing phase.
    Here we just compare first character of the text T i.e, t(i)
    with the first character of the pattern P i.e, p(i),
      if there is a match we increment the pointers i and j and go forward.
        If there is a mismatch then we look into the partial match table b[j]
         to shift the position of j to appropriate value based
          on the prefix/suffix match by using b[j].
     */

    /*
    How to use PMT ?
    We can use the values in the partial match table to skip ahead
    (rather than redoing unnecessary old comparisons) when we find partial matches.
    The formula works like this:


     */
    public static void searchSubString(char[] text, char[] ptrn) {
        int i = 0; // i is the pointer for text
        int j = 0; // j is the pointer for pmt table from pre pre prossing stage
        // pattern and text lengths
        int ptrnLen = ptrn.length;
        int txtLen = text.length;

        // initialize new array and preprocess the pattern
        int[] b = preProcessPattern(ptrn);

        while (i < txtLen) {
            while (j >= 0 && text[i] != ptrn[j]) {
                System.out.println("Mismatch happened, between text char "
                        + text[i] + " and pattern char " + ptrn[j]
                        + ", \nhence jumping the value of " + "j from " + j
                        + " to " + b[j] + " at text index i at " + i
                        + " based on partial match table");
                j = b[j];
            }
            i++;
            j++;

            // a match is found , where index of the text where the matching found and i in below sub string
            // Ex :  text : muthuselvan patten : sel
            // FOUND SUBSTRING AT i 8 and index:5
            if (j == ptrnLen) {
                System.out.println("FOUND SUBSTRING AT i " + i + " and index:"
                        + (i - ptrnLen));
                System.out.println("Setting j from " + j + " to " + b[j]);
                j = b[j];
            }
        }
    }


    public static void patternMatchNonKMP(String source ,String find) {

        char[] sourceToChar = source.toCharArray();
        char[] findToChar = find.toCharArray();
        int findCounter = 0 ;
        int sourceCounter = 0 ;
        int matched = 0;
        int returnIndex = 0 ;

        for (sourceCounter=0;sourceCounter<=source.length()-1;sourceCounter++) {
            System.out.println("Souce "+sourceCounter+ " - " +sourceToChar[sourceCounter]);

            while(findCounter <= find.length()-1) {

                if (findToChar[findCounter] != sourceToChar[sourceCounter]) {
                    break;
                } else {


                    if ((matched == 0 ) && (find.length() -1 == findCounter )) {
                        System.out.println("First matched " +sourceToChar[sourceCounter]+ "in source index " +sourceCounter);
                        matched = sourceCounter;
                        returnIndex = matched;
                    }

                    findCounter++;
                }
            }


        }
        System.out.println("Index match : " +returnIndex);


    }
}
