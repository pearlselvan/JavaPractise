package CodingPractise;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by muthuselvan on 4/27/17.
 */
public class ArrayComparator {

    public ArrayComparator() {

    }

    public static void main(String[] args) {

        Chess[] studentArray = new Chess[5];

        for (int i=0;i<=4;i++) {
            studentArray[i].setScore(i);
            studentArray[i].setName("Muthu"+i);
        }

//        for (int i=1;i<=5;i++) {
//            studentArray[i].getName();
//            studentArray[i].getScore();
//        }
        Arrays.sort(studentArray,new scoreComparator());



    }


}


class scoreComparator implements Comparator<Chess> {

    @Override
    public int compare(Chess o1, Chess o2) {
        return o2.score - o1.score;
    }
}

class Chess {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name ;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    Integer score ;

    public Chess(String name,Integer score) {
        this.name = name;
        this.score=score;
    }



}
