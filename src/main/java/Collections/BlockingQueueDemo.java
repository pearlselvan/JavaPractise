package Collections;

import java.util.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;

/*
  A BlockingQueue implementation class supports operations that wait for the queue to become non-empty
   when retrieving an element,
   and wait for space to become available in the queue when storing an element.
 */

/*
  Exception :
  BlockingQueue in Java doesn't allow null elements, various implementation of BlockingQueue
  like ArrayBlockingQueue, LinkedBlockingQueue throws NullPointerException
  when you try to add null on queue.

  Common methods :
  Common methods of BlockingQueue is are put() and take()
  which are blocking methods in Java and used to insert and retrive elements from BlockingQueue in Java.
  put() will block if BlockingQueue is full
  take() will block if BlockingQueue is empty,
  call to take() removes element from head of Queue as shown in following example:




 */



/**
 * Created by muthuselvan on 2/3/17.
 * @see java.util.concurrent.LinkedBlockingQueue
 * @see java.util.concurrent.BlockingQueue
 * @see java.util.concurrent.ArrayBlockingQueue
 * @see java.util.concurrent.LinkedBlockingQueue
 * @see java.util.concurrent.PriorityBlockingQueue
 *
 */
public class BlockingQueueDemo
{


    public static void main(String[] args) throws InterruptedException {

        boundedBlockingQueue();
        blockingQueue();
        concurrentLinkedQueue();



    }

    public static void linkedBlockingQueue() {
        Queue linkedBlockingQ =  new LinkedBlockingDeque();
        linkedBlockingQ.offer(1);
    }


    public static void boundedBlockingQueue() {

        BlockingQueue bounded = new ArrayBlockingQueue(2) ;
        bounded.offer(100);
        bounded.offer(200);
        // bounded.add(300);  //Exceltion :main" java.lang.IllegalStateException: Queue full
        System.out.println("Bounder Block Q : " +bounded.size());


    }

    public static void concurrentLinkedQueue() {
        Queue concurrentLinkedQueue =  new ConcurrentLinkedQueue();
        concurrentLinkedQueue.offer(1);
    }

      /*
         1. its thread safe
         2. Practical use : typically used to have on thread produce objects, which another thread consumes.
         3. It is not possible to insert null into a BlockingQueue. If you try to insert null,
         the BlockingQueue will throw a NullPointerException.
         4.

       */
      public static void blockingQueue() throws InterruptedException {
          BlockingQueue queue = new ArrayBlockingQueue(1024);
          try {
              queue.put(1);
              queue.put(2);
//              queue.put(null);
          } catch (NullPointerException e) {
              System.out.println("Null values will not allowed in ArrayBlockingQueue ");
              e.printStackTrace();
          } catch (InterruptedException e ) {
              e.printStackTrace();
          }

          /*
          Retrieves and removes the head of this queue, waiting if necessary
          until an element becomes available.
           */
          System.out.println("Array Blocking Q take : " +queue.take());

          /*
            * Retrieves, but does not remove, the head of this queue,
            or returns {@code null} if this queue is empty.
           */

          System.out.println("Array Blocking Q peek : " +queue.peek());

          /*
           Retrieves and removes the head of this queue,
           or returns {@code null} if this queue is empty.
           */
          System.out.println("Array Blocking Q poll : " +queue.poll());


      }}




