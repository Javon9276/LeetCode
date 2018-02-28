package cn.javon.leetcode.easy._121_besttimetobuyandsellstock;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-28
 **/
public class TestBestTimeToBuyAndSellStock {

    int[] prices1 = new int[]{7, 1, 5, 3, 6, 4};
    int[] prices2 = new int[]{7, 6, 4, 3, 1};
    int[] prices3 = new int[]{3, 2, 7, 1, 3};
    int[] prices = prices3;


    @Test
    public void testMyBestTimeToBuyAndSellStock() {
        MyBestTimeToBuyAndSellStock myBestTimeToBuyAndSellStock = new MyBestTimeToBuyAndSellStock();
        System.out.println(myBestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void testOfficialBestTimeToBuyAndSellStock() {
        OfficialBestTimeToBuyAndSellStock officialBestTimeToBuyAndSellStock = new OfficialBestTimeToBuyAndSellStock();
        System.out.println(officialBestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void testRankingBestTimeToBuyAndSellStock() {
        RankingBestTimeToBuyAndSellStock rankingBestTimeToBuyAndSellStock = new RankingBestTimeToBuyAndSellStock();
        System.out.println(rankingBestTimeToBuyAndSellStock.maxProfit(prices));
    }

}
