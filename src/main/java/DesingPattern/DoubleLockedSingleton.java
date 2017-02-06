package DesingPattern;

import java.util.Objects;
import java.util.concurrent.*;

/**
 * Created by muthuselvan on 2/4/17.
 */

//http://javarevisited.blogspot.com/2014/05/double-checked-locking-on-singleton-in-java.html

public class DoubleLockedSingleton {

    private static Future firstTask = null;

    public static void main(String[] args) {
        DoubleCheckedLock doubleCheckedLock = DoubleCheckedLock.getInstance();
        System.out.println("1 " +doubleCheckedLock.hashCode());

        DoubleCheckedLock doubleCheckedLock2 = DoubleCheckedLock.getInstance();
        System.out.println("2 " +doubleCheckedLock.hashCode());

       Tworker tworker = new Tworker();
       ExecutorService service = Executors.newFixedThreadPool(2);
       firstTask = service.submit(tworker);
        try {
            System.out.println("Return :  " +firstTask.get().hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
    }


}



class Tworker implements Callable {
    DoubleCheckedLock doubleCheckedLock;
    public DoubleCheckedLock call() {
        try {
            doubleCheckedLock = DoubleCheckedLock.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doubleCheckedLock;



    }

}


//Doble Checked Locking
class DoubleCheckedLock    {
    private static DoubleCheckedLock doubleCheckedLock = null ;
    private DoubleCheckedLock() {

    }

    public static DoubleCheckedLock getInstance() {
        if (doubleCheckedLock == null) {
          synchronized (DoubleCheckedLock.class) {
              if (doubleCheckedLock == null) {
                  doubleCheckedLock = new DoubleCheckedLock();
              }
          }
        }
        return doubleCheckedLock;

    }


}



