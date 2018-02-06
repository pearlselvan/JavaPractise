package Java8Demo.LambdaExercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PredicateFilter {

    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(10,20,30,40,50);
        printConditionally(nos,(x)-> x < 30); // will print 10 , 20
        System.out.println("-------------");
        printConditionally(nos,(x)-> x > 30); // will print 40 , 50
        System.out.println("-------------");
        printConditionally(nos,(x)-> x > 10 && x < 50); // will print 20 , 30 , 40

        List<Integer> result = nos.stream().filter((x)-> x > 30).collect(Collectors.toList());
        System.out.println("Using Stram " +result);
        Supplier<String> supplier = () -> "welcome";
        System.out.println(supplier.get());


    }

    static String getName() {
        return "muthu";
    }

    public static void printConditionally (List<Integer> mylist, Predicate<Integer> condition) {

        for (Integer no : mylist) {
            if (condition.test(no)) {
                System.out.println(no);

            }

        }

    }
}
