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
    //One of the key thing to remember about PriorityQueue in Java is that it's Iterator doesn't guarantee any order, if you want to traverse in ordered fashion,
    // better use Arrays.sort(pq.toArray())



  //http://javarevisited.blogspot.com/2013/10/what-is-priorityqueue-data-structure-java-example-tutorial.html
    public static void PriorityQueue() {

        System.out.println("Priority Q implementation ");
        Queue<String> pQueue = new PriorityQueue<>();

        pQueue.add("first");
        pQueue.add("second");
        pQueue.add("third");

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
        System.out.println("Running " +name);

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
