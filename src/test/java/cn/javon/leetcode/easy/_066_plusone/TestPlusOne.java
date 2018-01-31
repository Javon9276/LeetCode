package cn.javon.leetcode.easy._066_plusone;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-31
 **/
public class TestPlusOne {

    private int[] digits1 = new int[]{0};
    private int[] digits2 = new int[]{1,9};
    private int[] digits3 = new int[]{9,9};

    private int[] digits = digits3;

    @Test
    public void testMyPlusOne() {
        MyPlusOne myPlusOne = new MyPlusOne();
        int[] restuls = myPlusOne.plusOne(digits);
        for (int i = 0; i < restuls.length; i++) {
            System.out.print(restuls[i] + " ");
        }
    }

    @Test
    public void testRankingPlusOne() {
        RankingPlusOne rankingPlusOne = new RankingPlusOne();
        int[] restuls = rankingPlusOne.plusOne(digits);
        for (int i = 0; i < restuls.length; i++) {
            System.out.print(restuls[i] + " ");
        }
    }

}
