package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by muthuselvan on 2/2/17.
 */

// Comparator for customized sorting comparting two objects
// This interface java.util.Comparator

public class ComparatorDemo {

    public static void main(String[] args) {
        Person p1 = new Person("muthu",8);
        Person p2 = new Person("selvan",2);
        Person p3 = new Person("revanth",5);
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p1);
        personArrayList.add(p2);
        personArrayList.add(p3);

//        Collections.sort(personArrayList ,new PersonComparatorByHeightByAscending());


        Collections.sort(personArrayList ,new PersonComparatorByHeightByAscending());
        personArrayList.forEach(out -> System.out.println("Height be Asecending : " +out));

        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person h1, Person h2) {
                return -h1.getName().compareTo(h2.getName());
            }
        });

        personArrayList.forEach(out -> System.out.println("Name be Asecending by ananymous : " +out));


        //Using lambda :
        personArrayList.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));
        personArrayList.forEach(out -> System.out.println("Lambda :: Name be Asecending by ananymous : " +out));

    }


}


class Person {

    private String name ;
    private Integer height ;

    public Person(String name, Integer height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}

class PersonComparatorByHeightByAscending implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getHeight().compareTo(o2.getHeight());
    }

}

class PersonComparatorByHeightByDecending implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return -o1.getHeight().compareTo(o2.getHeight());
    }

}
