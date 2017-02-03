package ThreadDemo;

import java.util.concurrent.TimeUnit;

/**
 * Created by muthuselvan on 1/31/17.
 */

//Ref : https://meteatamel.wordpress.com/2012/03/21/deadlock-detection-in-java/


/*
What is a deadlock?
 Imagine you have two threads, thread1 and thread2.
 Thread1 acquires lock1 and is about to acquire lock2 while thread2 acquires lock2 and is about to acquire lock1.
  In this case, threads are deadlocked because they are each waiting for the other thread to release the other lock
  and your application just hangs.

   Deadlocks usually occur when the order of locks is not consistent throughout the application.

   How to get the thread dump ? use jstack
 */




public class DeadLockAvoid {




    public static void main(String[] args) throws InterruptedException {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) { // main synchronized block start here
                    System.out.println("Thread 1 acquires lock 1 ");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2) {
                        System.out.println("Thread 1 acquired lock 1");
                    }   // sub synchronized block ends here

                }  // main synchronized block ends here
            }
        });

        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock2) { // main synchronized block start here
                    System.out.println("Thread 2 acquired lock 2");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1) {
                        System.out.println("Thread 2 acquires lock 1");
                    }

                } //// main synchronized ends start here
            }
        });

        thread2.start();







//        Thread thread1 = new Thread(new Runnable() {
//            @Override public void run() {
//                synchronized (lock1) {
//                    System.out.println("Thread1 acquired lock1");
//                    try {
//                        TimeUnit.MILLISECONDS.sleep(50);
//                    } catch (InterruptedException ignore) {}
//                    synchronized (lock2) {
//                        System.out.println("Thread1 acquired lock2");
//                    }
//                }
//            }
//
//        });
//        thread1.start();
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override public void run() {
//                synchronized (lock2) {
//                    System.out.println("Thread2 acquired lock2");
//                    try {
//                        TimeUnit.MILLISECONDS.sleep(50);
//                    } catch (InterruptedException ignore) {}
//                    synchronized (lock1) {
//                        System.out.println("Thread2 acquired lock1");
//                    }
//                }
//            }
//        });
//        thread2.start();
//
//        // Wait a little for threads to deadlock.
//        try {
//            TimeUnit.MILLISECONDS.sleep(100);
//        } catch (InterruptedException ignore) {}
    }
//

    }

