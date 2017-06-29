package Collections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by muthuselvan on 2/2/17.
 */
public class QueueDemo {

    /*
      implemention class
       LinkedList , PriorityQueue , LinkedBlockingQueue , BlockingQueue , ArrayBlockingQueue , LinkedBlockingQueue
        and PriorityBlockingQueue
     */
    public static void main(String[] args) {
        addQueue();
        ArrayBlockingQueue();
        PriorityQueue();
        queueOpearation();
    }

    public static void addQueue() {


        Queue<Integer> queue= new LinkedList();
        queue.add(12345);
        queue.add(54321);
        queue.add(77777);

        queue.offer(909090);
        queue.offer(909091);


        queue.forEach(q -> System.out.println(q));

    }


    /*
       Both java queue add () and offer () methods are available in the Queue interface and are used to add elements to the queue.
       Preference will be given to java queue Offer() method. add() internally just call offer() method and does nothing extra.
       And also, add () method throws exception “java.lang.IllegalStateException: Queue full” at the moment queue is full whereas
       offer() method will return a Boolean value false for the same in case the queue is of restricted capacity.
        */
    public static  void ArrayBlockingQueue() {
        Queue<String> fruits = new ArrayBlockingQueue(2) ;
        fruits.add("mango");
        fruits.add("banana");
//        fruits.add("apple"); // // This will throw xception in thread "main" java.lang.IllegalStateException: Queue full
        fruits.forEach(my -> System.out.println(my)); // This will throw xception in thread "main" java.lang.IllegalStateException: Queue full

        Queue<String> offerFruits = new ArrayBlockingQueue(2) ;
        offerFruits.offer("mango");
        offerFruits.offer("banana");
        offerFruits.offer("apple");

        offerFruits.forEach(my -> System.out.println(my));

    }

    //default initial capacity (11)
    //PriorityQueue is also not synchronized, so use counterpart : PriorityBlockingQueue
    //One of the key thing to remember about PriorityQueue in Java is that it's Iterator doesn't guarantee any order,
    // if you want to traverse in ordered fashion,
    // better use Arrays.sort(pq.toArray())



  //http://javarevisited.blogspot.com/2013/10/what-is-priorityqueue-data-structure-java-example-tutorial.html
    //PriorityQueue is an unbounded Queue implementation
    //Priority queue is also very useful in implementing Dijkstra algorithm (Shortest Path Algorithm in Java) in Java.
    // PriorityQueue is also not synchronized,
    //PriorityQueue in Java is that it's Iterator doesn't guarantee any order,
    //PriorityQueue doesn't allow null elements, if you try to add null, it will throw java.lang.NullPointerException.
    //PriorityQueue keeps the smallest element in head
    //peek() returns the head of the  queue
    // poll() remove the head of the queue


   //When to use PriorityQueue in Java?
   //Use when you want to process elements on some priority e.g. processing the highest priority element first
    // or lowest priority element first. You can decide relative priority comparison by using Comparator interface and overriding
    // compare() method.

    // You can use PriorityQueue to process a job of highest priority first.
    // If you are implementing a dashboard kind of interface, you can also use this class to bubble up important issues,
    // alerts or notification at the top. Since you cannot store object, which is not comparable,
    // its useless for them. You also need to pay some price for keeping the head as per priority
    // so if you are not required that feature better not to use this class.

   //  You cannot store incompatible elements in PriorityQueue,
   // which means you cannot store Integer and String on a PriorityQueue of Object,
    // this will result in ClassCastException

    //Complexity :
    //Time complexity of enqueuing and dequeuing elements is in order of O(log(n))

//    PriorityQueue is based upon priority heap where elements are ordered on their priority










    public static void PriorityQueue() {

        System.out.println("Priority Q implementation ");
        Queue<String> pQueue = new PriorityQueue<>();

        pQueue.add("first");
        pQueue.add("second");
        pQueue.add("third");

        System.out.println("PQ Adding integer Demo ");

         ////////  PriorityQueue keeps the smallest element in head ///////////

        Queue<Integer> qInteger = new PriorityQueue<>();
        qInteger.add(1000);
        qInteger.add(10);
        qInteger.add(100);

        Iterator<Integer> integerIterator = qInteger.iterator();

        while (integerIterator.hasNext()) {
            System.out.println("Integer Q : " +integerIterator.next());
        }

        ////////  PriorityQueue keeps the smallest element in head ///////////

        Queue<Item> itemQueue = new PriorityQueue<>();
        Item iphone = new Item("iPhone",100);
        Item iPad = new Item("iPad",10);
        Item mac = new Item("Mac",300);
        itemQueue.add(iphone);
        itemQueue.add(iPad);
        itemQueue.add(mac);
        itemQueue.forEach(item -> System.out.println("Item : " +item.getItem()));

    }

    public static void queueOpearation() {

        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("Method " +name);

        Queue<Integer> jiraIssue = new ArrayDeque<>();
        jiraIssue.offer(100);
        jiraIssue.offer(101);
        jiraIssue.offer(102);

        System.out.println("Peek" +jiraIssue.peek());  // Retrieves, but does not remove, the head of this queue,
        System.out.println("Poll" +jiraIssue.poll());  //Retrieves and removes the head of this queue,

    }

}


class Item implements Comparable<Item> {
    public Item(String item, Integer price) {
        this.item = item;
        this.price = price;
    }
    String item ;
    Integer price ;
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item1 = (Item) o;
        if (!item.equals(item1.item)) return false;
        return price.equals(item1.price);
    }

    @Override
    public int hashCode() {
        int result = item.hashCode();
        result = 31 * result + price.hashCode();
        return result;
    }

    @Override
    public int compareTo(Item o) {
        if (this.price == o.price) {
            return this.item.compareTo(o.item);
        }
        return this.price - o.price;
    }

}
