package CodingPractise;

/**
 * Created by muthuselvan on 3/7/17.
 */
public class PrintStar {
//http://www.java67.com/2015/10/how-to-print-pyramid-pattern-in-java-example.html
    public static void main(String[] args) {
        drawPriyamid();
    }


    public static void drawPriyamid() {

        for (int i = 0; i < 5; i++) {
            ////printing * one time for evey 4 spaces
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" "); // Please note only print with one space
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* "); // Please note only print
            }
            System.out.println(); // Please note just println
        } //End outer for loop


    }
}
/*
     *
    * *
   * * *
  * * * *
 * * * * *

  Logically :
   4 SPACES  * 4 SPACES
   3 SPACES * * 3 SPACES
  2 SPACES * * * 2 SPACES
 1 SPACES * * * *  1 SPACES
0 SPACES * * * * * 0 SPACES


SPACES WILL BE TAKE CARE BY inner for loop which in j in above code
printing start will be take care by last inner thats k (//printing * one time for evey 4 spaces )
outer for loop next line



 */
