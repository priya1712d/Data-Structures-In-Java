package practice;

public class StockMarket {

    public static void main(String[] args) {
        int[] prices = {-10, 100, 150, 120, -110};
        int profit =  maxProfit(prices);
        System.out.println("Profit");
        System.out.println(profit);
    }

        public static int maxProfit(int[] prices) {
            int maxProfitSoFar = 0;
            int minSoFar = prices[0];
            for(int i=1; i<prices.length; i++){
                maxProfitSoFar = Math.max(maxProfitSoFar, prices[i]-minSoFar);
                minSoFar = Math.min(minSoFar, prices[i]);
            }

            return maxProfitSoFar;
        }
}
