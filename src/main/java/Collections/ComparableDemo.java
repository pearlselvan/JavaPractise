package Collections;

import java.util.*;

/*
https://www.javacodegeeks.com/2013/03/difference-between-comparator-and-comparable-in-java.html
1.Comparable is implemented by a class in order to be
able to comparing object of itself with some other objects.
2.The method required for implementation is compareTo()
3.


Comparator vs Comparable
=========================

Comparator :
------------
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

Comparable :
------------

1. Sorting logic is in separate class. Hence we can write different sorting based on different attributes of objects to be sorted. E.g. Sorting using id,name etc.
Implementation	Class whose objects to be sorted must implement this interface.e.g Country class needs to implement comparable to collection of country object by id	Class whose objects to be sorted do not need to implement this interface.Some other class can implement this interface. E.g.-CountrySortByIdComparator class can implement Comparator interface to sort collection of country object by id

2.This method compares o1 and o2 objects. and returns a integer.Its value has following meaning.
1. positive – o1 is greater than o2
2. zero – o1 equals to o2
3. negative – o1 is less than o1


3. Calling method :
Collections.sort(List, Comparator)
Here objects will be sorted on the basis of Compare method in Comparator


Java.util.Comparator
Java code:

 */
public class ComparableDemo {
    public static void main(String[] args) {
        EmployeeComparable emp1 = new EmployeeComparable(65,"XRama");
        EmployeeComparable emp2 = new EmployeeComparable(23,"ZMuthu");
        EmployeeComparable emp3 = new EmployeeComparable(13,"ARevanth");


        if (emp1.compareTo(emp2) > 0) {
            System.out.println("Emp : " +emp1.getEmpName() +" is older then " +emp2.getEmpName());
        } else {
            System.out.println("Emp : " +emp1.getEmpName() +" is younger then " +emp2.getEmpName());
        }
        System.out.println("Using comparator ...");
        ArrayList<EmployeeComparable> employeeComparableArrayList = new ArrayList<>();
        employeeComparableArrayList.add(emp1);
        employeeComparableArrayList.add(emp2);
        employeeComparableArrayList.add(emp3);
        Collections.sort(employeeComparableArrayList, new EmployeeComparatorAscending());

        employeeComparableArrayList.forEach( (emp) -> System.out.println("Ascending by emp name: " +emp));


        Collections.sort(employeeComparableArrayList, new EmployeeComparatorDecending());

        employeeComparableArrayList.forEach( (emp) -> System.out.println("Decending by emp name : " +emp));



    }
}

class EmployeeComparable implements
        Comparable<EmployeeComparable>
{
    private int empAge ;
    private String empName ;

    public EmployeeComparable(int empid, String empName) {
        this.empAge = empid;
        this.empName = empName;
    }

    public int getEmpid() {
        return empAge;
    }

    public void setEmpid(int empid) {
        this.empAge = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }




    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "empid=" + empAge +
                ", empName='" + empName + '\'' +
                '}';
    }



    @Override
    public int compareTo(EmployeeComparable o) {
        if (this.empAge > o.empAge )
            return 1;
        else if (this.empAge < o.empAge)
            return -1;
         else
        return 0;
    }
}


class EmployeeComparatorAscending implements Comparator<EmployeeComparable> {

    @Override
    public int compare(EmployeeComparable o1, EmployeeComparable o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

class EmployeeComparatorDecending implements Comparator<EmployeeComparable> {

    @Override
    public int compare(EmployeeComparable o1, EmployeeComparable o2) {
        return -o1.getEmpName().compareTo(o2.getEmpName());
    }
}


