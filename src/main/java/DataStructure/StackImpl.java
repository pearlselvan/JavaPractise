package DataStructure;

import java.util.Stack;

/**
 * Created by muthuselvan on 2/6/17.
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





    }
}



class StackImplementation {



}
