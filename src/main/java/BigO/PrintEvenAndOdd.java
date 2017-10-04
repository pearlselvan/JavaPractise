package BigO;

/**
 * Created by muthuselvan on 9/7/17.
 */
public class PrintEvenAndOdd {

    public static void main(String[] args) {
        PrintEvenAndOdd printEvenAndOdd = new PrintEvenAndOdd();
        int[] data = {10,4,3,2,1,0};
        printEvenAndOdd.printEvenOdd(data);

    }

    //Even it has two for loop does't mean the o(2n) ..its O(N) ..because drop constants that remove 2
    static void printEvenOdd(int[] data) {

        for (int num : data) {
            if (num % 2 == 0 ) {
                System.out.println("Even" +num);
            }
        }

        for (int num : data) {
            if (num % 2 != 0 ) {
                System.out.println("Odd" +num);
            }
        }

    }
}
