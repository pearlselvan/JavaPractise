package BigO;

/**
 * Created by muthuselvan on 8/24/17.
 0 - 0
 0 - 1
 0 - 2
 0 - 3
 0 - 4
 0 - 5
 1 - 1
 1 - 2
 1 - 3
 1 - 4
 1 - 5
 2 - 2
 2 - 3
 2 - 4
 2 - 5
 3 - 3
 3 - 4
 3 - 5
 4 - 4
 4 - 5
 5 - 5

 */
public class PrintOrderedPairs {

    public static void main(String[] args) {

        printordered();

    }

    // Big o is 0(n SQURE) , drop the constansts
    static void printordered() {
        for (int i=0;i<=5;i++) {
            for (int j=i;j<=5;j++) {
                System.out.println(i + " - " +j);
//                System.out.print("* ");
            }
//            System.out.println("");

        }

    }

    // very very common mistake , its not o(n2) noramally we
//    would think if two for loop then o(n2) no because n wiil
    // defind the length ,  here there is not n of the arrays ,
    // this is depends on the length of the two array ...so big o(A*B) where
    // A and B are length of the array
    static void printordered2(int[] array1,int[] array2) {

        for (int i=0;i<=array1.length-1;i++) {

            for (int j=0;j<array2.length-1;j++) {

            }

        }


    }



}
