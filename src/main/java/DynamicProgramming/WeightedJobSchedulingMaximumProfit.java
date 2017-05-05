package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by muthuselvan on 4/13/17.
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/dynamic/WeightedJobSchedulingMaximumProfit.java
 */
public class WeightedJobSchedulingMaximumProfit {

    public static void main(String[] args) {



        Jobs[] jobsarray = new Jobs[4];

        //        Jobs j1=new Jobs(1,2,50);
//        Jobs j2=new Jobs(3,5,20);
//        Jobs j3=new Jobs(6,19,100);
//        Jobs j4=new Jobs(2,100,200);


//        jobsarray[0]=new Jobs(1,120,50);
//        jobsarray[1]=new Jobs(3,5,20);
//        jobsarray[2]=new Jobs(6,19,100);
//        jobsarray[3]=new Jobs(2,100,200);


        jobsarray[0]=new Jobs(3,10,20);
        jobsarray[1]=new Jobs(1,2,50);
        jobsarray[2]=new Jobs(6,19,100);
        jobsarray[3]=new Jobs(2,100,200);
        Arrays.sort(jobsarray,new MyComparator());

        List<Jobs> alljobs = new ArrayList();
        alljobs.add(jobsarray[0]);
        alljobs.add(jobsarray[1]);
        alljobs.add(jobsarray[2]);
        alljobs.add(jobsarray[3]);
        System.out.println("All jobs after sorted" +alljobs);

        WeightedJobSchedulingMaximumProfit weightedJobSchedulingMaximumProfit = new WeightedJobSchedulingMaximumProfit();
        System.out.println("Max : " +weightedJobSchedulingMaximumProfit.maximum(jobsarray));

    }

    public int maximum(Jobs[] jobs){
        int T[] = new int[jobs.length];
        MyComparator comparator = new MyComparator();
        Arrays.sort(jobs, comparator);
        T[0] = jobs[0].profit;
        System.out.println("Initall T[0] : " +T[0]);
        for(int i=1; i < jobs.length; i++){
            System.out.println("jobs[i].profit in index : "+ i +" : "+jobs[i].profit);
            System.out.println("T[i-1] : in index "   +T[i-1]);
            T[i] = Math.max(jobs[i].profit, T[i-1]); // Getting profit of

            System.out.println("T[i] value After : T[i] = Math.max(jobs[i].profit, T[i-1]) : " +T[i]);

            for(int j=i-1; j >=0; j--){

                if(jobs[j].end <= jobs[i].start){ //check if do not overlap
                    System.out.println("jobs[j].end  " +jobs[j].end);
                    System.out.println("jobs[i].start  " +jobs[i].start);
                    T[i] = Math.max(T[i], jobs[i].profit + T[j]);
                    System.out.println("T[i] value After : T[i] = Math.max(T[i], jobs[i].profit + T[j]) : " +T[i]);
                    break;
                }
            }
        }

        // End of the above loob will profit after combined the job (which is not overlapping )
        // so we need to find max profit now from array T
        int maxVal = Integer.MIN_VALUE;
        for (int val : T) {
            if (maxVal < val) {
                maxVal = val;
            }
        }
        return maxVal;
    }

}

class MyComparator implements Comparator<Jobs> {
    @Override
    public int compare(Jobs o1, Jobs o2) {
    return o1.end <= o2.end ? -1:1;
    }
}

class Jobs {

    int start ;
    int end ;
    int profit ;

    public Jobs(int start,int end,int profit) {
        this.start = start;
        this.end=end;
        this.profit=profit;
    }

    @Override
    public String toString() {
        return "Jobs {" +
                "start=" + start +
                ", end=" + end +
                ", profit=" + profit +
                '}';
    }

//    @Override
//    public int compareTo(Jobs jobs) {
//
//        if (this.end == jobs.end) {
//         return 0;
//        } else {
//          return this.end > jobs.end ? -1 : 1;
//        }
//
//
//    }
}
