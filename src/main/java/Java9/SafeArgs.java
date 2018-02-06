package Java9;

public class SafeArgs {

    //Heap Pollution Problem : One type of object pointing to another object is called :
    //How to avoid ? use SafeVarArgs Annodation
    /*
      Saf
     */
    public static void main(String[] args) {

        sumNos(10,20);

    }

    public static void sumNos(Integer...a) {
        int sum = 0 ;
        for (Integer n : a ) {
            sum = sum + n ;

        }
        System.out.println("Sum : " +sum);

    }



    public void cerfication() {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
//        int d = (a<b) ? (a<c)? a : (b<c) ? b : c ;
//        System.out.println(d);
        //Ans : Compilation fails


    }

}
