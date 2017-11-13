package Java8Demo;

import java.util.function.BiConsumer;

/**
 * Created by muthuselvan on 10/22/17.
 */
public class BiConsumerLambdaException {


    public static void main(String[] args) {


        int[] numbers = {10,20,30,40};
        int divider = 2 ;
        System.out.println("Without lambda");
        doOpearation(numbers, divider, new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                System.out.println(integer+integer2);
            }
        });

        System.out.println("With lambda");
        doOpearation(numbers,divider,(k,v) -> System.out.println(k+v));
        System.out.println("With lambda");
        doOpearation(numbers,divider,(k,v) -> System.out.println(k-v));
        System.out.println("With lambda");
        doOpearation(numbers,divider,(k,v) -> System.out.println(k/v));


    }

    private static void doOpearation(int[] numbers, int divider, BiConsumer<Integer,Integer> consumer) {

        for (int num : numbers) {
//            System.out.println(num+divider);
            consumer.accept(num,divider);
        }

    }


}
