import java.util.Scanner;

public class Practise4 {
    public static void main(String[] args) {

        String in = "ab";
        char[] chars = in.toCharArray();

        for (int i=1;i<in.length()-2;i++) {
            System.out.println(i);
            if (chars[i] == chars[i+2]) {
                System.out.println(i);
            } else {
                System.out.println(i);
            }
        }

    }
}
