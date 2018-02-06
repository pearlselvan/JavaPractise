package Java8Demo.LambdaExercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainApp {

    static SearchUtils searchUtils = new SearchUtils();

    public static void main(String[] args) {



        List<Person> personList = Arrays.asList(
                new Person("Muthu",10, Person.Sex.FEMALE),
                new Person("Revanth",20),
                new Person("Google",100)
        );


        personList.forEach(out-> System.out.println(out));

        searchUtils.printCondionally(personList,p->p.getName().startsWith("M"));




    }
}
