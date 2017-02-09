package DesingPattern;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by muthuselvan on 2/4/17.
 */
public class Singleton {


    //System.out.println("Signleton 1 " +singletonClassInstance1.hashCode());
    public static void main(String[] args) {

//        SingletonClass singletonClassInstance1 = SingletonClass.getInstance();
//        System.out.println("Signleton 1 " +singletonClassInstance1.hashCode());
//        SingletonClass singletonClassInstance2= SingletonClass.getInstance();
//        System.out.println("Signleton 2 " +singletonClassInstance2.hashCode());

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonClass singletonClassInstance1 = SingletonClass.getInstance();

                System.out.println("Signleton 1 " +singletonClassInstance1.hashCode());
            }
        });

        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonClass singletonClassInstance2= SingletonClass.getInstance();
                System.out.println("Signleton 2 " +singletonClassInstance2.hashCode());
            }
        });

        thread2.start();
    }
}


class ThreadRunnable implements Callable {
    public ThreadRunnable(){

    }

    @Override
    public SingletonClass call() {
        SingletonClass singletonClassInstance1= SingletonClass.getInstance();
        return singletonClassInstance1;
    }
}

class SingletonClass  {
    private static SingletonClass singletonClass = null ;
    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if ( singletonClass == null ) {
             singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
