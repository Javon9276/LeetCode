package cn.javon.leetcode.easy._122_besttimetobuyandsellstockii;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-01
 **/
public class TestBestTimeToBuyAndSellStockII {

    int[] prices1 = new int[]{7, 1, 5, 3, 6, 4};
    int[] prices2 = new int[]{7, 6, 4, 3, 1};
    int[] prices3 = new int[]{3, 2, 7, 1, 3};
    int[] prices = prices1;

    @Test
    public void testMyBestTimeToBuyAndSellStockII(){
        MyBestTimeToBuyAndSellStockII myBestTimeToBuyAndSellStockII = new MyBestTimeToBuyAndSellStockII();
        System.out.println(myBestTimeToBuyAndSellStockII.maxProfit(prices));
    }

}
