package CodingPractise.General;

/**
 * Created by muthuselvan on 7/12/17.
 *
 * Question ? http://www.corejavainterviewquestions.com/idiots-guide-big-o/
 * ==========
 * I have an array of the numbers 1 to 100 in a random number. One of the numbers is missing.
 * Write an algorithm to figure out what the number is and what position is missing.

 * There are many variations of this question all of which are very popular.
 * To calculate the missing number we can simply add up all the numbers we do have,
 * and subtract this from the expected answer of the sum of all numbers between 1 and 100.

 * To do this we have to iterate the list once. Whilst doing this we can also note which spot has the gap.
 *
 * What is the big O of your algo?
  ==================================
    Our algorithm iterates through our list once, so it’s simply O(n).


 *
 */
public class FindMissionNumber {

    public static void main(String[] args) {
        int[] in = {1,2,3,5};
        int sum=0;

        for (int i=0;i<in.length;i++) {
            sum = sum + in[i];
        }
        System.out.println("Sum " +sum);
        System.out.println("Missing number " +(sum-5));
    }


}
