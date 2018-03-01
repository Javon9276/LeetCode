package cn.javon.leetcode.easy._122_besttimetobuyandsellstockii;

/**
 * @author Javon
 * @since 2018-03-01
 **/
public class MyBestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

}
