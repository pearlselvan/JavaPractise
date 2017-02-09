package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by muthuselvan on 2/2/17.
 * http://beginnersbook.com/2013/12/difference-between-arraylist-and-linkedlist-in-java/
 */

/*

 Compare with Search , Deletion , Inserts Performance
 and   Memory Overhead
 What is similarity ?
 1. Both will maintain insertion order
 2. Both from list interface
 3. Both of them non synchronized but we have :
   Collections.synchronizedList method.
 */


public class ArrayListDemo {
    public static void main(String[] args) {
        arrayList();
        linkedList();
    }

    //seach will be good o(1) where in linked list o(n)
    // because it implements RandomAccess so search wil be faseter
    // its not thread safe , so use vector but
    public static void arrayList() {
        ArrayList<String> arrayList = new ArrayList<>();  // implements RandomAccess so search wil be faseter
        arrayList.add("google1");
        arrayList.add("google2");
        arrayList.add("google3");
        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList.size());
        arrayList.forEach(name -> System.out.println(name));
    }



    //When to use :  insert and remove because o(1)
    // but in array list o(n)

    // frequent addition and deletion in application
    // then LinkedList is a best choice.

    // Linked List is Doubly-linked list implementation
    // because its impleemnt list and queue inteface

    public static void linkedList() {
//        List<Employee> linkedList = new LinkedList<>();
        List<Employee> linkedList = new CopyOnWriteArrayList<>();  // use this for thread safe
        Employee emp1 = new Employee("Muthu",1);
        Employee emp2 = new Employee("Selvan",2);
        Employee emp3 = new Employee("Selvan2",3);
        linkedList.add(emp1);
        linkedList.add(emp2);
        // in list is possbile to add the index position
        linkedList.add(0,emp3);
        linkedList.forEach(emp -> System.out.println("Name : " +emp.geteName()));

        LinkedList poll = new LinkedList(); // becaue linked list implement
        // queue inteface so it support peek , poll ,pollfirst
        // which support queue opearation
    }
}

class Employee {
    String eName ;
    int  eId ;

    public Employee(String eName, int eId) {
        this.eName = eName;
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }
    public int geteId() {
        return eId;
    }
    public void seteId(int eId) {
        this.eId = eId;
    }
}
