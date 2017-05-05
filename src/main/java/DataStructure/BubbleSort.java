package DataStructure;

/**
 * Created by muthuselvan on 2/6/17.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] in = {10,40,30,5,7};

        int [] result = new int[in.length-1];

        for (int i=0;i<=in.length-1;i++) {
            for (int j=1;j<=in.length-1;j++) {
                if (in[j-1] >=in[j]) {
                    int temp = in[j-1];
                    in[j-1] = in[j];
                    in[j] = temp;

                }
            }
        }


        for (int i=0;i<=in.length-1;i++) {
            System.out.println("-" +in[i]);
        }

    }
}
