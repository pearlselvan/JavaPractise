package Java8Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Predicate;

/**
 * Created by muthuselvan on 10/22/17.
 */
public class PredicateLambdaInterface {

    public PredicateLambdaInterface() {

    }


    public static void main(String[] args) {



        List<Person> allpersonlist = Arrays.asList(
                new Person("ma","ra",35),
                new Person("sevan","as",35),
                new Person("revanth","ms",35),
                new Person("coo","vim",35),
                new Person("car","mike",35),
                new Person("cts","rose",35)
                );

        allpersonlist.forEach(out -> System.out.println(out));

        Collections.sort(allpersonlist, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getFname().compareTo(o2.getFname());
                    }
                }
        );
        System.out.println("After sort by first name ");
        allpersonlist.forEach(out -> System.out.println(out));

        System.out.println("After sort by lastime name using lambda");
        Collections.sort(allpersonlist, (p1,p2)-> p1.getLname().compareTo(p2.getLname()));

        allpersonlist.forEach(out -> System.out.println(out));

        // print start name with "C"


        printlist(allpersonlist);

        printstartwithC(allpersonlist);

        printconditionally(allpersonlist, p-> p.getFname().startsWith("c"));

        printconditionally(allpersonlist, p-> true);




    }

    private static void printconditionally(List<Person> allpersonlist,Predicate<Person> predicate) {
        System.out.println(" Print Conditionally using lambda ....");

        for (Person person : allpersonlist) {

            if (predicate.test(person)) {
                System.out.println(person.fname);
            }
        }

    }

    private static void printlist(List<Person> allpersonlist) {
        System.out.println("printing list ...");

        for ( Person printlst : allpersonlist) {
            System.out.println(printlst);
        }

    }

    private static void printstartwithC(List<Person> allpersonlist) {
        System.out.println("printing fname starting with C ...");

        for ( Person printlst : allpersonlist) {

            if (printlst.getFname().startsWith("c")) {
                System.out.println(printlst);
            }
        }

    }


}


class Person {

    String fname ;
    String lname ;
    Integer age ;





    public Person(String fname, String lname, Integer age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public Person () {

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "InterfacePerson{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }


}
