package CodingPractise.String;

/**
 * Created by muthuselvan on 4/29/17.
 *
 * Search the string for the given array
 */
public class StringSerachUsingBinarySearch {

    public static void main(String[] args) {

        String[] data = {"APPLE","BANA","CAT","DOG","ELE","FREE","GOO","HELLO"};
        Integer first =  0;
        Integer last = data.length -1 ;



        searchStr(data,"HELLO",first,last);
    }

    public static void searchStr(String[] data,String search,Integer firstI,Integer lastI) {



        if ((search == null ) && (search.isEmpty())) return;


        int arrayLength =  data.length -1  ;


        int first = 0;
        int last = arrayLength;


        while (first <= last) {
            int mid = ( first + last ) /2 ;
//            System.out.println("Middle Array " +data[mid] +" : mid " +mid);

//            System.out.println(data[first]);

            if (search.equals(data[mid])) {
                System.out.println("Found " +search+ " in index  " +mid);
                return;
            }

            if (search.compareTo(data[mid]) > 0) {
//                System.out.println(search + ":" +data[mid]);
//                System.out.println("Search left");
                first = mid +1 ;

            }

            if (search.compareTo(data[mid]) < 0) { // if search is less
//                System.out.println(search + ":" +data[mid]);
//                System.out.println("Search right");
                last = mid-1;


            }





//            first++;
        }
        System.out.println(search +" is not found");

//        String first = "BALL";
//        String sec = "APPLE";
//
//        if (first.compareTo(sec) < 0) {
//            System.out.println(first +"is leass");
//        } else {
//            System.out.println(first +"is not leass");
//        }

    }




}
