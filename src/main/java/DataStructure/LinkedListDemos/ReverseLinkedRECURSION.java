package DataStructure.LinkedListDemos;


/**
 * Created by muthuselvan on 8/7/17.
 */
public class ReverseLinkedRECURSION {
    static RNode head;

    public static void main(String[] args) {


        insertfirst(10);
        insertfirst(20);
        insertfirst(30);
        System.out.println("Origina");
        printlist(head);
//        reverseIterative(head);
        System.out.println("Using recursion");
        printlist(reverseusingRECURSION(head));

    }


    public static void insertfirst(int data) {
        RNode new_node=new RNode(data);
        new_node.next=head;
        head=new_node;
    }


    public static RNode reverseIterative(RNode first) {
        RNode current = first;
        RNode next = null;
        RNode prev=null;

        while (current!=null) {
            next=current.next;
//            System.out.println("curr.data=>" +current.data);
            current.next=prev;
            prev=current;
            current=next;
//            System.out.println("prev.data=>" +prev.data);
        }
        head=prev;
        printlist(head);
        return prev;

    }

//    public static RNode reverseRecursion(RNode first) {

//               RNode new_node;
//
//        if (first.next == null) {
//            return ;
//        }
//
//        new_node=reverseusingRECURSION(first.next);
//        first.next.next=first;
//        first.next=null;
//        return new_node;


//    }

    //https://www.youtube.com/watch?v=KYH83T4q6Vs

    public static RNode reverseusingRECURSION(RNode first) {

        /*
         what is exit condion ,  if first.next = null when return BEFORE return change head to current that is point to last node
         */

        RNode new_head;

        if (first.next==null) {
            head=first;
            return head     ;
        }

        new_head=reverseusingRECURSION(first.next);
        first.next.next=first; //why two next because currently the first will point the last head two next will before the last node ..this will change link reference
        first.next=null; //
//        System.out.println("->" +first.data);
//        printlist(first);
        return new_head;

    }


    public static void printlist(RNode first) {

        RNode current=first;
        while (current!=null) {
            System.out.print    ("=>" +current.data);
            current=current.next;
        }

    }









}


class RNode {

    int data ;
    RNode next ;

    public RNode(int data) {
        this.data = data;
        this.next=null;
    }


}
