package DataStructure.LinkedListDemos;

import java.util.HashSet;

/**
 * Created by muthuselvan on 5/5/17.
 */
public class RemoveDupilcateFromUnSortedLinkedList {

    DubNode head ;
    public static void main(String[] args) {

        RemoveDupilcateFromUnSortedLinkedList rem = new RemoveDupilcateFromUnSortedLinkedList();
        rem.insert(100);
        rem.insert(100); //tc1 . remove first
        rem.insert(10);
        rem.insert(10);  // tc2 : remove middile
        rem.insert(120); // tc3 : remove last
        rem.insert(120);
        rem.insert(120);  // tc4 : remove more then 2 duplicate
        rem.display();
        rem.deleDuplicate(rem.head);
        rem.display();
    }


    public void insert(int data) {
        DubNode new_node = new DubNode(data);
        new_node.next=head;
        head=new_node;
    }

    public void display() {
        DubNode temp = head;
        while (temp!=null) {
            System.out.print("-" +temp.data);
            temp=temp.next;
        }
    }

    void deleDuplicate(DubNode unsoted) {
        HashSet<Integer> duplicateAdd = new HashSet<>();
        DubNode prev = null ;
        while (unsoted!= null) {

            if (duplicateAdd.contains(unsoted.data)) {
                System.out.println("Found duplicate : " +unsoted.data);
                prev.next = unsoted.next;
            } else {
                System.out.println("No duplicate");
                duplicateAdd.add(unsoted.data);
                prev=unsoted;
            }

            unsoted=unsoted.next;


        }

    }

}


class DubNode {

    DubNode next;
    int data ;

    public DubNode(int data) {
        this.data =data;
        this.next = null;
    }
}
