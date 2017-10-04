package ProblemSolving;

/**
 * Created by muthuselvan on 9/5/17.
 * https://www.tutorialspoint.com/javaexamples/method_tower.htm
 *
 *
 * Approach : http://algorithms.tutorialhorizon.com/towers-of-hanoi/

 Recur­sively Move N-1 disk from source to Aux­il­iary peg.
 Move the last disk from source to destination.
 Recur­sively Move N-1 disk from Aux­il­iary to des­ti­na­tion peg.


 Big - O : ( 2 power n )
 http://www-bcf.usc.edu/~stejada/csci101/slides/2012/TowerHanoi.pdf

 DP Solution :
 https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2008.%20Recursion%20and%20Dynamic%20Programming/Q8_06_Towers_of_Hanoi/Tower.java
 *
 */
public class TowersOfHonoi {

    public static void main(String[] args) {
        int nDisks = 3;
        //A would Tower-Source or Tower-From
        //B would be Tower-Temp or Tower-inter ...B would be buffer
        //C would be Tower-Destionation or Tower-To
        doTowers(nDisks, 'A', 'B', 'C');

    }

    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
