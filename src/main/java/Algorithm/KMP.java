package Algorithm;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

/**
 * Created by muthuselvan on 2/1/17.
 */
public class KMP {


    public static void main(String[] args) {

            ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
            long[] threadIds = threadBean.findMonitorDeadlockedThreads();
            int deadlockedThreads = threadIds != null? threadIds.length : 0;
            System.out.println("Number of deadlocked threads: " + deadlockedThreads);

    }
}
