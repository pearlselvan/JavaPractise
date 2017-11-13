package Java8Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by muthuselvan on 10/4/17.
 */
public class ClassicComparator {

    public static void main(String[] args) {

        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        Employee employee_dev = new Employee("muthu",35);
        Employee employee_teseter = new Employee("senthil",45);
        Employee employee_manger = new Employee("revanth",25);
        Employee employee_intern = new Employee("aswin",125);

        employeeArrayList.add(employee_dev);
        employeeArrayList.add(employee_teseter);
        employeeArrayList.add(employee_manger);
        employeeArrayList.add(employee_intern);
        System.out.println("Empl List before sorting " +employeeArrayList);
        //with out anamymous class
        Collections.sort(employeeArrayList,new Employee_Comparator());
        System.out.println("Empl List after sorting " +employeeArrayList);

    }

}


class Employee_Comparator implements Comparator {

public int compare(Object e1, Object e2) {
    Employee employee1 = (Employee) e1;
    Employee employee2 = (Employee) e2;

    return employee1.getEmployeeName().compareTo(employee2.getEmployeeName());


}

}

class Employee {

    private String employeeName;
    private int age;

    public Employee(String employeeName,int age)
    {
        this.employeeName=employeeName;
        this.age=age;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName= employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()
    {
        return getEmployeeName()+" : "+getAge();
    }
}

