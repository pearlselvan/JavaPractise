package CodingPractise;

/**
 * Created by muthuselvan on 3/24/17.
 */
public class StairCase {

    public static void main(String[] args) {
        drawStairCase(5);
    }

    public static void drawStairCase(int n ) {

        for (int i = n; i > 0; i--) {
            for (int k = i; k >= i; k--) {
                System.out.print(" *"); // Please note only print
            }
            System.out.println(); // Please note just println
        } //End outer for loop

    }
}
