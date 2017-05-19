package Lang;

/**
 * Created by muthuselvan on 5/15/17.
 * http://www.wideskills.com/java-tutorial/java-object-typecasting
 *
 * Real usage of type casing ? Below is the problem statement :
 * // Base is some thrid part class (assume appium)
 // and you or other 3rd pary (selion /perfeto) extended appium
 // in your / there class but you have used selion / perfecto in your class
 // now you want to access some of the method in perfecto ...

 //Question is How to access appium class directly through selion / perfecto
 // that without creating the appium instance appium a = new appium
 *
 *
 */
public class TypeCastingDemo {

    public TypeCastingDemo() {
    }

    public static void main(String[] args) {
        Appium b = new SeLion();
        b.appiumDriverinit();
        // How to create
        SeLion d = (SeLion) b ;
        d.derived();

    }
}

//Parent
class Appium  {
    public Appium() {

    }

    public void appiumDriverinit() {
        System.out.println("Base");
    }
}

//Child
class SeLion extends Appium
{
    public SeLion() {
    }

    public void derived() {
        System.out.println("Derived");
    }
}
