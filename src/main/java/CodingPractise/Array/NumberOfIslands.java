package CodingPractise.Array;

/**
 * Created by muthuselvan on 9/8/17.
 *
 * http://www.ideserve.co.in/learn/number-of-clusters-of-1s
 * https://www.pramp.com/challenge/yZm60L6d5juM7K38KYZ6
 *
 *
 Test Case #1
 Input: [[0]],Expected: 0,Actual: 0
 Test Case #2
 Input: [[1]],Expected: 1,Actual: 0
 Test Case #3
 Input: [[1,0,1,0]],Expected: 2,Actual: 0
 Test Case #4
 Input: [[1,0,1,0],[0,1,1,1],[0,0,1,0]],Expected: 2,Actual: 0
 Test Case #5
 Input: [[1,0,1,0],[0,1,1,1],[0,0,1,0],[1,1,0,0],[0,1,0,1]],Expected: 4,Actual: 0
 Test Case #6
 Input: [[0,1,0,1,0],[0,0,1,1,1],[1,0,0,1,0],[0,1,1,0,0],[1,0,1,0,1]],Expected: 6,Actual: 0
 Test Case #7
 Input: [[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1]],Expected: 1,Actual: 0
 */
public class NumberOfIslands {

    public static void main(String[] args) {

        char[][] data = {
                        { '0',    '1',    '0',    '1',    '0'},
                         {'0',    '0',    '1',    '1',    '1'},
                         {'1',    '0',    '0',    '1',    '0'},
                         {'0',    '1',    '1',    '0',    '0'},
                         {'1',    '0',    '1',    '0',    '1'}

        };
        System.out.println(numIslands(data));

    }


    public static int numIslands(char[][] grid) {
        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;

        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    count++;
                    merge(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void merge(char[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;

        if(i<0||i>=m||j<0||j>=n||grid[i][j]!='1')
            return;

        grid[i][j]='X';

        merge(grid, i-1, j);
        merge(grid, i+1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);
    }
}
