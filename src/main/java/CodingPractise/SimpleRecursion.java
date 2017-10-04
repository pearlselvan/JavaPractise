package CodingPractise;

/**
 * Created by muthuselvan on 8/3/17.
 */
public class SimpleRecursion {

    public static void main(String[] args) {
        System.out.println(printmultiple(5));
    }

    static int printmultiple(int n) {


        if (n==0) {
            return 0;
        } else {

            return 2+printmultiple(n-1);
        }
    }
}
