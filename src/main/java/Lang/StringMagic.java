package Lang;

/**
 * Created by muthuselvan on 2/9/17.
 * Reff : http://www.java67.com/2014/08/difference-between-string-literal-and-new-String-object-Java.html
 */

/*
  Why String is final or Immutable in Java ?
  ------------------------------------------
  1. thread safe
  2. security
 */
public class StringMagic {

    public static void main(String[] args) {
         /*
        if you create object using String literal syntax e.g. "Java",
        it may return an existing object from String pool
         (a cache of String object in Perm gen space,
         which is now moved to heap space in recent Java release)
         */
        String name1 = "muthu";
        String name2 = "muthu"; // This will retrurn existing object from StringPool
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name1.equals(name2));
        //Both expression gives you String object,
        // but there is subtle difference between them.
        // When you create String object using new()
        // operator, it always create a new object in heap memory

        String myHeap = new String("Iam in heap NOT in cache");

        String a = "Java";
        String b = "Java";
        System.out.println(a == b); // True


        String c = new String("Java");
        String d = new String("Java");
        System.out.println(c == d); // False

//      String interning using inter() method





    }
}
