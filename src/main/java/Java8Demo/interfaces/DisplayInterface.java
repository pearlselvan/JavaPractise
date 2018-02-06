package Java8Demo.interfaces;

public interface DisplayInterface {
    void show();

    default public void powerOn() {
        System.out.println("Power On");
    }

    default public void startPhone() {
        System.out.println("Phone Restarting ..");
    }
}
