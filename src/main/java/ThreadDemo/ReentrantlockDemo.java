package ThreadDemo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by muthuselvan on 1/31/17.
 * 1. ReentrantLock in Java is added on java.util.concurrent package in Java 1.5
 * along with other concurrent utilities like CountDownLatch, Executors and CyclicBarrier.
 * 2. which provides more control on lock acquisition is trying to get a lock with ability to interrupt,
 * and a timeout on waiting for lock,
 * in Short :
 * ReentrantLock extends functionality of synchronized keyword in Java and open path for more controlled locking in Java.
 *  fairness, which can be used to provide lock to longest waiting thread.
 *








 */
public class ReentrantlockDemo {

    static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {

        rlock();



    }


    public static void rlock() {



        Thread t1 = new Thread(new Runnable() {




            @Override
            public void run() {
                try {
                    reentrantLock.tryLock();
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    reentrantLock.unlock();
                }

            }
        });

        t1.start();

    }

}
