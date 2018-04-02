package cn.javon.leetcode.easy._202_happynumber;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-04-02
 **/
public class TestHappyNumber {


    int n1 = 19;
    int n2 = 4;
    int n = n2;

    @Test
    public void testMyHappyNumber() {
        MyHappyNumber myHappyNumber = new MyHappyNumber();
        System.out.println(myHappyNumber.isHappy(n));
    }

    @Test
    public void testRankingHappyNumber() {
        RankingHappyNumber rankingHappyNumber = new RankingHappyNumber();
        System.out.println(rankingHappyNumber.isHappy(n));
    }
}
