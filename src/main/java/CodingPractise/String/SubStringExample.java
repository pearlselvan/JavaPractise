package CodingPractise.String;

/**
 * Created by muthuselvan on 2/8/17.
 */
public class SubStringExample {

    public SubStringExample() {

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
            if (pindex == patLength) return sindex; //Please note this inside outer for loop

        } //outer for loop
        return -1;                            // not found
    }


    public static void main(String[] args) {
//        String name = "Muthu";
//        System.out.println(name.substring(1)); //will print "uthu"
//        System.out.println(name.substring(1,3)); //will print "ut"
        System.out.println(subStringUsingBruitForce("ABC","ABCSC"));
        System.out.println(subStringUsingBruitForce("LO","ABCSC"));
    }


}
