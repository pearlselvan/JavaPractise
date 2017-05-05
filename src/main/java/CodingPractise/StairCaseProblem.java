package CodingPractise;

/**
 * Created by muthuselvan on 4/23/17.
 */
public class StairCaseProblem {

    public static void main(String[] args) {
        System.out.println("Counts ways for 5" +new StairCaseProblem().countways(2));

    }


    int countways(int n ) {
        if (n < 0) {
            return 0;
        } else if (n == 0 ) {
            return 1;
        } else {
            return countways(n - 1) + countways(n - 2) + countways(n - 3);
        }
    }
}
