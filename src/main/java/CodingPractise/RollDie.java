package CodingPractise;

/**
 * Created by muthuselvan on 6/7/17.
 */
public class RollDie {

    public static void main(String[] args) {

//        int SIDES = 6 ;


        int SIDES = 6;   // how many sides on the die?

        // roll should be 1 through SIDES
        int roll = (int) (Math.random() * SIDES) + 1;

        // print result
        System.out.println(roll);


    }
}
