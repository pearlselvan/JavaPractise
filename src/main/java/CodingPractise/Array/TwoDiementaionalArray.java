package CodingPractise.Array;

/**
 * Created by muthuselvan on 3/23/17.
 */

/*
int[][] multi = new int[][]{
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
};
 */
public class TwoDiementaionalArray {

    public static void main(String[] args) {


        int[][] multi = new int[][]{
                { 0, 1, 1, 0, 1, 1 },
                { 1, 1, 0, 1, 1, 1 },
                { 0, 1, 1, 1, 0, 0 },
                { 1, 1, 100, 1, 0, 0 },
                { 1, 1, 1, 1, 71, 0 },
                { 0, 1, 1, 1, 0, 70 }
        };
        System.out.println(multi[3][2]);


        for (int i=1;i<multi.length;i++) {
            for (int j=0;j<multi.length;i++) {
                int k = j+i-1;
                System.out.println(multi[i][k+1]);


            }
            }

        }


    }

