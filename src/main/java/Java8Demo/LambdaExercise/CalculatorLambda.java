package Java8Demo.LambdaExercise;

import java.util.function.BiFunction;
import java.util.function.Function;

public class CalculatorLambda {


    //Ref : https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#approach4
//    static CalculatorLambda myApp = new CalculatorLambda();

    public static void main(String[] args) {


        calc add = (x,y) ->  x+y;
        calc minus = (x,y) ->  x-y;
        calc divide = (x,y) -> {
          if (y == 0) {
              return 0;
          }
              else {
              return x/y;
              }

        };
        System.out.println("Sum Of Two Nos : " +calculate(10,2,add));
        System.out.println("Min Of Two Nos : " +calculate(10,2,minus));
        System.out.println("Div Of Two Nos : " +calculate(10,0,divide));


        Function<Integer,Integer> function = (x) -> x+2;
        System.out.println(function.apply(2));

        BiFunction<Integer,Integer,Integer> add_UsingBiFunction = (x,y) -> x+y;
        System.out.println(add_UsingBiFunction.apply(10,20));


    }

    interface calc {
        int opearation(int x,int y);
    }

    public static int calculate (int x , int y , calc calc) {
        return calc.opearation(x,y);
    }

}



