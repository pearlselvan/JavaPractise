package DataStructure;

/**
 * Created by muthuselvan on 5/4/17.
 */
public class LinkedListGetNthNode {



    NodeG head ;


    public static void main(String[] args) {
        LinkedListGetNthNode linkedListGetNthNode = new LinkedListGetNthNode();
        linkedListGetNthNode.append(10);
        linkedListGetNthNode.append(20);
        linkedListGetNthNode.append(30);
        linkedListGetNthNode.append(40);
        linkedListGetNthNode.display();
        System.out.println(linkedListGetNthNode.getNthNode(2));
    }
    public void append(int data) {
        System.out.println("Total " +NodeG.getCounter());
        NodeG new_node = new NodeG(data);
        new_node.next = head;
        head=new_node;
    }

    public int getNthNode(int index) {

        NodeG temp = head ;
        int count = 0 ;

        while (temp!=null) {

            if (count == index) {
                return temp.data;
            }
            count++;
            temp=temp.next;

        }
        return -1;
    }

    public void display() {
        NodeG temp = head ;
        while (temp!=null) {
            System.out.println( "->" +temp.data);
            temp=temp.next;
        }

    }

}

class NodeG {
    public static int getCounter() {
        return counter;
    }

    static int counter ;
    int data ;
    NodeG next ;

    public NodeG(int data) {

        this.data = data;
        this.next = null ;
        counter++;
    }
}
