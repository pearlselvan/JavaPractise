package Collections;

import java.util.*;

/*
1.Comparable is implemented by a class in order to be
able to comparing object of itself with some other objects.
2.The method required for implementation is compareTo()
3.
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


