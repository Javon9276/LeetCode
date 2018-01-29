package cn.javon.leetcode.easy._038_countandsay;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-29
 **/
public class TestCountAndSay {

    private int n = 6;

    @Test
    public void testMyCountAndSay() {
        MyCountAndSay myCountAndSay = new MyCountAndSay();
        System.out.println(myCountAndSay.countAndSay(n));
    }

    @Test
    public void testRankingCountAndSay() {
        RankingCountAndSay rankingCountAndSay = new RankingCountAndSay();
        System.out.println(rankingCountAndSay.countAndSay(n));
    }

}
