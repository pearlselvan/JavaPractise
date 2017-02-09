package DesingPattern;

import java.util.ArrayList;

/**
 * Created by muthuselvan on 2/9/17.
 */

/*
WorkFlow:
---------
Clients call operations on the adapter instance.
In turn adapter calls adaptee operations
that carry out the request.

When to use it:
---------------
1. You want to use existing class and its interface does not match the one you need.
2. You want to create a resuable class that cooperates with unrelated or unforeseen
 classes that is, class that don't necessarily have compatible interfaces.
(Ex: e commerce web site , you alread have pay gateway that accepts
credit and you want add new payment geteway that accepts
credit card also so here oldgateway and newgateway as the
two different incompatable interface )

Example class includes :
------------------------
PrintableList(Target) //This is our target thats new class
PrintString(Adaptee) // // This is Adaptee because old
PrintableListAdapter(Adapter) // This adapter will implment new interface (PrintableList)
and create the instance for Adaptee ( PrintString )

Consider that we have a third party library that provides print string
functionality through PrintString class.

Reff :http://www.java2blog.com/2012/09/adapter-design-pattern-in-java.html

 */
public class AdapterSimple {

    public static void main(String[] args) {
        ArrayList<String> list=new  ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        //Work flow : Clients call operations on the adapter instance.
        //In turn adapter calls adaptee operations
        PrintableList pl=new PrintableListAdapter();
        pl.printList(list);


    }

}

//Consider that we have a third party library that provides print string
// functionality through PrintString class.
//This you old one
// This is Adaptee because old
class PrintString {
    public void print(String s)
    {
        System.out.println(s);
    }
}

//Client deals with ArrayList<String> but not with string.
// We have provided a PrintableList interface that expects the client input
// .This is our target.

interface PrintableList {
    void printList(ArrayList<String> list);
}

//Lets assume we can not change it now.
//Finally we have PrintableListAdapter class which will implement
// PrintableList interface and will deal with our adaptee class (old class here printString).



class PrintableListAdapter implements PrintableList{

    public void printList(ArrayList<String> list) {

        //Converting ArrayList<String> to String so that we can pass String to
        // adaptee class
        String listString = "";

        for (String s : list)
        {
            listString += s + "\t";
        }

        // instantiating adaptee class
        PrintString printString=new PrintString();
        printString.print(listString);
    }
}










