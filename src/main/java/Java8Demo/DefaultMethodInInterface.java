package Java8Demo;

public class DefaultMethodInInterface implements TestInterface {

    public static void main(String[] args) {

    }

    @Override
    public void m1() {
    }


}

interface TestInterface {

    void m1();
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}


