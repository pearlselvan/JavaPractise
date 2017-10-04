package CodingPractise;

/**
 * Created by muthuselvan on 7/7/17.
 */
public class Practise3 {

    public static void main(String[] args) {
        try {
            bad();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("D");
    }


      public static void bad() {

      }



}
