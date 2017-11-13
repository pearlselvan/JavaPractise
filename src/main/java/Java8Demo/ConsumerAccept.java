package Java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by muthuselvan on 11/1/17.
 */
public class ConsumerAccept {


    public static void main(String[] args) {
        Consumer<String> consumer =  (out) -> {
                System.out.println(" Message : " +out);

        } ;

          //Example 1
          consumer.accept("10");

          // Example 2

        List<SoftwareEngineer> engs = Arrays.asList(new SoftwareEngineer("Muthu",100),
                new SoftwareEngineer("Pitchai",101));
//http://www.java2s.com/Tutorials/Java/java.util.function/Consumer/index.htm
        printList(engs,out-> System.out.println(out.getName()));
        printList(engs,out-> {
//           out.getSalary()+= 100;
        });




    }

    public static void printList(List<SoftwareEngineer> se_arg, Consumer<SoftwareEngineer> consumer) {
        for (SoftwareEngineer softwareEngineer : se_arg ) {
//            System.out.println(softwareEngineer.getName());
            consumer.accept(softwareEngineer);
        }


    }



}


class SoftwareEngineer {

    private String name ;
    private Integer salary ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public SoftwareEngineer(String name, Integer salary) {
        this.name = name;
    }
}
