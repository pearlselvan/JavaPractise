package DynamicProgramming;

/**
 * Created by muthuselvan on 3/27/17.
 * http://techieme.in/find-interleaving-strings-using-dynamic-programming/
 * http://algorithmsandme.in/2014/05/if-string-is-interleaved-of-two-strings/
 * http://buttercola.blogspot.com/2014/09/leetcode-interleaving-string.html
 *
 * Understand the problem:
 * ========================
     The problem gives three strings s1, s2, and s3, find out whether s3 is formed by the interleaving of s1 and s2.
     The crux of the problem is to understand the "interleaving". Basically, we can understand the problem by s2
     is formed by connecting s1 and s2 together. The way of connecting could be interleaved.


 Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

 For example,
 Given:
 s1 = "aabcc",
 s2 = "dbbca",

 When s3 = "aadbbcbcac", return true.
 When s3 = "aadbbbaccc", return false.


 Approaches :
 https://leetcode.com/articles/interleaving-strings/

 *
 */

// Input 1 = ABCD  Input2 = XYZ
//Expected Interleaving String : ABXYCDZ



public class StringInterleaving {

    public static void main(String[] args) {
        System.out.println("Interleave using DB : " +isInterleave("aabcc","dbbca","aadbbcbcac"));

    }


    public static boolean isInterleave(String s1, String s2, String s3) {

        if ((s1.length()+s2.length())!=s3.length()) return false;

        boolean[][] matrix = new boolean[s2.length()+1][s1.length()+1];

        matrix[0][0] = true;

        for (int i = 1; i < matrix[0].length; i++){
            matrix[0][i] = matrix[0][i-1]&&(s1.charAt(i-1)==s3.charAt(i-1));
        }

        for (int i = 1; i < matrix.length; i++){
            matrix[i][0] = matrix[i-1][0]&&(s2.charAt(i-1)==s3.charAt(i-1));
        }

        for (int i = 1; i < matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                matrix[i][j] = (matrix[i-1][j]&&(s2.charAt(i-1)==s3.charAt(i+j-1)))
                        || (matrix[i][j-1]&&(s1.charAt(j-1)==s3.charAt(i+j-1)));
            }
        }

        return matrix[s2.length()][s1.length()];

    }

}
