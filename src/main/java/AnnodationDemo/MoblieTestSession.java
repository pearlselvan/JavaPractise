package AnnodationDemo;

/**
 * Created by muthuselvan on 5/14/17.
 */
public class MoblieTestSession extends AbstractTestSession  {

    private String appName;

    public MoblieTestSession() {
        super();

    }

    public void initializeTestSession(InvokedMethodInformation method) {
        MobileTest deviceTestAnnotation = method.getAnnotation(MobileTest.class);

        if (deviceTestAnnotation == null) {
            deviceTestAnnotation = method.getActualMethod().getDeclaringClass().getAnnotation(MobileTest.class);
        }

        if (deviceTestAnnotation != null) {
            this.appName = deviceTestAnnotation.appName();
            System.out.println("Appname from initializeTestSession " +appName);

        }

    }



}
