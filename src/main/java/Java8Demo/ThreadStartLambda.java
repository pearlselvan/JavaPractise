package Java8Demo;

/**
 * Created by muthuselvan on 2/8/17.
 */
public class ThreadStartLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=10;i++) {
                    System.out.println("Running Child");
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }


        });


        thread.start();


        Thread threadLambda = new Thread(() ->
        {
            for (int i = 0;i<=10;i++) {
                System.out.println("Running lamda child thread ");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadLambda.start();


        for (int i=0;i<=10;i++) {
            System.out.println("Running Main");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
