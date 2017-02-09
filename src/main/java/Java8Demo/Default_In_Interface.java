package Java8Demo;

/**
 * Created by muthuselvan on 2/5/17.
 * Ref : https://zeroturnaround.com/rebellabs/java-8-explained-default-methods/
 */

/*
Default methods enable us to add new functionalities to interfaces without
breaking the classes that implements that interface. Lets take a look at the example below.
 */
public class Default_In_Interface {
}


interface defineInterface {

    default void defaultInterface() {
        System.out.println("Calling Default interface");
    }
}


//    Multiple inheritance?
//-----------------------------

 interface A {
    default void foo(){
        System.out.println("Calling A.foo()");
    }
}

 interface B {
    default void foo(){
        System.out.println("Calling B.foo()");
    }
}

class MulInterface implements A, B {
    @Override
    public void foo() {
        A.super.foo(); // Calling A's method by using
    }
}
