package cn.javon.leetcode.easy._121_besttimetobuyandsellstock;

public class RankingBestTimeToBuyAndSellStock {

    public int maxProfit(int prices[]) {
        if (prices == null || prices.length <= 1)
            return 0;
        int buyIndex = 0;
        int sellIndex = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[buyIndex]) {
                buyIndex = i;
            } else {
                maxProfit = Math.max(prices[i] - prices[buyIndex], maxProfit);
            }
        }
        return maxProfit;
    }

}
