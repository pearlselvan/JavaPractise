package ProblemSolving;

/**
 * Created by muthuselvan on 2/20/17.
 * https://www.interviewcake.com/question/python/stock-price
 */
public class StockProfit {

    public StockProfit() {

    }

    public static void main(String[] args) {
//        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
        int[] stockPricesYesterday = new int[]{5, 3, 1, 8};
//        int[] stockPricesYesterday = new int[]{10, 7, 6, 5, 4, 3};
//        int[] stockPricesYesterday = new int[]{10};
      //  System.out.println("PRofit obtimized "+getMaxProfitOptimized(stockPricesYesterday));
//        System.out.println("PRofit better approach "+getMaxProfitBetter(stockPricesYesterday));
        System.out.println("Profit obtimized negative "+getMaxProfitOptimizedreturnNegativeProfit(stockPricesYesterday));

//        System.out.println("PRofit "+getMaxProfit(stockPricesYesterday));
    }

//O(n) time and O(1)O(1) space. We only loop through the array once.
    public static int getMaxProfitOptimizedreturnNegativeProfit(int[] stockPricesYesterday) {

        if (stockPricesYesterday.length < 2 ) {
            throw  new IllegalArgumentException("Profit required more then two prices");
        }

        int minPrice = stockPricesYesterday[0];
        int maxProfit = stockPricesYesterday[1]- stockPricesYesterday[0];

        for (int currentPrice : stockPricesYesterday) {

            minPrice  = Math.min(currentPrice,minPrice);

            int potentialProfit = currentPrice - minPrice ;

            maxProfit = Math.max(potentialProfit,maxProfit);



        }

        return maxProfit ;

    }

    public static int getMaxProfitOptimized(int[] stockPricesYesterday) {

        int minPrice = stockPricesYesterday[0];
//        int maxProfit = stockPricesYesterday[1] -stockPricesYesterday[0];
        int maxProfit = 0;


        if ( stockPricesYesterday.length < 2 ) {
            throw new IllegalArgumentException("Please list more than two stacks to compate the prices ");
        }

        for (int currentPrice : stockPricesYesterday) {

            // ensure min_price is the lowest price we've seen so far
            minPrice = Math.min(minPrice, currentPrice);

            // see what our profit would be if we bought at the
            // min price and sold at the current price
            int potentialProfit = currentPrice - minPrice;

            // update maxProfit if we can do better
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }

    public static int getMaxProfitBetter(int[] stockPricesYesterday) {
        int maxProfit = 0 ;
        for (int earlyTime=0;earlyTime<stockPricesYesterday.length;earlyTime++) {
            int earlyPrice = stockPricesYesterday[earlyTime];
            for (int laterTime=earlyTime+1;laterTime<stockPricesYesterday.length;laterTime++) {
                int laterPrice = stockPricesYesterday[laterTime];
                int potentialProfit = laterPrice-earlyPrice;
                maxProfit = Math.max(maxProfit,potentialProfit);
            }
        }
        return maxProfit;
    }



    //treating the earlier time as the buy time &  the later time as the sell time
    //But that will take O(n^2)O(n2​ ) time, since we have two nested loops—for every
     // time, we're going through every other time.
// Also, it's not correct: we won't ever report a negative profit! Can we do better?
    public static int getMaxProfit(int[] stockPricesYesterday) {
        int maxProfit = 0;

        // go through every time :
        for (int outerTime = 0; outerTime < stockPricesYesterday.length; outerTime++) {
            System.out.println("Outer time  : " +outerTime);

            // for every time, got through every OTHER time
            for (int innerTime = 0; innerTime < stockPricesYesterday.length; innerTime++) {
                System.out.println("-----Inner Time : " +innerTime);

                // for each pair, find the earlier and later times
                int earlierTime = Math.min(outerTime, innerTime);
                int laterTime   = Math.max(outerTime, innerTime);
//                System.out.println("Early time : " +earlierTime+ " Later time " +laterTime);
                // and use those to find the earlier and later prices
                int earlierPrice = stockPricesYesterday[earlierTime];
                int laterPrice   = stockPricesYesterday[laterTime];

                System.out.println("Early price : " +earlierPrice+ " on Early time " +earlierTime);
                System.out.println("Later price : " +laterPrice+ " on Later time " +laterTime);

                // see what our profit would be if we bought at the
                // min price and sold at the current price
                int potentialProfit = laterPrice - earlierPrice;

                // update maxProfit if we can do better
                maxProfit = Math.max(maxProfit, potentialProfit);
                System.out.println("Profile " +maxProfit+ "in later time : " +laterPrice);
            }
        }

        return maxProfit;
    }



}

