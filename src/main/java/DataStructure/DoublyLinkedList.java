package DataStructure;

/**
 * Created by muthuselvan on 3/19/17.
 * http://quiz.geeksforgeeks.org/doubly-linked-list/
 * http://www.cs.columbia.edu/~janak/teaching/f03-cs3134/homeworks/doublyLinked.java
 */
public class DoublyLinkedList {

    private static DNode head ;
    private static DNode tail ;

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertLast(100);
        doublyLinkedList.push(10);
        doublyLinkedList.push(20);
        doublyLinkedList.insertAfter(10,100);
        doublyLinkedList.printList();
    }

    public DNode push(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode ; //Assign newnode address to head
            tail = newNode ; //Assign newnode address to tail
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        return newNode;
    }

    public DNode insertLast(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = tail;
            tail.previous = newNode;
            tail = newNode;
        }

        return newNode ;
    }

     //key is element which needs to be serached for adding dd
    //http://www.cs.columbia.edu/~janak/teaching/f03-cs3134/homeworks/doublyLinked.java
    public void insertAfter(int key,int dataToInsert) {
//        DNode newnode = new DNode(data);
        DNode current = head;
        while (current.data != key) {
            System.out.println("Current Data : " + current.data);
            current = current.next;
            if (current == null) {
                System.out.println("Curent is null");
            }

        }
        DNode newNode = new DNode(dataToInsert);
        if (current == tail) {
            newNode.next = tail;
            tail = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;

        }
        newNode.previous = current;
        current.next = newNode;
        System.out.println("Found : " + current.data);
    }

    public void insertAfter(int data) {



    }

    public void printList() {
        DNode first = head ;
        while (first!=null) {
            System.out.println("->" +first.data);
            first = first.next;

        }


    }
}

class DNode {
    int data ;
    DNode next ;
    DNode previous ;

    public DNode(int data) {
        this.data = data;
        this.next = null ;
        this.previous = null ;
    }
}
