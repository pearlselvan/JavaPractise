package DataStructure;

/**
 * Created by muthuselvan on 5/6/17
 * http://www.programmerinterview.com/index.php/data-structures/find-nth-to-last-element-in-a-linked-list/
 *
 * 1. using iteration :
 *
 *
 * 2/ using recursion :
 */
public class LinkedKistFindLastNthElement {

    public static void main(String[] args) {

        NodeUtil nodeUtil = new NodeUtil(10);
        nodeUtil.append(10);
        nodeUtil.append(20);
        nodeUtil.display();


    }
}


class NodeUtil {
    int data;
    NodeUtil next;
    NodeUtil head;

    public NodeUtil(int data) {
        this.data = data;
    }


    public int findNthLast(int m) {

        if (m<1 || head == null) return -1;

        NodeUtil fast =head;
        NodeUtil slow =head;

        for  (int  i  =  0;  i  <  m - 1;  ++i)  {

        }


            return 1;
    }

    public void display() {
        NodeUtil current = head;
        while (current!=null) {
            System.out.print("->" +current.data);
            current=current.next;
        }
    }

    public void append(int data) {
        NodeUtil new_node = new NodeUtil(data);
        new_node.next=head;
        head=new_node;


    }
}
