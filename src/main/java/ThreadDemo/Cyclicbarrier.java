package ThreadDemo;

/**
 * Created by muthuselvan on 1/31/17.
 * A java.util.concurrent.CountDownLatch is a concurrency construct
 * that allows one or more threads to wait for a given set of operations to complete.
 *
 * Example Practical :
 * e.g. Application’s main thread want to wait, till other service threads which are responsible
 * for starting framework services have completed started all services.
 *
 * Ref : http://howtodoinjava.com/core-java/multi-threading/when-to-use-countdownlatch-java-concurrency-example-tutorial/
 *
 * What is different CyclicBarrier and CountDownLatch?
 *
 * Both CyclicBarrier and CountDownLatch are used to implement
 * a scenario where one Thread waits for one or more Thread to
 * complete there job before starts processing
 *
 * Diff is :
 * ---------
 * You can not reuse same CountDownLatch instance once count reaches to zero
 * and latch is open, on the other hand CyclicBarrier can be reused by resetting Barrier,
 * Once barrier is broken.
 *
 * Example when to use ?
 * ---------------------
 * What it implies that CountDownLatch is a good for one-time events
 * like application start-up time and CyclicBarrier can be used to in case of
 * the recurrent event e.g. concurrently calculating a solution of the big problem etc.

 How to reuse ?
 ------------------
 reuse CyclicBarrier by calling reset() method which resets Barrier to its initial State.







 *
 */
public class Cyclicbarrier {
}
