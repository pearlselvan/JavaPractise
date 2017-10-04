package CodingPractise.Search;

/**
 * Created by muthuselvan on 9/2/17.
 * http://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
 */
public class SearchRowColumnSortedMatrix {

    public static void main(String[] args) {

        // Input arr of Strings.
        String arr[] = {"for", "", "", "", "geeks", "ide", "",
                "practice", "" , "", "quiz", "", ""};

        // input Search String
        String str = "geeks";
//        int n = sizeof(arr)/sizeof(arr[0]);
        int n = arr.length/arr[0].length();
        System.out.println(arr.length);
        System.out.println(n);
//        System.out.println("Found " +searchStr(arr,str,0,n-1));

    }


//    // Compare two string equals are not
//    static Integer compareStrings(String str1, String str2) {
//
//        int i = 0;
//        while (str1.charAt(i) == str2.charAt(i) && str1.charAt(i) != '\0') {
//            i++;
//            if (str1.charAt(i) > str2.charAt(i))
//                return -1;
//            if (str1.charAt(i) < str2.charAt(i))
//                return 0;
//        }
//        return 1;
//
//    }
//
//    static Integer searchStr(String arr[], String str, int first,
//              int last) {
//
//        if (first > last)
//            return -1;
//
//        // Move mid to the middle
//        int mid = (last+first)/2;
//
//
//        // If mid is empty , find closet non-empty string
//        if (arr[mid].isEmpty())
//        {
//            // If mid is empty, search in both sides of mid
//            // and find the closest non-empty string, and
//            // set mid accordingly.
//            int left  = mid - 1;
//            int right = mid + 1;
//            while (true) {
//                if (left < first && right > last)
//                    return -1;
//
//                if (right<=last && !arr[right].isEmpty())
//                {
//                    mid = right;
//                    break;
//                }
//
//                if (left>=first && !arr[left].isEmpty())
//                {
//                    mid = left;
//                    break;
//                }
//
//                right++;
//                left--;
//            } //End while
//
//        }  // End if
//
//        // If str is found at mid
//
//        if (compareStrings(str, arr[mid]) == 0)
//            return mid;
//
//        // If str is greater than mid
//        if (compareStrings(str, arr[mid]) < 0)
//            return searchStr(arr, str, mid+1, last);
//
//        return searchStr(arr, str, first, mid-1);
//
//
//
//
//    } // End method


}
