package Lang;

/**
 * Created by muthuselvan on 7/11/17.
 */
public class OverLoad_CompileTime {

    public OverLoad_CompileTime() {
    }

    public static void main(String[] args) {

        reboot();
        reboot(2);

    }

    public static void reboot() {
        System.out.println("Rebooting one time ");
    }

    public static void reboot(int ntimes) {
        for (int i=0;i<ntimes;i++) {
            System.out.println("Rebooting " +i+ " times");
        }
    }
}
