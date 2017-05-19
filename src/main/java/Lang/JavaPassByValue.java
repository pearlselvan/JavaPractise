package Lang;

/**
 * Created by muthuselvan on 5/12/17.
 *
 *  Java doesn't pass method arguments by reference; it passes them by value.
 *
 *  in java when you pass the primitive type as argument then its pass by values
 *  then the original value will not get affected , because when passing the values
 *  it copy the value
 *
 *  if you pass the object as argument then its pass by reference then the value will be changed
 *
 *
 *  https://www.youtube.com/watch?v=YltSPGHmiZU
 *  https://www.youtube.com/watch?v=hNR6fsksEu8
 */
public class JavaPassByValue {

    public static void main(String[] args) {

        int a=10, b=20;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);

    }


    public static void swap(int a ,int b ) {
        int temp = a;
        a=b;
        b=temp;
    }
}
