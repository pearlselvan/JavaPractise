package Java8Demo.interfaces;

public class Mobile implements DisplayInterface {

    @Override
    public void show() {
        System.out.println("Displaying in " +
                "Mobile");
    }
}
