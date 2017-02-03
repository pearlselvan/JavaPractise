package Collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by muthuselvan on 2/2/17.
 */

// Set will allow unique things
public class SetDemo {

    public static void main(String[] args) {

        setDemo();
    }


    public static void setDemo() {
        Set<String> set = new HashSet<String>();
        set.add("google1");
        set.add("google2");
        set.add("google3");
        // in set we can't add the element by position wise but in list we can
        set.forEach(printSet -> System.out.println(printSet));
    }

}


