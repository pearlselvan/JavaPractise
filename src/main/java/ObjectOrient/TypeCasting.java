package ObjectOrient;

/**
 * Created by muthuselvan on 3/11/17.
 */

/*
What type casting :
java object typecasting one object reference can be type cast into another object reference
The cast can be to its own class type or to one of its subclass or superclass types or interfaces.
There are compile-time rules and runtime rules for casting in java.

But as per rules of Java programming language, only classes or interfaces (collectively known as Type)
from the same type hierarchy can be cast or converted into each other.

compile time error:
------------------
If you try to cast two objects which don't share same type hierarchy,
i.e. there is no parent-child relationship between them, you will get compile time error

Run time - class cast exception :
---------------------------------
if you typecast objects from same type hierarchy but the object which you are casting
are not of the same type on which you are casting then it will throw ClassCastException in Java.

why do you need type casting?
-----------------------------
You need type casting to get access to fields and methods declared on target type or class

There can be 2 casting java scenarios
------------------------------------
· Upcasting :
-=-=-=-=-=-=-
When we cast a reference along the class hierarchy in a direction from the sub classes towards the root,
it is an upcast. We need not use a cast operator in this case.

· Downcasting :
-=-=-=-=-=-=-=-
When we cast a reference along the class hierarchy in a direction from the root class towards the children or subclasses
it is a downcast.







 */
public class TypeCasting {

    public static void main(String[] args) {
        parent p = new child(); //  child object ref can hold the parent object but using this reference we can
                                 //call the methods in parent NOT in child ..in order to call this we need cast
        p.parentmethod();
//        child c = p  // compile time error required type casing as in below

        System.out.println( p instanceof  parent);
//        child c = (child) p; //java.lang.ClassCastException
//        c.parentmethod(); //java.lang.ClassCastException





    }
}


class  parent {

    public void parentmethod() {
        System.out.println("parent::parentmethod");
    }
}

class child extends parent {

    public void parentmethod() {
        System.out.println("child::parentmethod");
    }
}
