package CodingPractise;

/**
 * Created by muthuselvan on 4/16/17.
 * http://algorithms.tutorialhorizon.com/replace-all-spaces-in-a-string-with/
 *
 *
 *
 */
public class URLifyString {

    public static void main(String[] args) {
        String url="Mr John  Welcome";
//        System.out.println(url.replace(" ","%20"));
//        System.out.println(urlify(url.toCharArray(),url.length()));
//        System.out.println(url.length());
//        System.out.println(countSpaces(url.toCharArray(),url.length()));


//        System.out.println(urlify(url.toCharArray(),13));

//        System.out.println(replace(url.toCharArray(),url.length()));


        String s1 = "I am Sumit Jain";
        int trueLength = s1.length();
        System.out.println("Input String : " + s1);
        URLifyString r = new URLifyString();
        r.replace(s1, trueLength);
    }


    public static char[] urlify(char[] str, int length) {

        int numSpaces = countSpaces(str, length);
        int endPtr = length - 1 + numSpaces * 2;
        for (int i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[endPtr] = '0';
                str[endPtr - 1] = '2';
                str[endPtr - 2] = '%';
                endPtr -= 3;
            } else {
                str[endPtr] = str[i];
                endPtr--;
            }
        }
        return str;
    }

    public void replace(String s1, int length) {
        char[] chars = s1.toCharArray();
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }
        int newLength = length + 2 * spaceCount;
        char [] charsNew = new char [newLength];
        for (int i = length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                charsNew[newLength - 1] = '0';
                charsNew[newLength - 2] = '2';
                charsNew[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
//				System.out.println(chars[i]);
                charsNew[newLength - 1] = chars[i];
                newLength = newLength - 1;
            }
        }
        System.out.println("Output String : " + String.valueOf(charsNew));
    }

    private static int countSpaces(char[] str, int length) {
        int numSpaces = 0;
        for (int i = 0; i < length; i++) {
            if (str[i] == ' ') {
                numSpaces++;
            }
        }
        return numSpaces;
    }

    public static char[]  replace(char[] str,int truelength) {
        int spacecount=0,index,i=0;
        for(i=0;i<truelength;i++) {
            if(str[i] == ' ') {
                spacecount++;
            }
        }
        System.out.println("Count : " +spacecount);
        index=truelength+spacecount*2;

        if (truelength < str.length) str[truelength] = '\0' ; //End Array

        for (i=truelength-1;i>=0;i--) {

            if (str[i] == ' ') {
                str[index-1] ='0';
                str[index-2] ='2';
                str[index-3] ='%';

                index=index -3 ;

            } else {
                str[index-1]=str[i];
                index--;
            }

        }

      return str;

    }
}
