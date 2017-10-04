package CodingPractise;

import java.util.Scanner;

/**
 * Created by muthuselvan on 7/3/17.
 */
public class Practice2 {
    /// to convert to base 7 from given base 10
    public static String convert(long _in) {
        char [] base7={'0','a','t','l','s','i','n'};
        StringBuffer target=new StringBuffer();

        for (long i=_in; i>0; i /=7){
            target.append(base7[(int)i%7]);
        }

        target= target.reverse();
        return target.toString();
    }





    public static int divide(int a,int b) {
        int c = -1;
        try {
            c= a/b ;
        }catch (Exception e ) {
            System.err.print("Exe");

        } finally {
            System.err.println("fina");
        }
        return c ;

    }

    public static void main (String[] args) throws Exception {
//        System.out.println(divide(4,0));
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long _in=7792875;
//        _in=16807+2401*2+343*3+49*4+7*5+1*6;
        System.out.println(convert(n));
    }
}
