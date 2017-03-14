package DataStructure;

import java.util.concurrent.CountDownLatch;

/**
 * Created by muthuselvan on 3/12/17.
 */
public class LinkedListCount {

    static CountNode head ;

    public static void main(String[] args) {



    }


    //TODO : implement and print the count value
    public static void add(int data) {

//        CountNode newNode = new CountNode(data);
//
//        if (head == null) {
//            CountNode firstnode = new CountNode(data);
//            return;
//        }
//
//        newNode.next = null ;
//        CountNode last = head ;
//
//        while (last.next ! = null) {
//            last=last.next;
//        }


    }

//    public void append(int data) {
//        System.out.println("Appening " +data);
//        LLNode newNode = new LLNode(data); // Node which is going to insert
//
//        if (head == null) {
//            LLNode firstNode = new LLNode(data);
//            return;
//        }
//
//        //last node will be null
//        newNode.next = null ;
//        LLNode last =  head ;
//
//        while (last.next != null) {
//            last=last.next;
//        }
//
//        last.next = newNode;
//        return;
//
//    }


}

class CountNode {

    CountNode next ;
    int data ;
    static  int count = 0 ;

    public CountNode(int data) {
        this.data=data;
        this.next = null ;
        count ++;

    }
}
