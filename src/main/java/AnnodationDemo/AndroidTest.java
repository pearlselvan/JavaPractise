package AnnodationDemo;

import org.junit.Test;
import org.testng.annotations.BeforeClass;

/**
 * Created by muthuselvan on 5/14/17.
 */
public class AndroidTest {

    AndroidTest androidTest = new AndroidTest();


    @BeforeClass
    public void setup() {
        System.out.println("Set up running ");
    }

    @org.testng.annotations.Test(groups = {"functional-mobile, selendroid"})
    @MobileTest(appName = "citrix" ,device = "10.3")
    public void testLogin() {
//        MoblieTestSession moblieTestSession = new MoblieTestSession();
        System.out.println("appname"  +androidTest.getClass().getAnnotations());



    }
}
