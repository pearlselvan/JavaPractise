package CodingPractise;

/**
 * Created by muthuselvan on 5/2/17.
 *
 *
 * Read this story first to understand problem :
 * https://www.hackerearth.com/practice/algorithms/dynamic-programming/2-dimensional/practice-problems/algorithm/building-the-wall-2/
 *
 * Simple logic :
 * You can explain this first : http://www.hsufengko.com/home/fill-out-a-4xn-wall-with-4x1-and-1x4-bricks
 *
 * Dynamic programming :
 * https://codegist.in/algorithms/dynamic-programming/build-wall-bricks-dynamic-programming-set-4
 */
public class BrickBuildingtheWall {

    public static void main(String[] args) {
        System.out.println("No of ways : " +buildNumberOfWays(4));



    }

    /*
    For Example for N=4 ,
    Wall size become 4×4 ,
    There are two ways to build wall of size 4×4 = {4 bricks of size 1×4 placed vertically, 4 bricks of size 4×1 placed horizontally}
     i.e answer is 2


     */
    public static int buildNumberOfWays(int N) {

        if (N < 0) return 0;

        if (N<=3) return 1;
        if (N==4) return 2;
        return buildNumberOfWays(N-1) + buildNumberOfWays(N-4);




    }

}
