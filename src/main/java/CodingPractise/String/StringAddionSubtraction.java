package CodingPractise.String;

/**
 * Created by muthuselvan on 5/9/17.
 */
public class StringAddionSubtraction {

    public static void main(String[] args) {
        String in = "1+2-1";

        String[] data=in.split("-");
//        System.out.println(" 1= " +data[0]);
//        System.out.println(" 2= " +data[1]);
//
//        for (int i=0;i<data.length;i++) {
//            if (data[i].contains("+")) {
//
//
//            }
//        }

        char[] intocharArray = in.toCharArray();
        int result=0;
        for (int i=0;i<in.length();i++) {
            if (intocharArray[i] == '+') {
                result=Character.getNumericValue(intocharArray[i-1]) + Character.getNumericValue(intocharArray[i+1]);
                System.out.println(intocharArray[i-1]);
                System.out.println(intocharArray[i+1]);
            } else {
                continue;
            }
//            System.out.println("Result : " +result);
            System.out.println("Current index " +i +"in value" +intocharArray[i]);
            for (int j=i;i<in.length();i++) {
                if (intocharArray[j] == '-') {
                    result = result - Character.getNumericValue(intocharArray[j]);
                }
            }
        }
        System.out.println("Result : " +result);
    }


}
