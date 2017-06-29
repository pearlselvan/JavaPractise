package CodingPractise;

/**
 * Created by muthuselvan on 6/3/17.
 * https://itssmee.wordpress.com/2010/06/28/java-example-of-hamming-distance/
 *
 * This algorithm calculates the distance between two strings, however they have to be of equal
 * length.

 It measures the minimum number of substitutions for the two strings to be equal.


 *
 */
public class HammingDistance_CounterforStringtoEqual {


    public static void main(String[] args) {
        System.out.println(getHammingDistance("karolin","kathrin"));

    }


    public static int getHammingDistance(String compOne,String compTwo)
    {
        if (compOne.length() != compTwo.length())
        {
            return -1;
        }

        int counter = 0;

        for (int i = 0; i < compOne.length(); i++)
        {
            if (compOne.charAt(i) != compTwo.charAt(i)) counter++;
        }

        return counter;
    }
}
