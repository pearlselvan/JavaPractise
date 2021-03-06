package ProblemSolving;

/**
 * Created by muthuselvan on 2/24/17.
 */
/*
You have an array of integers, and for each index you want to find the product
 of every integer except the integer at that index.
 http://www.programcreek.com/2014/07/leetcode-product-of-array-except-self-java/
 */
public class ProductOfEveryInteger {

    //http://www.programcreek.com/2014/07/leetcode-product-of-array-except-self-java/
    public static void main(String[] args) {
        int[] array = {1,2,3};

//        for (int i=0;i<productExceptSelf(array).length;i++) {
//            System.out.print("{"+productExceptSelf(array)[i]+"}");
//        }

        for (int i=0;i<productExceptSelf(array).length;i++) {
            System.out.print("{"+productExceptSelfOptimized(array)[i]+"}");
        }

        for (int i=0;i<productExceptSelf(array).length;i++) {
            System.out.print("<"+getProductsOfAllIntsExceptAtIndexBest(array)[i]+">");
        }



    }



    public static int[] getProductsOfAllIntsExceptAtIndexBest(int[] intArray) {

        // we make an array with the length of the input array to
        // hold our products
        int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];

        // for each integer, we find the product of all the integers
        // before it, storing the total product so far each time
        int productSoFar = 1;
        for (int i = 0; i < intArray.length; i++) {
            productsOfAllIntsExceptAtIndex[i] = productSoFar;
            productSoFar *= intArray[i];
        }

        // for each integer, we find the product of all the integers
        // after it. since each index in products already has the
        // product of all the integers before it, now we're storing
        // the total product of all other integers
        productSoFar = 1;
        for (int i = intArray.length - 1; i >= 0; i--) {
            productsOfAllIntsExceptAtIndex[i] *= productSoFar;
            productSoFar *= intArray[i];
        }

        return productsOfAllIntsExceptAtIndex;
    }


    //Space is O(1).
    public static int[] productExceptSelfOptimized(int[] nums) {
        int[] result = new int[nums.length];

        result[nums.length-1]=1;
        for(int i=nums.length-2; i>=0; i--){
            result[i]=result[i+1]*nums[i+1];
        }

        int left=1;
        for(int i=0; i<nums.length; i++){
            result[i]=result[i]*left;
            left = left*nums[i];
        }

        return result;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] t1 = new int[nums.length];
        int[] t2 = new int[nums.length];



        t1[0]=1;
        t2[nums.length-1]=1;

        System.out.println("");

        //scan from left to right
         for(int i=0; i<nums.length-1; i++){
            t1[i+1] = nums[i] * t1[i];
//            System.out.println(i +":" +t1[i] +" :" +nums[i]);
        }
        System.out.println("-------");

        //scan from right to left
        for(int i=nums.length-1; i>0; i--){
            t2[i-1] = t2[i] * nums[i];
//            System.out.println(i +":" +t2[i]+ ":" +nums[i]);
        }

        //multiply
        for(int i=0; i<nums.length; i++){
            result[i] = t1[i] * t2[i];
        }

        return result;
    }

    public static int productOfAllExceptCurrent(int[] array) {


        for (int outer=0;outer<array.length;outer++) {

            for (int inner =outer;inner<array.length;inner++) {


                if (array[outer] != array[inner]) {
//                    inner = outer -1 ;

//                    multipler = multipler * array[inner];

                    System.out.println(inner+ " : "+array[inner]);
//                    System.out.println(multipler);
                }
            }
            System.out.println("---multipler---");

        }

        return 1;
    }


}
