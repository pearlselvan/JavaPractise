package Lang;

import java.io.*;

/**
 * Created by muthuselvan on 2/2/17.
 */

/*

Java provides a mechanism, called object serialization
where an object can be represented as a
sequence of bytes that includes the object's data
    as well as information about the object's type
and the types of data stored in the object.

After a serialized object has been written into a file,
it can be read from the file and deserialized that is,
the type information and bytes that represent the object
and its data can be used to recreate the object in memory.

Most impressive is that the entire process is JVM independent,
meaning an object can be serialized on one platform and
deserialized on an entirely different platform.

Implementation :
---------------
Classes ObjectInputStream and ObjectOutputStream
are high-level streams that contain the methods
for serializing and deserializing an object.

FileOutputStream > ObjectOutputStream > writeObject > 2 close

Conditon:
---------
Two conditions must be met −
The class must implement the java.io.Serializable
interface.

All of the fields in the class must be serializable.
If a field is not serializable, it must be marked transient.

Consideration :
---------------
1.The try/catch block tries to catch a ClassNotFoundException,
which is declared by the readObject() method.
For a JVM to be able to deserialize an object,
it must be able to find the bytecode for the class.
If the JVM can't find a class during the deserialization of an object,
it throws a ClassNotFoundException.

2.Notice that the return value of readObject()
is cast to an Employee reference.



 */

public class SerializeDemo {

    public static void main(String[] args) {
        EmployeeSerialize employeeSerialize = new EmployeeSerialize();
        employeeSerialize.setName("Muthu");
        employeeSerialize.setEmpid("1200");
        employeeSerialize.setSSN(81);
        System.out.println("Calling DeSerilization ...");

        EmployeeDeSerialize employeeDeSerialize = new EmployeeDeSerialize();
        employeeDeSerialize.EmployeeDeSerializeCall();


        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("employee.ser"));
            ObjectOutputStream empOut = new ObjectOutputStream(fileOutputStream);
            empOut.writeObject(employeeSerialize);
            empOut.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


class EmployeeSerialize implements Serializable {

    public String name ;
    public String empid ;
    public Integer SSN ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public Integer getSSN() {
        return SSN;
    }

    public void setSSN(Integer SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return "EmployeeSerialize{" +
                "name='" + name + '\'' +
                ", empid='" + empid + '\'' +
                ", SSN=" + SSN +
                '}';
    }
}


class EmployeeDeSerialize {
    static EmployeeSerialize emp ;
    public EmployeeDeSerialize() {

    }

    //ClassNotFoundException is mandatory
    public static void EmployeeDeSerializeCall() {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("employee.ser"));
            ObjectInputStream oin = new ObjectInputStream(fileInputStream);
             emp = (EmployeeSerialize)oin.readObject();
        }catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) { //ClassNotFoundException is mandatory
            c.printStackTrace();
        }
        System.out.println("Printing Employee Name : " +emp.getName());
    }

}
