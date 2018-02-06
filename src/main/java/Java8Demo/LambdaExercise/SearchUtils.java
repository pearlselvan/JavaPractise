package Java8Demo.LambdaExercise;

import java.util.List;
import java.util.function.Predicate;

public class SearchUtils {


    public static void printall(List<Person> personList){
        personList.forEach(out-> System.out.println(out));

    }

    public static void printCondionally(List<Person> personList, Predicate<Person> condition) {

        for (Person person : personList) {
            if (condition.test(person)) {
                System.out.println(person.getName());
            }

        }

    }
}
