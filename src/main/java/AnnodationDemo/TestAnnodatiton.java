package AnnodationDemo;

import java.lang.annotation.Annotation;

/**
 * Created by muthuselvan on 5/19/17.
 */
public class TestAnnodatiton {

    public static void main(String[] args) {
        System.out.println();

        AndroidTest androidTest = new AndroidTest();

        Annotation[] annodations = AndroidTest.class.getAnnotations();

        Class<? extends Annotation> type = annodations[1].annotationType();
        System.out.println("Values of " + type.getName());

    }
}
