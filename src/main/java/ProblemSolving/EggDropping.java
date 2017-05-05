package ProblemSolving;

import java.util.Hashtable;

/**
 * Created by muthuselvan on 4/26/17.
 * for the given floor for the given egg , decide which floor which egg should be dropped so that
 * total attempt will be minimized
 * https://www.youtube.com/watch?v=amdKmQlATmQ
 */
public class EggDropping {

    public EggDropping() {


    }

    public static void main(String[] args) {
        System.out.println(eggDrop(2,100));
        Hashtable hashtable = new Hashtable();
        hashtable.put("1","2");
    }



    static int max(int a, int b) { return (a > b)? a: b; }
    //eggDrop will return floor which dropped the egg in worst case
    static int eggDrop(int egg, int floor) {

        if ((floor == 1 ) || (floor == 0 ) )
            return floor;

        if (egg == 1)
            return floor;

        int min = Integer.MAX_VALUE;
        int result ; // finding minimum of each floor
        int eachfloor = 0 ; // tracking for each floor : //
        //Example if we are going to try from 4 the floow then eachfloor = 4 to till last top floor

        for (eachfloor=1;eachfloor<=floor;eachfloor++) {
            // first arg is if egg break the reduce the egg and go to down the floor
            // second agr if egg does not break then go up with the avaiable egg
            result = Math.max(eggDrop(egg-1,eachfloor-1),eggDrop(egg,floor-eachfloor)) ;
            if (result < min )
                min=result;
        }

        return min+1;
    }


}
