package Lang;

/**
 * Created by muthuselvan on 3/13/17.
 * Polymorphism applies to overriding
 * http://javarevisited.blogspot.com/2013/03/can-we-overload-and-override-static-method-java.html#at_pco=smlwn-1.0&at_si=58c73f313bd6ccfa&at_ab=per-2&at_pos=0&at_tot=1
 *
 * Why override?
 * ===============
 *
 * Overriding means having two methods with the same method name and parameters (i.e., method signature).
 * One of the methods is in the parent class and the other is in the child class. Overriding allows a child class
 * to provide a specific implementation of a method that is already provided its parent class.
 *
 * Can we override static method ? NO
 *
 *
 * Why Static method can not be overridden in Java?
 since they are bonded during compile time by using type of Class, and not at runtime using Objects.

 Polymorphism applies to overriding, not to overloading.

 *
 */

/*

 */
public class Override_RunTime {

    public static void main(String[] args) {
        Labtop labtop = new Phone();
        labtop.boot();
        labtop.shutdown();


        Labtop labtop1 = new Labtop();
        labtop1.boot();
        labtop1.shutdown();




    }

}

class Labtop {
    public void boot() {
        System.out.println("Booting Labtop");
    }
    public static void shutdown() {
        System.out.println("static shutdown from Labtop");
    }
}

class Phone extends Labtop {
    public void boot() {
        System.out.println("Booting Phone");
    }
    public static void shutdown() {
        System.out.println("static shutdown from Phone");
    }
}
