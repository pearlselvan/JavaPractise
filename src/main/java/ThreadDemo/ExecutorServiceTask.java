package ThreadDemo;

//https://examples.javacodegeeks.com/core-java/util/concurrent/executorservice/java-executorservice-example-tutorial/

import java.util.Objects;
import java.util.concurrent.*;

/**
 * Created by muthuselvan on 1/31/17.
 */
public class ExecutorServiceTask {

    //the Future object, the result of asynchronous computation.
    private static Future firstTask = null;
    private static Future secondTask =null;



    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyThread myThread1  = new MyThread("first",5,10);
//        MyThread myThread2  = new MyThread("second",5,5);
//        Thread thread1= new Thread(myThread1);
//        Thread thread2= new Thread(myThread2);
//        thread1.start();
//        thread2.start();
        /*
        The java.util.concurrent.ExecutorService interface represents an asynchronous execution mechanism which is capable of executing
        tasks in the background. An ExecutorService is thus very similar to a thread pool.
        In fact, the implementation of ExecutorService present in the java.util.concurrent package is a thread pool implementation.
        http://tutorials.jenkov.com/java-util-concurrent/executorservice.html
         */
        // This create the thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);
//      MyThread myThread1  = new MyThread("first",5,10);
        Runnable myThread1  = new MyThread("first",5,10);
        // the Runnable interface is passed to the execute() method. This causes the Runnable to be executed by one of the threads in the ExecutorService.
//        executor.execute(myThread1); // This will not return object . if you want return use future
        firstTask = executor.submit(myThread1);

        while (!firstTask.isDone()) {
            System.out.println("Fitst Task is in progress");
            System.out.println(firstTask.get());
        }

        System.out.println("First Task Status " +firstTask.get());  // //returns null if the task has finished correctly.

        System.out.println("======================CALLABLE DEMO USING FUTURE AND EXEUTOR SERVICE =============================");


        MyThreadCallable secondCallableThread = new MyThreadCallable("second",5,20);
        secondTask = executor.submit(secondCallableThread);

        while (!secondTask.isDone()) {
            System.out.println("Second Taks is in Progress");
        }
        System.out.println("Second Task Status " +secondTask.get());

     executor.shutdown();


    }
}


class MyThread implements Runnable {

    private String myName;
    private int count;
    private final long timeSleep;

    MyThread(String name, int newcount, long newtimeSleep) {
        this.myName = name;
        this.count = newcount;
        this.timeSleep = newtimeSleep;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        int sum = 0;
        for (int i = 1; i <= this.count; i++) {
            sum = sum + i;
        }
        System.out.println(myName + " thread has sum = " + sum +
                " and is going to sleep for " + timeSleep);
        try {
            Thread.sleep(this.timeSleep);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}


class MyThreadCallable implements Callable {

    private String myName;
    private int count;
    private final long timeSleep;

    MyThreadCallable(String name, int newcount, long newtimeSleep) {
        this.myName = name;
        this.count = newcount;
        this.timeSleep = newtimeSleep;
    }

    @Override
    public Integer call() {
        // TODO Auto-generated method stub

        int sum = 0;
        for (int i = 1; i <= this.count; i++) {
            sum = sum + i;
        }
        System.out.println(myName + " thread has sum = " + sum +
                " and is going to sleep for " + timeSleep);
        try {
            Thread.sleep(this.timeSleep);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sum;
    }

}