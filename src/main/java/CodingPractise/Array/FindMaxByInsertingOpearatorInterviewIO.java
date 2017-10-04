package CodingPractise.Array;

/**
 *
 * http://www.geeksforgeeks.org/minimum-maximum-values-expression/
 *
 * Created by muthuselvan on 8/28/17.
 * We looked at the following problem:
  Given a list of numbers, insert “+”, “-”, “*” or “/” between each pair
 consecutive of numbers to find the maximum value you can get.
 For simplicity, assume that all operators are of equal precedence
    order and evaluation happens from left to right.
 *
 * Exampel :
 * (1 , 12, 3 ) = output : 1+12*3=39
 *
 * float getMaxNumber(float[] nums) {
 *
 *
 *
 * }
 *
 *
 *
 *  def max_number(arr):
 *   def sub_problem(prod,i):
 *    if i == len(arr):
 *    return prod
 *
 *    c=max(prod+sub_problem(arr[i],i+1) , prod - sub_problem(arr[i,i+1), sub_problem(prod*arr[i],i+1))
 *
 *    if (arr[i]!=0:
 *    return max(c,sub_problem(prod / arr[i],i+1))
 *    else :
 *    return c
 *
 *    return sub_problem(arr[0],1)
 *
 *
 */
public class FindMaxByInsertingOpearatorInterviewIO {

    public static void main(String[] args) {

        String name="muthu";
        String[] dataString = {"G","R","T"};
        System.out.println(name.length());
        System.out.println(dataString.length);

        FindMaxByInsertingOpearatorInterviewIO fin = new FindMaxByInsertingOpearatorInterviewIO();
        float[] data = {10,2,4};
        System.out.println(fin.getMaxNumber(data));




    }

    float getMaxNumber(float[] data) {

        int result = 0 ;
        int max = 0 ;

        for (int first=0;first<data.length;first++) {
            for (int second=first+1;second<data.length;second++) {
//                System.out.println(data[first] +" : " +data[second]);
                System.out.println(first +" : " +second);
//                result=
            }

        }

        return 3.6f;
    }


}
