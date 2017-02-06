package ThreadDemo;

/**
 * Created by muthuselvan on 2/4/17.
 */


//http://javarevisited.blogspot.com/2011/06/volatile-keyword-java-example-tutorial.html
// https://dzone.com/articles/java-volatile-keyword-0


    /*

   1. volatile keyword in Java guarantees that value of the volatile variable will always be read from main memory and not
   from Thread's local cache.


     */


    /*

    If you are working with the multithreaded programming, the volatile keyword will be more useful.
    When multiple threads using the same variable, each thread will have its own copy of the local cache for that variable.
    So, when it’s updating the value, it is actually updated in the local cache not in the main variable memory.
    The other thread which is using the same variable doesn’t know anything about the values changed by the another thread.
    To avoid this problem, if you declare a variable as volatile, then it will not be stored in the local cache.
    Whenever thread are updating the values, it is updated to the main memory. So, other threads can access the updated value
     */


public class VolatileDemo extends Thread {
    private volatile boolean keepRunning = true;
    public void run() {
        System.out.println("Thread started");
        while (keepRunning) {
            try {/*  w w  w .  ja v  a 2  s .c  om*/
                System.out.println("Going to sleep");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped");
    }
    public void stopThread() {
        this.keepRunning = false;
    }
    public static void main(String[] args) throws Exception{
        VolatileDemo v = new VolatileDemo();
        v.start();
        Thread.sleep(3000);
        System.out.println("Going to set the stop flag to true");
        v.stopThread();
    }
}
