public class BestTimeBuyAndSell_1 {


    //When ever we visit a minimum value update the min
    //And also, calculate the maximum and update the maximum profit
    //TC: O(N) where N is number of prices
    //SC: O(1) Not using any extra space.
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;

        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimeBuyAndSell_1 bestTimeBuyAndSell_1 = new BestTimeBuyAndSell_1();
        int maxProfit = bestTimeBuyAndSell_1.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
        System.out.println("The max profit is: "+maxProfit);
    }
}