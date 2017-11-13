package Java8Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by muthuselvan on 10/26/17.
 */
public class StreamPrintEvenNumbers {

    public static void main(String[] args) {
//        List<Integer> input = Arrays.asList(IntStream.range(1,10));
//        List<Integer> input  = IntStream.range(1,10).boxed().collect(Collectors.toList());
        System.out.println(getRangeOfList());
        List<Integer> result = getRangeOfList().stream().filter( out -> out % 2 == 0).collect(Collectors.toList());
        System.out.println("Print filter result : " +result);

        // map
        System.out.println("*2  for each list : " +getRangeOfList().stream().map((out) -> out*2).collect(Collectors.toList()));


    }


    public static List<Integer> getRangeOfList() {
        return IntStream.range(1,10).boxed().collect(Collectors.toList());

    }
}
