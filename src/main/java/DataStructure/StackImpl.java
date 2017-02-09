package DataStructure;

import java.util.Stack;

/**
 * Created by muthuselvan on 2/6/17.
 *
 * Stack Opearation :
 * -----------------
 *  Push: A new entity can be added to the top of the collection.
    Pop: An entity will be removed from the top of the collection.
    Peek or Top: Returns the top of the entity with out removing it

 Overflow State:
 ---------------
 A stack may be implemented to have a bounded capacity.
 If the stack is full and does not contain enough space to accept
 an entity to be pushed, the stack is
 then considered to be in an overflow state.

 Underflow State:
 -----------------
 The pop operation removes an item from the top of the stack.
 A pop either reveals previously concealed items or results in an empty stack,
 but, if the stack is empty, it goes into underflow state,
 which means no items are present in stack to be removed.

 A stack is a restricted data structure,
 ------------------------------------------
 because only a small number of operations are performed on it.
 The nature of the pop and push operations also means
 that stack elements have a natural order.
 Elements are removed from the stack in the reverse order to the
 order of their addition. Therefore,
 the lower elements are those that have been on the stack the longest.

 Efficiency of Stacks
 ---------------------
 In the stack, the elements can be push or pop one at a time in
 constant O(1) time. That is,
 the time is not dependent on how many items are in the stack and
 is therefore very quick. No comparisons or moves are necessary.
 *
 * Ref : https://dzone.com/articles/balanced-parenthesis-check
 * http://www.java2novice.com/data-structures-in-java/stacks/introduction/#sthash.xEzxJLE1.dpuf
 * http://eddmann.com/posts/implementing-a-stack-in-java-using-arrays-and-linked-lists/

 */
public class StackImpl {
    public static void main(String[] args) {
        Stack<String> parenthisis = new Stack<>();
        parenthisis.push("{");
        parenthisis.push("[");
        parenthisis.push("<");
        parenthisis.push(">");
        parenthisis.push("]");
        parenthisis.push("}");
        System.out.println("Stack Size : " +parenthisis.size());
        //POP : Removes the object at the top of this stack and returns that
        System.out.println("Pop ..the last inseted item  : " +parenthisis.pop());
        //PEEK : Looks at the object at the top of this stack without removing it
        System.out.println("Pop ..the last inseted item  : " +parenthisis.peek());
        System.out.println("Using stack imple class");
        StackImplementation myStack = new StackImplementation(3);
        myStack.push(20);
        myStack.push(12);
        myStack.push(21);

        //Reverse using stack
        for (int i=myStack.size();i>=1;i--) {
            System.out.print("" +myStack.pop());
        }

        System.out.println("Size of the stack : " +myStack.size());
        System.out.println("Peek of the stack" +myStack.peek());
        System.out.println("pop of the stack" +myStack.pop());
        System.out.println("Peek of the stack" +myStack.peek());


        StackImplementation<String> stringStack = new StackImplementation(3);
        stringStack.push("N");
        stringStack.push("A");
        stringStack.push("F");

        //Reverse using stack
        for (int i=stringStack.size();i>=1;i--) {
            System.out.print("" +stringStack.pop());
        }

    }
}



class StackImplementation<T> {
    private int stackSize ;
    private T[] stackArray;
    private int top ;

    public StackImplementation(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray= (T[]) new Object[stackSize];
        this.top = -1 ;
    }


    public boolean isFull() {
        return (top == stackSize);
    }

    public int size() {
        return top+1;
    }
    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(T elt) {
        if (isFull()) {
            System.out.println("Stack is FULL");
        } else {
            top ++;
            stackArray[top] = elt;
        }
    }

    public T peek() {
        return stackArray[top];
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        T current = stackArray[top--];
        return current;
    }

}
