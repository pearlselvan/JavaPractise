package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * https://www.javacodegeeks.com/2013/03/difference-between-comparator-and-comparable-in-java.html
 * http://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
 * Created by muthuselvan on 2/2/17.
 * Comparator vs Comparable
 =========================

 Comparable :
 ------------

 Why ?
 =====
 A comparable object is capable of comparing itself with another object.

 1. Sorting logic:

 Sorting logic must be in same class whose objects are being sorted.
 Hence this is called natural ordering of objects


 2. Sorting method	int compareTo(Object o1)
 This method compares this object with o1 object and returns a integer.Its value has following meaning
 1. positive – this object is greater than o1
 2. zero – this object equals to o1
 3. negative – this object is less than o1	int compare(Object o1,Object o2)

 3. Calling method	Collections.sort(List)
 Here objects will be sorted on the basis of CompareTo method	Collections.sort(List, Comparator)
 Here objects will be sorted on the basis of Compare method in Comparator

 4. Package :	Java.lang.Comparable

 Comparator :
 ------------

 Why ?
 -----
 Comparing object more then one value thats suppose we want sort movies by their rating and names also. When we make a
 collection element comparable(by having it implement Comparable), we get only one chance to implement the compareTo()
 method



 1. Sorting logic is in separate class. Hence we can write different sorting based on different attributes of objects
 to be sorted. E.g. Sorting using id,name etc.
 Implementation	Class whose objects to be sorted must implement this interface.e.g Country class needs to implement
 comparable to collection of country object by id	Class whose objects to be sorted do not need to implement this interface.
 Some other class can implement this interface. E.g.-CountrySortByIdComparator class can implement Comparator interface to sort collection of country object by id

 2.This method compares o1 and o2 objects. and returns a integer.Its value has following meaning.
 1. positive – o1 is greater than o2
 2. zero – o1 equals to o2
 3. negative – o1 is less than o1


 3. Calling method :
 Collections.sort(List, Comparator)
 Here objects will be sorted on the basis of Compare method in Comparator


 Java.util.Comparator
 Java code:

 NOTE :
 ======
 1. Comparable is meant for objects with natural ordering which means the object itself must know how it is to be ordered.
 For example Roll Numbers of students. Whereas, Comparator interface sorting is done through a separate class.
 2. Logically, Comparable interface compares “this” reference with the object specified and Comparator in
 Java compares two different class objects provided.
 3. If any class implements Comparable interface in Java then collection of that object either List or Array can be sorted
 automatically by using Collections.sort() or Arrays.sort() method and objects will be sorted based on there natural
 order defined by CompareTo method.


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
