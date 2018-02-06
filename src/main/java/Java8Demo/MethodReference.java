package Java8Demo;

import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by muthuselvan on 10/23/17.
 * https://www.youtube.com/watch?v=lwwIZuwYmNI&index=21&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
 */
public class MethodReference {


    public static void main(String[] args) {
        Consumer<String> consumerNoMethodReference = name -> System.out.println(name);
        Consumer<String> consumerUsingMethondReferene = System.out::println;
        consumerNoMethodReference.accept("S");
        consumerUsingMethondReferene.accept("Using Methond Reference");


        Thread threadNoStaticMethodReference = new Thread(() -> printMessage());
        threadNoStaticMethodReference.start();
        Thread threadUsingStaticMethodReference = new Thread(MethodReference::printMessage);
        threadUsingStaticMethodReference.start();
        Predicate intPredicateless = i -> 1 < 100 ;
        System.out.println(intPredicateless.test(10));
    }



    public static void printMessage() {
        System.out.println("Print message using thered");
    }
}
