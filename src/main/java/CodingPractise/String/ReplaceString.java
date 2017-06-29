package CodingPractise.String;

/**
 * Created by muthuselvan on 3/11/17.
 */
public class ReplaceString {

    public static void main(String[] args) {


        System.out.println(replace("MTTHU","U"));
        System.out.println(replaceCorr("MTTHU","U"));
    }


    // This logic will not work delete the char thats in below  srcChar[i] = ' ';
    // because theer is not room for adding addionla spaces
    //http://blog.codingforinterviews.com/string-questions/
    public static String replace(String src, String replace) {
        //MRTHU -> MUTHU
        char[] srcChar = src.toCharArray();
        for (int i=0;i<src.length();i++) {
            if (srcChar[i] == 'R' ) {
                System.out.println("T is found at " +i);
                srcChar[i] = 'U';
            }
        }
        return new String(srcChar);
    }

    //The time taken is O(m), where m is the length of the original string including the additional characters. As this is achieved in one pass, it is optimal.
    public static String replaceCorr (String x, String replace) {
        // count the number of whitespace to be replaced
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                count++;
            }
        }
        // create an array, including the whitespace
        char[] word = new char[x.length() + count * replace.length() - 1];
        int index = 0;
        //iterate through x, replacing whitespace
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                for (int j = 0; j < replace.length(); j++) {
                    word[index++] = replace.charAt(j);
                }
            }
            else {
                word[index++] = x.charAt(i);
            }
        }
        return new String(word);
    }
}

