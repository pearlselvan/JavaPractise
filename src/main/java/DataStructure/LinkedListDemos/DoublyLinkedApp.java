package DataStructure.LinkedListDemos;

// doublyLinked.java
// demonstrates doubly-linked list
// to run this program: C>java DoublyLinkedApp
////////////////////////////////////////////////////////////////
class Link
{
    public long dData;                 // data item
    public Link next;                  // next link in list
    public Link previous;              // previous link in list
    // -------------------------------------------------------------
    public Link(long d)                // constructor
    { dData = d; }
    // -------------------------------------------------------------
    public void displayLink()          // display this link
    { System.out.print(dData + " "); }
// -------------------------------------------------------------
}  // end class Link
////////////////////////////////////////////////////////////////
class DoublyLinkedList1
{
    private Link head;               // ref to first item
    private Link tail;                // ref to last item
    // -------------------------------------------------------------
    public DoublyLinkedList1()         // constructor
    {
        head = null;                  // no items on list yet
        tail = null;
    }
    // -------------------------------------------------------------
    public boolean isEmpty()          // true if no links
    { return head==null; }
    // -------------------------------------------------------------
    //inserting first mean adding before head
    //newly added node becomes the new head of DLL.
    public void insertFirst(long dd)  // insert at front of list
    {
        Link newLink = new Link(dd);   // make new link

        if( isEmpty() ) {                // if empty list,
            tail = newLink;             // newLink <-- last
        }
        else {
            head.previous = newLink;   // newLink <-- old first
        }
        newLink.next = head;          // newLink --> old first
        head = newLink;               // first --> newLink
    }
    // -------------------------------------------------------------
    //inserting tail mean adding after tail
    public void inserttail(long dd)   // insert at end of list
    {
        Link newLink = new Link(dd);   // make new link
        if( isEmpty() )                // if empty list,
            head = newLink;            // first --> newLink
        else
        {
            tail.next = newLink;        // old last --> newLink
            newLink.previous = tail;    // old last <-- newLink
        }
        tail = newLink;                // newLink <-- last
    }
    // -------------------------------------------------------------
    public Link deleteFirst()         // delete first link
    {                              // (assumes non-empty list)
        Link temp = head;
        if(head.next == null)         // if only one item
            tail = null;                // null <-- last
        else
            head.next.previous = null; // null <-- old next
        head = head.next;            // first --> old next
        return temp;
    }
    // -------------------------------------------------------------
    public Link deletetail()          // delete last link
    {                              // (assumes non-empty list)
        Link temp = tail;
        if(head.next == null)         // if only one item
            head = null;               // first --> null
        else
            tail.previous.next = null;  // old previous --> null
        tail = tail.previous;          // old previous <-- last
        return temp;
    }
    // -------------------------------------------------------------
    // insert dd just after key
    public boolean insertAfter(long key, long dd)
    {                              // (assumes non-empty list)
        Link current = head;          // start at beginning
        while(current.dData != key)    // until match is found,
        {
            current = current.next;     // move to next link
            if(current == null)
                return false;            // didn't find it
        }
        Link newLink = new Link(dd);   // make new link

        if(current==tail)              // if last link,
        {
            newLink.next = null;        // newLink --> null
            tail = newLink;             // newLink <-- last
        }
        else                           // not tail link,
        {
            newLink.next = current.next; // newLink --> old next
            // newLink <-- old next
//            current.next.previous = newLink;
            current.next = newLink;
//            current.previous = newLink;
        }
        newLink.previous = current;    // old current <-- newLink
        current.next = newLink;        // old current --> newLink
        return true;                   // found it, did insertion
    }
    // -------------------------------------------------------------
    public Link deleteKey(long key)   // delete item w/ given key
    {                              // (assumes non-empty list)
        Link current = head;          // start at beginning
        while(current.dData != key)    // until match is found,
        {
            current = current.next;     // move to next link
            if(current == null)
                return null;             // didn't find it
        }
        if(current==head)             // found it; first item?
            head = current.next;       // first --> old next
        else                           // not first
            // old previous --> old next
            current.previous.next = current.next;

        if(current==tail)              // last item?
            tail = current.previous;    // old previous <-- last
        else                           // not tail
            // old previous <-- old next
            current.next.previous = current.previous;
        return current;                // return value
    }
    // -------------------------------------------------------------
    public void displayForward()
    {
        System.out.print("List (first-->tail): ");
        Link current = head;          // start at beginning
        while(current != null)         // until end of list,
        {
            current.displayLink();      // display data
            current = current.next;     // move to next link
        }
        System.out.println("");
    }
    // -------------------------------------------------------------
    public void displayBackward()
    {
        System.out.print("List (tail-->first): ");
        Link current = tail;           // start at end
        while(current != null)         // until start of list,
        {
            current.displayLink();      // display data
            current = current.previous; // move to previous link
        }
        System.out.println("");
    }
// -------------------------------------------------------------
}  // end class DoublyLinkedList
////////////////////////////////////////////////////////////////
public class DoublyLinkedApp
{
    public static void main(String[] args)
    {                             // make a new list
        DoublyLinkedList1 theList = new DoublyLinkedList1();

        theList.insertFirst(22);      // insert at front
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.inserttail(11);       // insert at rear
        theList.inserttail(33);
        theList.inserttail(55);

        theList.displayForward();     // display list forward
        theList.displayBackward();    // display list backward

        theList.deleteFirst();        // delete first item
        theList.deletetail();         // delete last item
        theList.deleteKey(11);        // delete item with key 11

        theList.displayForward();     // display list forward

        theList.insertAfter(22, 77);  // insert 77 after 22
        theList.insertAfter(33, 88);  // insert 88 after 33

        theList.displayForward();     // display list forward
    }  // end main()
}  // end class DoublyLinkedApp
////////////////////////////////////////////////////////////////
