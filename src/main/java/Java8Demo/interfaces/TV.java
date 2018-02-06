package Java8Demo.interfaces;

public class TV implements DisplayInterface {
    @Override
    public void show() {
        System.out.println("Displaying in T.V");
    }

    @Override
    public void powerOn() {
        System.out.println("TV is on now ");
    }
}
