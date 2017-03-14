package Lang;

/**
 * Created by muthuselvan on 3/13/17.
 * Polymorphism applies to overriding
 * http://javarevisited.blogspot.com/2013/03/can-we-overload-and-override-static-method-java.html#at_pco=smlwn-1.0&at_si=58c73f313bd6ccfa&at_ab=per-2&at_pos=0&at_tot=1
 *
 */


/*
Why Static method can not be overridden in Java?
since they are bonded during compile time by using type of Class, and not at runtime using Objects.



 */
public class Override_RunTime {

    public static void main(String[] args) {
        Labtop labtop = new Phone();
        labtop.boot();

        Labtop labtop1 = new Labtop();



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
