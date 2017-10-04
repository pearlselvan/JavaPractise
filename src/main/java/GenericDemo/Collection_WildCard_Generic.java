package GenericDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by muthuselvan on 7/11/17.
 * https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html
 */
public class Collection_WildCard_Generic {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("muthu");
        arrayList.add("selvan");

        printCollection(arrayList);
        printCollectionUsingGenerics(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        printCollection(linkedList);

        printCollectionUsingGenerics(linkedList);



    }

  // older version : i.e., a pre-5.0 release)
    public static void printCollection(Collection c ) {
        Iterator iterator = c.iterator() ;

        for (int i=0;i<c.size();i++) {
            System.out.println(iterator.next());
        }

    }

    public static void printCollectionUsingGenerics(Collection<?> c) {
        for (Object collectionObject : c)
            System.out.println("Using Generics - " +collectionObject);

    }
}
