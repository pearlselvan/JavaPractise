package DataStructure;

/**
 * Created by muthuselvan on 5/3/17.
 * Two method :
 * 1. Using recursion
 * 2. Without recustion
 *
 * http://techieme.in/merging-two-sorted-singly-linked-list/
 *
 * Big - O : O(m + n)
 */
public class MergeTwoSortedLinkedList {

    static SortedLinkList head ;

    public static void main(String[] args) {

        MergeTwoSortedLinkedList ll = new MergeTwoSortedLinkedList();


        ll.insertFirst(30);
        ll.insertFirst(20);
        ll.insertFirst(10);
        System.out.println("First linked list");
        ll.displayList();

        MergeTwoSortedLinkedList ll2 = new MergeTwoSortedLinkedList();
        ll2.insertFirst(60);
        ll2.insertFirst(50);
        ll2.insertFirst(40);

        System.out.println("Second linked list");
        ll2.displayList();



        SortedLinkList sortedLinkList = mergeTwoList(ll.head,ll2.head);
        System.out.println("Merging using non recursion");
        ll2.displayList(sortedLinkList);

        System.out.println("Merging using recursion");
        SortedLinkList sortedLinkListUsingRecursion = MergeListsUsingRecursion(ll.head,ll2.head);
        ll2.displayList(sortedLinkListUsingRecursion);



    }


    public static SortedLinkList MergeListsUsingRecursion(SortedLinkList list1, SortedLinkList list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.data < list2.data) {
            list1.next = MergeListsUsingRecursion(list1.next, list2);
            return list1;
        } else {
            list2.next = MergeListsUsingRecursion(list2.next, list1);
            return list2;
        }
    }


// This is similar to merge sort
// pick the smallest unpicked element from first list and compare with first element in second list
    // if its less store the first element ( min element ) to the result then increment first pointer to
    // if is not store the second element ( which is min ) to the resule them increment second pointer

    // if you are doing some time any one of the list is exhausted then we need to check the element in list1 and list2
    // if list1 is exhausted then move the list1 element in result
    // if list2 is exhausted then move the list2 element in result

    public static SortedLinkList mergeTwoList(SortedLinkList l1,SortedLinkList l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

//        SortedLinkList head = new SortedLinkList(0);
        SortedLinkList result=head;

        SortedLinkList p1=l1;
        SortedLinkList p2=l2;
        while(p1!=null && p2!=null){
            if(p1.data < p2.data){
                result.next = p1;
                p1 = p1.next;
            }else{
                result.next = p2;
                p2 = p2.next;
            }
            result=result.next;
        }

        if(p1!=null){
            result.next = p1;
        }

        if(p2!=null){
            result.next = p2;
        }

        return head.next;





    }

    public void insertFirst(int data) {
        SortedLinkList new_node = new SortedLinkList(data);
        new_node.next=head;
        head=new_node;
    }

    public void displayList() {
        SortedLinkList temp = head ;
        while (temp!=null) {
            System.out.print("->" +temp.data);
            temp = temp.next;
        }
    }

    public void displayList(SortedLinkList first) {
        SortedLinkList temp = head ;
        while (temp!=null) {
            System.out.print("->" +temp.data);
            temp = temp.next;
        }
    }
}

class SortedLinkList {
    SortedLinkList next ;
    int data ;
    public SortedLinkList(int data) {
        this.data = data;
        this.next = null ;
    }
}
