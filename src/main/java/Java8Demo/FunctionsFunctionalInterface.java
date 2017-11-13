package Java8Demo;

import java.util.function.Function;

/**
 * Created by muthuselvan on 10/27/17.
 */
public class FunctionsFunctionalInterface {

    public static void main(String[] args) {
        Function<Integer,Integer> mul = (m) -> m*2 ;
        System.out.println(mul.apply(5));

    }
}
