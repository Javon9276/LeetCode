package cn.javon.leetcode.easy._121_besttimetobuyandsellstock;

/**
 * @author Javon
 * @since 2018-02-28
 **/
public class MyBestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sum < (prices[i] - prices[j])) {
                    sum = prices[i] - prices[j];
                }
            }
        }
        return sum;
    }
}
