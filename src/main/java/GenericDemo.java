//import java.util.LinkedList;
//
///**
// * Created by muthuselvan on 1/31/17.
// * http://www.journaldev.com/1663/java-generics-example-method-class-interface
// */
//
///*
//    E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
//K – Key (Used in Map)
//N – Number
//T – Type
//V – Value (Used in Map)
//S,U,V etc. – 2nd, 3rd, 4th types
//
// */
//
//public class GenericDemo {
//
//    public static void main(String[] args) {
//        Item<String> stringItem = new Item<>();
//        LinkedList<Item<String>> stringLinkedList = new LinkedList<>();
//        stringItem.setT("muthu");
//        stringItem.setT("selvan");
//        stringLinkedList.add(stringItem);
////        System.out.println("String item" +stringItem.getT());
//
//        stringLinkedList.forEach(System.out::println);
//
//        Item<Integer> integerItem = new Item<>();
//        integerItem.setT(1);
//        integerItem.setT(2);
//        System.out.println("Integere item " +integerItem.getT());
//
//
//
//
//    }
//
//
//
//
//
//}
//
//class Item<T> {
//
//    @Override
//    public String toString() {
//        return "Item{" +
//                "t=" + t +
//                '}';
//    }
//
//    private T t ;
//
//    public T getT() {
//        return t;
//    }
//
//    public void setT(T t) {
//        this.t = t;
//    }
//
//
//
//
//}
