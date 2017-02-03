package ObjectOrient;

/**
 * Created by muthuselvan on 2/3/17.
 */

/*
1. Concurrency and multithreading advantage provided by immutable objects
2. Immutable object not only guarantees safe publication of object’s state, but also can be shared among other threads without
any external synchronization.


 How to implement ?
 1. final class
 2. private final variable
 3. Constructor setter
 4. Only Getter



What is benifit ?
1) Immutable objects are by default thread safe, can be shared without synchronization in concurrent environment.
2) Immutable object simplifies development, because its easier to share between multiple threads without external synchronization.
3) Immutable object boost performance of Java application by reducing synchronization in code.






 */
public final class ImmutableDemo {

    public String getName() {
        return name;
    }

    private final String name ;

    public ImmutableDemo(String name) {
        this.name = name;
    }
}
